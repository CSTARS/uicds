/*
 * An XML document type.
 * Localname: ArcByCenterPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.ArcByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one ArcByCenterPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcByCenterPointDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.www.gml._3_2.ArcByCenterPointDocument
{
    
    public ArcByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint");
    private static final org.apache.xmlbeans.QNameSet ARCBYCENTERPOINT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
    });
    
    
    /**
     * Gets the "ArcByCenterPoint" element
     */
    public net.opengis.www.gml._3_2.ArcByCenterPointType getArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.ArcByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcByCenterPoint" element
     */
    public void setArcByCenterPoint(net.opengis.www.gml._3_2.ArcByCenterPointType arcByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.ArcByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            }
            target.set(arcByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcByCenterPoint" element
     */
    public net.opengis.www.gml._3_2.ArcByCenterPointType addNewArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.ArcByCenterPointType target = null;
            target = (net.opengis.www.gml._3_2.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            return target;
        }
    }
}
