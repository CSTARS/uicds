/*
 * An XML document type.
 * Localname: LocationContactInformation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LocationContactInformationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LocationContactInformation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationContactInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.LocationContactInformationDocument
{
    
    public LocationContactInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCONTACTINFORMATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationContactInformation");
    
    
    /**
     * Gets the "LocationContactInformation" element
     */
    public gov.niem.niem.niem_core._2_0.ContactInformationType getLocationContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationContactInformation" element
     */
    public boolean isNilLocationContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationContactInformation" element
     */
    public void setLocationContactInformation(gov.niem.niem.niem_core._2_0.ContactInformationType locationContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(LOCATIONCONTACTINFORMATION$0);
            }
            target.set(locationContactInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationContactInformation" element
     */
    public gov.niem.niem.niem_core._2_0.ContactInformationType addNewLocationContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(LOCATIONCONTACTINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationContactInformation" element
     */
    public void setNilLocationContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.ContactInformationType target = null;
            target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.ContactInformationType)get_store().add_element_user(LOCATIONCONTACTINFORMATION$0);
            }
            target.setNil();
        }
    }
}
