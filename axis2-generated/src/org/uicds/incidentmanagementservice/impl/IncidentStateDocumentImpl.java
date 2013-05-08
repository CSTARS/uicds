/*
 * An XML document type.
 * Localname: IncidentState
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.IncidentStateDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one IncidentState(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class IncidentStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.IncidentStateDocument
{
    
    public IncidentStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTSTATE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentState");
    
    
    /**
     * Gets the "IncidentState" element
     */
    public org.uicds.incidentmanagementservice.IncidentStateType getIncidentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentStateType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentStateType)get_store().find_element_user(INCIDENTSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentState" element
     */
    public void setIncidentState(org.uicds.incidentmanagementservice.IncidentStateType incidentState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentStateType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentStateType)get_store().find_element_user(INCIDENTSTATE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.IncidentStateType)get_store().add_element_user(INCIDENTSTATE$0);
            }
            target.set(incidentState);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentState" element
     */
    public org.uicds.incidentmanagementservice.IncidentStateType addNewIncidentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.IncidentStateType target = null;
            target = (org.uicds.incidentmanagementservice.IncidentStateType)get_store().add_element_user(INCIDENTSTATE$0);
            return target;
        }
    }
}
