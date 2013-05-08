/*
 * An XML document type.
 * Localname: InvolvedIn
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.InvolvedInDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one InvolvedIn(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class InvolvedInDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.InvolvedInDocument
{
    
    public InvolvedInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOLVEDIN$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "InvolvedIn");
    
    
    /**
     * Gets the "InvolvedIn" element
     */
    public gov.ucore.ucore._2_0.AgentEventRelationshipType getInvolvedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.AgentEventRelationshipType)get_store().find_element_user(INVOLVEDIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvolvedIn" element
     */
    public void setInvolvedIn(gov.ucore.ucore._2_0.AgentEventRelationshipType involvedIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.AgentEventRelationshipType)get_store().find_element_user(INVOLVEDIN$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.AgentEventRelationshipType)get_store().add_element_user(INVOLVEDIN$0);
            }
            target.set(involvedIn);
        }
    }
    
    /**
     * Appends and returns a new empty "InvolvedIn" element
     */
    public gov.ucore.ucore._2_0.AgentEventRelationshipType addNewInvolvedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.AgentEventRelationshipType)get_store().add_element_user(INVOLVEDIN$0);
            return target;
        }
    }
}
