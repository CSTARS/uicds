/*
 * An XML document type.
 * Localname: AbstractRing
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.AbstractRingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one AbstractRing(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractRingDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractObjectDocumentImpl implements net.opengis.www.gml._3_2.AbstractRingDocument
{
    
    public AbstractRingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing"),
    });
    
    
    /**
     * Gets the "AbstractRing" element
     */
    public net.opengis.www.gml._3_2.AbstractRingType getAbstractRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingType)get_store().find_element_user(ABSTRACTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractRing" element
     */
    public void setAbstractRing(net.opengis.www.gml._3_2.AbstractRingType abstractRing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingType)get_store().find_element_user(ABSTRACTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.AbstractRingType)get_store().add_element_user(ABSTRACTRING$0);
            }
            target.set(abstractRing);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractRing" element
     */
    public net.opengis.www.gml._3_2.AbstractRingType addNewAbstractRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.AbstractRingType target = null;
            target = (net.opengis.www.gml._3_2.AbstractRingType)get_store().add_element_user(ABSTRACTRING$0);
            return target;
        }
    }
}
