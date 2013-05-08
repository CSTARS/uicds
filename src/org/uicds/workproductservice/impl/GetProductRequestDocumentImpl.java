/*
 * An XML document type.
 * Localname: GetProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one GetProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductRequestDocument
{
    
    public GetProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetProductRequest");
    
    
    /**
     * Gets the "GetProductRequest" element
     */
    public org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest getGetProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest)get_store().find_element_user(GETPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductRequest" element
     */
    public void setGetProductRequest(org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest getProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest)get_store().find_element_user(GETPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest)get_store().add_element_user(GETPRODUCTREQUEST$0);
            }
            target.set(getProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductRequest" element
     */
    public org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest addNewGetProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest)get_store().add_element_user(GETPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductRequestDocument.GetProductRequest
    {
        
        public GetProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.www.precis._2009._06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentificationType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentificationType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.www.precis._2009._06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentificationType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
