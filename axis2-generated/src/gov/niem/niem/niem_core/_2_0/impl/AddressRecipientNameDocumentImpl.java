/*
 * An XML document type.
 * Localname: AddressRecipientName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.AddressRecipientNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one AddressRecipientName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AddressRecipientNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.AddressRecipientNameDocument
{
    
    public AddressRecipientNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSRECIPIENTNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressRecipientName");
    
    
    /**
     * Gets the "AddressRecipientName" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getAddressRecipientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AddressRecipientName" element
     */
    public boolean isNilAddressRecipientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AddressRecipientName" element
     */
    public void setAddressRecipientName(gov.niem.niem.niem_core._2_0.TextType addressRecipientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSRECIPIENTNAME$0);
            }
            target.set(addressRecipientName);
        }
    }
    
    /**
     * Appends and returns a new empty "AddressRecipientName" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewAddressRecipientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSRECIPIENTNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "AddressRecipientName" element
     */
    public void setNilAddressRecipientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSRECIPIENTNAME$0);
            }
            target.setNil();
        }
    }
}
