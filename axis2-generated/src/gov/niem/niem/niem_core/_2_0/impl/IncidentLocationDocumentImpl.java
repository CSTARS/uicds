/*
 * An XML document type.
 * Localname: IncidentLocation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.IncidentLocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one IncidentLocation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IncidentLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.IncidentLocationDocument
{
    
    public IncidentLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTLOCATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentLocation");
    
    
    /**
     * Gets the "IncidentLocation" element
     */
    public gov.niem.niem.niem_core._2_0.LocationType getIncidentLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LocationType target = null;
            target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IncidentLocation" element
     */
    public boolean isNilIncidentLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LocationType target = null;
            target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IncidentLocation" element
     */
    public void setIncidentLocation(gov.niem.niem.niem_core._2_0.LocationType incidentLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LocationType target = null;
            target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().add_element_user(INCIDENTLOCATION$0);
            }
            target.set(incidentLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentLocation" element
     */
    public gov.niem.niem.niem_core._2_0.LocationType addNewIncidentLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LocationType target = null;
            target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().add_element_user(INCIDENTLOCATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "IncidentLocation" element
     */
    public void setNilIncidentLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LocationType target = null;
            target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LocationType)get_store().add_element_user(INCIDENTLOCATION$0);
            }
            target.setNil();
        }
    }
}
