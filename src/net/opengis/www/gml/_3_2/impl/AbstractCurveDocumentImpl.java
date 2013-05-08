/*
 * An XML document type.
 * Localname: AbstractCurve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.AbstractCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one AbstractCurve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCurveDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractGeometricPrimitiveDocumentImpl implements net.opengis.www.gml._3_2.AbstractCurveDocument
{
    
    public AbstractCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCURVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
    });
    
    
    /**
     * Gets the "AbstractCurve" element
     */
    public net.opengis.www.gml._3_2.AbstractCurveType getAbstractCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveType)get_store().find_element_user(ABSTRACTCURVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCurve" element
     */
    public void setAbstractCurve(net.opengis.www.gml._3_2.AbstractCurveType abstractCurve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveType)get_store().find_element_user(ABSTRACTCURVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractCurveType)get_store().add_element_user(ABSTRACTCURVE$0);
            }
            target.set(abstractCurve);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCurve" element
     */
    public net.opengis.www.gml._3_2.AbstractCurveType addNewAbstractCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractCurveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractCurveType)get_store().add_element_user(ABSTRACTCURVE$0);
            return target;
        }
    }
}
