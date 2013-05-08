/*
 * An XML document type.
 * Localname: RenderingInstructions
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.RenderingInstructionsDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one RenderingInstructions(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingInstructionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.RenderingInstructionsDocument
{
    
    public RenderingInstructionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGINSTRUCTIONS$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructions");
    
    
    /**
     * Gets the "RenderingInstructions" element
     */
    public _0._1.structure.message.RenderingInstructionsType getRenderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingInstructionsType target = null;
            target = (_0._1.structure.message.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenderingInstructions" element
     */
    public void setRenderingInstructions(_0._1.structure.message.RenderingInstructionsType renderingInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingInstructionsType target = null;
            target = (_0._1.structure.message.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.RenderingInstructionsType)get_store().add_element_user(RENDERINGINSTRUCTIONS$0);
            }
            target.set(renderingInstructions);
        }
    }
    
    /**
     * Appends and returns a new empty "RenderingInstructions" element
     */
    public _0._1.structure.message.RenderingInstructionsType addNewRenderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.RenderingInstructionsType target = null;
            target = (_0._1.structure.message.RenderingInstructionsType)get_store().add_element_user(RENDERINGINSTRUCTIONS$0);
            return target;
        }
    }
}
