/*
 * An XML document type.
 * Localname: BinaryAttachment
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.BinaryAttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one BinaryAttachment(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class BinaryAttachmentDocumentImpl extends _0._1.structure.message.impl.AttachmentContentAbstractDocumentImpl implements gov.ucore.ucore._2_0.BinaryAttachmentDocument
{
    
    public BinaryAttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARYATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryAttachment");
    
    
    /**
     * Gets the "BinaryAttachment" element
     */
    public gov.ucore.ucore._2_0.BinaryAttachmentType getBinaryAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.BinaryAttachmentType target = null;
            target = (gov.ucore.ucore._2_0.BinaryAttachmentType)get_store().find_element_user(BINARYATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BinaryAttachment" element
     */
    public void setBinaryAttachment(gov.ucore.ucore._2_0.BinaryAttachmentType binaryAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.BinaryAttachmentType target = null;
            target = (gov.ucore.ucore._2_0.BinaryAttachmentType)get_store().find_element_user(BINARYATTACHMENT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.BinaryAttachmentType)get_store().add_element_user(BINARYATTACHMENT$0);
            }
            target.set(binaryAttachment);
        }
    }
    
    /**
     * Appends and returns a new empty "BinaryAttachment" element
     */
    public gov.ucore.ucore._2_0.BinaryAttachmentType addNewBinaryAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.BinaryAttachmentType target = null;
            target = (gov.ucore.ucore._2_0.BinaryAttachmentType)get_store().add_element_user(BINARYATTACHMENT$0);
            return target;
        }
    }
}
