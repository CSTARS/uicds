/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one Envelope(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends net.opengis.www.gml._3_2.impl.AbstractObjectDocumentImpl implements net.opengis.www.gml._3_2.EnvelopeDocument
{
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Envelope");
    
    
    /**
     * Gets the "Envelope" element
     */
    public net.opengis.www.gml._3_2.EnvelopeType getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.EnvelopeType target = null;
            target = (net.opengis.www.gml._3_2.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    public void setEnvelope(net.opengis.www.gml._3_2.EnvelopeType envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.EnvelopeType target = null;
            target = (net.opengis.www.gml._3_2.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public net.opengis.www.gml._3_2.EnvelopeType addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.EnvelopeType target = null;
            target = (net.opengis.www.gml._3_2.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
