/*
 * An XML document type.
 * Localname: MimeType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.www.precis._2009._06.base.MimeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.base.impl;
/**
 * A document containing one MimeType(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class MimeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.www.precis._2009._06.base.MimeTypeDocument
{
    
    public MimeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETYPE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "MimeType");
    
    
    /**
     * Gets the "MimeType" element
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.CodespaceValueType target = null;
            target = (com.saic.www.precis._2009._06.base.CodespaceValueType)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MimeType" element
     */
    public void setMimeType(com.saic.www.precis._2009._06.base.CodespaceValueType mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.CodespaceValueType target = null;
            target = (com.saic.www.precis._2009._06.base.CodespaceValueType)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                target = (com.saic.www.precis._2009._06.base.CodespaceValueType)get_store().add_element_user(MIMETYPE$0);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Appends and returns a new empty "MimeType" element
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType addNewMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.CodespaceValueType target = null;
            target = (com.saic.www.precis._2009._06.base.CodespaceValueType)get_store().add_element_user(MIMETYPE$0);
            return target;
        }
    }
}
