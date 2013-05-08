/*
 * An XML document type.
 * Localname: CreateSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.CreateSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice.impl;
/**
 * A document containing one CreateSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class CreateSOIResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.CreateSOIResponseDocument
{
    
    public CreateSOIResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATESOIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "CreateSOIResponse");
    
    
    /**
     * Gets the "CreateSOIResponse" element
     */
    public org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse getCreateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse)get_store().find_element_user(CREATESOIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateSOIResponse" element
     */
    public void setCreateSOIResponse(org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse createSOIResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse)get_store().find_element_user(CREATESOIRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse)get_store().add_element_user(CREATESOIRESPONSE$0);
            }
            target.set(createSOIResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateSOIResponse" element
     */
    public org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse addNewCreateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse)get_store().add_element_user(CREATESOIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class CreateSOIResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.CreateSOIResponseDocument.CreateSOIResponse
    {
        
        public CreateSOIResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
