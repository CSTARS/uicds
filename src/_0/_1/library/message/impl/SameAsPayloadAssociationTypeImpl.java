/*
 * XML Type:  SameAsPayloadAssociationType
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsPayloadAssociationType
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * An XML SameAsPayloadAssociationType(@ulex:message:library:1.0).
 *
 * This is a complex type.
 */
public class SameAsPayloadAssociationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.SameAsPayloadAssociationType
{
    
    public SameAsPayloadAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference");
    private static final javax.xml.namespace.QName PAYLOADOBJECTREFERENCE$2 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadObjectReference");
    private static final javax.xml.namespace.QName PAYLOADREFERENCE$4 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadReference");
    
    
    /**
     * Gets the "ObjectReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObjectReference" element
     */
    public void setObjectReference(_0._1.library.message.ValidatingReferenceType objectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            }
            target.set(objectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    public _0._1.library.message.ValidatingReferenceType addNewObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "PayloadObjectReference" element
     */
    public _0._1.library.message.NonValidatingReferenceType getPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.NonValidatingReferenceType target = null;
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$2, 0);
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
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$2, 0);
            if (target == null)
            {
                target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$2);
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
            target = (_0._1.library.message.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "PayloadReference" element
     */
    public _0._1.library.message.ValidatingReferenceType getPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.ValidatingReferenceType target = null;
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$4, 0);
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
            target = (_0._1.library.message.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$4, 0);
            if (target == null)
            {
                target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$4);
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
            target = (_0._1.library.message.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$4);
            return target;
        }
    }
}
