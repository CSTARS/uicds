/*
 * An XML document type.
 * Localname: GetProductCurrentVersionRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetProductCurrentVersionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one GetProductCurrentVersionRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetProductCurrentVersionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductCurrentVersionRequestDocument
{
    
    public GetProductCurrentVersionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTCURRENTVERSIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetProductCurrentVersionRequest");
    
    
    /**
     * Gets the "GetProductCurrentVersionRequest" element
     */
    public org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest getGetProductCurrentVersionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest target = null;
            target = (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest)get_store().find_element_user(GETPRODUCTCURRENTVERSIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductCurrentVersionRequest" element
     */
    public void setGetProductCurrentVersionRequest(org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest getProductCurrentVersionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest target = null;
            target = (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest)get_store().find_element_user(GETPRODUCTCURRENTVERSIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest)get_store().add_element_user(GETPRODUCTCURRENTVERSIONREQUEST$0);
            }
            target.set(getProductCurrentVersionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductCurrentVersionRequest" element
     */
    public org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest addNewGetProductCurrentVersionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest target = null;
            target = (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest)get_store().add_element_user(GETPRODUCTCURRENTVERSIONREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetProductCurrentVersionRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetProductCurrentVersionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest
    {
        
        public GetProductCurrentVersionRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier");
        
        
        /**
         * Gets the "Identifier" element
         */
        public com.saic.www.precis._2009._06.base.IdentifierType getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentifierType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Identifier" element
         */
        public void setIdentifier(com.saic.www.precis._2009._06.base.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentifierType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (com.saic.www.precis._2009._06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Appends and returns a new empty "Identifier" element
         */
        public com.saic.www.precis._2009._06.base.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.base.IdentifierType target = null;
                target = (com.saic.www.precis._2009._06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
    }
}
