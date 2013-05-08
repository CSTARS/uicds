/*
 * An XML document type.
 * Localname: LatitudeDegreeValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LatitudeDegreeValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LatitudeDegreeValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LatitudeDegreeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.LatitudeDegreeValueDocument
{
    
    public LatitudeDegreeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDEDEGREEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeDegreeValue");
    
    
    /**
     * Gets the "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niem_core._2_0.LatitudeDegreeType getLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LatitudeDegreeValue" element
     */
    public boolean isNilLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LatitudeDegreeValue" element
     */
    public void setLatitudeDegreeValue(gov.niem.niem.niem_core._2_0.LatitudeDegreeType latitudeDegreeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            }
            target.set(latitudeDegreeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niem_core._2_0.LatitudeDegreeType addNewLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LatitudeDegreeValue" element
     */
    public void setNilLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            }
            target.setNil();
        }
    }
}
