/*
 * An XML document type.
 * Localname: NANPTelephoneNumber
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0;


/**
 * A document containing one NANPTelephoneNumber(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public interface NANPTelephoneNumberDocument extends gov.niem.niem.niem_core._2_0.TelephoneNumberRepresentationDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NANPTelephoneNumberDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("nanptelephonenumberc0fddoctype");
    
    /**
     * Gets the "NANPTelephoneNumber" element
     */
    gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType getNANPTelephoneNumber();
    
    /**
     * Tests for nil "NANPTelephoneNumber" element
     */
    boolean isNilNANPTelephoneNumber();
    
    /**
     * Sets the "NANPTelephoneNumber" element
     */
    void setNANPTelephoneNumber(gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType nanpTelephoneNumber);
    
    /**
     * Appends and returns a new empty "NANPTelephoneNumber" element
     */
    gov.niem.niem.niem_core._2_0.NANPTelephoneNumberType addNewNANPTelephoneNumber();
    
    /**
     * Nils the "NANPTelephoneNumber" element
     */
    void setNilNANPTelephoneNumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument newInstance() {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.NANPTelephoneNumberDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
