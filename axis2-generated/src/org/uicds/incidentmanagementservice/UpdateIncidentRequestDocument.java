/*
 * An XML document type.
 * Localname: UpdateIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentmanagementservice;


/**
 * A document containing one UpdateIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public interface UpdateIncidentRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateIncidentRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("updateincidentrequest8d98doctype");
    
    /**
     * Gets the "UpdateIncidentRequest" element
     */
    org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest getUpdateIncidentRequest();
    
    /**
     * Sets the "UpdateIncidentRequest" element
     */
    void setUpdateIncidentRequest(org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest updateIncidentRequest);
    
    /**
     * Appends and returns a new empty "UpdateIncidentRequest" element
     */
    org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest addNewUpdateIncidentRequest();
    
    /**
     * An XML UpdateIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public interface UpdateIncidentRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateIncidentRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("updateincidentrequest89f8elemtype");
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        com.saic.www.precis._2009._06.base.IdentificationType getWorkProductIdentification();
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        void setWorkProductIdentification(com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification);
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        com.saic.www.precis._2009._06.base.IdentificationType addNewWorkProductIdentification();
        
        /**
         * Gets the "Incident" element
         */
        org.uicds.incident.UICDSIncidentType getIncident();
        
        /**
         * Sets the "Incident" element
         */
        void setIncident(org.uicds.incident.UICDSIncidentType incident);
        
        /**
         * Appends and returns a new empty "Incident" element
         */
        org.uicds.incident.UICDSIncidentType addNewIncident();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest newInstance() {
              return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument.UpdateIncidentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument newInstance() {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentmanagementservice.UpdateIncidentRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
