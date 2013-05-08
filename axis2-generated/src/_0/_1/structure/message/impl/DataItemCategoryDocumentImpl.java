/*
 * An XML document type.
 * Localname: DataItemCategory
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataItemCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataItemCategory(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataItemCategoryDocument
{
    
    public DataItemCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCATEGORY$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategory");
    
    
    /**
     * Gets the "DataItemCategory" element
     */
    public _0._1.structure.message.DataItemCategoryType getDataItemCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemCategoryType target = null;
            target = (_0._1.structure.message.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemCategory" element
     */
    public void setDataItemCategory(_0._1.structure.message.DataItemCategoryType dataItemCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemCategoryType target = null;
            target = (_0._1.structure.message.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DataItemCategoryType)get_store().add_element_user(DATAITEMCATEGORY$0);
            }
            target.set(dataItemCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemCategory" element
     */
    public _0._1.structure.message.DataItemCategoryType addNewDataItemCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataItemCategoryType target = null;
            target = (_0._1.structure.message.DataItemCategoryType)get_store().add_element_user(DATAITEMCATEGORY$0);
            return target;
        }
    }
}
