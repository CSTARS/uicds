/*
 * An XML document type.
 * Localname: GetSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.GetSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice;


/**
 * A document containing one GetSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public interface GetSOIResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSOIResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getsoiresponsecffddoctype");
    
    /**
     * Gets the "GetSOIResponse" element
     */
    org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse getGetSOIResponse();
    
    /**
     * Sets the "GetSOIResponse" element
     */
    void setGetSOIResponse(org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse getSOIResponse);
    
    /**
     * Appends and returns a new empty "GetSOIResponse" element
     */
    org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse addNewGetSOIResponse();
    
    /**
     * An XML GetSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public interface GetSOIResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSOIResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("getsoiresponse1e71elemtype");
        
        /**
         * Gets the "WorkProduct" element
         */
        com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct getWorkProduct();
        
        /**
         * Sets the "WorkProduct" element
         */
        void setWorkProduct(com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct workProduct);
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        com.saic.www.precis._2009._06.structures.WorkProductDocument.WorkProduct addNewWorkProduct();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse newInstance() {
              return (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.sensorservice.GetSOIResponseDocument.GetSOIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.sensorservice.GetSOIResponseDocument newInstance() {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorservice.GetSOIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorservice.GetSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
