/*
 * An XML document type.
 * Localname: GetIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.GetIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one GetIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.GetIncidentResponseDocument
{
    
    public GetIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetIncidentResponse");
    
    
    /**
     * Gets the "GetIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse getGetIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse)get_store().find_element_user(GETINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentResponse" element
     */
    public void setGetIncidentResponse(org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse getIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse)get_store().find_element_user(GETINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse)get_store().add_element_user(GETINCIDENTRESPONSE$0);
            }
            target.set(getIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentResponse" element
     */
    public org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse addNewGetIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse)get_store().add_element_user(GETINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.GetIncidentResponseDocument.GetIncidentResponse
    {
        
        public GetIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
