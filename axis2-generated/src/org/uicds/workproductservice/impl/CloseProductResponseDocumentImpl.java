/*
 * An XML document type.
 * Localname: CloseProductResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.CloseProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one CloseProductResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class CloseProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.CloseProductResponseDocument
{
    
    public CloseProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "CloseProductResponse");
    
    
    /**
     * Gets the "CloseProductResponse" element
     */
    public org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse getCloseProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse)get_store().find_element_user(CLOSEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseProductResponse" element
     */
    public void setCloseProductResponse(org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse closeProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse)get_store().find_element_user(CLOSEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse)get_store().add_element_user(CLOSEPRODUCTRESPONSE$0);
            }
            target.set(closeProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseProductResponse" element
     */
    public org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse addNewCloseProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse)get_store().add_element_user(CLOSEPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CloseProductResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class CloseProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.CloseProductResponseDocument.CloseProductResponse
    {
        
        public CloseProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
