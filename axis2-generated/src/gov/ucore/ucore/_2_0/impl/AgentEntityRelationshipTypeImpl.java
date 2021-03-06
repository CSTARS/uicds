/*
 * XML Type:  AgentEntityRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.AgentEntityRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML AgentEntityRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class AgentEntityRelationshipTypeImpl extends gov.ucore.ucore._2_0.impl.RelationshipTypeImpl implements gov.ucore.ucore._2_0.AgentEntityRelationshipType
{
    
    public AgentEntityRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRef");
    private static final javax.xml.namespace.QName ENTITYREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRef");
    
    
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
     * Gets the "EntityRef" element
     */
    public gov.ucore.ucore._2_0.EntityRefType getEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityRefType target = null;
            target = (gov.ucore.ucore._2_0.EntityRefType)get_store().find_element_user(ENTITYREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EntityRef" element
     */
    public void setEntityRef(gov.ucore.ucore._2_0.EntityRefType entityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityRefType target = null;
            target = (gov.ucore.ucore._2_0.EntityRefType)get_store().find_element_user(ENTITYREF$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.EntityRefType)get_store().add_element_user(ENTITYREF$2);
            }
            target.set(entityRef);
        }
    }
    
    /**
     * Appends and returns a new empty "EntityRef" element
     */
    public gov.ucore.ucore._2_0.EntityRefType addNewEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.EntityRefType target = null;
            target = (gov.ucore.ucore._2_0.EntityRefType)get_store().add_element_user(ENTITYREF$2);
            return target;
        }
    }
}
