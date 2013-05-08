/*
 * XML Type:  CodeWithAuthorityType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.www.gml._3_2.CodeWithAuthorityType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.www.gml._3_2;


/**
 * An XML CodeWithAuthorityType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.www.gml._3_2.CodeWithAuthorityType.
 */
public interface CodeWithAuthorityType extends net.opengis.www.gml._3_2.CodeType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeWithAuthorityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("codewithauthoritytype2dabtype");
    
    /**
     * Gets the "codeSpace" attribute
     */
    java.lang.String getCodeSpace();
    
    /**
     * Gets (as xml) the "codeSpace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetCodeSpace();
    
    /**
     * True if has "codeSpace" attribute
     */
    boolean isSetCodeSpace();
    
    /**
     * Sets the "codeSpace" attribute
     */
    void setCodeSpace(java.lang.String codeSpace);
    
    /**
     * Sets (as xml) the "codeSpace" attribute
     */
    void xsetCodeSpace(org.apache.xmlbeans.XmlAnyURI codeSpace);
    
    /**
     * Unsets the "codeSpace" attribute
     */
    void unsetCodeSpace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType newInstance() {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.www.gml._3_2.CodeWithAuthorityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.www.gml._3_2.CodeWithAuthorityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
