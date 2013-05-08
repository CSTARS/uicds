/*
 * An XML document type.
 * Localname: measure
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * A document containing one measure(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.www.gml._3_2.MeasureDocument
{
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "measure");
    
    
    /**
     * Gets the "measure" element
     */
    public net.opengis.www.gml._3_2.MeasureType getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.MeasureType target = null;
            target = (net.opengis.www.gml._3_2.MeasureType)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measure" element
     */
    public void setMeasure(net.opengis.www.gml._3_2.MeasureType measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.MeasureType target = null;
            target = (net.opengis.www.gml._3_2.MeasureType)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.MeasureType)get_store().add_element_user(MEASURE$0);
            }
            target.set(measure);
        }
    }
    
    /**
     * Appends and returns a new empty "measure" element
     */
    public net.opengis.www.gml._3_2.MeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.MeasureType target = null;
            target = (net.opengis.www.gml._3_2.MeasureType)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
}
