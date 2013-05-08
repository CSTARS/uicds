/*
 * XML Type:  PublishMessageType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PublishMessageType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * An XML PublishMessageType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PublishMessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.PublishMessageType
{
    
    public PublishMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadata");
    private static final javax.xml.namespace.QName DATASUBMITTERMETADATA$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSubmitterMetadata");
    private static final javax.xml.namespace.QName PUBLISHMESSAGEITEMABSTRACT$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract");
    private static final org.apache.xmlbeans.QNameSet PUBLISHMESSAGEITEMABSTRACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPackage"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "Attachment"),
    });
    
    
    /**
     * Gets the "PDMessageMetadata" element
     */
    public _0._1.structure.message.PDMessageMetadataType getPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadata" element
     */
    public void setPDMessageMetadata(_0._1.structure.message.PDMessageMetadataType pdMessageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            }
            target.set(pdMessageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadata" element
     */
    public _0._1.structure.message.PDMessageMetadataType addNewPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.PDMessageMetadataType target = null;
            target = (_0._1.structure.message.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataSubmitterMetadata" element
     */
    public _0._1.structure.message.SystemMetadataType getDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSubmitterMetadata" element
     */
    public void setDataSubmitterMetadata(_0._1.structure.message.SystemMetadataType dataSubmitterMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$2, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$2);
            }
            target.set(dataSubmitterMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSubmitterMetadata" element
     */
    public _0._1.structure.message.SystemMetadataType addNewDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.SystemMetadataType target = null;
            target = (_0._1.structure.message.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "PublishMessageItemAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getPublishMessageItemAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLISHMESSAGEITEMABSTRACT$5, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PublishMessageItemAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPublishMessageItemAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PUBLISHMESSAGEITEMABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PublishMessageItemAbstract" element
     */
    public int sizeOfPublishMessageItemAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISHMESSAGEITEMABSTRACT$5);
        }
    }
    
    /**
     * Sets array of all "PublishMessageItemAbstract" element
     */
    public void setPublishMessageItemAbstractArray(org.apache.xmlbeans.XmlObject[] publishMessageItemAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publishMessageItemAbstractArray, PUBLISHMESSAGEITEMABSTRACT$4, PUBLISHMESSAGEITEMABSTRACT$5);
        }
    }
    
    /**
     * Sets ith "PublishMessageItemAbstract" element
     */
    public void setPublishMessageItemAbstractArray(int i, org.apache.xmlbeans.XmlObject publishMessageItemAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PUBLISHMESSAGEITEMABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publishMessageItemAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishMessageItemAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewPublishMessageItemAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PUBLISHMESSAGEITEMABSTRACT$5, PUBLISHMESSAGEITEMABSTRACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublishMessageItemAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPublishMessageItemAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PUBLISHMESSAGEITEMABSTRACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "PublishMessageItemAbstract" element
     */
    public void removePublishMessageItemAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISHMESSAGEITEMABSTRACT$5, i);
        }
    }
}
