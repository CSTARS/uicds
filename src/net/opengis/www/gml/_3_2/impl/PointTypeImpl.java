/*
 * XML Type:  PointType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.PointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * An XML PointType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class PointTypeImpl extends net.opengis.www.gml._3_2.impl.AbstractGeometricPrimitiveTypeImpl implements net.opengis.www.gml._3_2.PointType
{
    
    public PointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.www.gml._3_2.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(net.opengis.www.gml._3_2.DirectPositionType pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public net.opengis.www.gml._3_2.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
}
