/*
 * An XML document type.
 * Localname: LocationHighway
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LocationHighwayDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LocationHighway(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationHighwayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.LocationHighwayDocument
{
    
    public LocationHighwayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONHIGHWAY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationHighway");
    
    
    /**
     * Gets the "LocationHighway" element
     */
    public gov.niem.niem.niem_core._2_0.HighwayType getLocationHighway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.HighwayType target = null;
            target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationHighway" element
     */
    public boolean isNilLocationHighway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.HighwayType target = null;
            target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationHighway" element
     */
    public void setLocationHighway(gov.niem.niem.niem_core._2_0.HighwayType locationHighway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.HighwayType target = null;
            target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().add_element_user(LOCATIONHIGHWAY$0);
            }
            target.set(locationHighway);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationHighway" element
     */
    public gov.niem.niem.niem_core._2_0.HighwayType addNewLocationHighway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.HighwayType target = null;
            target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().add_element_user(LOCATIONHIGHWAY$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationHighway" element
     */
    public void setNilLocationHighway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.HighwayType target = null;
            target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.HighwayType)get_store().add_element_user(LOCATIONHIGHWAY$0);
            }
            target.setNil();
        }
    }
}
