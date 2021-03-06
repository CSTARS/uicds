/*
 * An XML document type.
 * Localname: AbstractGeometricPrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.AbstractGeometricPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one AbstractGeometricPrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeometricPrimitiveDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractGeometryDocumentImpl implements net.opengis.www.gml._3_2.AbstractGeometricPrimitiveDocument
{
    
    public AbstractGeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
    });
    
    
    /**
     * Gets the "AbstractGeometricPrimitive" element
     */
    public net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType getAbstractGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType)get_store().find_element_user(ABSTRACTGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeometricPrimitive" element
     */
    public void setAbstractGeometricPrimitive(net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType abstractGeometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType)get_store().find_element_user(ABSTRACTGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType)get_store().add_element_user(ABSTRACTGEOMETRICPRIMITIVE$0);
            }
            target.set(abstractGeometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeometricPrimitive" element
     */
    public net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType addNewAbstractGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGeometricPrimitiveType)get_store().add_element_user(ABSTRACTGEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
