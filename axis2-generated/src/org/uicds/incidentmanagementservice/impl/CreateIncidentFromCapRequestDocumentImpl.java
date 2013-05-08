/*
 * An XML document type.
 * Localname: CreateIncidentFromCapRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentFromCapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument
{
    
    public CreateIncidentFromCapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTFROMCAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentFromCapRequest");
    
    
    /**
     * Gets the "CreateIncidentFromCapRequest" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest getCreateIncidentFromCapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().find_element_user(CREATEINCIDENTFROMCAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentFromCapRequest" element
     */
    public void setCreateIncidentFromCapRequest(org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest createIncidentFromCapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().find_element_user(CREATEINCIDENTFROMCAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().add_element_user(CREATEINCIDENTFROMCAPREQUEST$0);
            }
            target.set(createIncidentFromCapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentFromCapRequest" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest addNewCreateIncidentFromCapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().add_element_user(CREATEINCIDENTFROMCAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentFromCapRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest
    {
        
        public CreateIncidentFromCapRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALERT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
        
        
        /**
         * Gets the "alert" element
         */
        public _1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert getAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                _1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert target = null;
                target = (_1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "alert" element
         */
        public void setAlert(_1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert alert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert target = null;
                target = (_1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    target = (_1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                }
                target.set(alert);
            }
        }
        
        /**
         * Appends and returns a new empty "alert" element
         */
        public _1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert addNewAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                _1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert target = null;
                target = (_1._1.cap.emergency.tc.names.oasis.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                return target;
            }
        }
    }
}
