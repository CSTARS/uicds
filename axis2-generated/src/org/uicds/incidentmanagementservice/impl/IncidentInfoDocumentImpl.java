/*
 * An XML document type.
 * Localname: IncidentInfo
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.IncidentInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one IncidentInfo(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class IncidentInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.IncidentInfoDocument
{
    
    public IncidentInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentInfo");
    
    
    /**
     * Gets the "IncidentInfo" element
     */
    public org.uicds.incidentmanagementservice.IncidentInfoType getIncidentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentInfoType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentInfo" element
     */
    public void setIncidentInfo(org.uicds.incidentmanagementservice.IncidentInfoType incidentInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentInfoType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.IncidentInfoType)get_store().add_element_user(INCIDENTINFO$0);
            }
            target.set(incidentInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentInfo" element
     */
    public org.uicds.incidentmanagementservice.IncidentInfoType addNewIncidentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentInfoType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentInfoType)get_store().add_element_user(INCIDENTINFO$0);
            return target;
        }
    }
}
