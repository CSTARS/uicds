/*
 * An XML document type.
 * Localname: DistinctFrom
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.DistinctFromDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one DistinctFrom(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DistinctFromDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.DistinctFromDocument
{
    
    public DistinctFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTINCTFROM$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DistinctFrom");
    
    
    /**
     * Gets the "DistinctFrom" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType getDistinctFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(DISTINCTFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DistinctFrom" element
     */
    public void setDistinctFrom(gov.ucore.ucore._2_0.ThingThingRelationshipType distinctFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().find_element_user(DISTINCTFROM$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(DISTINCTFROM$0);
            }
            target.set(distinctFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "DistinctFrom" element
     */
    public gov.ucore.ucore._2_0.ThingThingRelationshipType addNewDistinctFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingThingRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.ThingThingRelationshipType)get_store().add_element_user(DISTINCTFROM$0);
            return target;
        }
    }
}
