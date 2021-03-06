/*
 * An XML document type.
 * Localname: identifier
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.IdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one identifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class IdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.IdentifierDocument
{
    
    public IdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "identifier");
    
    
    /**
     * Gets the "identifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType)get_store().add_element_user(IDENTIFIER$0);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
}
