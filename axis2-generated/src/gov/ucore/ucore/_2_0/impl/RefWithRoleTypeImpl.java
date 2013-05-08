/*
 * XML Type:  RefWithRoleType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.RefWithRoleType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML RefWithRoleType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class RefWithRoleTypeImpl extends gov.ucore.ucore._2_0.impl.RefTypeImpl implements gov.ucore.ucore._2_0.RefWithRoleType
{
    
    public RefWithRoleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Role");
    
    
    /**
     * Gets the "Role" element
     */
    public gov.ucore.ucore._2_0.RoleType getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.RoleType target = null;
            target = (gov.ucore.ucore._2_0.RoleType)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0) != 0;
        }
    }
    
    /**
     * Sets the "Role" element
     */
    public void setRole(gov.ucore.ucore._2_0.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.RoleType target = null;
            target = (gov.ucore.ucore._2_0.RoleType)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.RoleType)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Appends and returns a new empty "Role" element
     */
    public gov.ucore.ucore._2_0.RoleType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.RoleType target = null;
            target = (gov.ucore.ucore._2_0.RoleType)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, 0);
        }
    }
}
