/*
 * An XML document type.
 * Localname: SystemMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.SystemMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one SystemMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class SystemMetadataDomainAttributeDocumentImpl extends _0._1.structure.message.impl.SystemMetadataExtensionAbstractDocumentImpl implements _0._1.structure.message.SystemMetadataDomainAttributeDocument
{
    
    public SystemMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataDomainAttribute");
    
    
    /**
     * Gets the "SystemMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getSystemMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemMetadataDomainAttribute" element
     */
    public void setSystemMetadataDomainAttribute(_0._1.structure.message.DomainAttributeType systemMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0);
            }
            target.set(systemMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewSystemMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
