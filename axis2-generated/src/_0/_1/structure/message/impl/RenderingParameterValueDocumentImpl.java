/*
 * An XML document type.
 * Localname: RenderingParameterValue
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.RenderingParameterValueDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one RenderingParameterValue(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingParameterValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.RenderingParameterValueDocument
{
    
    public RenderingParameterValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGPARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterValue");
    
    
    /**
     * Gets the "RenderingParameterValue" element
     */
    public java.lang.String getRenderingParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingParameterValue" element
     */
    public org.apache.xmlbeans.XmlString xgetRenderingParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenderingParameterValue" element
     */
    public void setRenderingParameterValue(java.lang.String renderingParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGPARAMETERVALUE$0);
            }
            target.setStringValue(renderingParameterValue);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingParameterValue" element
     */
    public void xsetRenderingParameterValue(org.apache.xmlbeans.XmlString renderingParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGPARAMETERVALUE$0);
            }
            target.set(renderingParameterValue);
        }
    }
}
