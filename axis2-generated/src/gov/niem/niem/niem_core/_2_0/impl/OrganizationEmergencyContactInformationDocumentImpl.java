/*
 * An XML document type.
 * Localname: OrganizationEmergencyContactInformation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.OrganizationEmergencyContactInformationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one OrganizationEmergencyContactInformation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationEmergencyContactInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.OrganizationEmergencyContactInformationDocument
{
    
    public OrganizationEmergencyContactInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONEMERGENCYCONTACTINFORMATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationEmergencyContactInformation");
    
    
    /**
     * Gets the "OrganizationEmergencyContactInformation" element
     */
    public gov.niem.niem.niem_core._2_0.ContactInformationType getOrganizationEmergencyContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationEmergencyContactInformation" element
     */
    public boolean isNilOrganizationEmergencyContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationEmergencyContactInformation" element
     */
    public void setOrganizationEmergencyContactInformation(gov.niem.niem.niem_core._2_0.ContactInformationType organizationEmergencyContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0);
            }
            target.set(organizationEmergencyContactInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationEmergencyContactInformation" element
     */
    public gov.niem.niem.niem_core._2_0.ContactInformationType addNewOrganizationEmergencyContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationEmergencyContactInformation" element
     */
    public void setNilOrganizationEmergencyContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$0);
            }
            target.setNil();
        }
    }
}
