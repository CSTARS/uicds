/*
 * An XML document type.
 * Localname: language
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.LanguageDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one language(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class LanguageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.LanguageDocument
{
    
    public LanguageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "language");
    
    
    /**
     * Gets the "language" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType)get_store().add_element_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Appends and returns a new empty "language" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.CompoundLanguageIdentifierType)get_store().add_element_user(LANGUAGE$0);
            return target;
        }
    }
}
