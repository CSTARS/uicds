/*
 * An XML document type.
 * Localname: EmployedBy
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.EmployedByDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one EmployedBy(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class EmployedByDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.EmployedByDocument
{
    
    public EmployedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYEDBY$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EmployedBy");
    
    
    /**
     * Gets the "EmployedBy" element
     */
    public gov.ucore.ucore._2_0.PersonAgentRelationshipType getEmployedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonAgentRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonAgentRelationshipType)get_store().find_element_user(EMPLOYEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EmployedBy" element
     */
    public void setEmployedBy(gov.ucore.ucore._2_0.PersonAgentRelationshipType employedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonAgentRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonAgentRelationshipType)get_store().find_element_user(EMPLOYEDBY$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PersonAgentRelationshipType)get_store().add_element_user(EMPLOYEDBY$0);
            }
            target.set(employedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "EmployedBy" element
     */
    public gov.ucore.ucore._2_0.PersonAgentRelationshipType addNewEmployedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonAgentRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonAgentRelationshipType)get_store().add_element_user(EMPLOYEDBY$0);
            return target;
        }
    }
}
