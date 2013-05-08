/*
 * XML Type:  RenderingInstructionsType
 * Namespace: ulex:message:structure:1.0
 * Java type: _0._1.structure.message.RenderingInstructionsType
 *
 * Automatically generated - do not modify.
 */
package _0._1.structure.message;


/**
 * An XML RenderingInstructionsType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface RenderingInstructionsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RenderingInstructionsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("renderinginstructionstype5b47type");
    
    /**
     * Gets the "RenderingMethod" element
     */
    _0._1.codes.message.RenderingMethodCodeSimpleType.Enum getRenderingMethod();
    
    /**
     * Gets (as xml) the "RenderingMethod" element
     */
    _0._1.codes.message.RenderingMethodCodeSimpleType xgetRenderingMethod();
    
    /**
     * Sets the "RenderingMethod" element
     */
    void setRenderingMethod(_0._1.codes.message.RenderingMethodCodeSimpleType.Enum renderingMethod);
    
    /**
     * Sets (as xml) the "RenderingMethod" element
     */
    void xsetRenderingMethod(_0._1.codes.message.RenderingMethodCodeSimpleType renderingMethod);
    
    /**
     * Gets the "AttachmentURI" element
     */
    java.lang.String getAttachmentURI();
    
    /**
     * Gets (as xml) the "AttachmentURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetAttachmentURI();
    
    /**
     * True if has "AttachmentURI" element
     */
    boolean isSetAttachmentURI();
    
    /**
     * Sets the "AttachmentURI" element
     */
    void setAttachmentURI(java.lang.String attachmentURI);
    
    /**
     * Sets (as xml) the "AttachmentURI" element
     */
    void xsetAttachmentURI(org.apache.xmlbeans.XmlAnyURI attachmentURI);
    
    /**
     * Unsets the "AttachmentURI" element
     */
    void unsetAttachmentURI();
    
    /**
     * Gets array of all "RenderingParameter" elements
     */
    _0._1.structure.message.RenderingParameterType[] getRenderingParameterArray();
    
    /**
     * Gets ith "RenderingParameter" element
     */
    _0._1.structure.message.RenderingParameterType getRenderingParameterArray(int i);
    
    /**
     * Returns number of "RenderingParameter" element
     */
    int sizeOfRenderingParameterArray();
    
    /**
     * Sets array of all "RenderingParameter" element
     */
    void setRenderingParameterArray(_0._1.structure.message.RenderingParameterType[] renderingParameterArray);
    
    /**
     * Sets ith "RenderingParameter" element
     */
    void setRenderingParameterArray(int i, _0._1.structure.message.RenderingParameterType renderingParameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RenderingParameter" element
     */
    _0._1.structure.message.RenderingParameterType insertNewRenderingParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RenderingParameter" element
     */
    _0._1.structure.message.RenderingParameterType addNewRenderingParameter();
    
    /**
     * Removes the ith "RenderingParameter" element
     */
    void removeRenderingParameter(int i);
    
    /**
     * Gets the "RenderingDescription" element
     */
    java.lang.String getRenderingDescription();
    
    /**
     * Gets (as xml) the "RenderingDescription" element
     */
    org.apache.xmlbeans.XmlString xgetRenderingDescription();
    
    /**
     * True if has "RenderingDescription" element
     */
    boolean isSetRenderingDescription();
    
    /**
     * Sets the "RenderingDescription" element
     */
    void setRenderingDescription(java.lang.String renderingDescription);
    
    /**
     * Sets (as xml) the "RenderingDescription" element
     */
    void xsetRenderingDescription(org.apache.xmlbeans.XmlString renderingDescription);
    
    /**
     * Unsets the "RenderingDescription" element
     */
    void unsetRenderingDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.structure.message.RenderingInstructionsType newInstance() {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.structure.message.RenderingInstructionsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.structure.message.RenderingInstructionsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.RenderingInstructionsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.structure.message.RenderingInstructionsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.structure.message.RenderingInstructionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
