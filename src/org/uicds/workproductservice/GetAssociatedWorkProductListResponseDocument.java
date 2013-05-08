/*
 * An XML document type.
 * Localname: GetAssociatedWorkProductListResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workproductservice;


/**
 * A document containing one GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public interface GetAssociatedWorkProductListResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAssociatedWorkProductListResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getassociatedworkproductlistresponse903edoctype");
    
    /**
     * Gets the "GetAssociatedWorkProductListResponse" element
     */
    org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getGetAssociatedWorkProductListResponse();
    
    /**
     * Sets the "GetAssociatedWorkProductListResponse" element
     */
    void setGetAssociatedWorkProductListResponse(org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getAssociatedWorkProductListResponse);
    
    /**
     * Appends and returns a new empty "GetAssociatedWorkProductListResponse" element
     */
    org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse addNewGetAssociatedWorkProductListResponse();
    
    /**
     * An XML GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public interface GetAssociatedWorkProductListResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAssociatedWorkProductListResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getassociatedworkproductlistresponsec141elemtype");
        
        /**
         * Gets the "WorkProductList" element
         */
        org.uicds.workproductservice.WorkProductListDocument.WorkProductList getWorkProductList();
        
        /**
         * Sets the "WorkProductList" element
         */
        void setWorkProductList(org.uicds.workproductservice.WorkProductListDocument.WorkProductList workProductList);
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        org.uicds.workproductservice.WorkProductListDocument.WorkProductList addNewWorkProductList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse newInstance() {
              return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument newInstance() {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workproductservice.GetAssociatedWorkProductListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
