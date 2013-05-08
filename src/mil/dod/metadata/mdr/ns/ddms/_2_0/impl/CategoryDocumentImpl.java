/*
 * An XML document type.
 * Localname: category
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one category(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.CategoryDocument
{
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "category");
    
    
    /**
     * Gets the "category" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundCategoryIdentifierType)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
}
