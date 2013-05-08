/*
 * An XML document type.
 * Localname: SystemIdentifierAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.SystemIdentifierAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one SystemIdentifierAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class SystemIdentifierAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.SystemIdentifierAbstractDocument
{
    
    public SystemIdentifierAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMIDENTIFIERABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemIdentifierAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMIDENTIFIERABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemIdentifierAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemIdentifier"),
    });
    
    
    /**
     * Gets the "SystemIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemIdentifierAbstract" element
     */
    public void setSystemIdentifierAbstract(org.apache.xmlbeans.XmlObject systemIdentifierAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMIDENTIFIERABSTRACT$0);
            }
            target.set(systemIdentifierAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewSystemIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMIDENTIFIERABSTRACT$0);
            return target;
        }
    }
}
