/*
 * An XML document type.
 * Localname: PackageSecurityMetadata
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PackageSecurityMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one PackageSecurityMetadata(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PackageSecurityMetadataDocumentImpl extends _0._1.structure.message.impl.PackageMetadataExtensionAbstractDocumentImpl implements gov.ucore.ucore._2_0.PackageSecurityMetadataDocument
{
    
    public PackageSecurityMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGESECURITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageSecurityMetadata");
    
    
    /**
     * Gets the "PackageSecurityMetadata" element
     */
    public gov.ucore.ucore._2_0.PackageSecurityMetadataType getPackageSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageSecurityMetadataType)get_store().find_element_user(PACKAGESECURITYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageSecurityMetadata" element
     */
    public void setPackageSecurityMetadata(gov.ucore.ucore._2_0.PackageSecurityMetadataType packageSecurityMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageSecurityMetadataType)get_store().find_element_user(PACKAGESECURITYMETADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PackageSecurityMetadataType)get_store().add_element_user(PACKAGESECURITYMETADATA$0);
            }
            target.set(packageSecurityMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageSecurityMetadata" element
     */
    public gov.ucore.ucore._2_0.PackageSecurityMetadataType addNewPackageSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageSecurityMetadataType)get_store().add_element_user(PACKAGESECURITYMETADATA$0);
            return target;
        }
    }
}
