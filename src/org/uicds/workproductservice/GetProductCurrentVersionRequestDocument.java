/*
 * An XML document type.
 * Localname: GetProductCurrentVersionRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetProductCurrentVersionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice;


/**
 * A document containing one GetProductCurrentVersionRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public interface GetProductCurrentVersionRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProductCurrentVersionRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getproductcurrentversionrequest3182doctype");
    
    /**
     * Gets the "GetProductCurrentVersionRequest" element
     */
    org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest getGetProductCurrentVersionRequest();
    
    /**
     * Sets the "GetProductCurrentVersionRequest" element
     */
    void setGetProductCurrentVersionRequest(org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest getProductCurrentVersionRequest);
    
    /**
     * Appends and returns a new empty "GetProductCurrentVersionRequest" element
     */
    org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest addNewGetProductCurrentVersionRequest();
    
    /**
     * An XML GetProductCurrentVersionRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public interface GetProductCurrentVersionRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProductCurrentVersionRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getproductcurrentversionrequestf8c5elemtype");
        
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
            public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest newInstance() {
              return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument.GetProductCurrentVersionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument newInstance() {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetProductCurrentVersionRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetProductCurrentVersionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
