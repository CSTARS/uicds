/*
 * An XML document type.
 * Localname: SameAsDigestReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsDigestReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one SameAsDigestReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsDigestReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.SameAsDigestReferenceDocument
{
    
    public SameAsDigestReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASDIGESTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsDigestReference");
    
    
    /**
     * Gets the "SameAsDigestReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType getSameAsDigestReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(SAMEASDIGESTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsDigestReference" element
     */
    public void setSameAsDigestReference(_0._1.library.message.NonValidatingReferenceType sameAsDigestReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(SAMEASDIGESTREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(SAMEASDIGESTREFERENCE$0);
            }
            target.set(sameAsDigestReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsDigestReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType addNewSameAsDigestReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(SAMEASDIGESTREFERENCE$0);
            return target;
        }
    }
}
