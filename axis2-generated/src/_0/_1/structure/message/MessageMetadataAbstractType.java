/*
 * XML Type:  MessageMetadataAbstractType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.MessageMetadataAbstractType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message;


/**
 * An XML MessageMetadataAbstractType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface MessageMetadataAbstractType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageMetadataAbstractType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("messagemetadataabstracttype1be0type");
    
    /**
     * Gets the "ULEXFramework" element
     */
    java.lang.String getULEXFramework();
    
    /**
     * Gets (as xml) the "ULEXFramework" element
     */
    org.apache.xmlbeans.XmlString xgetULEXFramework();
    
    /**
     * Sets the "ULEXFramework" element
     */
    void setULEXFramework(java.lang.String ulexFramework);
    
    /**
     * Sets (as xml) the "ULEXFramework" element
     */
    void xsetULEXFramework(org.apache.xmlbeans.XmlString ulexFramework);
    
    /**
     * Gets the "ULEXImplementation" element
     */
    _0._1.structure.message.ULEXImplementationType getULEXImplementation();
    
    /**
     * Sets the "ULEXImplementation" element
     */
    void setULEXImplementation(_0._1.structure.message.ULEXImplementationType ulexImplementation);
    
    /**
     * Appends and returns a new empty "ULEXImplementation" element
     */
    _0._1.structure.message.ULEXImplementationType addNewULEXImplementation();
    
    /**
     * Gets the "MessageDateTime" element
     */
    java.util.Calendar getMessageDateTime();
    
    /**
     * Gets (as xml) the "MessageDateTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetMessageDateTime();
    
    /**
     * Sets the "MessageDateTime" element
     */
    void setMessageDateTime(java.util.Calendar messageDateTime);
    
    /**
     * Sets (as xml) the "MessageDateTime" element
     */
    void xsetMessageDateTime(org.apache.xmlbeans.XmlDateTime messageDateTime);
    
    /**
     * Gets the "MessageSequenceNumber" element
     */
    java.math.BigInteger getMessageSequenceNumber();
    
    /**
     * Gets (as xml) the "MessageSequenceNumber" element
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMessageSequenceNumber();
    
    /**
     * Sets the "MessageSequenceNumber" element
     */
    void setMessageSequenceNumber(java.math.BigInteger messageSequenceNumber);
    
    /**
     * Sets (as xml) the "MessageSequenceNumber" element
     */
    void xsetMessageSequenceNumber(org.apache.xmlbeans.XmlNonNegativeInteger messageSequenceNumber);
    
    /**
     * Gets the "DataSensitivityAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataSensitivityAbstract();
    
    /**
     * True if has "DataSensitivityAbstract" element
     */
    boolean isSetDataSensitivityAbstract();
    
    /**
     * Sets the "DataSensitivityAbstract" element
     */
    void setDataSensitivityAbstract(org.apache.xmlbeans.XmlObject dataSensitivityAbstract);
    
    /**
     * Appends and returns a new empty "DataSensitivityAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataSensitivityAbstract();
    
    /**
     * Unsets the "DataSensitivityAbstract" element
     */
    void unsetDataSensitivityAbstract();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static _0._1.structure.message.MessageMetadataAbstractType newInstance() {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static _0._1.structure.message.MessageMetadataAbstractType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.structure.message.MessageMetadataAbstractType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.MessageMetadataAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.MessageMetadataAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.MessageMetadataAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
