/*
 * An XML document type.
 * Localname: DataItemPublishInstruction
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataItemPublishInstructionDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataItemPublishInstruction(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemPublishInstructionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataItemPublishInstructionDocument
{
    
    public DataItemPublishInstructionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMPUBLISHINSTRUCTION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPublishInstruction");
    
    
    /**
     * Gets the "DataItemPublishInstruction" element
     */
    public _0._1.codes.message.DataItemPublishInstructionCodeSimpleType.Enum getDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemPublishInstruction" element
     */
    public _0._1.codes.message.DataItemPublishInstructionCodeSimpleType xgetDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.DataItemPublishInstructionCodeSimpleType target = null;
            target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemPublishInstruction" element
     */
    public boolean isNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.DataItemPublishInstructionCodeSimpleType target = null;
            target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataItemPublishInstruction" element
     */
    public void setDataItemPublishInstruction(_0._1.codes.message.DataItemPublishInstructionCodeSimpleType.Enum dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.setEnumValue(dataItemPublishInstruction);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemPublishInstruction" element
     */
    public void xsetDataItemPublishInstruction(_0._1.codes.message.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.DataItemPublishInstructionCodeSimpleType target = null;
            target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.set(dataItemPublishInstruction);
        }
    }
    
    /**
     * Nils the "DataItemPublishInstruction" element
     */
    public void setNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.codes.message.DataItemPublishInstructionCodeSimpleType target = null;
            target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (_0._1.codes.message.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.setNil();
        }
    }
}
