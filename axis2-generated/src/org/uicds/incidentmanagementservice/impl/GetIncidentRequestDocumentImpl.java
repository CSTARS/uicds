/*
 * An XML document type.
 * Localname: GetIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.GetIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice.impl;
/**
 * A document containing one GetIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.GetIncidentRequestDocument
{
    
    public GetIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetIncidentRequest");
    
    
    /**
     * Gets the "GetIncidentRequest" element
     */
    public org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest getGetIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest)get_store().find_element_user(GETINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentRequest" element
     */
    public void setGetIncidentRequest(org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest getIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest)get_store().find_element_user(GETINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest)get_store().add_element_user(GETINCIDENTREQUEST$0);
            }
            target.set(getIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentRequest" element
     */
    public org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest addNewGetIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest target = null;
            target = (org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest)get_store().add_element_user(GETINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentmanagementservice.GetIncidentRequestDocument.GetIncidentRequest
    {
        
        public GetIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
