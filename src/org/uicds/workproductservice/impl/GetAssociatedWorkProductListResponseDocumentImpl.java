/*
 * An XML document type.
 * Localname: GetAssociatedWorkProductListResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetAssociatedWorkProductListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument
{
    
    public GetAssociatedWorkProductListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetAssociatedWorkProductListResponse");
    
    
    /**
     * Gets the "GetAssociatedWorkProductListResponse" element
     */
    public org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getGetAssociatedWorkProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAssociatedWorkProductListResponse" element
     */
    public void setGetAssociatedWorkProductListResponse(org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getAssociatedWorkProductListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0);
            }
            target.set(getAssociatedWorkProductListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAssociatedWorkProductListResponse" element
     */
    public org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse addNewGetAssociatedWorkProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetAssociatedWorkProductListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse
    {
        
        public GetAssociatedWorkProductListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
