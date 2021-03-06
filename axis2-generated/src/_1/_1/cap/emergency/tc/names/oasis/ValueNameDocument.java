/*
 * An XML document type.
 * Localname: valueName
 * Namespace: urn:oasis:names:tc:emergency:cap:1.1
 * Java type: _1._1.cap.emergency.tc.names.oasis.ValueNameDocument
 *
 * Automatically generated - do not modify.
 */
package _1._1.cap.emergency.tc.names.oasis;


/**
 * A document containing one valueName(@urn:oasis:names:tc:emergency:cap:1.1) element.
 *
 * This is a complex type.
 */
public interface ValueNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("valuenamef49fdoctype");
    
    /**
     * Gets the "valueName" element
     */
    java.lang.String getValueName();
    
    /**
     * Gets (as xml) the "valueName" element
     */
    org.apache.xmlbeans.XmlString xgetValueName();
    
    /**
     * Sets the "valueName" element
     */
    void setValueName(java.lang.String valueName);
    
    /**
     * Sets (as xml) the "valueName" element
     */
    void xsetValueName(org.apache.xmlbeans.XmlString valueName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument newInstance() {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _1._1.cap.emergency.tc.names.oasis.ValueNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_1._1.cap.emergency.tc.names.oasis.ValueNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
