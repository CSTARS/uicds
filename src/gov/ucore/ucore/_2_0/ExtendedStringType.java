/*
 * XML Type:  ExtendedStringType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.ExtendedStringType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0;


/**
 * An XML ExtendedStringType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface ExtendedStringType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtendedStringType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("extendedstringtype7cdftype");
    
    /**
     * Gets the "Value" element
     */
    gov.ucore.ucore._2_0.StringType getValue();
    
    /**
     * Sets the "Value" element
     */
    void setValue(gov.ucore.ucore._2_0.StringType value);
    
    /**
     * Appends and returns a new empty "Value" element
     */
    gov.ucore.ucore._2_0.StringType addNewValue();
    
    /**
     * Gets array of all "AltSpelling" elements
     */
    gov.ucore.ucore._2_0.StringType[] getAltSpellingArray();
    
    /**
     * Gets ith "AltSpelling" element
     */
    gov.ucore.ucore._2_0.StringType getAltSpellingArray(int i);
    
    /**
     * Returns number of "AltSpelling" element
     */
    int sizeOfAltSpellingArray();
    
    /**
     * Sets array of all "AltSpelling" element
     */
    void setAltSpellingArray(gov.ucore.ucore._2_0.StringType[] altSpellingArray);
    
    /**
     * Sets ith "AltSpelling" element
     */
    void setAltSpellingArray(int i, gov.ucore.ucore._2_0.StringType altSpelling);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AltSpelling" element
     */
    gov.ucore.ucore._2_0.StringType insertNewAltSpelling(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AltSpelling" element
     */
    gov.ucore.ucore._2_0.StringType addNewAltSpelling();
    
    /**
     * Removes the ith "AltSpelling" element
     */
    void removeAltSpelling(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore._2_0.ExtendedStringType newInstance() {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.ExtendedStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.ExtendedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
