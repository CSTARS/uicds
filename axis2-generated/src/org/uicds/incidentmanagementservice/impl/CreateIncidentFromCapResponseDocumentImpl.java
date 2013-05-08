/*
 * An XML document type.
 * Localname: CreateIncidentFromCapResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one CreateIncidentFromCapResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentFromCapResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument
{
    
    public CreateIncidentFromCapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTFROMCAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentFromCapResponse");
    
    
    /**
     * Gets the "CreateIncidentFromCapResponse" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse getCreateIncidentFromCapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().find_element_user(CREATEINCIDENTFROMCAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentFromCapResponse" element
     */
    public void setCreateIncidentFromCapResponse(org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse createIncidentFromCapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().find_element_user(CREATEINCIDENTFROMCAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().add_element_user(CREATEINCIDENTFROMCAPRESPONSE$0);
            }
            target.set(createIncidentFromCapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentFromCapResponse" element
     */
    public org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse addNewCreateIncidentFromCapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().add_element_user(CREATEINCIDENTFROMCAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentFromCapResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentFromCapResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse
    {
        
        public CreateIncidentFromCapResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
