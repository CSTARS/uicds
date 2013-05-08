/*
 * An XML document type.
 * Localname: SameAsDigestReference
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsDigestReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message;


/**
 * A document containing one SameAsDigestReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public interface SameAsDigestReferenceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SameAsDigestReferenceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("sameasdigestreference29fbdoctype");
    
    /**
     * Gets the "SameAsDigestReference" element
     */
    _0._1.library.message.NonValidatingReferenceType getSameAsDigestReference();
    
    /**
     * Sets the "SameAsDigestReference" element
     */
    void setSameAsDigestReference(_0._1.library.message.NonValidatingReferenceType sameAsDigestReference);
    
    /**
     * Appends and returns a new empty "SameAsDigestReference" element
     */
    _0._1.library.message.NonValidatingReferenceType addNewSameAsDigestReference();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.library.message.SameAsDigestReferenceDocument newInstance() {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.library.message.SameAsDigestReferenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.library.message.SameAsDigestReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
