/*
 * An XML document type.
 * Localname: PayloadReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.PayloadReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one PayloadReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class PayloadReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.PayloadReferenceDocument
{
    
    public PayloadReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYLOADREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadReference");
    
    
    /**
     * Gets the "PayloadReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PayloadReference" element
     */
    public void setPayloadReference(_0._1.library.message.ValidatingReferenceType payloadReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$0);
            }
            target.set(payloadReference);
        }
    }
    
    /**
     * Appends and returns a new empty "PayloadReference" element
     */
    public _0._1.library.message.ValidatingReferenceType addNewPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$0);
            return target;
        }
    }
}
