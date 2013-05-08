/*
 * An XML document type.
 * Localname: GeoLocation
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.GeoLocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one GeoLocation(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class GeoLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.GeoLocationDocument
{
    
    public GeoLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOLOCATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocation");
    
    
    /**
     * Gets the "GeoLocation" element
     */
    public gov.ucore.ucore._2_0.GeoLocationType getGeoLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.GeoLocationType target = null;
            target = (gov.ucore.ucore._2_0.GeoLocationType)get_store().find_element_user(GEOLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeoLocation" element
     */
    public void setGeoLocation(gov.ucore.ucore._2_0.GeoLocationType geoLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.GeoLocationType target = null;
            target = (gov.ucore.ucore._2_0.GeoLocationType)get_store().find_element_user(GEOLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.GeoLocationType)get_store().add_element_user(GEOLOCATION$0);
            }
            target.set(geoLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "GeoLocation" element
     */
    public gov.ucore.ucore._2_0.GeoLocationType addNewGeoLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.GeoLocationType target = null;
            target = (gov.ucore.ucore._2_0.GeoLocationType)get_store().add_element_user(GEOLOCATION$0);
            return target;
        }
    }
}
