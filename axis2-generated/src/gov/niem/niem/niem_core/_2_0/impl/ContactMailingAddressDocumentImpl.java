/*
 * An XML document type.
 * Localname: ContactMailingAddress
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.ContactMailingAddressDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one ContactMailingAddress(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactMailingAddressDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.ContactMeansDocumentImpl implements gov.niem.niem.niem_core._2_0.ContactMailingAddressDocument
{
    
    public ContactMailingAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTMAILINGADDRESS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactMailingAddress");
    
    
    /**
     * Gets the "ContactMailingAddress" element
     */
    public gov.niem.niem.niem_core._2_0.AddressType getContactMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.AddressType target = null;
            target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().find_element_user(CONTACTMAILINGADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactMailingAddress" element
     */
    public boolean isNilContactMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.AddressType target = null;
            target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().find_element_user(CONTACTMAILINGADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactMailingAddress" element
     */
    public void setContactMailingAddress(gov.niem.niem.niem_core._2_0.AddressType contactMailingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.AddressType target = null;
            target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().find_element_user(CONTACTMAILINGADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().add_element_user(CONTACTMAILINGADDRESS$0);
            }
            target.set(contactMailingAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactMailingAddress" element
     */
    public gov.niem.niem.niem_core._2_0.AddressType addNewContactMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.AddressType target = null;
            target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().add_element_user(CONTACTMAILINGADDRESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactMailingAddress" element
     */
    public void setNilContactMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.AddressType target = null;
            target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().find_element_user(CONTACTMAILINGADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.AddressType)get_store().add_element_user(CONTACTMAILINGADDRESS$0);
            }
            target.setNil();
        }
    }
}
