/*
 * XML Type:  PublishMessageContainerType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PublishMessageContainerType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * An XML PublishMessageContainerType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PublishMessageContainerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PublishMessageContainerType
{
    
    public PublishMessageContainerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessage");
    
    
    /**
     * Gets array of all "PublishMessage" elements
     */
    public _0._1.structure.message.PublishMessageType[] getPublishMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLISHMESSAGE$0, targetList);
            _0._1.structure.message.PublishMessageType[] result = new _0._1.structure.message.PublishMessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PublishMessage" element
     */
    public _0._1.structure.message.PublishMessageType getPublishMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PublishMessage" element
     */
    public int sizeOfPublishMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISHMESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "PublishMessage" element
     */
    public void setPublishMessageArray(_0._1.structure.message.PublishMessageType[] publishMessageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publishMessageArray, PUBLISHMESSAGE$0);
        }
    }
    
    /**
     * Sets ith "PublishMessage" element
     */
    public void setPublishMessageArray(int i, _0._1.structure.message.PublishMessageType publishMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publishMessage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishMessage" element
     */
    public _0._1.structure.message.PublishMessageType insertNewPublishMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PublishMessageType target = null;
            target = (_0._1.structure.message.PublishMessageType)get_store().insert_element_user(PUBLISHMESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublishMessage" element
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
    
    /**
     * Removes the ith "PublishMessage" element
     */
    public void removePublishMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISHMESSAGE$0, i);
        }
    }
}
