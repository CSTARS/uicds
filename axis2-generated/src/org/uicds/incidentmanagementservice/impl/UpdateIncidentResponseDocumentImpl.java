/*
 * An XML document type.
 * Localname: UpdateIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one UpdateIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class UpdateIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument
{
    
    public UpdateIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "UpdateIncidentResponse");
    
    
    /**
     * Gets the "UpdateIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse getUpdateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().find_element_user(UPDATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateIncidentResponse" element
     */
    public void setUpdateIncidentResponse(org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse updateIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().find_element_user(UPDATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().add_element_user(UPDATEINCIDENTRESPONSE$0);
            }
            target.set(updateIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse addNewUpdateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().add_element_user(UPDATEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class UpdateIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument.UpdateIncidentResponse
    {
        
        public UpdateIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTPUBLICATIONRESPONSE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse");
        
        
        /**
         * Gets the "WorkProductPublicationResponse" element
         */
        public org.uicds.workproductservice.WorkProductPublicationResponseType getWorkProductPublicationResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductPublicationResponse" element
         */
        public void setWorkProductPublicationResponse(org.uicds.workproductservice.WorkProductPublicationResponseType workProductPublicationResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
                }
                target.set(workProductPublicationResponse);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductPublicationResponse" element
         */
        public org.uicds.workproductservice.WorkProductPublicationResponseType addNewWorkProductPublicationResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
                return target;
            }
        }
    }
}
