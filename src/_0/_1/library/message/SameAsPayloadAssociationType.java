/*
 * XML Type:  SameAsPayloadAssociationType
 * Namespace: ulex:message:library:1.0
 * Java type: _0._1.library.message.SameAsPayloadAssociationType
 *
 * Automatically generated - do not modify.
 */
package _0._1.library.message;


/**
 * An XML SameAsPayloadAssociationType(@ulex:message:library:1.0).
 *
 * This is a complex type.
 */
public interface SameAsPayloadAssociationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SameAsPayloadAssociationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("sameaspayloadassociationtype4d43type");
    
    /**
     * Gets the "ObjectReference" element
     */
    _0._1.library.message.ValidatingReferenceType getObjectReference();
    
    /**
     * Sets the "ObjectReference" element
     */
    void setObjectReference(_0._1.library.message.ValidatingReferenceType objectReference);
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    _0._1.library.message.ValidatingReferenceType addNewObjectReference();
    
    /**
     * Gets the "PayloadObjectReference" element
     */
    _0._1.library.message.NonValidatingReferenceType getPayloadObjectReference();
    
    /**
     * Sets the "PayloadObjectReference" element
     */
    void setPayloadObjectReference(_0._1.library.message.NonValidatingReferenceType payloadObjectReference);
    
    /**
     * Appends and returns a new empty "PayloadObjectReference" element
     */
    _0._1.library.message.NonValidatingReferenceType addNewPayloadObjectReference();
    
    /**
     * Gets the "PayloadReference" element
     */
    _0._1.library.message.ValidatingReferenceType getPayloadReference();
    
    /**
     * Sets the "PayloadReference" element
     */
    void setPayloadReference(_0._1.library.message.ValidatingReferenceType payloadReference);
    
    /**
     * Appends and returns a new empty "PayloadReference" element
     */
    _0._1.library.message.ValidatingReferenceType addNewPayloadReference();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.library.message.SameAsPayloadAssociationType newInstance() {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.library.message.SameAsPayloadAssociationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.library.message.SameAsPayloadAssociationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.library.message.SameAsPayloadAssociationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.library.message.SameAsPayloadAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
