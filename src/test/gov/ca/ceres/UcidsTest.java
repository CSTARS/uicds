package gov.ca.ceres;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Properties;


import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.Header;

import org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import org.uicds.incidentmanagementservice.GetIncidentListRequestDocument;
import org.uicds.incidentmanagementservice.GetIncidentListResponseDocument;
import org.uicds.incidentmanagementservice.GetIncidentRequestDocument;
import org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest;
import org.uicds.incidentmanagementservice.GetIncidentResponseDocument;
import org.uicds.incidentmanagementservice.IncidentManagementServiceServiceStub;

import com.saic.www.precis._2009._06.base.ChecksumType;
import com.saic.www.precis._2009._06.base.CodespaceValueType;
import com.saic.www.precis._2009._06.base.IdentificationType;
import com.saic.www.precis._2009._06.base.IdentifierType;
import com.saic.www.precis._2009._06.base.VersionType;
import com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct;

import sun.misc.BASE64Encoder;

/**
 * Testing connection to the ucids server
 * 
 * @author jrmerz
 *
 */
public class UcidsTest {
	
	private static Properties prop = new Properties();
	static {
		try {
	           //load a properties file
			prop.load(new FileInputStream("/opt/uicds/sumbot.conf"));
		} catch (IOException ex) {
			ex.printStackTrace();
	    }
	}
	
	// DEFAULTS
	private final static String HOST = "https://uicds.resources.ca.gov";
	private final static String INCIDENT_MANAGEMENT_PATH = "/uicds/core/ws/services/IncidentManagementService";
	private final static String SENSOR_PATH = "/uicds/core/ws/services/SensorService";
	private final static String USERNAME = prop.getProperty("username");
	private final static String PASSWORD = prop.getProperty("password");
	
	private IncidentManagementServiceServiceStub stub;
	
