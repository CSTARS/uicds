/*
 * XML Type:  PolygonType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PolygonType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML PolygonType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PolygonTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.PolygonType
{
    
    public PolygonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.www.gml._3_2.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PolygonType target = null;
            target = (net.opengis.www.gml._3_2.PolygonType)get_store().find_element_user(POLYGON$0, 0);
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
    public void setPolygon(net.opengis.www.gml._3_2.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PolygonType target = null;
            target = (net.opengis.www.gml._3_2.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.www.gml._3_2.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PolygonType target = null;
            target = (net.opengis.www.gml._3_2.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
