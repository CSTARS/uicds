/*
 * XML Type:  IdentifierType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.www.precis._2009._06.base.IdentifierType
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.base;


/**
 * An XML IdentifierType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is an atomic type that is a restriction of com.saic.www.precis._2009._06.base.IdentifierType.
 */
public interface IdentifierType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("identifiertype3218type");
    
    /**
     * Gets the "label" attribute
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" attribute
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "label" attribute
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" attribute
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "label" attribute
     */
    void unsetLabel();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.www.precis._2009._06.base.IdentifierType newInstance() {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.base.IdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.base.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
