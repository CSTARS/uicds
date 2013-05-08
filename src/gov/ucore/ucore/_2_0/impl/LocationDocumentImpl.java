/*
 * An XML document type.
 * Localname: Location
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one Location(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends gov.ucore.ucore._2_0.impl.ThingAbstractDocumentImpl implements gov.ucore.ucore._2_0.LocationDocument
{
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Location");
    
    
    /**
     * Gets the "Location" element
     */
    public gov.ucore.ucore._2_0.LocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.LocationType target = null;
            target = (gov.ucore.ucore._2_0.LocationType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(gov.ucore.ucore._2_0.LocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.LocationType target = null;
            target = (gov.ucore.ucore._2_0.LocationType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.LocationType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public gov.ucore.ucore._2_0.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.LocationType target = null;
            target = (gov.ucore.ucore._2_0.LocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
