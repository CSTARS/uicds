/*
 * An XML document type.
 * Localname: ContactTelephoneNumber
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.ContactTelephoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one ContactTelephoneNumber(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactTelephoneNumberDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.ContactMeansDocumentImpl implements gov.niem.niem.niem_core._2_0.ContactTelephoneNumberDocument
{
    
    public ContactTelephoneNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTTELEPHONENUMBER$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactTelephoneNumber");
    
    
    /**
     * Gets the "ContactTelephoneNumber" element
     */
    public gov.niem.niem.niem_core._2_0.TelephoneNumberType getContactTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().find_element_user(CONTACTTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactTelephoneNumber" element
     */
    public boolean isNilContactTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().find_element_user(CONTACTTELEPHONENUMBER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactTelephoneNumber" element
     */
    public void setContactTelephoneNumber(gov.niem.niem.niem_core._2_0.TelephoneNumberType contactTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().find_element_user(CONTACTTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().add_element_user(CONTACTTELEPHONENUMBER$0);
            }
            target.set(contactTelephoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactTelephoneNumber" element
     */
    public gov.niem.niem.niem_core._2_0.TelephoneNumberType addNewContactTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().add_element_user(CONTACTTELEPHONENUMBER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactTelephoneNumber" element
     */
    public void setNilContactTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().find_element_user(CONTACTTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TelephoneNumberType)get_store().add_element_user(CONTACTTELEPHONENUMBER$0);
            }
            target.setNil();
        }
    }
}
