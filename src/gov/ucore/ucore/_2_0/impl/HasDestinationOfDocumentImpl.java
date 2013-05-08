/*
 * An XML document type.
 * Localname: HasDestinationOf
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.HasDestinationOfDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one HasDestinationOf(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class HasDestinationOfDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.HasDestinationOfDocument
{
    
    public HasDestinationOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASDESTINATIONOF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasDestinationOf");
    
    
    /**
     * Gets the "HasDestinationOf" element
     */
    public gov.ucore.ucore._2_0.EntityLocationRelationshipType getHasDestinationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.EntityLocationRelationshipType)get_store().find_element_user(HASDESTINATIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HasDestinationOf" element
     */
    public void setHasDestinationOf(gov.ucore.ucore._2_0.EntityLocationRelationshipType hasDestinationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.EntityLocationRelationshipType)get_store().find_element_user(HASDESTINATIONOF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.EntityLocationRelationshipType)get_store().add_element_user(HASDESTINATIONOF$0);
            }
            target.set(hasDestinationOf);
        }
    }
    
    /**
     * Appends and returns a new empty "HasDestinationOf" element
     */
    public gov.ucore.ucore._2_0.EntityLocationRelationshipType addNewHasDestinationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.EntityLocationRelationshipType)get_store().add_element_user(HASDESTINATIONOF$0);
            return target;
        }
    }
}
