/*
 * An XML document type.
 * Localname: DataSensitivityAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataSensitivityAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataSensitivityAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataSensitivityAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataSensitivityAbstractDocument
{
    
    public DataSensitivityAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASENSITIVITYABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSensitivityAbstract");
    private static final org.apache.xmlbeans.QNameSet DATASENSITIVITYABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MessageClassification"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSensitivityAbstract"),
    });
    
    
    /**
     * Gets the "DataSensitivityAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATASENSITIVITYABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSensitivityAbstract" element
     */
    public void setDataSensitivityAbstract(org.apache.xmlbeans.XmlObject dataSensitivityAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATASENSITIVITYABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATASENSITIVITYABSTRACT$0);
            }
            target.set(dataSensitivityAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSensitivityAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATASENSITIVITYABSTRACT$0);
            return target;
        }
    }
}
