/*
 * An XML document type.
 * Localname: exterior
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.ExteriorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one exterior(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ExteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.www.gml._3_2.ExteriorDocument
{
    
    public ExteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "exterior");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.www.gml._3_2.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingPropertyType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
    public void setExterior(net.opengis.www.gml._3_2.AbstractRingPropertyType exterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingPropertyType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            }
            target.set(exterior);
        }
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.www.gml._3_2.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingPropertyType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
}
