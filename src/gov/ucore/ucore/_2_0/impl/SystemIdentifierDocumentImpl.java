/*
 * An XML document type.
 * Localname: SystemIdentifier
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.SystemIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one SystemIdentifier(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SystemIdentifierDocumentImpl extends _0._1.structure.message.impl.SystemIdentifierAbstractDocumentImpl implements gov.ucore.ucore._2_0.SystemIdentifierDocument
{
    
    public SystemIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemIdentifier");
    
    
    /**
     * Gets the "SystemIdentifier" element
     */
    public gov.ucore.ucore._2_0.StringType getSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(SYSTEMIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemIdentifier" element
     */
    public void setSystemIdentifier(gov.ucore.ucore._2_0.StringType systemIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(SYSTEMIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(SYSTEMIDENTIFIER$0);
            }
            target.set(systemIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemIdentifier" element
     */
    public gov.ucore.ucore._2_0.StringType addNewSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(SYSTEMIDENTIFIER$0);
            return target;
        }
    }
}
