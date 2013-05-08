/*
 * An XML document type.
 * Localname: AssociatedGroups
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.www.precis._2009._06.base.AssociatedGroupsDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.www.precis._2009._06.base;


/**
 * A document containing one AssociatedGroups(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public interface AssociatedGroupsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociatedGroupsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("associatedgroupsf9dfdoctype");
    
    /**
     * Gets the "AssociatedGroups" element
     */
    com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups getAssociatedGroups();
    
    /**
     * Sets the "AssociatedGroups" element
     */
    void setAssociatedGroups(com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups associatedGroups);
    
    /**
     * Appends and returns a new empty "AssociatedGroups" element
     */
    com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups addNewAssociatedGroups();
    
    /**
     * An XML AssociatedGroups(@http://www.saic.com/precis/2009/06/base).
     *
     * This is a complex type.
     */
    public interface AssociatedGroups extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociatedGroups.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("associatedgroupsa4e9elemtype");
        
        /**
         * Gets array of all "Identifier" elements
         */
        com.saic.www.precis._2009._06.base.IdentifierType[] getIdentifierArray();
        
        /**
         * Gets ith "Identifier" element
         */
        com.saic.www.precis._2009._06.base.IdentifierType getIdentifierArray(int i);
        
        /**
         * Returns number of "Identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "Identifier" element
         */
        void setIdentifierArray(com.saic.www.precis._2009._06.base.IdentifierType[] identifierArray);
        
        /**
         * Sets ith "Identifier" element
         */
        void setIdentifierArray(int i, com.saic.www.precis._2009._06.base.IdentifierType identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        com.saic.www.precis._2009._06.base.IdentifierType insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        com.saic.www.precis._2009._06.base.IdentifierType addNewIdentifier();
        
        /**
         * Removes the ith "Identifier" element
         */
        void removeIdentifier(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups newInstance() {
              return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument.AssociatedGroups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument newInstance() {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.www.precis._2009._06.base.AssociatedGroupsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.www.precis._2009._06.base.AssociatedGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
