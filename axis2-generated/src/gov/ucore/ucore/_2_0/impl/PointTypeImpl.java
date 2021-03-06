/*
 * XML Type:  PointType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PointType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML PointType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PointTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.PointType
{
    
    public PointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point");
    
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.www.gml._3_2.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PointType target = null;
            target = (net.opengis.www.gml._3_2.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.www.gml._3_2.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PointType target = null;
            target = (net.opengis.www.gml._3_2.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.www.gml._3_2.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.PointType target = null;
            target = (net.opengis.www.gml._3_2.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
}
