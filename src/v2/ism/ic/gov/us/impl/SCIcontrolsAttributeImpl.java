/*
 * An XML attribute type.
 * Localname: SCIcontrols
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: v2.ism.ic.gov.us.SCIcontrolsAttribute
 *
 * Automatically generated - do not modify.
 */
package v2.ism.ic.gov.us.impl;
/**
 * A document containing one SCIcontrols(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class SCIcontrolsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements v2.ism.ic.gov.us.SCIcontrolsAttribute
{
    
    public SCIcontrolsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCICONTROLS$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SCIcontrols");
    
    
    /**
     * Gets the "SCIcontrols" attribute
     */
    public java.util.List getSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SCIcontrols" attribute
     */
    public v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols xgetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$0);
            return target;
        }
    }
    
    /**
     * True if has "SCIcontrols" attribute
     */
    public boolean isSetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCICONTROLS$0) != null;
        }
    }
    
    /**
     * Sets the "SCIcontrols" attribute
     */
    public void setSCIcontrols(java.util.List scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCICONTROLS$0);
            }
            target.setListValue(scIcontrols);
        }
    }
    
    /**
     * Sets (as xml) the "SCIcontrols" attribute
     */
    public void xsetSCIcontrols(v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$0);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().add_attribute_user(SCICONTROLS$0);
            }
            target.set(scIcontrols);
        }
    }
    
    /**
     * Unsets the "SCIcontrols" attribute
     */
    public void unsetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCICONTROLS$0);
        }
    }
    /**
     * An XML SCIcontrols(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class SCIcontrolsImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols
    {
        
        public SCIcontrolsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SCIcontrolsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
