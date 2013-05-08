/*
 * An XML document type.
 * Localname: DataOwnerMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataOwnerMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataOwnerMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerMetadataDomainAttributeDocumentImpl extends _0._1.structure.message.impl.DataOwnerMetadataExtensionAbstractDocumentImpl implements _0._1.structure.message.DataOwnerMetadataDomainAttributeDocument
{
    
    public DataOwnerMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataDomainAttribute");
    
    
    /**
     * Gets the "DataOwnerMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getDataOwnerMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadataDomainAttribute" element
     */
    public void setDataOwnerMetadataDomainAttribute(_0._1.structure.message.DomainAttributeType dataOwnerMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0);
            }
            target.set(dataOwnerMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadataDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewDataOwnerMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
