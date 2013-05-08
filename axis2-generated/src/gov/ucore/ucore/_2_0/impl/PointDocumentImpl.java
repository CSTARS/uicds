/*
 * An XML document type.
 * Localname: Point
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PointDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one Point(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PointDocumentImpl extends gov.ucore.ucore._2_0.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore._2_0.PointDocument
{
    
    public PointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Point");
    
    
    /**
     * Gets the "Point" element
     */
    public gov.ucore.ucore._2_0.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PointType target = null;
            target = (gov.ucore.ucore._2_0.PointType)get_store().find_element_user(POINT$0, 0);
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
    public void setPoint(gov.ucore.ucore._2_0.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PointType target = null;
            target = (gov.ucore.ucore._2_0.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public gov.ucore.ucore._2_0.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PointType target = null;
            target = (gov.ucore.ucore._2_0.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
}
