/*
 * An XML document type.
 * Localname: GetSOIListResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.GetSOIListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice.impl;
/**
 * A document containing one GetSOIListResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class GetSOIListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIListResponseDocument
{
    
    public GetSOIListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOILISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "GetSOIListResponse");
    
    
    /**
     * Gets the "GetSOIListResponse" element
     */
    public org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse getGetSOIListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse)get_store().find_element_user(GETSOILISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOIListResponse" element
     */
    public void setGetSOIListResponse(org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse getSOIListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse)get_store().find_element_user(GETSOILISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse)get_store().add_element_user(GETSOILISTRESPONSE$0);
            }
            target.set(getSOIListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOIListResponse" element
     */
    public org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse addNewGetSOIListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse)get_store().add_element_user(GETSOILISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSOIListResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class GetSOIListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIListResponseDocument.GetSOIListResponse
    {
        
        public GetSOIListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTLIST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductList");
        
        
        /**
         * Gets the "WorkProductList" element
         */
        public org.uicds.workproductservice.WorkProductListDocument.WorkProductList getWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workproductservice.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductList" element
         */
        public void setWorkProductList(org.uicds.workproductservice.WorkProductListDocument.WorkProductList workProductList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workproductservice.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
                if (target == null)
                {
                    target = (org.uicds.workproductservice.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
                }
                target.set(workProductList);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        public org.uicds.workproductservice.WorkProductListDocument.WorkProductList addNewWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workproductservice.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workproductservice.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
                return target;
            }
        }
    }
}
