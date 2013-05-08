/*
 * An XML document type.
 * Localname: UpdateSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorservice.UpdateSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorservice;


/**
 * A document containing one UpdateSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public interface UpdateSOIResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateSOIResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("updatesoiresponsef842doctype");
    
    /**
     * Gets the "UpdateSOIResponse" element
     */
    org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse getUpdateSOIResponse();
    
    /**
     * Sets the "UpdateSOIResponse" element
     */
    void setUpdateSOIResponse(org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse updateSOIResponse);
    
    /**
     * Appends and returns a new empty "UpdateSOIResponse" element
     */
    org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse addNewUpdateSOIResponse();
    
    /**
     * An XML UpdateSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public interface UpdateSOIResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateSOIResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("updatesoiresponseddf1elemtype");
        
        /**
         * Gets the "WorkProductPublicationResponse" element
         */
        org.uicds.workproductservice.WorkProductPublicationResponseType getWorkProductPublicationResponse();
        
        /**
         * Sets the "WorkProductPublicationResponse" element
         */
        void setWorkProductPublicationResponse(org.uicds.workproductservice.WorkProductPublicationResponseType workProductPublicationResponse);
        
        /**
         * Appends and returns a new empty "WorkProductPublicationResponse" element
         */
        org.uicds.workproductservice.WorkProductPublicationResponseType addNewWorkProductPublicationResponse();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse newInstance() {
              return (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.sensorservice.UpdateSOIResponseDocument.UpdateSOIResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.sensorservice.UpdateSOIResponseDocument newInstance() {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorservice.UpdateSOIResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorservice.UpdateSOIResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
