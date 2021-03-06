/*
 * An XML document type.
 * Localname: ContactWebsiteURI
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.ContactWebsiteURIDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one ContactWebsiteURI(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactWebsiteURIDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.ContactMeansDocumentImpl implements gov.niem.niem.niem_core._2_0.ContactWebsiteURIDocument
{
    
    public ContactWebsiteURIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTWEBSITEURI$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactWebsiteURI");
    
    
    /**
     * Gets the "ContactWebsiteURI" element
     */
    public gov.niem.niem.proxy.xsd._2_0.AnyURI getContactWebsiteURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.AnyURI target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().find_element_user(CONTACTWEBSITEURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactWebsiteURI" element
     */
    public boolean isNilContactWebsiteURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.AnyURI target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().find_element_user(CONTACTWEBSITEURI$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactWebsiteURI" element
     */
    public void setContactWebsiteURI(gov.niem.niem.proxy.xsd._2_0.AnyURI contactWebsiteURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.AnyURI target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().find_element_user(CONTACTWEBSITEURI$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().add_element_user(CONTACTWEBSITEURI$0);
            }
            target.set(contactWebsiteURI);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactWebsiteURI" element
     */
    public gov.niem.niem.proxy.xsd._2_0.AnyURI addNewContactWebsiteURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.AnyURI target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().add_element_user(CONTACTWEBSITEURI$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactWebsiteURI" element
     */
    public void setNilContactWebsiteURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.AnyURI target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().find_element_user(CONTACTWEBSITEURI$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.AnyURI)get_store().add_element_user(CONTACTWEBSITEURI$0);
            }
            target.setNil();
        }
    }
}
