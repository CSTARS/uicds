/*
 * An XML document type.
 * Localname: IdentificationCategoryText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.IdentificationCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one IdentificationCategoryText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationCategoryTextDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.IdentificationCategoryDocumentImpl implements gov.niem.niem.niem_core._2_0.IdentificationCategoryTextDocument
{
    
    public IdentificationCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategoryText");
    
    
    /**
     * Gets the "IdentificationCategoryText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getIdentificationCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationCategoryText" element
     */
    public boolean isNilIdentificationCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationCategoryText" element
     */
    public void setIdentificationCategoryText(gov.niem.niem.niem_core._2_0.TextType identificationCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYTEXT$0);
            }
            target.set(identificationCategoryText);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationCategoryText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewIdentificationCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationCategoryText" element
     */
    public void setNilIdentificationCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYTEXT$0);
            }
            target.setNil();
        }
    }
}
