/*
 * An XML attribute type.
 * Localname: disseminationControls
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: v2.ism.ic.gov.us.DisseminationControlsAttribute
 *
 * Automatically generated - do not modify.
 */
package v2.ism.ic.gov.us;


/**
 * A document containing one disseminationControls(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public interface DisseminationControlsAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisseminationControlsAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("disseminationcontrolsb186attrtypetype");
    
    /**
     * Gets the "disseminationControls" attribute
     */
    java.util.List getDisseminationControls();
    
    /**
     * Gets (as xml) the "disseminationControls" attribute
     */
    v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls xgetDisseminationControls();
    
    /**
     * True if has "disseminationControls" attribute
     */
    boolean isSetDisseminationControls();
    
    /**
     * Sets the "disseminationControls" attribute
     */
    void setDisseminationControls(java.util.List disseminationControls);
    
    /**
     * Sets (as xml) the "disseminationControls" attribute
     */
    void xsetDisseminationControls(v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls disseminationControls);
    
    /**
     * Unsets the "disseminationControls" attribute
     */
    void unsetDisseminationControls();
    
    /**
     * An XML disseminationControls(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public interface DisseminationControls extends org.apache.xmlbeans.XmlNMTOKENS
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisseminationControls.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("disseminationcontrolsbc95attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls newValue(java.lang.Object obj) {
              return (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls) type.newValue( obj ); }
            
            public static v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls newInstance() {
              return (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute newInstance() {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static v2.ism.ic.gov.us.DisseminationControlsAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (v2.ism.ic.gov.us.DisseminationControlsAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
