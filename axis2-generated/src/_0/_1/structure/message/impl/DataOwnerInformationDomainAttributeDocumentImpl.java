/*
 * An XML document type.
 * Localname: DataOwnerInformationDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataOwnerInformationDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataOwnerInformationDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerInformationDomainAttributeDocumentImpl extends _0._1.structure.message.impl.DataOwnerInformationExtensionAbstractDocumentImpl implements _0._1.structure.message.DataOwnerInformationDomainAttributeDocument
{
    
    public DataOwnerInformationDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERINFORMATIONDOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerInformationDomainAttribute");
    
    
    /**
     * Gets the "DataOwnerInformationDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType getDataOwnerInformationDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerInformationDomainAttribute" element
     */
    public void setDataOwnerInformationDomainAttribute(_0._1.structure.message.DomainAttributeType dataOwnerInformationDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().find_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0);
            }
            target.set(dataOwnerInformationDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerInformationDomainAttribute" element
     */
    public _0._1.structure.message.DomainAttributeType addNewDataOwnerInformationDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DomainAttributeType target = null;
            target = (_0._1.structure.message.DomainAttributeType)get_store().add_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0);
            return target;
        }
    }
}
