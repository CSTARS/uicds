/*
 * An XML document type.
 * Localname: relatedResources
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one relatedResources(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class RelatedResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesDocument
{
    
    public RelatedResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDRESOURCES$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "relatedResources");
    
    
    /**
     * Gets the "relatedResources" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType getRelatedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType)get_store().find_element_user(RELATEDRESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relatedResources" element
     */
    public void setRelatedResources(mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType relatedResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType)get_store().find_element_user(RELATEDRESOURCES$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType)get_store().add_element_user(RELATEDRESOURCES$0);
            }
            target.set(relatedResources);
        }
    }
    
    /**
     * Appends and returns a new empty "relatedResources" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType addNewRelatedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType)get_store().add_element_user(RELATEDRESOURCES$0);
            return target;
        }
    }
}
