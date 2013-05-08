/*
 * An XML document type.
 * Localname: PackageResourceMetadataExtension
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PackageResourceMetadataExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one PackageResourceMetadataExtension(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PackageResourceMetadataExtensionDocumentImpl extends _0._1.structure.message.impl.PackageMetadataExtensionAbstractDocumentImpl implements gov.ucore.ucore._2_0.PackageResourceMetadataExtensionDocument
{
    
    public PackageResourceMetadataExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGERESOURCEMETADATAEXTENSION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageResourceMetadataExtension");
    
    
    /**
     * Gets the "PackageResourceMetadataExtension" element
     */
    public gov.ucore.ucore._2_0.PackageResourceMetadataType getPackageResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageResourceMetadataType)get_store().find_element_user(PACKAGERESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageResourceMetadataExtension" element
     */
    public void setPackageResourceMetadataExtension(gov.ucore.ucore._2_0.PackageResourceMetadataType packageResourceMetadataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageResourceMetadataType)get_store().find_element_user(PACKAGERESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.PackageResourceMetadataType)get_store().add_element_user(PACKAGERESOURCEMETADATAEXTENSION$0);
            }
            target.set(packageResourceMetadataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageResourceMetadataExtension" element
     */
    public gov.ucore.ucore._2_0.PackageResourceMetadataType addNewPackageResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore._2_0.PackageResourceMetadataType)get_store().add_element_user(PACKAGERESOURCEMETADATAEXTENSION$0);
            return target;
        }
    }
}
