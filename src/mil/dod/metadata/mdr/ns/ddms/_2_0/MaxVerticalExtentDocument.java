/*
 * An XML document type.
 * Localname: MaxVerticalExtent
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0;


/**
 * A document containing one MaxVerticalExtent(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public interface MaxVerticalExtentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaxVerticalExtentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("maxverticalextentf464doctype");
    
    /**
     * Gets the "MaxVerticalExtent" element
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.VerticalDistanceType getMaxVerticalExtent();
    
    /**
     * Sets the "MaxVerticalExtent" element
     */
    void setMaxVerticalExtent(mil.dod.metadata.mdr.ns.ddms._2_0.VerticalDistanceType maxVerticalExtent);
    
    /**
     * Appends and returns a new empty "MaxVerticalExtent" element
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.VerticalDistanceType addNewMaxVerticalExtent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.MaxVerticalExtentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
