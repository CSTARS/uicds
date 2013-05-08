/*
 * An XML document type.
 * Localname: PublishProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.PublishProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one PublishProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class PublishProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.PublishProductRequestDocument
{
    
    public PublishProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "PublishProductRequest");
    
    
    /**
     * Gets the "PublishProductRequest" element
     */
    public org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest getPublishProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest target = null;
            target = (org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest)get_store().find_element_user(PUBLISHPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishProductRequest" element
     */
    public void setPublishProductRequest(org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest publishProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest target = null;
            target = (org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest)get_store().find_element_user(PUBLISHPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest)get_store().add_element_user(PUBLISHPRODUCTREQUEST$0);
            }
            target.set(publishProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishProductRequest" element
     */
    public org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest addNewPublishProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest target = null;
            target = (org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest)get_store().add_element_user(PUBLISHPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML PublishProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class PublishProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.PublishProductRequestDocument.PublishProductRequest
    {
        
        public PublishProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "incidentId");
        private static final javax.xml.namespace.QName WORKPRODUCT$2 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets the "incidentId" element
         */
        public java.lang.String getIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentId" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "incidentId" element
         */
        public boolean isSetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "incidentId" element
         */
        public void setIncidentId(java.lang.String incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
                }
                target.setStringValue(incidentId);
            }
        }
        
        /**
         * Sets (as xml) the "incidentId" element
         */
        public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
                }
                target.set(incidentId);
            }
        }
        
        /**
         * Unsets the "incidentId" element
         */
        public void unsetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$0, 0);
            }
        }
        
        /**
         * Gets the "WorkProduct" element
         */
        public com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct getWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$2, 0);
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
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$2, 0);
                if (target == null)
                {
                    target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$2);
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
                target = (com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$2);
                return target;
            }
        }
    }
}
