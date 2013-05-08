/*
 * An XML document type.
 * Localname: PDMessageMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PDMessageMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PDMessageMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PDMessageMetadataDomainAttributeDocumentImpl extends _0._1.structure.message.impl.PDMessageMetadataExtensionAbstractDocumentImpl implements _0._1.structure.message.PDMessageMetadataDomainAttributeDocument
{
    
    public PDMessageMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataDomainAttribute");
    
    
    /**
     * Gets the "PDMessageMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getPDMessageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadataDomainAttribute" element
     */
    public void setPDMessageMetadataDomainAttribute(_0._1.structure.message.DomainAttributeType pdMessageMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0);
            }
            target.set(pdMessageMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewPDMessageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
