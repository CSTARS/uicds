/*
 * An XML document type.
 * Localname: ULEXImplementationName
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.ULEXImplementationNameDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one ULEXImplementationName(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class ULEXImplementationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.ULEXImplementationNameDocument
{
    
    public ULEXImplementationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATIONNAME$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationName");
    
    
    /**
     * Gets the "ULEXImplementationName" element
     */
    public java.lang.String getULEXImplementationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ULEXImplementationName" element
     */
    public org.apache.xmlbeans.XmlString xgetULEXImplementationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementationName" element
     */
    public void setULEXImplementationName(java.lang.String ulexImplementationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULEXIMPLEMENTATIONNAME$0);
            }
            target.setStringValue(ulexImplementationName);
        }
    }
    
    /**
     * Sets (as xml) the "ULEXImplementationName" element
     */
    public void xsetULEXImplementationName(org.apache.xmlbeans.XmlString ulexImplementationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULEXIMPLEMENTATIONNAME$0);
            }
            target.set(ulexImplementationName);
        }
    }
}
