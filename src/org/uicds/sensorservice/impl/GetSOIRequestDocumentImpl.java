/*
 * An XML document type.
 * Localname: GetSOIRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.GetSOIRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice.impl;
/**
 * A document containing one GetSOIRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class GetSOIRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIRequestDocument
{
    
    public GetSOIRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOIREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "GetSOIRequest");
    
    
    /**
     * Gets the "GetSOIRequest" element
     */
    public org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest getGetSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest target = null;
            target = (org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest)get_store().find_element_user(GETSOIREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOIRequest" element
     */
    public void setGetSOIRequest(org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest getSOIRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest target = null;
            target = (org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest)get_store().find_element_user(GETSOIREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest)get_store().add_element_user(GETSOIREQUEST$0);
            }
            target.set(getSOIRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOIRequest" element
     */
    public org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest addNewGetSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest target = null;
            target = (org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest)get_store().add_element_user(GETSOIREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetSOIRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class GetSOIRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIRequestDocument.GetSOIRequest
    {
        
        public GetSOIRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
