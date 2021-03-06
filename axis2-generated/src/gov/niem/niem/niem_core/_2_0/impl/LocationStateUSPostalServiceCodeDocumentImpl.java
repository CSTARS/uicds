/*
 * An XML document type.
 * Localname: LocationStateUSPostalServiceCode
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LocationStateUSPostalServiceCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LocationStateUSPostalServiceCode(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationStateUSPostalServiceCodeDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.LocationStateDocumentImpl implements gov.niem.niem.niem_core._2_0.LocationStateUSPostalServiceCodeDocument
{
    
    public LocationStateUSPostalServiceCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSTATEUSPOSTALSERVICECODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStateUSPostalServiceCode");
    
    
    /**
     * Gets the "LocationStateUSPostalServiceCode" element
     */
    public gov.niem.niem.usps_states._2_0.USStateCodeType getLocationStateUSPostalServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.usps_states._2_0.USStateCodeType target = null;
            target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().find_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationStateUSPostalServiceCode" element
     */
    public boolean isNilLocationStateUSPostalServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.usps_states._2_0.USStateCodeType target = null;
            target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().find_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationStateUSPostalServiceCode" element
     */
    public void setLocationStateUSPostalServiceCode(gov.niem.niem.usps_states._2_0.USStateCodeType locationStateUSPostalServiceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.usps_states._2_0.USStateCodeType target = null;
            target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().find_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().add_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0);
            }
            target.set(locationStateUSPostalServiceCode);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationStateUSPostalServiceCode" element
     */
    public gov.niem.niem.usps_states._2_0.USStateCodeType addNewLocationStateUSPostalServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.usps_states._2_0.USStateCodeType target = null;
            target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().add_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationStateUSPostalServiceCode" element
     */
    public void setNilLocationStateUSPostalServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.usps_states._2_0.USStateCodeType target = null;
            target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().find_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.usps_states._2_0.USStateCodeType)get_store().add_element_user(LOCATIONSTATEUSPOSTALSERVICECODE$0);
            }
            target.setNil();
        }
    }
}
