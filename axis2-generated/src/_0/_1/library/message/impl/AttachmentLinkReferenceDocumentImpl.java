/*
 * An XML document type.
 * Localname: AttachmentLinkReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.AttachmentLinkReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one AttachmentLinkReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.AttachmentLinkReferenceDocument
{
    
    public AttachmentLinkReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINKREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "AttachmentLinkReference");
    
    
    /**
     * Gets the "AttachmentLinkReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType getAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentLinkReference" element
     */
    public void setAttachmentLinkReference(_0._1.library.message.NonValidatingReferenceType attachmentLinkReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            }
            target.set(attachmentLinkReference);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLinkReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType addNewAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            return target;
        }
    }
}
