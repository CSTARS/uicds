/*
 * XML Type:  RenderingMethodCodeSimpleType
 * Namespace: ulex:message:codes:1.0
 * Java type: _0._1.codes.message.RenderingMethodCodeSimpleType
 *
 * Automatically generated - do not modify.
 */
package _0._1.codes.message;


/**
 * An XML RenderingMethodCodeSimpleType(@ulex:message:codes:1.0).
 *
 * This is an atomic type that is a restriction of _0._1.codes.message.RenderingMethodCodeSimpleType.
 */
public interface RenderingMethodCodeSimpleType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RenderingMethodCodeSimpleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB10C9499E0DFBB636176E7D7114A9D4F").resolveHandle("renderingmethodcodesimpletype3a7ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum XHTML_STYLE_SHEET = Enum.forString("XHTMLStyleSheet");
    static final Enum HTML_STYLE_SHEET = Enum.forString("HTMLStyleSheet");
    static final Enum PDF_STYLE_SHEET = Enum.forString("PDFStyleSheet");
    static final Enum TEXT_STYLE_SHEET = Enum.forString("TextStyleSheet");
    static final Enum OTHER_STYLE_SHEET = Enum.forString("OtherStyleSheet");
    static final Enum RENDERED_BINARY = Enum.forString("RenderedBinary");
    static final Enum NARRATIVE = Enum.forString("Narrative");
    
    static final int INT_XHTML_STYLE_SHEET = Enum.INT_XHTML_STYLE_SHEET;
    static final int INT_HTML_STYLE_SHEET = Enum.INT_HTML_STYLE_SHEET;
    static final int INT_PDF_STYLE_SHEET = Enum.INT_PDF_STYLE_SHEET;
    static final int INT_TEXT_STYLE_SHEET = Enum.INT_TEXT_STYLE_SHEET;
    static final int INT_OTHER_STYLE_SHEET = Enum.INT_OTHER_STYLE_SHEET;
    static final int INT_RENDERED_BINARY = Enum.INT_RENDERED_BINARY;
    static final int INT_NARRATIVE = Enum.INT_NARRATIVE;
    
    /**
     * Enumeration value class for _0._1.codes.message.RenderingMethodCodeSimpleType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_XHTML_STYLE_SHEET
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_XHTML_STYLE_SHEET = 1;
        static final int INT_HTML_STYLE_SHEET = 2;
        static final int INT_PDF_STYLE_SHEET = 3;
        static final int INT_TEXT_STYLE_SHEET = 4;
        static final int INT_OTHER_STYLE_SHEET = 5;
        static final int INT_RENDERED_BINARY = 6;
        static final int INT_NARRATIVE = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("XHTMLStyleSheet", INT_XHTML_STYLE_SHEET),
                new Enum("HTMLStyleSheet", INT_HTML_STYLE_SHEET),
                new Enum("PDFStyleSheet", INT_PDF_STYLE_SHEET),
                new Enum("TextStyleSheet", INT_TEXT_STYLE_SHEET),
                new Enum("OtherStyleSheet", INT_OTHER_STYLE_SHEET),
                new Enum("RenderedBinary", INT_RENDERED_BINARY),
                new Enum("Narrative", INT_NARRATIVE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.codes.message.RenderingMethodCodeSimpleType newValue(java.lang.Object obj) {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) type.newValue( obj ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType newInstance() {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.codes.message.RenderingMethodCodeSimpleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.codes.message.RenderingMethodCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
