/*
 * An XML document type.
 * Localname: TelephoneNumberID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.TelephoneNumberIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one TelephoneNumberID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneNumberIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.TelephoneNumberIDDocument
{
    
    public TelephoneNumberIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONENUMBERID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberID");
    
    
    /**
     * Gets the "TelephoneNumberID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String getTelephoneNumberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(TELEPHONENUMBERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneNumberID" element
     */
    public boolean isNilTelephoneNumberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(TELEPHONENUMBERID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneNumberID" element
     */
    public void setTelephoneNumberID(gov.niem.niem.proxy.xsd._2_0.String telephoneNumberID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(TELEPHONENUMBERID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(TELEPHONENUMBERID$0);
            }
            target.set(telephoneNumberID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneNumberID" element
     */
    public gov.niem.niem.proxy.xsd._2_0.String addNewTelephoneNumberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(TELEPHONENUMBERID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneNumberID" element
     */
    public void setNilTelephoneNumberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.String target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().find_element_user(TELEPHONENUMBERID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.String)get_store().add_element_user(TELEPHONENUMBERID$0);
            }
            target.setNil();
        }
    }
}
