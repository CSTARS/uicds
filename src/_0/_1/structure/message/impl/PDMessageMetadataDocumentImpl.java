/*
 * An XML document type.
 * Localname: PDMessageMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PDMessageMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PDMessageMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PDMessageMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PDMessageMetadataDocument
{
    
    public PDMessageMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadata");
    
    
    /**
     * Gets the "PDMessageMetadata" element
     */
    public _0._1.structure.message.PDMessageMetadataType getPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadata" element
     */
    public void setPDMessageMetadata(_0._1.structure.message.PDMessageMetadataType pdMessageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            }
            target.set(pdMessageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadata" element
     */
    public _0._1.structure.message.PDMessageMetadataType addNewPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            return target;
        }
    }
}
