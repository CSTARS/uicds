/*
 * An XML document type.
 * Localname: RenderingParameter
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.RenderingParameterDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one RenderingParameter(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.RenderingParameterDocument
{
    
    public RenderingParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGPARAMETER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameter");
    
    
    /**
     * Gets the "RenderingParameter" element
     */
    public _0._1.structure.message.RenderingParameterType getRenderingParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingParameterType target = null;
            target = (_0._1.structure.message.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenderingParameter" element
     */
    public void setRenderingParameter(_0._1.structure.message.RenderingParameterType renderingParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingParameterType target = null;
            target = (_0._1.structure.message.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.RenderingParameterType)get_store().add_element_user(RENDERINGPARAMETER$0);
            }
            target.set(renderingParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "RenderingParameter" element
     */
    public _0._1.structure.message.RenderingParameterType addNewRenderingParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingParameterType target = null;
            target = (_0._1.structure.message.RenderingParameterType)get_store().add_element_user(RENDERINGPARAMETER$0);
            return target;
        }
    }
}
