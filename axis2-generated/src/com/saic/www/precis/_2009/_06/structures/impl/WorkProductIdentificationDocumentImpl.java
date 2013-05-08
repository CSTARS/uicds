/*
 * An XML document type.
 * Localname: WorkProductIdentification
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.www.precis._2009._06.structures.WorkProductIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.structures.impl;
/**
 * A document containing one WorkProductIdentification(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductIdentificationDocumentImpl extends _0._1.structure.message.impl.PackageMetadataExtensionAbstractDocumentImpl implements com.saic.www.precis._2009._06.structures.WorkProductIdentificationDocument
{
    
    public WorkProductIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
    
    
    /**
     * Gets the "WorkProductIdentification" element
     */
    public com.saic.www.precis._2009._06.base.IdentificationType getWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.IdentificationType target = null;
            target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductIdentification" element
     */
    public void setWorkProductIdentification(com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.IdentificationType target = null;
            target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
            }
            target.set(workProductIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductIdentification" element
     */
    public com.saic.www.precis._2009._06.base.IdentificationType addNewWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.www.precis._2009._06.base.IdentificationType target = null;
            target = (com.saic.www.precis._2009._06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
            return target;
        }
    }
}
