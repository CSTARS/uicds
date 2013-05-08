/*
 * An XML document type.
 * Localname: AreaCircularRegion
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.AreaCircularRegionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one AreaCircularRegion(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AreaCircularRegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.AreaCircularRegionDocument
{
    
    public AreaCircularRegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREACIRCULARREGION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaCircularRegion");
    
    
    /**
     * Gets the "AreaCircularRegion" element
     */
    public gov.niem.niem.niem_core._2_0.CircularRegionType getAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.CircularRegionType target = null;
            target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AreaCircularRegion" element
     */
    public boolean isNilAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.CircularRegionType target = null;
            target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AreaCircularRegion" element
     */
    public void setAreaCircularRegion(gov.niem.niem.niem_core._2_0.CircularRegionType areaCircularRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.CircularRegionType target = null;
            target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            }
            target.set(areaCircularRegion);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaCircularRegion" element
     */
    public gov.niem.niem.niem_core._2_0.CircularRegionType addNewAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.CircularRegionType target = null;
            target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AreaCircularRegion" element
     */
    public void setNilAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.CircularRegionType target = null;
            target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            }
            target.setNil();
        }
    }
}
