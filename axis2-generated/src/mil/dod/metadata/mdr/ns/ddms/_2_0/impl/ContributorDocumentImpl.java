/*
 * An XML document type.
 * Localname: contributor
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.ContributorDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one contributor(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class ContributorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.ContributorDocument
{
    
    public ContributorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRIBUTOR$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "contributor");
    
    
    /**
     * Gets the "contributor" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType getContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contributor" element
     */
    public void setContributor(mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType)get_store().add_element_user(CONTRIBUTOR$0);
            }
            target.set(contributor);
        }
    }
    
    /**
     * Appends and returns a new empty "contributor" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType addNewContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.ContributorType)get_store().add_element_user(CONTRIBUTOR$0);
            return target;
        }
    }
}
