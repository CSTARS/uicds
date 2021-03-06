/*
 * An XML document type.
 * Localname: GetSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.GetSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice.impl;
/**
 * A document containing one GetSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class GetSOIResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIResponseDocument
{
    
    public GetSOIResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "GetSOIResponse");
    
    
    /**
     * Gets the "GetSOIResponse" element
     */
    public org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse getGetSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse target = null;
            target = (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse)get_store().find_element_user(GETSOIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOIResponse" element
     */
    public void setGetSOIResponse(org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse getSOIResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse target = null;
            target = (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse)get_store().find_element_user(GETSOIRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse)get_store().add_element_user(GETSOIRESPONSE$0);
            }
            target.set(getSOIResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOIResponse" element
     */
    public org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse addNewGetSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse target = null;
            target = (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse)get_store().add_element_user(GETSOIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class GetSOIResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse
    {
        
        public GetSOIResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
