/*
 * An XML document type.
 * Localname: Deprecated
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo._2_0.DeprecatedDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo._2_0;


/**
 * A document containing one Deprecated(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public interface DeprecatedDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeprecatedDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("deprecatedeef6doctype");
    
    /**
     * Gets the "Deprecated" element
     */
    gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated getDeprecated();
    
    /**
     * Sets the "Deprecated" element
     */
    void setDeprecated(gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated deprecated);
    
    /**
     * Appends and returns a new empty "Deprecated" element
     */
    gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated addNewDeprecated();
    
    /**
     * An XML Deprecated(@http://niem.gov/niem/appinfo/2.0).
     *
     * This is a complex type.
     */
    public interface Deprecated extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Deprecated.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("deprecatedf125elemtype");
        
        /**
         * Gets the "value" attribute
         */
        boolean getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(boolean value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value value);
        
        /**
         * An XML value(@http://niem.gov/niem/appinfo/2.0).
         *
         * This is an atomic type that is a restriction of gov.niem.niem.appinfo._2_0.DeprecatedDocument$Deprecated$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlBoolean
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("value5c9cattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value newValue(java.lang.Object obj) {
                  return (gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value) type.newValue( obj ); }
                
                public static gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value newInstance() {
                  return (gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated newInstance() {
              return (gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.niem.niem.appinfo._2_0.DeprecatedDocument.Deprecated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument newInstance() {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.appinfo._2_0.DeprecatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.appinfo._2_0.DeprecatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
