/*
 * An XML document type.
 * Localname: Narrative
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.NarrativeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one Narrative(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class NarrativeDocumentImpl extends _0._1.structure.message.impl.NarrativeAbstractDocumentImpl implements gov.ucore.ucore._2_0.NarrativeDocument
{
    
    public NarrativeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NARRATIVE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Narrative");
    
    
    /**
     * Gets the "Narrative" element
     */
    public gov.ucore.ucore._2_0.StringType getNarrative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(NARRATIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Narrative" element
     */
    public void setNarrative(gov.ucore.ucore._2_0.StringType narrative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().find_element_user(NARRATIVE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(NARRATIVE$0);
            }
            target.set(narrative);
        }
    }
    
    /**
     * Appends and returns a new empty "Narrative" element
     */
    public gov.ucore.ucore._2_0.StringType addNewNarrative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.StringType target = null;
            target = (gov.ucore.ucore._2_0.StringType)get_store().add_element_user(NARRATIVE$0);
            return target;
        }
    }
}
