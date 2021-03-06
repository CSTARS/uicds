/*
 * An XML document type.
 * Localname: creator
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.CreatorDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one creator(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class CreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.CreatorDocument
{
    
    public CreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATOR$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "creator");
    
    
    /**
     * Gets the "creator" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    public void setCreator(mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType)get_store().add_element_user(CREATOR$0);
            }
            target.set(creator);
        }
    }
    
    /**
     * Appends and returns a new empty "creator" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType addNewCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CreatorType)get_store().add_element_user(CREATOR$0);
            return target;
        }
    }
}
