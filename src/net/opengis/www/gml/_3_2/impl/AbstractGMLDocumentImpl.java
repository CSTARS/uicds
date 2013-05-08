/*
 * An XML document type.
 * Localname: AbstractGML
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.AbstractGMLDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one AbstractGML(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGMLDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractObjectDocumentImpl implements net.opengis.www.gml._3_2.AbstractGMLDocument
{
    
    public AbstractGMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGML$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGML$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
    });
    
    
    /**
     * Gets the "AbstractGML" element
     */
    public net.opengis.www.gml._3_2.AbstractGMLType getAbstractGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGMLType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGMLType)get_store().find_element_user(ABSTRACTGML$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGML" element
     */
    public void setAbstractGML(net.opengis.www.gml._3_2.AbstractGMLType abstractGML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGMLType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGMLType)get_store().find_element_user(ABSTRACTGML$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractGMLType)get_store().add_element_user(ABSTRACTGML$0);
            }
            target.set(abstractGML);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGML" element
     */
    public net.opengis.www.gml._3_2.AbstractGMLType addNewAbstractGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractGMLType target = null;
            target = (net.opengis.www.gml._3_2.AbstractGMLType)get_store().add_element_user(ABSTRACTGML$0);
            return target;
        }
    }
}
