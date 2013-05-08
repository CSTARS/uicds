/*
 * XML Type:  LinearRingType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.LinearRingType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2.impl;
/**
 * An XML LinearRingType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class LinearRingTypeImpl extends net.opengis.www.gml._3_2.impl.AbstractRingTypeImpl implements net.opengis.www.gml._3_2.LinearRingType
{
    
    public LinearRingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    
    
    /**
     * Gets array of all "pos" elements
     */
    public net.opengis.www.gml._3_2.DirectPositionType[] getPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POS$0, targetList);
            net.opengis.www.gml._3_2.DirectPositionType[] result = new net.opengis.www.gml._3_2.DirectPositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pos" element
     */
    public net.opengis.www.gml._3_2.DirectPositionType getPosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().find_element_user(POS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pos" element
     */
    public int sizeOfPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$0);
        }
    }
    
    /**
     * Sets array of all "pos" element
     */
    public void setPosArray(net.opengis.www.gml._3_2.DirectPositionType[] posArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(posArray, POS$0);
        }
    }
    
    /**
     * Sets ith "pos" element
     */
    public void setPosArray(int i, net.opengis.www.gml._3_2.DirectPositionType pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().find_element_user(POS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pos);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pos" element
     */
    public net.opengis.www.gml._3_2.DirectPositionType insertNewPos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().insert_element_user(POS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pos" element
     */
    public net.opengis.www.gml._3_2.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.www.gml._3_2.DirectPositionType target = null;
            target = (net.opengis.www.gml._3_2.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pos" element
     */
    public void removePos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$0, i);
        }
    }
}
