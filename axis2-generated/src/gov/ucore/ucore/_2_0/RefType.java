/*
 * XML Type:  RefType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.RefType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0;


/**
 * An XML RefType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface RefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("reftype2208type");
    
    /**
     * Gets the "ref" attribute
     */
    java.util.List getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetRef();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.util.List ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlIDREFS ref);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore._2_0.RefType newInstance() {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore._2_0.RefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore._2_0.RefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore._2_0.RefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.RefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.RefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.RefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
