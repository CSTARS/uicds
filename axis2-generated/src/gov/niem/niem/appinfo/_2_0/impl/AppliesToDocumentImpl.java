/*
 * An XML document type.
 * Localname: AppliesTo
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo._2_0.AppliesToDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo._2_0.impl;
/**
 * A document containing one AppliesTo(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public class AppliesToDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo._2_0.AppliesToDocument
{
    
    public AppliesToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLIESTO$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "AppliesTo");
    
    
    /**
     * Gets the "AppliesTo" element
     */
    public gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo getAppliesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo target = null;
            target = (gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AppliesTo" element
     */
    public void setAppliesTo(gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo appliesTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo target = null;
            target = (gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
            }
            target.set(appliesTo);
        }
    }
    
    /**
     * Appends and returns a new empty "AppliesTo" element
     */
    public gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo addNewAppliesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo target = null;
            target = (gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
            return target;
        }
    }
    /**
     * An XML AppliesTo(@http://niem.gov/niem/appinfo/2.0).
     *
     * This is a complex type.
     */
    public static class AppliesToImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo._2_0.AppliesToDocument.AppliesTo
    {
        
        public AppliesToImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "name");
        private static final javax.xml.namespace.QName NAMESPACE$2 = 
            new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "namespace");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNCName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "namespace" attribute
         */
        public java.lang.String getNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "namespace" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$2);
                return target;
            }
        }
        
        /**
         * True if has "namespace" attribute
         */
        public boolean isSetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAMESPACE$2) != null;
            }
        }
        
        /**
         * Sets the "namespace" attribute
         */
        public void setNamespace(java.lang.String namespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$2);
                }
                target.setStringValue(namespace);
            }
        }
        
        /**
         * Sets (as xml) the "namespace" attribute
         */
        public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$2);
                }
                target.set(namespace);
            }
        }
        
        /**
         * Unsets the "namespace" attribute
         */
        public void unsetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAMESPACE$2);
            }
        }
    }
}
