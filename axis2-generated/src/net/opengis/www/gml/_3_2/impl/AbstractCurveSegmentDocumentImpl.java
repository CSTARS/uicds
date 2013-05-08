/*
 * An XML document type.
 * Localname: AbstractCurveSegment
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.AbstractCurveSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one AbstractCurveSegment(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCurveSegmentDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractObjectDocumentImpl implements net.opengis.www.gml._3_2.AbstractCurveSegmentDocument
{
    
    public AbstractCurveSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment"),
    });
    
    
    /**
     * Gets the "AbstractCurveSegment" element
     */
    public net.opengis.www.gml._3_2.AbstractCurveSegmentType getAbstractCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveSegmentType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCurveSegment" element
     */
    public void setAbstractCurveSegment(net.opengis.www.gml._3_2.AbstractCurveSegmentType abstractCurveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveSegmentType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractCurveSegmentType)get_store().add_element_user(ABSTRACTCURVESEGMENT$0);
            }
            target.set(abstractCurveSegment);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCurveSegment" element
     */
    public net.opengis.www.gml._3_2.AbstractCurveSegmentType addNewAbstractCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveSegmentType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveSegmentType)get_store().add_element_user(ABSTRACTCURVESEGMENT$0);
            return target;
        }
    }
}
