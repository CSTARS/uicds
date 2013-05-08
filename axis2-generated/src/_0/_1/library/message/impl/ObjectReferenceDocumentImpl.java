/*
 * An XML document type.
 * Localname: ObjectReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.ObjectReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one ObjectReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class ObjectReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.ObjectReferenceDocument
{
    
    public ObjectReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference");
    
    
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
}
