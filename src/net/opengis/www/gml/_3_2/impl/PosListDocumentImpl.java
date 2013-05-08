/*
 * An XML document type.
 * Localname: posList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.PosListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one posList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PosListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.www.gml._3_2.PosListDocument
{
    
    public PosListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "posList");
    
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.www.gml._3_2.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionListType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    public void setPosList(net.opengis.www.gml._3_2.DirectPositionListType posList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionListType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            }
            target.set(posList);
        }
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.www.gml._3_2.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionListType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            return target;
        }
    }
}
