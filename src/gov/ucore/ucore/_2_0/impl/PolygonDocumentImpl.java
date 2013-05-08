/*
 * An XML document type.
 * Localname: Polygon
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PolygonDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one Polygon(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PolygonDocumentImpl extends gov.ucore.ucore._2_0.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore._2_0.PolygonDocument
{
    
    public PolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public gov.ucore.ucore._2_0.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PolygonType target = null;
            target = (gov.ucore.ucore._2_0.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Polygon" element
     */
    public void setPolygon(gov.ucore.ucore._2_0.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PolygonType target = null;
            target = (gov.ucore.ucore._2_0.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public gov.ucore.ucore._2_0.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PolygonType target = null;
            target = (gov.ucore.ucore._2_0.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
