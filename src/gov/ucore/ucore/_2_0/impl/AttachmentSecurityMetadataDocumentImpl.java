/*
 * An XML document type.
 * Localname: AttachmentSecurityMetadata
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.AttachmentSecurityMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one AttachmentSecurityMetadata(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AttachmentSecurityMetadataDocumentImpl extends _0._1.structure.message.impl.AttachmentExtensionAbstractDocumentImpl implements gov.ucore.ucore._2_0.AttachmentSecurityMetadataDocument
{
    
    public AttachmentSecurityMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTSECURITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentSecurityMetadata");
    
    
    /**
     * Gets the "AttachmentSecurityMetadata" element
     */
    public gov.ucore.ucore._2_0.AttachmentSecurityMetadataType getAttachmentSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AttachmentSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.AttachmentSecurityMetadataType)get_store().find_element_user(ATTACHMENTSECURITYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentSecurityMetadata" element
     */
    public void setAttachmentSecurityMetadata(gov.ucore.ucore._2_0.AttachmentSecurityMetadataType attachmentSecurityMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AttachmentSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.AttachmentSecurityMetadataType)get_store().find_element_user(ATTACHMENTSECURITYMETADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.AttachmentSecurityMetadataType)get_store().add_element_user(ATTACHMENTSECURITYMETADATA$0);
            }
            target.set(attachmentSecurityMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentSecurityMetadata" element
     */
    public gov.ucore.ucore._2_0.AttachmentSecurityMetadataType addNewAttachmentSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AttachmentSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.AttachmentSecurityMetadataType)get_store().add_element_user(ATTACHMENTSECURITYMETADATA$0);
            return target;
        }
    }
}
