/*
 * An XML document type.
 * Localname: name
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.NameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one name(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.www.gml._3_2.NameDocument
{
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "name");
    
    
    /**
     * Gets the "name" element
     */
    public net.opengis.www.gml._3_2.CodeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CodeType target = null;
            target = (net.opengis.www.gml._3_2.CodeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(net.opengis.www.gml._3_2.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CodeType target = null;
            target = (net.opengis.www.gml._3_2.CodeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.CodeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public net.opengis.www.gml._3_2.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.CodeType target = null;
            target = (net.opengis.www.gml._3_2.CodeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
}
