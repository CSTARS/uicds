/*
 * An XML document type.
 * Localname: SameAsPayloadReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsPayloadReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one SameAsPayloadReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsPayloadReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.SameAsPayloadReferenceDocument
{
    
    public SameAsPayloadReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASPAYLOADREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadReference");
    
    
    /**
     * Gets the "SameAsPayloadReference" element
     */
    public _0._1.library.message.PayloadObjectReferenceType getSameAsPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.PayloadObjectReferenceType target = null;
            target = (_0._1.library.message.PayloadObjectReferenceType)get_store().find_element_user(SAMEASPAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsPayloadReference" element
     */
    public void setSameAsPayloadReference(_0._1.library.message.PayloadObjectReferenceType sameAsPayloadReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.PayloadObjectReferenceType target = null;
            target = (_0._1.library.message.PayloadObjectReferenceType)get_store().find_element_user(SAMEASPAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.PayloadObjectReferenceType)get_store().add_element_user(SAMEASPAYLOADREFERENCE$0);
            }
            target.set(sameAsPayloadReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsPayloadReference" element
     */
    public _0._1.library.message.PayloadObjectReferenceType addNewSameAsPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.PayloadObjectReferenceType target = null;
            target = (_0._1.library.message.PayloadObjectReferenceType)get_store().add_element_user(SAMEASPAYLOADREFERENCE$0);
            return target;
        }
    }
}
