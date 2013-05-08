/*
 * An XML document type.
 * Localname: OrganizationSubUnitName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.OrganizationSubUnitNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one OrganizationSubUnitName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationSubUnitNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.OrganizationSubUnitNameDocument
{
    
    public OrganizationSubUnitNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONSUBUNITNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationSubUnitName");
    
    
    /**
     * Gets the "OrganizationSubUnitName" element
     */
    public gov.niem.niem.niem_core._2_0.TextType getOrganizationSubUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationSubUnitName" element
     */
    public boolean isNilOrganizationSubUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationSubUnitName" element
     */
    public void setOrganizationSubUnitName(gov.niem.niem.niem_core._2_0.TextType organizationSubUnitName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ORGANIZATIONSUBUNITNAME$0);
            }
            target.set(organizationSubUnitName);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationSubUnitName" element
     */
    public gov.niem.niem.niem_core._2_0.TextType addNewOrganizationSubUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ORGANIZATIONSUBUNITNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationSubUnitName" element
     */
    public void setNilOrganizationSubUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.TextType target = null;
            target = (gov.niem.niem.niem_core._2_0.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.TextType)get_store().add_element_user(ORGANIZATIONSUBUNITNAME$0);
            }
            target.setNil();
        }
    }
}
