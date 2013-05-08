/*
 * XML Type:  PackageAbstractType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.PackageAbstractType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message;


/**
 * An XML PackageAbstractType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface PackageAbstractType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackageAbstractType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("packageabstracttype1af0type");
    
    /**
     * Gets the "PackageMetadata" element
     */
    _0._1.structure.message.PackageMetadataType getPackageMetadata();
    
    /**
     * Sets the "PackageMetadata" element
     */
    void setPackageMetadata(_0._1.structure.message.PackageMetadataType packageMetadata);
    
    /**
     * Appends and returns a new empty "PackageMetadata" element
     */
    _0._1.structure.message.PackageMetadataType addNewPackageMetadata();
    
    /**
     * Gets the "DigestAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDigestAbstract();
    
    /**
     * True if has "DigestAbstract" element
     */
    boolean isSetDigestAbstract();
    
    /**
     * Sets the "DigestAbstract" element
     */
    void setDigestAbstract(org.apache.xmlbeans.XmlObject digestAbstract);
    
    /**
     * Appends and returns a new empty "DigestAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDigestAbstract();
    
    /**
     * Unsets the "DigestAbstract" element
     */
    void unsetDigestAbstract();
    
    /**
     * Gets array of all "StructuredPayload" elements
     */
    _0._1.structure.message.StructuredPayloadType[] getStructuredPayloadArray();
    
    /**
     * Gets ith "StructuredPayload" element
     */
    _0._1.structure.message.StructuredPayloadType getStructuredPayloadArray(int i);
    
    /**
     * Returns number of "StructuredPayload" element
     */
    int sizeOfStructuredPayloadArray();
    
    /**
     * Sets array of all "StructuredPayload" element
     */
    void setStructuredPayloadArray(_0._1.structure.message.StructuredPayloadType[] structuredPayloadArray);
    
    /**
     * Sets ith "StructuredPayload" element
     */
    void setStructuredPayloadArray(int i, _0._1.structure.message.StructuredPayloadType structuredPayload);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredPayload" element
     */
    _0._1.structure.message.StructuredPayloadType insertNewStructuredPayload(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredPayload" element
     */
    _0._1.structure.message.StructuredPayloadType addNewStructuredPayload();
    
    /**
     * Removes the ith "StructuredPayload" element
     */
    void removeStructuredPayload(int i);
    
    /**
     * Gets array of all "AttachmentLink" elements
     */
    _0._1.structure.message.AttachmentLinkType[] getAttachmentLinkArray();
    
    /**
     * Gets ith "AttachmentLink" element
     */
    _0._1.structure.message.AttachmentLinkType getAttachmentLinkArray(int i);
    
    /**
     * Returns number of "AttachmentLink" element
     */
    int sizeOfAttachmentLinkArray();
    
    /**
     * Sets array of all "AttachmentLink" element
     */
    void setAttachmentLinkArray(_0._1.structure.message.AttachmentLinkType[] attachmentLinkArray);
    
    /**
     * Sets ith "AttachmentLink" element
     */
    void setAttachmentLinkArray(int i, _0._1.structure.message.AttachmentLinkType attachmentLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentLink" element
     */
    _0._1.structure.message.AttachmentLinkType insertNewAttachmentLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentLink" element
     */
    _0._1.structure.message.AttachmentLinkType addNewAttachmentLink();
    
    /**
     * Removes the ith "AttachmentLink" element
     */
    void removeAttachmentLink(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static _0._1.structure.message.PackageAbstractType newInstance() {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static _0._1.structure.message.PackageAbstractType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.structure.message.PackageAbstractType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.structure.message.PackageAbstractType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.structure.message.PackageAbstractType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.PackageAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.PackageAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
