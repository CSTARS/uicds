/*
 * An XML document type.
 * Localname: PackageMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PackageMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PackageMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PackageMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PackageMetadataDocument
{
    
    public PackageMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadata");
    
    
    /**
     * Gets the "PackageMetadata" element
     */
    public _0._1.structure.message.PackageMetadataType getPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PackageMetadataType target = null;
            target = (_0._1.structure.message.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadata" element
     */
    public void setPackageMetadata(_0._1.structure.message.PackageMetadataType packageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PackageMetadataType target = null;
            target = (_0._1.structure.message.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            }
            target.set(packageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadata" element
     */
    public _0._1.structure.message.PackageMetadataType addNewPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PackageMetadataType target = null;
            target = (_0._1.structure.message.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            return target;
        }
    }
}
