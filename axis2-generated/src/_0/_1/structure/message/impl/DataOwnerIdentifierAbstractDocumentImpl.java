/*
 * An XML document type.
 * Localname: DataOwnerIdentifierAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataOwnerIdentifierAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataOwnerIdentifierAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerIdentifierAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataOwnerIdentifierAbstractDocument
{
    
    public DataOwnerIdentifierAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERIDENTIFIERABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerIdentifierAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERIDENTIFIERABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerIdentifierAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerIdentifier"),
    });
    
    
    /**
     * Gets the "DataOwnerIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerIdentifierAbstract" element
     */
    public void setDataOwnerIdentifierAbstract(org.apache.xmlbeans.XmlObject dataOwnerIdentifierAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERIDENTIFIERABSTRACT$0);
            }
            target.set(dataOwnerIdentifierAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERIDENTIFIERABSTRACT$0);
            return target;
        }
    }
}
