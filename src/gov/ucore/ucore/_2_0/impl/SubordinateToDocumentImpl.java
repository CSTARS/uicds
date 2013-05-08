/*
 * An XML document type.
 * Localname: SubordinateTo
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.SubordinateToDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one SubordinateTo(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SubordinateToDocumentImpl extends gov.ucore.ucore._2_0.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore._2_0.SubordinateToDocument
{
    
    public SubordinateToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBORDINATETO$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SubordinateTo");
    
    
    /**
     * Gets the "SubordinateTo" element
     */
    public gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType getSubordinateTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType)get_store().find_element_user(SUBORDINATETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubordinateTo" element
     */
    public void setSubordinateTo(gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType subordinateTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType)get_store().find_element_user(SUBORDINATETO$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType)get_store().add_element_user(SUBORDINATETO$0);
            }
            target.set(subordinateTo);
        }
    }
    
    /**
     * Appends and returns a new empty "SubordinateTo" element
     */
    public gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType addNewSubordinateTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore._2_0.SubordinateSuperiorRelationshipType)get_store().add_element_user(SUBORDINATETO$0);
            return target;
        }
    }
}
