package gov.ca.ceres;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Properties;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.RosterListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.RosterPacket.ItemStatus;


public class FakeCoreMessage {

	private static Properties prop = new Properties();
	static {
		try {
	           //load a properties file
			prop.load(new FileInputStream(System.getProperty("user.home")+"/dev/config/uicds.conf"));
		} catch (IOException ex) {
			ex.printStackTrace();
	    }
	}
	private final static String USERNAME = prop.getProperty("xmppCoreUsername");
	private final static String PASSWORD = prop.getProperty("xmppCorePassword");
	
	
	public static void main(String[] args) throws XMPPException, InterruptedException {
		ConnectionConfiguration config = new ConnectionConfiguration("uicds.resources.ca.gov", 5222);
		Connection conn2 = new XMPPConnection(config);
		conn2.connect();
		System.out.println("Connected to xmpp server");
		
		conn2.login(USERNAME, PASSWORD);
		System.out.println("Authenticated");
		
		
		
		
		ChatManager chatmanager = conn2.getChatManager();
		Chat newChat = chatmanager.createChat("sumbot@uicds.resources.ca.gov", new MessageListener() {
			@Override
			public void processMessage(Chat chat, Message message) {
				System.out.println("Received message: #"+message.getFrom()+", " + message.getBody());
			}
		});

		String xml = readfile("src/test_resources/dumbyInc.xml");
		
		try {
		    newChat.sendMessage(xml);
		    System.out.println("Test incedent sent");
		} catch (XMPPException e) {
		    System.out.println("Error Delivering block");
		}
		
		conn2.disconnect();
		System.out.println("Disconnected xmpp server");
	}
	
	private static String readfile(String filename) {

		StringBuffer contents = new StringBuffer();
		try {
			FileInputStream fstream = new FileInputStream(filename);
		    DataInputStream in = new DataInputStream(fstream);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String strLine;
		    
		    while ((strLine = br.readLine()) != null)   {
			  contents.append(strLine);
			}
		    in.close();
		} catch (Exception e) { //Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return contents.toString();
	}
	
}
