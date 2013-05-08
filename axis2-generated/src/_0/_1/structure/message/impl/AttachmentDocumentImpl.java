/*
 * An XML document type.
 * Localname: Attachment
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one Attachment(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends _0._1.structure.message.impl.PublishMessageItemAbstractDocumentImpl implements _0._1.structure.message.AttachmentDocument
{
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "Attachment");
    
    
    /**
     * Gets the "Attachment" element
     */
    public _0._1.structure.message.AttachmentType getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentType target = null;
            target = (_0._1.structure.message.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attachment" element
     */
    public void setAttachment(_0._1.structure.message.AttachmentType attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentType target = null;
            target = (_0._1.structure.message.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            }
            target.set(attachment);
        }
    }
    
    /**
     * Appends and returns a new empty "Attachment" element
     */
    public _0._1.structure.message.AttachmentType addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.AttachmentType target = null;
            target = (_0._1.structure.message.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
}
