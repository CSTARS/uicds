/*
 * XML Type:  LengthMeasureType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LengthMeasureType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * An XML LengthMeasureType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class LengthMeasureTypeImpl extends gov.niem.niem.niem_core._2_0.impl.MeasureTypeImpl implements gov.niem.niem.niem_core._2_0.LengthMeasureType
{
    
    public LengthMeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTHUNITCODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LengthUnitCode");
    
    
    /**
     * Gets the "LengthUnitCode" element
     */
    public gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType getLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType target = null;
            target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().find_element_user(LENGTHUNITCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LengthUnitCode" element
     */
    public boolean isNilLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType target = null;
            target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().find_element_user(LENGTHUNITCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LengthUnitCode" element
     */
    public boolean isSetLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTHUNITCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "LengthUnitCode" element
     */
    public void setLengthUnitCode(gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType lengthUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType target = null;
            target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().find_element_user(LENGTHUNITCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().add_element_user(LENGTHUNITCODE$0);
            }
            target.set(lengthUnitCode);
        }
    }
    
    /**
     * Appends and returns a new empty "LengthUnitCode" element
     */
    public gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType addNewLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType target = null;
            target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().add_element_user(LENGTHUNITCODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LengthUnitCode" element
     */
    public void setNilLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType target = null;
            target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().find_element_user(LENGTHUNITCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.unece_rec20_misc._2_0.LengthCodeType)get_store().add_element_user(LENGTHUNITCODE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LengthUnitCode" element
     */
    public void unsetLengthUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTHUNITCODE$0, 0);
        }
    }
}
