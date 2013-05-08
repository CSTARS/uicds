/*
 * An XML document type.
 * Localname: GetAssociatedWorkProductListRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice;


/**
 * A document containing one GetAssociatedWorkProductListRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public interface GetAssociatedWorkProductListRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAssociatedWorkProductListRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("getassociatedworkproductlistrequestc97adoctype");
    
    /**
     * Gets the "GetAssociatedWorkProductListRequest" element
     */
    org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest getGetAssociatedWorkProductListRequest();
    
    /**
     * Sets the "GetAssociatedWorkProductListRequest" element
     */
    void setGetAssociatedWorkProductListRequest(org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest getAssociatedWorkProductListRequest);
    
    /**
     * Appends and returns a new empty "GetAssociatedWorkProductListRequest" element
     */
    org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest addNewGetAssociatedWorkProductListRequest();
    
    /**
     * An XML GetAssociatedWorkProductListRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public interface GetAssociatedWorkProductListRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAssociatedWorkProductListRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("getassociatedworkproductlistrequestccb5elemtype");
        
        /**
         * Gets the "Identifier" element
         */
        com.saic.www.precis._2009._06.base.IdentifierType getIdentifier();
        
        /**
         * Sets the "Identifier" element
         */
        void setIdentifier(com.saic.www.precis._2009._06.base.IdentifierType identifier);
        
        /**
         * Appends and returns a new empty "Identifier" element
         */
        com.saic.www.precis._2009._06.base.IdentifierType addNewIdentifier();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest newInstance() {
              return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument.GetAssociatedWorkProductListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument newInstance() {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
