/*
 * An XML document type.
 * Localname: LinearRing
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.LinearRingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one LinearRing(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LinearRingDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractRingDocumentImpl implements net.opengis.www.gml._3_2.LinearRingDocument
{
    
    public LinearRingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINEARRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearRing");
    
    
    /**
     * Gets the "LinearRing" element
     */
    public net.opengis.www.gml._3_2.LinearRingType getLinearRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.LinearRingType target = null;
            target = (net.opengis.www.gml._3_2.LinearRingType)get_store().find_element_user(LINEARRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LinearRing" element
     */
    public void setLinearRing(net.opengis.www.gml._3_2.LinearRingType linearRing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.LinearRingType target = null;
            target = (net.opengis.www.gml._3_2.LinearRingType)get_store().find_element_user(LINEARRING$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.LinearRingType)get_store().add_element_user(LINEARRING$0);
            }
            target.set(linearRing);
        }
    }
    
    /**
     * Appends and returns a new empty "LinearRing" element
     */
    public net.opengis.www.gml._3_2.LinearRingType addNewLinearRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.LinearRingType target = null;
            target = (net.opengis.www.gml._3_2.LinearRingType)get_store().add_element_user(LINEARRING$0);
            return target;
        }
    }
}
