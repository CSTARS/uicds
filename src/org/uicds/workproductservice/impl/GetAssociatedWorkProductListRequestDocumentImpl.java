/*
 * An XML document type.
 * Localname: GetAssociatedWorkProductListRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one GetAssociatedWorkProductListRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetAssociatedWorkProductListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument
{
    
    public GetAssociatedWorkProductListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETASSOCIATEDWORKPRODUCTLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetAssociatedWorkProductListRequest");
    
    
    /**
     * Gets the "GetAssociatedWorkProductListRequest" element
     */
    public org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest getGetAssociatedWorkProductListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAssociatedWorkProductListRequest" element
     */
    public void setGetAssociatedWorkProductListRequest(org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest getAssociatedWorkProductListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTREQUEST$0);
            }
            target.set(getAssociatedWorkProductListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAssociatedWorkProductListRequest" element
     */
    public org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest addNewGetAssociatedWorkProductListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest target = null;
            target = (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetAssociatedWorkProductListRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetAssociatedWorkProductListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest
    {
        
        public GetAssociatedWorkProductListRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
