/*
 * XML Type:  StructuredPayloadMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.StructuredPayloadMetadataType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message;


/**
 * An XML StructuredPayloadMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface StructuredPayloadMetadataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructuredPayloadMetadataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("structuredpayloadmetadatatypee06ctype");
    
    /**
     * Gets the "CommunityURI" element
     */
    java.lang.String getCommunityURI();
    
    /**
     * Gets (as xml) the "CommunityURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetCommunityURI();
    
    /**
     * Sets the "CommunityURI" element
     */
    void setCommunityURI(java.lang.String communityURI);
    
    /**
     * Sets (as xml) the "CommunityURI" element
     */
    void xsetCommunityURI(org.apache.xmlbeans.XmlAnyURI communityURI);
    
    /**
     * Gets the "CommunityDescription" element
     */
    java.lang.String getCommunityDescription();
    
    /**
     * Gets (as xml) the "CommunityDescription" element
     */
    org.apache.xmlbeans.XmlString xgetCommunityDescription();
    
    /**
     * True if has "CommunityDescription" element
     */
    boolean isSetCommunityDescription();
    
    /**
     * Sets the "CommunityDescription" element
     */
    void setCommunityDescription(java.lang.String communityDescription);
    
    /**
     * Sets (as xml) the "CommunityDescription" element
     */
    void xsetCommunityDescription(org.apache.xmlbeans.XmlString communityDescription);
    
    /**
     * Unsets the "CommunityDescription" element
     */
    void unsetCommunityDescription();
    
    /**
     * Gets the "CommunityVersion" element
     */
    java.lang.String getCommunityVersion();
    
    /**
     * Gets (as xml) the "CommunityVersion" element
     */
    org.apache.xmlbeans.XmlString xgetCommunityVersion();
    
    /**
     * Sets the "CommunityVersion" element
     */
    void setCommunityVersion(java.lang.String communityVersion);
    
    /**
     * Sets (as xml) the "CommunityVersion" element
     */
    void xsetCommunityVersion(org.apache.xmlbeans.XmlString communityVersion);
    
    /**
     * Gets array of all "CommunityPedigreeURI" elements
     */
    _0._1.structure.message.CommunityPedigreeURIType[] getCommunityPedigreeURIArray();
    
    /**
     * Gets ith "CommunityPedigreeURI" element
     */
    _0._1.structure.message.CommunityPedigreeURIType getCommunityPedigreeURIArray(int i);
    
    /**
     * Returns number of "CommunityPedigreeURI" element
     */
    int sizeOfCommunityPedigreeURIArray();
    
    /**
     * Sets array of all "CommunityPedigreeURI" element
     */
    void setCommunityPedigreeURIArray(_0._1.structure.message.CommunityPedigreeURIType[] communityPedigreeURIArray);
    
    /**
     * Sets ith "CommunityPedigreeURI" element
     */
    void setCommunityPedigreeURIArray(int i, _0._1.structure.message.CommunityPedigreeURIType communityPedigreeURI);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommunityPedigreeURI" element
     */
    _0._1.structure.message.CommunityPedigreeURIType insertNewCommunityPedigreeURI(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommunityPedigreeURI" element
     */
    _0._1.structure.message.CommunityPedigreeURIType addNewCommunityPedigreeURI();
    
    /**
     * Removes the ith "CommunityPedigreeURI" element
     */
    void removeCommunityPedigreeURI(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.structure.message.StructuredPayloadMetadataType newInstance() {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.StructuredPayloadMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.StructuredPayloadMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
