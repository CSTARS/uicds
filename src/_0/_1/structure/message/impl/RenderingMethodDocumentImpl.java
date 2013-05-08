/*
 * An XML document type.
 * Localname: RenderingMethod
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.RenderingMethodDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one RenderingMethod(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.RenderingMethodDocument
{
    
    public RenderingMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGMETHOD$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingMethod");
    
    
    /**
     * Gets the "RenderingMethod" element
     */
    public _0._1.codes.message.RenderingMethodCodeSimpleType.Enum getRenderingMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return (_0._1.codes.message.RenderingMethodCodeSimpleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingMethod" element
     */
    public _0._1.codes.message.RenderingMethodCodeSimpleType xgetRenderingMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.RenderingMethodCodeSimpleType target = null;
            target = (_0._1.codes.message.RenderingMethodCodeSimpleType)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenderingMethod" element
     */
    public void setRenderingMethod(_0._1.codes.message.RenderingMethodCodeSimpleType.Enum renderingMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGMETHOD$0);
            }
            target.setEnumValue(renderingMethod);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingMethod" element
     */
    public void xsetRenderingMethod(_0._1.codes.message.RenderingMethodCodeSimpleType renderingMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.RenderingMethodCodeSimpleType target = null;
            target = (_0._1.codes.message.RenderingMethodCodeSimpleType)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                target = (_0._1.codes.message.RenderingMethodCodeSimpleType)get_store().add_element_user(RENDERINGMETHOD$0);
            }
            target.set(renderingMethod);
        }
    }
}
