/*
 * XML Type:  SubordinateSuperiorRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML SubordinateSuperiorRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class SubordinateSuperiorRelationshipTypeImpl extends gov.ucore.ucore._2_0.impl.RelationshipTypeImpl implements gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType
{
    
    public SubordinateSuperiorRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBORDINATE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Subordinate");
    private static final javax.xml.namespace.QName SUPERIOR$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Superior");
    
    
    /**
     * Gets the "Subordinate" element
     */
    public gov.ucore.ucore._2_0.AgentRefType getSubordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(SUBORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subordinate" element
     */
    public void setSubordinate(gov.ucore.ucore._2_0.AgentRefType subordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(SUBORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(SUBORDINATE$0);
            }
            target.set(subordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "Subordinate" element
     */
    public gov.ucore.ucore._2_0.AgentRefType addNewSubordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(SUBORDINATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Superior" element
     */
    public gov.ucore.ucore._2_0.AgentRefType getSuperior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(SUPERIOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Superior" element
     */
    public void setSuperior(gov.ucore.ucore._2_0.AgentRefType superior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().find_element_user(SUPERIOR$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(SUPERIOR$2);
            }
            target.set(superior);
        }
    }
    
    /**
     * Appends and returns a new empty "Superior" element
     */
    public gov.ucore.ucore._2_0.AgentRefType addNewSuperior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.AgentRefType target = null;
            target = (gov.ucore.ucore._2_0.AgentRefType)get_store().add_element_user(SUPERIOR$2);
            return target;
        }
    }
}
