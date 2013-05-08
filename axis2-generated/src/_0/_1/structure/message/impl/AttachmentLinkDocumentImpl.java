/*
 * An XML document type.
 * Localname: AttachmentLink
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.AttachmentLinkDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one AttachmentLink(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.AttachmentLinkDocument
{
    
    public AttachmentLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINK$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLink");
    
    
    /**
     * Gets the "AttachmentLink" element
     */
    public _0._1.structure.message.AttachmentLinkType getAttachmentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentLinkType target = null;
            target = (_0._1.structure.message.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentLink" element
     */
    public void setAttachmentLink(_0._1.structure.message.AttachmentLinkType attachmentLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentLinkType target = null;
            target = (_0._1.structure.message.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.AttachmentLinkType)get_store().add_element_user(ATTACHMENTLINK$0);
            }
            target.set(attachmentLink);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLink" element
     */
    public _0._1.structure.message.AttachmentLinkType addNewAttachmentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentLinkType target = null;
            target = (_0._1.structure.message.AttachmentLinkType)get_store().add_element_user(ATTACHMENTLINK$0);
            return target;
        }
    }
}
