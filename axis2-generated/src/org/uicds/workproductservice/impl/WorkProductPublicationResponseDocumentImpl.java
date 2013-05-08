/*
 * An XML document type.
 * Localname: WorkProductPublicationResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.WorkProductPublicationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice.impl;
/**
 * A document containing one WorkProductPublicationResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class WorkProductPublicationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workproductservice.WorkProductPublicationResponseDocument
{
    
    public WorkProductPublicationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTPUBLICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse");
    
    
    /**
     * Gets the "WorkProductPublicationResponse" element
     */
    public org.uicds.workproductservice.WorkProductPublicationResponseType getWorkProductPublicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductPublicationResponse" element
     */
    public void setWorkProductPublicationResponse(org.uicds.workproductservice.WorkProductPublicationResponseType workProductPublicationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
            }
            target.set(workProductPublicationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductPublicationResponse" element
     */
    public org.uicds.workproductservice.WorkProductPublicationResponseType addNewWorkProductPublicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workproductservice.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workproductservice.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
            return target;
        }
    }
}
