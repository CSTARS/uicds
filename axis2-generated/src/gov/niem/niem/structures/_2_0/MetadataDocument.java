/*
 * An XML document type.
 * Localname: Metadata
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures._2_0.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures._2_0;


/**
 * A document containing one Metadata(@http://niem.gov/niem/structures/2.0) element.
 *
 * This is a complex type.
 */
public interface MetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("metadata117fdoctype");
    
    /**
     * Gets the "Metadata" element
     */
    gov.niem.niem.structures._2_0.MetadataType getMetadata();
    
    /**
     * Sets the "Metadata" element
     */
    void setMetadata(gov.niem.niem.structures._2_0.MetadataType metadata);
    
    /**
     * Appends and returns a new empty "Metadata" element
     */
    gov.niem.niem.structures._2_0.MetadataType addNewMetadata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.structures._2_0.MetadataDocument newInstance() {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.structures._2_0.MetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.structures._2_0.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
