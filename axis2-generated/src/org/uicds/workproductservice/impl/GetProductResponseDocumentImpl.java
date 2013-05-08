/*
 * An XML document type.
 * Localname: GetProductResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one GetProductResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductResponseDocument
{
    
    public GetProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetProductResponse");
    
    
    /**
     * Gets the "GetProductResponse" element
     */
    public org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse getGetProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse target = null;
            target = (org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse)get_store().find_element_user(GETPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductResponse" element
     */
    public void setGetProductResponse(org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse getProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse target = null;
            target = (org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse)get_store().find_element_user(GETPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse)get_store().add_element_user(GETPRODUCTRESPONSE$0);
            }
            target.set(getProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductResponse" element
     */
    public org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse addNewGetProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse target = null;
            target = (org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse)get_store().add_element_user(GETPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductResponseDocument.GetProductResponse
    {
        
        public GetProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets the "WorkProduct" element
         */
        public com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct getWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProduct" element
         */
        public void setWorkProduct(com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        public com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                return target;
            }
        }
    }
}
