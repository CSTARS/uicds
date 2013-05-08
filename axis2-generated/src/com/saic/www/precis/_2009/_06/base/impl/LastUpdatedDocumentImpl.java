/*
 * An XML document type.
 * Localname: LastUpdated
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.www.precis._2009._06.base.LastUpdatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.base.impl;
/**
 * A document containing one LastUpdated(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class LastUpdatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.www.precis._2009._06.base.LastUpdatedDocument
{
    
    public LastUpdatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTUPDATED$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdated");
    
    
    /**
     * Gets the "LastUpdated" element
     */
    public com.saic.www.precis._2009._06.base.DateTimeType getLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.DateTimeType target = null;
            target = (com.saic.www.precis._2009._06.base.DateTimeType)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LastUpdated" element
     */
    public void setLastUpdated(com.saic.www.precis._2009._06.base.DateTimeType lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.DateTimeType target = null;
            target = (com.saic.www.precis._2009._06.base.DateTimeType)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                target = (com.saic.www.precis._2009._06.base.DateTimeType)get_store().add_element_user(LASTUPDATED$0);
            }
            target.set(lastUpdated);
        }
    }
    
    /**
     * Appends and returns a new empty "LastUpdated" element
     */
    public com.saic.www.precis._2009._06.base.DateTimeType addNewLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.DateTimeType target = null;
            target = (com.saic.www.precis._2009._06.base.DateTimeType)get_store().add_element_user(LASTUPDATED$0);
            return target;
        }
    }
}
