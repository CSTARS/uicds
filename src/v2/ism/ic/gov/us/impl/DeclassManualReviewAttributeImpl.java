/*
 * An XML attribute type.
 * Localname: declassManualReview
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: v2.ism.ic.gov.us.DeclassManualReviewAttribute
 *
 * Automatically generated - do not modify.
 */
package v2.ism.ic.gov.us.impl;
/**
 * A document containing one declassManualReview(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DeclassManualReviewAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements v2.ism.ic.gov.us.DeclassManualReviewAttribute
{
    
    public DeclassManualReviewAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLASSMANUALREVIEW$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassManualReview");
    
    
    /**
     * Gets the "declassManualReview" attribute
     */
    public boolean getDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassManualReview" attribute
     */
    public v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview xgetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$0);
            return target;
        }
    }
    
    /**
     * True if has "declassManualReview" attribute
     */
    public boolean isSetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSMANUALREVIEW$0) != null;
        }
    }
    
    /**
     * Sets the "declassManualReview" attribute
     */
    public void setDeclassManualReview(boolean declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSMANUALREVIEW$0);
            }
            target.setBooleanValue(declassManualReview);
        }
    }
    
    /**
     * Sets (as xml) the "declassManualReview" attribute
     */
    public void xsetDeclassManualReview(v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$0);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().add_attribute_user(DECLASSMANUALREVIEW$0);
            }
            target.set(declassManualReview);
        }
    }
    
    /**
     * Unsets the "declassManualReview" attribute
     */
    public void unsetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSMANUALREVIEW$0);
        }
    }
    /**
     * An XML declassManualReview(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of v2.ism.ic.gov.us.DeclassManualReviewAttribute$DeclassManualReview.
     */
    public static class DeclassManualReviewImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview
    {
        
        public DeclassManualReviewImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DeclassManualReviewImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
