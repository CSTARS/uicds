/*
 * An XML document type.
 * Localname: StructuredPayloadMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.StructuredPayloadMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one StructuredPayloadMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class StructuredPayloadMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.StructuredPayloadMetadataDocument
{
    
    public StructuredPayloadMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOADMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayloadMetadata");
    
    
    /**
     * Gets the "StructuredPayloadMetadata" element
     */
    public _0._1.structure.message.StructuredPayloadMetadataType getStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredPayloadMetadata" element
     */
    public void setStructuredPayloadMetadata(_0._1.structure.message.StructuredPayloadMetadataType structuredPayloadMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            }
            target.set(structuredPayloadMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredPayloadMetadata" element
     */
    public _0._1.structure.message.StructuredPayloadMetadataType addNewStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            return target;
        }
    }
}
