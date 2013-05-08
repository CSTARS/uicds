/*
 * An XML document type.
 * Localname: DataOwnerMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.DataOwnerMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one DataOwnerMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.DataOwnerMetadataDocument
{
    
    public DataOwnerMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata");
    
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    public _0._1.structure.message.DataOwnerMetadataType getDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataOwnerMetadataType target = null;
            target = (_0._1.structure.message.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    public void setDataOwnerMetadata(_0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataOwnerMetadataType target = null;
            target = (_0._1.structure.message.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$0);
            }
            target.set(dataOwnerMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    public _0._1.structure.message.DataOwnerMetadataType addNewDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.DataOwnerMetadataType target = null;
            target = (_0._1.structure.message.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$0);
            return target;
        }
    }
}
