/*
 * An XML document type.
 * Localname: SameAs
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.SameAsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one SameAs(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SameAsDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.SameAsDocument
{
    
    public SameAsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEAS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SameAs");
    
    
    /**
     * Gets the "SameAs" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType getSameAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(SAMEAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAs" element
     */
    public void setSameAs(gov.ucore.ucore._2_0.ThingThingRelationshipType sameAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(SAMEAS$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(SAMEAS$0);
            }
            target.set(sameAs);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAs" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType addNewSameAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(SAMEAS$0);
            return target;
        }
    }
}
