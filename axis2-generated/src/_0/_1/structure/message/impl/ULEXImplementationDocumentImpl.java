/*
 * An XML document type.
 * Localname: ULEXImplementation
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.ULEXImplementationDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one ULEXImplementation(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class ULEXImplementationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.ULEXImplementationDocument
{
    
    public ULEXImplementationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementation");
    
    
    /**
     * Gets the "ULEXImplementation" element
     */
    public _0._1.structure.message.ULEXImplementationType getULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.ULEXImplementationType target = null;
            target = (_0._1.structure.message.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementation" element
     */
    public void setULEXImplementation(_0._1.structure.message.ULEXImplementationType ulexImplementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.ULEXImplementationType target = null;
            target = (_0._1.structure.message.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$0);
            }
            target.set(ulexImplementation);
        }
    }
    
    /**
     * Appends and returns a new empty "ULEXImplementation" element
     */
    public _0._1.structure.message.ULEXImplementationType addNewULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.ULEXImplementationType target = null;
            target = (_0._1.structure.message.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$0);
            return target;
        }
    }
}
