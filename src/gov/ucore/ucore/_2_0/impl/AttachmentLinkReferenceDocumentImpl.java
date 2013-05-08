/*
 * An XML document type.
 * Localname: AttachmentLinkReference
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.AttachmentLinkReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one AttachmentLinkReference(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.AttachmentLinkReferenceDocument
{
    
    public AttachmentLinkReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINKREFERENCE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentLinkReference");
    
    
    /**
     * Gets the "AttachmentLinkReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
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
    public void setAttachmentLinkReference(_0._1.library.message.ValidatingReferenceType attachmentLinkReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            }
            target.set(attachmentLinkReference);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLinkReference" element
     */
    public _0._1.library.message.ValidatingReferenceType addNewAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            return target;
        }
    }
}
