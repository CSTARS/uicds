/*
 * An XML document type.
 * Localname: CreateIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.CreateIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice;


/**
 * A document containing one CreateIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public interface CreateIncidentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateIncidentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("createincidentresponse39abdoctype");
    
    /**
     * Gets the "CreateIncidentResponse" element
     */
    org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse getCreateIncidentResponse();
    
    /**
     * Sets the "CreateIncidentResponse" element
     */
    void setCreateIncidentResponse(org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse createIncidentResponse);
    
    /**
     * Appends and returns a new empty "CreateIncidentResponse" element
     */
    org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse addNewCreateIncidentResponse();
    
    /**
     * An XML CreateIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public interface CreateIncidentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateIncidentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("createincidentresponsecf36elemtype");
        
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
            public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse newInstance() {
              return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument.CreateIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument newInstance() {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentmanagementservice.CreateIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentmanagementservice.CreateIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
