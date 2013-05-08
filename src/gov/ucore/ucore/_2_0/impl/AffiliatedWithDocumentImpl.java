/*
 * An XML document type.
 * Localname: AffiliatedWith
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.AffiliatedWithDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one AffiliatedWith(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AffiliatedWithDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.AffiliatedWithDocument
{
    
    public AffiliatedWithDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFILIATEDWITH$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AffiliatedWith");
    
    
    /**
     * Gets the "AffiliatedWith" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType getAffiliatedWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(AFFILIATEDWITH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffiliatedWith" element
     */
    public void setAffiliatedWith(gov.ucore.ucore._2_0.ThingThingRelationshipType affiliatedWith)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(AFFILIATEDWITH$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(AFFILIATEDWITH$0);
            }
            target.set(affiliatedWith);
        }
    }
    
    /**
     * Appends and returns a new empty "AffiliatedWith" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType addNewAffiliatedWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(AFFILIATEDWITH$0);
            return target;
        }
    }
}
