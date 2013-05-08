/*
 * An XML document type.
 * Localname: GeographicCoordinateLongitude
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.GeographicCoordinateLongitudeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one GeographicCoordinateLongitude(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class GeographicCoordinateLongitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.GeographicCoordinateLongitudeDocument
{
    
    public GeographicCoordinateLongitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATELONGITUDE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicCoordinateLongitude");
    
    
    /**
     * Gets the "GeographicCoordinateLongitude" element
     */
    public gov.niem.niem.niem_core._2_0.LongitudeCoordinateType getGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeographicCoordinateLongitude" element
     */
    public boolean isNilGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GeographicCoordinateLongitude" element
     */
    public void setGeographicCoordinateLongitude(gov.niem.niem.niem_core._2_0.LongitudeCoordinateType geographicCoordinateLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$0);
            }
            target.set(geographicCoordinateLongitude);
        }
    }
    
    /**
     * Appends and returns a new empty "GeographicCoordinateLongitude" element
     */
    public gov.niem.niem.niem_core._2_0.LongitudeCoordinateType addNewGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GeographicCoordinateLongitude" element
     */
    public void setNilGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$0);
            }
            target.setNil();
        }
    }
}
