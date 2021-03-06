/*
 * An XML attribute type.
 * Localname: derivativelyClassifiedBy
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute
 *
 * Automatically generated - do not modify.
 */
package v2.ism.ic.gov.us.impl;
/**
 * A document containing one derivativelyClassifiedBy(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DerivativelyClassifiedByAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute
{
    
    public DerivativelyClassifiedByAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIVELYCLASSIFIEDBY$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivativelyClassifiedBy");
    
    
    /**
     * Gets the "derivativelyClassifiedBy" attribute
     */
    public java.lang.String getDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy xgetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            return target;
        }
    }
    
    /**
     * True if has "derivativelyClassifiedBy" attribute
     */
    public boolean isSetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$0) != null;
        }
    }
    
    /**
     * Sets the "derivativelyClassifiedBy" attribute
     */
    public void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            }
            target.setStringValue(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public void xsetDerivativelyClassifiedBy(v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$0);
            }
            target.set(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Unsets the "derivativelyClassifiedBy" attribute
     */
    public void unsetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVATIVELYCLASSIFIEDBY$0);
        }
    }
    /**
     * An XML derivativelyClassifiedBy(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute$DerivativelyClassifiedBy.
     */
    public static class DerivativelyClassifiedByImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy
    {
        
        public DerivativelyClassifiedByImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DerivativelyClassifiedByImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
