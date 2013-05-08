/*
 * An XML document type.
 * Localname: PackageMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PackageMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PackageMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PackageMetadataDomainAttributeDocumentImpl extends _0._1.structure.message.impl.PackageMetadataExtensionAbstractDocumentImpl implements _0._1.structure.message.PackageMetadataDomainAttributeDocument
{
    
    public PackageMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataDomainAttribute");
    
    
    /**
     * Gets the "PackageMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getPackageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadataDomainAttribute" element
     */
    public void setPackageMetadataDomainAttribute(_0._1.structure.message.DomainAttributeType packageMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0);
            }
            target.set(packageMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewPackageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
