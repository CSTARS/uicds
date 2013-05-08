/*
 * An XML document type.
 * Localname: IdentificationCategoryDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.IdentificationCategoryDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one IdentificationCategoryDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationCategoryDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.IdentificationCategoryDescriptionTextDocument
{
    
    public IdentificationCategoryDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategoryDescriptionText");
    
    
    /**
     * Gets the "IdentificationCategoryDescriptionText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getIdentificationCategoryDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationCategoryDescriptionText" element
     */
    public boolean isNilIdentificationCategoryDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationCategoryDescriptionText" element
     */
    public void setIdentificationCategoryDescriptionText(gov.niem.niem.niem_core._2_0.TextType identificationCategoryDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0);
            }
            target.set(identificationCategoryDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationCategoryDescriptionText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewIdentificationCategoryDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationCategoryDescriptionText" element
     */
    public void setNilIdentificationCategoryDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
