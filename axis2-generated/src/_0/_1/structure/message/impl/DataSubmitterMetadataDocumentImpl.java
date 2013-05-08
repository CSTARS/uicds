/*
 * An XML document type.
 * Localname: DataSubmitterMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataSubmitterMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataSubmitterMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataSubmitterMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataSubmitterMetadataDocument
{
    
    public DataSubmitterMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASUBMITTERMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSubmitterMetadata");
    
    
    /**
     * Gets the "DataSubmitterMetadata" element
     */
    public _0._1.structure.message.SystemMetadataType getDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSubmitterMetadata" element
     */
    public void setDataSubmitterMetadata(_0._1.structure.message.SystemMetadataType dataSubmitterMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$0);
            }
            target.set(dataSubmitterMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSubmitterMetadata" element
     */
    public _0._1.structure.message.SystemMetadataType addNewDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$0);
            return target;
        }
    }
}
