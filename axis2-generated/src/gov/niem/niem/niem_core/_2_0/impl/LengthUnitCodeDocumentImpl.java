/*
 * An XML document type.
 * Localname: LengthUnitCode
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.LengthUnitCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one LengthUnitCode(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LengthUnitCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.LengthUnitCodeDocument
{
    
    public LengthUnitCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
