/*
 * An XML document type.
 * Localname: ContactEmailID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.ContactEmailIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one ContactEmailID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactEmailIDDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.ContactMeansDocumentImpl implements gov.niem.niem.niem_core._2_0.ContactEmailIDDocument
{
    
    public ContactEmailIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTEMAILID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactEmailID");
    
    
    /**
     * Gets the "ContactEmailID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String getContactEmailID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(CONTACTEMAILID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactEmailID" element
     */
    public boolean isNilContactEmailID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(CONTACTEMAILID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactEmailID" element
     */
    public void setContactEmailID(gov.niem.niem.proxy.xsd._2_0.String contactEmailID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(CONTACTEMAILID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(CONTACTEMAILID$0);
            }
            target.set(contactEmailID);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactEmailID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String addNewContactEmailID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(CONTACTEMAILID$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactEmailID" element
     */
    public void setNilContactEmailID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(CONTACTEMAILID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(CONTACTEMAILID$0);
            }
            target.setNil();
        }
    }
}
