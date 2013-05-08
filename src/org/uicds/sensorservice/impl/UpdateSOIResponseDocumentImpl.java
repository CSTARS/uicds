/*
 * An XML document type.
 * Localname: UpdateSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.UpdateSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice.impl;
/**
 * A document containing one UpdateSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class UpdateSOIResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.UpdateSOIResponseDocument
{
    
    public UpdateSOIResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESOIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "UpdateSOIResponse");
    
    
    /**
     * Gets the "UpdateSOIResponse" element
     */
    public org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse getUpdateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse target = null;
            target = (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse)get_store().find_element_user(UPDATESOIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateSOIResponse" element
     */
    public void setUpdateSOIResponse(org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse updateSOIResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse target = null;
            target = (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse)get_store().find_element_user(UPDATESOIRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse)get_store().add_element_user(UPDATESOIRESPONSE$0);
            }
            target.set(updateSOIResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateSOIResponse" element
     */
    public org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse addNewUpdateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse target = null;
            target = (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse)get_store().add_element_user(UPDATESOIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class UpdateSOIResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse
    {
        
        public UpdateSOIResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
