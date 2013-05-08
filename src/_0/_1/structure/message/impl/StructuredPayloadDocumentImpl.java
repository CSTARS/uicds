/*
 * An XML document type.
 * Localname: StructuredPayload
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.StructuredPayloadDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one StructuredPayload(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class StructuredPayloadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.StructuredPayloadDocument
{
    
    public StructuredPayloadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOAD$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayload");
    
    
    /**
     * Gets the "StructuredPayload" element
     */
    public _0._1.structure.message.StructuredPayloadType getStructuredPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadType target = null;
            target = (_0._1.structure.message.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredPayload" element
     */
    public void setStructuredPayload(_0._1.structure.message.StructuredPayloadType structuredPayload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadType target = null;
            target = (_0._1.structure.message.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.StructuredPayloadType)get_store().add_element_user(STRUCTUREDPAYLOAD$0);
            }
            target.set(structuredPayload);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredPayload" element
     */
    public _0._1.structure.message.StructuredPayloadType addNewStructuredPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadType target = null;
            target = (_0._1.structure.message.StructuredPayloadType)get_store().add_element_user(STRUCTUREDPAYLOAD$0);
            return target;
        }
    }
}
