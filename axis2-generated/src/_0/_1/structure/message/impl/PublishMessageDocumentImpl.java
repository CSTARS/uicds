/*
 * An XML document type.
 * Localname: PublishMessage
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PublishMessageDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PublishMessage(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PublishMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PublishMessageDocument
{
    
    public PublishMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessage");
    
    
    /**
     * Gets the "PublishMessage" element
     */
    public _0._1.structure.message.PublishMessageType getPublishMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishMessage" element
     */
    public void setPublishMessage(_0._1.structure.message.PublishMessageType publishMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.PublishMessageType)get_store().add_element_user(PUBLISHMESSAGE$0);
            }
            target.set(publishMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishMessage" element
     */
    public _0._1.structure.message.PublishMessageType addNewPublishMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().add_element_user(PUBLISHMESSAGE$0);
            return target;
        }
    }
}
