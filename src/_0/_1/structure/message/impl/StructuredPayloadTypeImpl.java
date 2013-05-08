/*
 * XML Type:  StructuredPayloadType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.StructuredPayloadType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * An XML StructuredPayloadType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class StructuredPayloadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.StructuredPayloadType
{
    
    public StructuredPayloadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOADMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayloadMetadata");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "id");
    
    
    /**
     * Gets the "StructuredPayloadMetadata" element
     */
    public _0._1.structure.message.StructuredPayloadMetadataType getStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredPayloadMetadata" element
     */
    public void setStructuredPayloadMetadata(_0._1.structure.message.StructuredPayloadMetadataType structuredPayloadMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            }
            target.set(structuredPayloadMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredPayloadMetadata" element
     */
    public _0._1.structure.message.StructuredPayloadMetadataType addNewStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.StructuredPayloadMetadataType target = null;
            target = (_0._1.structure.message.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
