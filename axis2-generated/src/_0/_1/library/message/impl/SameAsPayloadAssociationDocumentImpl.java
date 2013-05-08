/*
 * An XML document type.
 * Localname: SameAsPayloadAssociation
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsPayloadAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message.impl;
/**
 * A document containing one SameAsPayloadAssociation(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsPayloadAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.library.message.SameAsPayloadAssociationDocument
{
    
    public SameAsPayloadAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASPAYLOADASSOCIATION$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociation");
    
    
    /**
     * Gets the "SameAsPayloadAssociation" element
     */
    public _0._1.library.message.SameAsPayloadAssociationType getSameAsPayloadAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.SameAsPayloadAssociationType target = null;
            target = (_0._1.library.message.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsPayloadAssociation" element
     */
    public void setSameAsPayloadAssociation(_0._1.library.message.SameAsPayloadAssociationType sameAsPayloadAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.SameAsPayloadAssociationType target = null;
            target = (_0._1.library.message.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$0, 0);
            if (target == null)
            {
                target = (_0._1.library.message.SameAsPayloadAssociationType)get_store().add_element_user(SAMEASPAYLOADASSOCIATION$0);
            }
            target.set(sameAsPayloadAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsPayloadAssociation" element
     */
    public _0._1.library.message.SameAsPayloadAssociationType addNewSameAsPayloadAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.library.message.SameAsPayloadAssociationType target = null;
            target = (_0._1.library.message.SameAsPayloadAssociationType)get_store().add_element_user(SAMEASPAYLOADASSOCIATION$0);
            return target;
        }
    }
}
