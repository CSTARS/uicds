/*
 * An XML document type.
 * Localname: NANPTelephoneNumber
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one NANPTelephoneNumber(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class NANPTelephoneNumberDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.TelephoneNumberRepresentationDocumentImpl implements gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument
{
    
    public NANPTelephoneNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NANPTELEPHONENUMBER$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "NANPTelephoneNumber");
    
    
    /**
     * Gets the "NANPTelephoneNumber" element
     */
    public gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType getNANPTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().find_element_user(NANPTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "NANPTelephoneNumber" element
     */
    public boolean isNilNANPTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().find_element_user(NANPTELEPHONENUMBER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "NANPTelephoneNumber" element
     */
    public void setNANPTelephoneNumber(gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType nanpTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().find_element_user(NANPTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().add_element_user(NANPTELEPHONENUMBER$0);
            }
            target.set(nanpTelephoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "NANPTelephoneNumber" element
     */
    public gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType addNewNANPTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().add_element_user(NANPTELEPHONENUMBER$0);
            return target;
        }
    }
    
    /**
     * Nils the "NANPTelephoneNumber" element
     */
    public void setNilNANPTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType target = null;
            target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().find_element_user(NANPTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType)get_store().add_element_user(NANPTELEPHONENUMBER$0);
            }
            target.setNil();
        }
    }
}
