/*
 * An XML document type.
 * Localname: DigestMetadata
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.DigestMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one DigestMetadata(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DigestMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore._2_0.DigestMetadataDocument
{
    
    public DigestMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGESTMETADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DigestMetadata");
    
    
    /**
     * Gets the "DigestMetadata" element
     */
    public gov.ucore.ucore._2_0.DigestMetadataType getDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestMetadataType target = null;
            target = (gov.ucore.ucore._2_0.DigestMetadataType)get_store().find_element_user(DIGESTMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DigestMetadata" element
     */
    public void setDigestMetadata(gov.ucore.ucore._2_0.DigestMetadataType digestMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestMetadataType target = null;
            target = (gov.ucore.ucore._2_0.DigestMetadataType)get_store().find_element_user(DIGESTMETADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.DigestMetadataType)get_store().add_element_user(DIGESTMETADATA$0);
            }
            target.set(digestMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DigestMetadata" element
     */
    public gov.ucore.ucore._2_0.DigestMetadataType addNewDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestMetadataType target = null;
            target = (gov.ucore.ucore._2_0.DigestMetadataType)get_store().add_element_user(DIGESTMETADATA$0);
            return target;
        }
    }
}
