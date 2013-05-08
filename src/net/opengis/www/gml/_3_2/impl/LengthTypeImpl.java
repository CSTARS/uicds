/*
 * XML Type:  LengthType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.LengthType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * An XML LengthType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class LengthTypeImpl extends net.opengis.www.gml._3_2.impl.MeasureTypeImpl implements net.opengis.www.gml._3_2.LengthType
{
    
    public LengthTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public net.opengis.www.gml._3_2.UomIdentifier xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.UomIdentifier target = null;
            target = (net.opengis.www.gml._3_2.UomIdentifier)get_store().find_attribute_user(UOM$0);
            return target;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(net.opengis.www.gml._3_2.UomIdentifier uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.UomIdentifier target = null;
            target = (net.opengis.www.gml._3_2.UomIdentifier)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (net.opengis.www.gml._3_2.UomIdentifier)get_store().add_attribute_user(UOM$0);
            }
            target.set(uom);
        }
    }
}
