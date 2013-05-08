/*
 * An XML document type.
 * Localname: RelativeLocationDistanceText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.RelativeLocationDistanceTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one RelativeLocationDistanceText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class RelativeLocationDistanceTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.RelativeLocationDistanceTextDocument
{
    
    public RelativeLocationDistanceTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONDISTANCETEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDistanceText");
    
    
    /**
     * Gets the "RelativeLocationDistanceText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getRelativeLocationDistanceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelativeLocationDistanceText" element
     */
    public boolean isNilRelativeLocationDistanceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelativeLocationDistanceText" element
     */
    public void setRelativeLocationDistanceText(gov.niem.niem.niem_core._2_0.TextType relativeLocationDistanceText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(RELATIVELOCATIONDISTANCETEXT$0);
            }
            target.set(relativeLocationDistanceText);
        }
    }
    
    /**
     * Appends and returns a new empty "RelativeLocationDistanceText" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewRelativeLocationDistanceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(RELATIVELOCATIONDISTANCETEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelativeLocationDistanceText" element
     */
    public void setNilRelativeLocationDistanceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(RELATIVELOCATIONDISTANCETEXT$0);
            }
            target.setNil();
        }
    }
}
