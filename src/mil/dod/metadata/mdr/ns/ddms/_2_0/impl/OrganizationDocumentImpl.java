/*
 * An XML document type.
 * Localname: Organization
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one Organization(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationDocument
{
    
    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Organization");
    
    
    /**
     * Gets the "Organization" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
}
