/*
 * An XML document type.
 * Localname: DataItemPackage
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataItemPackageDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataItemPackage(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemPackageDocumentImpl extends _0._1.structure.message.impl.PublishMessageItemAbstractDocumentImpl implements _0._1.structure.message.DataItemPackageDocument
{
    
    public DataItemPackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMPACKAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPackage");
    
    
    /**
     * Gets the "DataItemPackage" element
     */
    public _0._1.structure.message.DataItemPackageType getDataItemPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemPackageType target = null;
            target = (_0._1.structure.message.DataItemPackageType)get_store().find_element_user(DATAITEMPACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemPackage" element
     */
    public void setDataItemPackage(_0._1.structure.message.DataItemPackageType dataItemPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemPackageType target = null;
            target = (_0._1.structure.message.DataItemPackageType)get_store().find_element_user(DATAITEMPACKAGE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DataItemPackageType)get_store().add_element_user(DATAITEMPACKAGE$0);
            }
            target.set(dataItemPackage);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemPackage" element
     */
    public _0._1.structure.message.DataItemPackageType addNewDataItemPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemPackageType target = null;
            target = (_0._1.structure.message.DataItemPackageType)get_store().add_element_user(DATAITEMPACKAGE$0);
            return target;
        }
    }
}
