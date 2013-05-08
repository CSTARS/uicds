/*
 * XML Type:  ThingAttachmentLinkAssociationType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML ThingAttachmentLinkAssociationType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class ThingAttachmentLinkAssociationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType
{
    
    public ThingAttachmentLinkAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference");
    private static final javax.xml.namespace.QName ATTACHMENTLINKREFERENCE$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentLinkReference");
    private static final javax.xml.namespace.QName DESCRIPTOR$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Descriptor");
    
    
    /**
     * Gets the "ObjectReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObjectReference" element
     */
    public void setObjectReference(_0._1.library.message.ValidatingReferenceType objectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            }
            target.set(objectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    public _0._1.library.message.ValidatingReferenceType addNewObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "AttachmentLinkReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$2, 0);
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
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$2, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$2);
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
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "Descriptor" element
     */
    public gov.ucore.ucore._2_0.StringType getDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(DESCRIPTOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Descriptor" element
     */
    public boolean isSetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTOR$4) != 0;
        }
    }
    
    /**
     * Sets the "Descriptor" element
     */
    public void setDescriptor(gov.ucore.ucore._2_0.StringType descriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(DESCRIPTOR$4, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(DESCRIPTOR$4);
            }
            target.set(descriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "Descriptor" element
     */
    public gov.ucore.ucore._2_0.StringType addNewDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(DESCRIPTOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Descriptor" element
     */
    public void unsetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTOR$4, 0);
        }
    }
}
