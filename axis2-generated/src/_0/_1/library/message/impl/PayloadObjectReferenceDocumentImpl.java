/*
 * An XML document type.
 * Localname: PayloadObjectReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.PayloadObjectReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one PayloadObjectReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class PayloadObjectReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.PayloadObjectReferenceDocument
{
    
    public PayloadObjectReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYLOADOBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadObjectReference");
    
    
    /**
     * Gets the "PayloadObjectReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType getPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PayloadObjectReference" element
     */
    public void setPayloadObjectReference(_0._1.library.message.NonValidatingReferenceType payloadObjectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$0);
            }
            target.set(payloadObjectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "PayloadObjectReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType addNewPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$0);
            return target;
        }
    }
}
