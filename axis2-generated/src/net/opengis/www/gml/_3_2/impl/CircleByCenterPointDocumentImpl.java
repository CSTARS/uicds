/*
 * An XML document type.
 * Localname: CircleByCenterPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.CircleByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one CircleByCenterPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CircleByCenterPointDocumentImpl extends net.opengis.www.gml._3_2.impl.ArcByCenterPointDocumentImpl implements net.opengis.www.gml._3_2.CircleByCenterPointDocument
{
    
    public CircleByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint");
    
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.www.gml._3_2.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CircleByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.www.gml._3_2.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CircleByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.www.gml._3_2.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CircleByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            return target;
        }
    }
}
