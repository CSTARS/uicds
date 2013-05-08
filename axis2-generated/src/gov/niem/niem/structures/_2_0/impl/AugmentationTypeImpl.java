/*
 * XML Type:  AugmentationType
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures._2_0.AugmentationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures._2_0.impl;
/**
 * An XML AugmentationType(@http://niem.gov/niem/structures/2.0).
 *
 * This is a complex type.
 */
public class AugmentationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures._2_0.AugmentationType
{
    
    public AugmentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "id");
    private static final javax.xml.namespace.QName METADATA$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "metadata");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "metadata" attribute
     */
    public java.util.List getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$2);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadata" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METADATA$2);
            return target;
        }
    }
    
    /**
     * True if has "metadata" attribute
     */
    public boolean isSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METADATA$2) != null;
        }
    }
    
    /**
     * Sets the "metadata" attribute
     */
    public void setMetadata(java.util.List metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATA$2);
            }
            target.setListValue(metadata);
        }
    }
    
    /**
     * Sets (as xml) the "metadata" attribute
     */
    public void xsetMetadata(org.apache.xmlbeans.XmlIDREFS metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METADATA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METADATA$2);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Unsets the "metadata" attribute
     */
    public void unsetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METADATA$2);
        }
    }
}
