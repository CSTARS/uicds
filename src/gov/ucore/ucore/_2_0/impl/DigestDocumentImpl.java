/*
 * An XML document type.
 * Localname: Digest
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.DigestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one Digest(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DigestDocumentImpl extends _0._1.structure.message.impl.DigestAbstractDocumentImpl implements gov.ucore.ucore._2_0.DigestDocument
{
    
    public DigestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGEST$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Digest");
    
    
    /**
     * Gets the "Digest" element
     */
    public gov.ucore.ucore._2_0.DigestType getDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestType target = null;
            target = (gov.ucore.ucore._2_0.DigestType)get_store().find_element_user(DIGEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Digest" element
     */
    public void setDigest(gov.ucore.ucore._2_0.DigestType digest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestType target = null;
            target = (gov.ucore.ucore._2_0.DigestType)get_store().find_element_user(DIGEST$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.DigestType)get_store().add_element_user(DIGEST$0);
            }
            target.set(digest);
        }
    }
    
    /**
     * Appends and returns a new empty "Digest" element
     */
    public gov.ucore.ucore._2_0.DigestType addNewDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.DigestType target = null;
            target = (gov.ucore.ucore._2_0.DigestType)get_store().add_element_user(DIGEST$0);
            return target;
        }
    }
}
