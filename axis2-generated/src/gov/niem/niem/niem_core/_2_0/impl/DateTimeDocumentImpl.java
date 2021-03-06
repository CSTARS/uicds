/*
 * An XML document type.
 * Localname: DateTime
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.DateTimeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one DateTime(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class DateTimeDocumentImpl extends gov.niem.niem.niem_core._2_0.impl.DateRepresentationDocumentImpl implements gov.niem.niem.niem_core._2_0.DateTimeDocument
{
    
    public DateTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateTime");
    
    
    /**
     * Gets the "DateTime" element
     */
    public gov.niem.niem.proxy.xsd._2_0.DateTime getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DateTime" element
     */
    public boolean isNilDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DateTime" element
     */
    public void setDateTime(gov.niem.niem.proxy.xsd._2_0.DateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().add_element_user(DATETIME$0);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Appends and returns a new empty "DateTime" element
     */
    public gov.niem.niem.proxy.xsd._2_0.DateTime addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().add_element_user(DATETIME$0);
            return target;
        }
    }
    
    /**
     * Nils the "DateTime" element
     */
    public void setNilDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd._2_0.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd._2_0.DateTime)get_store().add_element_user(DATETIME$0);
            }
            target.setNil();
        }
    }
}
