/*
 * XML Type:  AttachmentLinkType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.AttachmentLinkType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message;


/**
 * An XML AttachmentLinkType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface AttachmentLinkType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachmentLinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("attachmentlinktype5869type");
    
    /**
     * Gets the "AttachmentURI" element
     */
    java.lang.String getAttachmentURI();
    
    /**
     * Gets (as xml) the "AttachmentURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetAttachmentURI();
    
    /**
     * Sets the "AttachmentURI" element
     */
    void setAttachmentURI(java.lang.String attachmentURI);
    
    /**
     * Sets (as xml) the "AttachmentURI" element
     */
    void xsetAttachmentURI(org.apache.xmlbeans.XmlAnyURI attachmentURI);
    
    /**
     * Gets the "AttachmentViewableIndicator" element
     */
    boolean getAttachmentViewableIndicator();
    
    /**
     * Gets (as xml) the "AttachmentViewableIndicator" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAttachmentViewableIndicator();
    
    /**
     * Sets the "AttachmentViewableIndicator" element
     */
    void setAttachmentViewableIndicator(boolean attachmentViewableIndicator);
    
    /**
     * Sets (as xml) the "AttachmentViewableIndicator" element
     */
    void xsetAttachmentViewableIndicator(org.apache.xmlbeans.XmlBoolean attachmentViewableIndicator);
    
    /**
     * Gets the "AttachmentDescriptionText" element
     */
    java.lang.String getAttachmentDescriptionText();
    
    /**
     * Gets (as xml) the "AttachmentDescriptionText" element
     */
    org.apache.xmlbeans.XmlString xgetAttachmentDescriptionText();
    
    /**
     * Sets the "AttachmentDescriptionText" element
     */
    void setAttachmentDescriptionText(java.lang.String attachmentDescriptionText);
    
    /**
     * Sets (as xml) the "AttachmentDescriptionText" element
     */
    void xsetAttachmentDescriptionText(org.apache.xmlbeans.XmlString attachmentDescriptionText);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.structure.message.AttachmentLinkType newInstance() {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.structure.message.AttachmentLinkType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.structure.message.AttachmentLinkType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.AttachmentLinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.AttachmentLinkType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.AttachmentLinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
