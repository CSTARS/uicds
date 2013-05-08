/*
 * An XML document type.
 * Localname: Subject
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one Subject(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class SubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.SubjectDocument
{
    
    public SubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Subject");
    
    
    /**
     * Gets the "Subject" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType)get_store().add_element_user(SUBJECT$0);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "Subject" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.SubjectType)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
}
