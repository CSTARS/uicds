/*
 * XML Type:  AgentEventRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.AgentEventRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML AgentEventRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class AgentEventRelationshipTypeImpl extends gov.ucore.ucore._2_0.impl.RelationshipTypeImpl implements gov.ucore.ucore._2_0.AgentEventRelationshipType
{
    
    public AgentEventRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRef");
    private static final javax.xml.namespace.QName EVENTREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventRef");
    
    
    /**
     * Gets the "AgentRef" element
     */
    public gov.ucore.ucore._2_0.AgentRefType getAgentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(AGENTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AgentRef" element
     */
    public void setAgentRef(gov.ucore.ucore._2_0.AgentRefType agentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(AGENTREF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(AGENTREF$0);
            }
            target.set(agentRef);
        }
    }
    
    /**
     * Appends and returns a new empty "AgentRef" element
     */
    public gov.ucore.ucore._2_0.AgentRefType addNewAgentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(AGENTREF$0);
            return target;
        }
    }
    
    /**
     * Gets the "EventRef" element
     */
    public gov.ucore.ucore._2_0.EventRefType getEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EventRefType target = null;
            target = (gov.ucore.ucore._2_0.EventRefType)get_store().find_element_user(EVENTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventRef" element
     */
    public void setEventRef(gov.ucore.ucore._2_0.EventRefType eventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EventRefType target = null;
            target = (gov.ucore.ucore._2_0.EventRefType)get_store().find_element_user(EVENTREF$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.EventRefType)get_store().add_element_user(EVENTREF$2);
            }
            target.set(eventRef);
        }
    }
    
    /**
     * Appends and returns a new empty "EventRef" element
     */
    public gov.ucore.ucore._2_0.EventRefType addNewEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EventRefType target = null;
            target = (gov.ucore.ucore._2_0.EventRefType)get_store().add_element_user(EVENTREF$2);
            return target;
        }
    }
}
