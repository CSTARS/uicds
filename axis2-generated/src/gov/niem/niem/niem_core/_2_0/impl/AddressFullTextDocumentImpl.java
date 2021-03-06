/*
 * An XML document type.
 * Localname: AddressFullText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.AddressFullTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one AddressFullText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AddressFullTextDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.AddressRepresentationDocumentImpl implements gov.niem.niem.niem_core._2_0.AddressFullTextDocument
{
    
    public AddressFullTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSFULLTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressFullText");
    
    
    /**
     * Gets the "AddressFullText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getAddressFullText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSFULLTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AddressFullText" element
     */
    public boolean isNilAddressFullText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSFULLTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AddressFullText" element
     */
    public void setAddressFullText(gov.niem.niem.niem_core._2_0.TextType addressFullText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSFULLTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSFULLTEXT$0);
            }
            target.set(addressFullText);
        }
    }
    
    /**
     * Appends and returns a new empty "AddressFullText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewAddressFullText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSFULLTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "AddressFullText" element
     */
    public void setNilAddressFullText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ADDRESSFULLTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ADDRESSFULLTEXT$0);
            }
            target.setNil();
        }
    }
}
