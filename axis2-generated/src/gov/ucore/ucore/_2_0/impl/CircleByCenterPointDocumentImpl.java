/*
 * An XML document type.
 * Localname: CircleByCenterPoint
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.CircleByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one CircleByCenterPoint(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class CircleByCenterPointDocumentImpl extends gov.ucore.ucore._2_0.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore._2_0.CircleByCenterPointDocument
{
    
    public CircleByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CircleByCenterPoint");
    
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public gov.ucore.ucore._2_0.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CircleByCenterPointType target = null;
            target = (gov.ucore.ucore._2_0.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
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
    public void setCircleByCenterPoint(gov.ucore.ucore._2_0.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CircleByCenterPointType target = null;
            target = (gov.ucore.ucore._2_0.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public gov.ucore.ucore._2_0.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.CircleByCenterPointType target = null;
            target = (gov.ucore.ucore._2_0.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            return target;
        }
    }
}
