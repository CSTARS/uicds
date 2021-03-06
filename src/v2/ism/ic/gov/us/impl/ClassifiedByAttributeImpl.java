/*
 * An XML attribute type.
 * Localname: classifiedBy
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: v2.ism.ic.gov.us.ClassifiedByAttribute
 *
 * Automatically generated - do not modify.
 */
package v2.ism.ic.gov.us.impl;
/**
 * A document containing one classifiedBy(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class ClassifiedByAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements v2.ism.ic.gov.us.ClassifiedByAttribute
{
    
    public ClassifiedByAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFIEDBY$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classifiedBy");
    
    
    /**
     * Gets the "classifiedBy" attribute
     */
    public java.lang.String getClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classifiedBy" attribute
     */
    public v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy xgetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$0);
            return target;
        }
    }
    
    /**
     * True if has "classifiedBy" attribute
     */
    public boolean isSetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFIEDBY$0) != null;
        }
    }
    
    /**
     * Sets the "classifiedBy" attribute
     */
    public void setClassifiedBy(java.lang.String classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFIEDBY$0);
            }
            target.setStringValue(classifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "classifiedBy" attribute
     */
    public void xsetClassifiedBy(v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$0);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().add_attribute_user(CLASSIFIEDBY$0);
            }
            target.set(classifiedBy);
        }
    }
    
    /**
     * Unsets the "classifiedBy" attribute
     */
    public void unsetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFIEDBY$0);
        }
    }
    /**
     * An XML classifiedBy(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of v2.ism.ic.gov.us.ClassifiedByAttribute$ClassifiedBy.
     */
    public static class ClassifiedByImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy
    {
        
        public ClassifiedByImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ClassifiedByImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
