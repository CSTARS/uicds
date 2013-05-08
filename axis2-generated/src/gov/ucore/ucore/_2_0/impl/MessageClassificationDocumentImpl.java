/*
 * An XML document type.
 * Localname: MessageClassification
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.MessageClassificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * A document containing one MessageClassification(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class MessageClassificationDocumentImpl extends _0._1.structure.message.impl.DataSensitivityAbstractDocumentImpl implements gov.ucore.ucore._2_0.MessageClassificationDocument
{
    
    public MessageClassificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGECLASSIFICATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MessageClassification");
    
    
    /**
     * Gets the "MessageClassification" element
     */
    public gov.ucore.ucore._2_0.MessageClassificationType getMessageClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.MessageClassificationType target = null;
            target = (gov.ucore.ucore._2_0.MessageClassificationType)get_store().find_element_user(MESSAGECLASSIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageClassification" element
     */
    public void setMessageClassification(gov.ucore.ucore._2_0.MessageClassificationType messageClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.MessageClassificationType target = null;
            target = (gov.ucore.ucore._2_0.MessageClassificationType)get_store().find_element_user(MESSAGECLASSIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.MessageClassificationType)get_store().add_element_user(MESSAGECLASSIFICATION$0);
            }
            target.set(messageClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageClassification" element
     */
    public gov.ucore.ucore._2_0.MessageClassificationType addNewMessageClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.MessageClassificationType target = null;
            target = (gov.ucore.ucore._2_0.MessageClassificationType)get_store().add_element_user(MESSAGECLASSIFICATION$0);
            return target;
        }
    }
}
