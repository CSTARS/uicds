/*
 * XML Type:  EnvelopeType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.EnvelopeType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML EnvelopeType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class EnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.EnvelopeType
{
    
    public EnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
