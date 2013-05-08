/*
 * An XML document type.
 * Localname: CreateIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.CreateIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one CreateIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentResponseDocument
{
    
    public CreateIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentResponse");
    
    
    /**
     * Gets the "CreateIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse getCreateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().find_element_user(CREATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentResponse" element
     */
    public void setCreateIncidentResponse(org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse createIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().find_element_user(CREATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().add_element_user(CREATEINCIDENTRESPONSE$0);
            }
            target.set(createIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse addNewCreateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().add_element_user(CREATEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse
    {
        
        public CreateIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
