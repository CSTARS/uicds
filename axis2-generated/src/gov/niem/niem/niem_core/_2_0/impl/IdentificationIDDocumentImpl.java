/*
 * An XML document type.
 * Localname: IdentificationID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.IdentificationIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one IdentificationID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.IdentificationIDDocument
{
    
    public IdentificationIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationID");
    
    
    /**
     * Gets the "IdentificationID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String getIdentificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(IDENTIFICATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationID" element
     */
    public boolean isNilIdentificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(IDENTIFICATIONID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationID" element
     */
    public void setIdentificationID(gov.niem.niem.proxy.xsd._2_0.String identificationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(IDENTIFICATIONID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(IDENTIFICATIONID$0);
            }
            target.set(identificationID);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String addNewIdentificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(IDENTIFICATIONID$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationID" element
     */
    public void setNilIdentificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(IDENTIFICATIONID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(IDENTIFICATIONID$0);
            }
            target.setNil();
        }
    }
}