	public UcidsTest() {
		try {
			stub = new IncidentManagementServiceServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
		Options options = new Options();
		
		ArrayList<Header> headers = new ArrayList<Header>();
		Header auth = new Header();
		String encoding = new BASE64Encoder().encodeBuffer((USERNAME + ":" + PASSWORD).getBytes()).replace("\n", "");
		auth.setName("Authorization");
		auth.setValue("Basic " + encoding);
		headers.add(auth);
		
		options.setTo(new EndpointReference(HOST+INCIDENT_MANAGEMENT_PATH));
		options.setProperty(HTTPConstants.HTTP_HEADERS, headers);
		
		stub._getServiceClient().setOptions(options);
	}
	
	public WorkProduct getIncident(String id, String checksum, String version, String type) throws RemoteException, XmlException {
		GetIncidentRequestDocument request = GetIncidentRequestDocument.Factory.newInstance();
		
		// set request xml
		GetIncidentRequest gir = request.addNewGetIncidentRequest();
		IdentificationType it = gir.addNewWorkProductIdentification();
		
		// set id xml
		IdentifierType idType = it.addNewIdentifier();
		idType.setStringValue(id);
		it.setIdentifier(idType);
		
		// set checksum xml
		ChecksumType ct = it.addNewChecksum();
		ct.setStringValue(checksum);
		it.setChecksum(ct);
		
		VersionType vt = it.addNewVersion();
		vt.setStringValue(version);
		it.setVersion(vt);
		
		CodespaceValueType cvt = it.addNewType();
		cvt.setStringValue(type);
		it.setType(cvt);
		
		
		request.setGetIncidentRequest(gir);
		
		GetIncidentResponseDocument doc = stub.getIncident(request);

		String ns =  "declare namespace ucore='http://ucore.gov/ucore/2.0';";
		
		WorkProduct wProduct = doc.getGetIncidentResponse().getWorkProduct();
		return wProduct;
	}
	
	public String createObservation(String gid, String name, String description, double lat, double lng) throws XmlException, IOException {
		// cheating..
		
		String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sen=\"http://uicds.org/SensorService\">" +
						"<soapenv:Header/>" +
						"<soapenv:Body>" +
							"<sen:CreateSOIRequest>" +
								"<sen:incidentID>"+gid+"</sen:incidentID>"+
								"<sen:SensorObservationInfo>"+
									"<sen:sosURN></sen:sosURN>" +
									"<sen:SensorInfo>" +
										"<sen:name>"+name+"</sen:name>"+
										"<sen:description><![CDATA["+description+"]]></sen:description>"+
										"<sen:latitude>"+lat+"</sen:latitude>"+
										"<sen:longitude>"+lng+"</sen:longitude>"+
									"</sen:SensorInfo>"+
								"</sen:SensorObservationInfo>"+
							"</sen:CreateSOIRequest>"+
						"</soapenv:Body>"+
					  "</soapenv:Envelope>";
		
		URL url = new URL(HOST+SENSOR_PATH);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// set header
		String encoding = new BASE64Encoder().encodeBuffer((USERNAME + ":" + PASSWORD).getBytes()).replace("\n", "");
		connection.setRequestProperty("Authorization", "Basic " + encoding);
		connection.setRequestProperty("Content-Length", String.valueOf(soap.length())); 
		connection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8"); 
		connection.setRequestProperty("Connection", "Close"); 
		connection.setRequestProperty("SoapAction", ""); 
		connection.setDoOutput(true);
		
		PrintWriter pw = new PrintWriter(connection.getOutputStream()); 
		pw.write(soap); 
		pw.flush();
		
		String line;
		StringBuffer xml = new StringBuffer();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		while ((line = reader.readLine()) != null) {
		   xml.append(line);
		}
		pw.close();
		reader.close();
		
		return xml.toString();
	}
	
	
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, IOException {
		// This is a hack!!!
		// getting around bad cert on server
		EasySSLProtocolSocketFactory easySSLProtocolSocketFactory;
		try {
		     easySSLProtocolSocketFactory = new EasySSLProtocolSocketFactory();
		     Protocol.unregisterProtocol("https");
		     Protocol.registerProtocol("https", new Protocol("https", (ProtocolSocketFactory) easySSLProtocolSocketFactory, 443));
		}
		catch (GeneralSecurityException e) {
		      e.printStackTrace();
		}
		
		IncidentManagementServiceServiceStub stub = new IncidentManagementServiceServiceStub();
		
		
		
		Options options = new Options();
		
		ArrayList<Header> headers = new ArrayList<Header>();
		Header auth = new Header();
		String encoding = new BASE64Encoder().encodeBuffer((USERNAME + ":" + PASSWORD).getBytes()).replace("\n", "");
		auth.setName("Authorization");
		auth.setValue("Basic " + encoding);
		headers.add(auth);
		
		options.setTo(new EndpointReference(HOST+INCIDENT_MANAGEMENT_PATH));
		options.setProperty(HTTPConstants.HTTP_HEADERS, headers);
		
		stub._getServiceClient().setOptions(options);
		
		
		GetIncidentListRequestDocument list = GetIncidentListRequestDocument.Factory.newInstance();
		list.setGetIncidentListRequest(list.addNewGetIncidentListRequest());
		
		GetIncidentListResponseDocument doc = stub.getIncidentList(list);

		String ns =  "declare namespace ucore='http://ucore.gov/ucore/2.0';";
		
		WorkProduct[] wProducts = doc.getGetIncidentListResponse().getWorkProductList().getWorkProductArray();
		for( int i = 0; i < wProducts.length; i++ ) {
			//System.out.println(wProducts[i].getDigestAbstract());
			XmlObject xml = wProducts[i].getDigestAbstract();
			//System.out.println(wProducts[i].toString());
			//System.out.println(xml.selectPath(ns+"$this/ucore:Event/ucore:Descriptor")[0].getDomNode().getChildNodes().item(0).getNodeValue());
		}
		
	}
	
}