/*
 * An XML document type.
 * Localname: CommunityPedigreeURI
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.CommunityPedigreeURIDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message.impl;
/**
 * A document containing one CommunityPedigreeURI(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class CommunityPedigreeURIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.structure.message.CommunityPedigreeURIDocument
{
    
    public CommunityPedigreeURIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYPEDIGREEURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURI");
    
    
    /**
     * Gets the "CommunityPedigreeURI" element
     */
    public _0._1.structure.message.CommunityPedigreeURIType getCommunityPedigreeURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.CommunityPedigreeURIType target = null;
            target = (_0._1.structure.message.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CommunityPedigreeURI" element
     */
    public void setCommunityPedigreeURI(_0._1.structure.message.CommunityPedigreeURIType communityPedigreeURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.CommunityPedigreeURIType target = null;
            target = (_0._1.structure.message.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$0, 0);
            if (target == null)
            {
                target = (_0._1.structure.message.CommunityPedigreeURIType)get_store().add_element_user(COMMUNITYPEDIGREEURI$0);
            }
            target.set(communityPedigreeURI);
        }
    }
    
    /**
     * Appends and returns a new empty "CommunityPedigreeURI" element
     */
    public _0._1.structure.message.CommunityPedigreeURIType addNewCommunityPedigreeURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.structure.message.CommunityPedigreeURIType target = null;
            target = (_0._1.structure.message.CommunityPedigreeURIType)get_store().add_element_user(COMMUNITYPEDIGREEURI$0);
            return target;
        }
    }
}
