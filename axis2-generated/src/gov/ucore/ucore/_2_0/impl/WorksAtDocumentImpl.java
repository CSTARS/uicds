/*
 * An XML document type.
 * Localname: WorksAt
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.WorksAtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one WorksAt(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class WorksAtDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.WorksAtDocument
{
    
    public WorksAtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "WorksAt");
    
    
    /**
     * Gets the "WorksAt" element
     */
    public gov.ucore.ucore._2_0.PersonLocationRelationshipType getWorksAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonLocationRelationshipType)get_store().find_element_user(WORKSAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorksAt" element
     */
    public void setWorksAt(gov.ucore.ucore._2_0.PersonLocationRelationshipType worksAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonLocationRelationshipType)get_store().find_element_user(WORKSAT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PersonLocationRelationshipType)get_store().add_element_user(WORKSAT$0);
            }
            target.set(worksAt);
        }
    }
    
    /**
     * Appends and returns a new empty "WorksAt" element
     */
    public gov.ucore.ucore._2_0.PersonLocationRelationshipType addNewWorksAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.PersonLocationRelationshipType)get_store().add_element_user(WORKSAT$0);
            return target;
        }
    }
}
