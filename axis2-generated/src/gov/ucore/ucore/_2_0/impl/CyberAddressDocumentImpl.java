/*
 * An XML document type.
 * Localname: CyberAddress
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.CyberAddressDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one CyberAddress(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class CyberAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.CyberAddressDocument
{
    
    public CyberAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYBERADDRESS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CyberAddress");
    
    
    /**
     * Gets the "CyberAddress" element
     */
    public gov.ucore.ucore._2_0.CyberAddressType getCyberAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CyberAddressType target = null;
            target = (gov.ucore.ucore._2_0.CyberAddressType)get_store().find_element_user(CYBERADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CyberAddress" element
     */
    public void setCyberAddress(gov.ucore.ucore._2_0.CyberAddressType cyberAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CyberAddressType target = null;
            target = (gov.ucore.ucore._2_0.CyberAddressType)get_store().find_element_user(CYBERADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.CyberAddressType)get_store().add_element_user(CYBERADDRESS$0);
            }
            target.set(cyberAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "CyberAddress" element
     */
    public gov.ucore.ucore._2_0.CyberAddressType addNewCyberAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CyberAddressType target = null;
            target = (gov.ucore.ucore._2_0.CyberAddressType)get_store().add_element_user(CYBERADDRESS$0);
            return target;
        }
    }
}
