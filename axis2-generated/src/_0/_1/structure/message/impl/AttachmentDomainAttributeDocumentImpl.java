/*
 * An XML document type.
 * Localname: AttachmentDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.AttachmentDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one AttachmentDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentDomainAttributeDocumentImpl extends _0._1.structure.message.impl.AttachmentExtensionAbstractDocumentImpl implements _0._1.structure.message.AttachmentDomainAttributeDocument
{
    
    public AttachmentDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTDOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDomainAttribute");
    
    
    /**
     * Gets the "AttachmentDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getAttachmentDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(ATTACHMENTDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentDomainAttribute" element
     */
    public void setAttachmentDomainAttribute(_0._1.structure.message.DomainAttributeType attachmentDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(ATTACHMENTDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(ATTACHMENTDOMAINATTRIBUTE$0);
            }
            target.set(attachmentDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewAttachmentDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(ATTACHMENTDOMAINATTRIBUTE$0);
            return target;
        }
    }
}
