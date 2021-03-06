/*
 * An XML document type.
 * Localname: LocationCountyName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LocationCountyNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LocationCountyName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCountyNameDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.LocationCountyDocumentImpl implements gov.niem.niem.niem_core._2_0.LocationCountyNameDocument
{
    
    public LocationCountyNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCOUNTYNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountyName");
    
    
    /**
     * Gets the "LocationCountyName" element
     */
    public gov.niem.niem.niem_core._2_0.ProperNameTextType getLocationCountyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ProperNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().find_element_user(LOCATIONCOUNTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationCountyName" element
     */
    public boolean isNilLocationCountyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ProperNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().find_element_user(LOCATIONCOUNTYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationCountyName" element
     */
    public void setLocationCountyName(gov.niem.niem.niem_core._2_0.ProperNameTextType locationCountyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ProperNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().find_element_user(LOCATIONCOUNTYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().add_element_user(LOCATIONCOUNTYNAME$0);
            }
            target.set(locationCountyName);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCountyName" element
     */
    public gov.niem.niem.niem_core._2_0.ProperNameTextType addNewLocationCountyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ProperNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().add_element_user(LOCATIONCOUNTYNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationCountyName" element
     */
    public void setNilLocationCountyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ProperNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().find_element_user(LOCATIONCOUNTYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ProperNameTextType)get_store().add_element_user(LOCATIONCOUNTYNAME$0);
            }
            target.setNil();
        }
    }
}
