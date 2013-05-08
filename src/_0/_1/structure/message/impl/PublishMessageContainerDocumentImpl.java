/*
 * An XML document type.
 * Localname: PublishMessageContainer
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PublishMessageContainerDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one PublishMessageContainer(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PublishMessageContainerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PublishMessageContainerDocument
{
    
    public PublishMessageContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGECONTAINER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageContainer");
    
    
    /**
     * Gets the "PublishMessageContainer" element
     */
    public _0._1.structure.message.PublishMessageContainerType getPublishMessageContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageContainerType target = null;
            target = (_0._1.structure.message.PublishMessageContainerType)get_store().find_element_user(PUBLISHMESSAGECONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishMessageContainer" element
     */
    public void setPublishMessageContainer(_0._1.structure.message.PublishMessageContainerType publishMessageContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageContainerType target = null;
            target = (_0._1.structure.message.PublishMessageContainerType)get_store().find_element_user(PUBLISHMESSAGECONTAINER$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.PublishMessageContainerType)get_store().add_element_user(PUBLISHMESSAGECONTAINER$0);
            }
            target.set(publishMessageContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishMessageContainer" element
     */
    public _0._1.structure.message.PublishMessageContainerType addNewPublishMessageContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageContainerType target = null;
            target = (_0._1.structure.message.PublishMessageContainerType)get_store().add_element_user(PUBLISHMESSAGECONTAINER$0);
            return target;
        }
    }
}
