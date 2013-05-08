/*
 * An XML document type.
 * Localname: CloseProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.CloseProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one CloseProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class CloseProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.CloseProductRequestDocument
{
    
    public CloseProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "CloseProductRequest");
    
    
    /**
     * Gets the "CloseProductRequest" element
     */
    public org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest getCloseProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest)get_store().find_element_user(CLOSEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseProductRequest" element
     */
    public void setCloseProductRequest(org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest closeProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest)get_store().find_element_user(CLOSEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest)get_store().add_element_user(CLOSEPRODUCTREQUEST$0);
            }
            target.set(closeProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseProductRequest" element
     */
    public org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest addNewCloseProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest)get_store().add_element_user(CLOSEPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CloseProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class CloseProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.CloseProductRequestDocument.CloseProductRequest
    {
        
        public CloseProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
