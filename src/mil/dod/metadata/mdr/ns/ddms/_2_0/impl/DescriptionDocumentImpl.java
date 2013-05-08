/*
 * An XML document type.
 * Localname: description
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one description(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionDocument
{
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "description");
    
    
    /**
     * Gets the "description" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
}
