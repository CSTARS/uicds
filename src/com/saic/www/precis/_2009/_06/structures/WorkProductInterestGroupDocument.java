/*
 * An XML document type.
 * Localname: WorkProductInterestGroup
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.structures;


/**
 * A document containing one WorkProductInterestGroup(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public interface WorkProductInterestGroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProductInterestGroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("workproductinterestgroupc92bdoctype");
    
    /**
     * Gets the "WorkProductInterestGroup" element
     */
    com.saic.www.precis._2009._06.structures.InterestGroupType getWorkProductInterestGroup();
    
    /**
     * Sets the "WorkProductInterestGroup" element
     */
    void setWorkProductInterestGroup(com.saic.www.precis._2009._06.structures.InterestGroupType workProductInterestGroup);
    
    /**
     * Appends and returns a new empty "WorkProductInterestGroup" element
     */
    com.saic.www.precis._2009._06.structures.InterestGroupType addNewWorkProductInterestGroup();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument newInstance() {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.structures.WorkProductInterestGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
