/*
 * XML Type:  CrossStreetType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.CrossStreetType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0;


/**
 * An XML CrossStreetType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface CrossStreetType extends gov.niem.niem.structures._2_0.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrossStreetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("crossstreettype8828type");
    
    /**
     * Gets array of all "CrossStreetDescriptionText" elements
     */
    gov.niem.niem.niem_core._2_0.TextType[] getCrossStreetDescriptionTextArray();
    
    /**
     * Gets ith "CrossStreetDescriptionText" element
     */
    gov.niem.niem.niem_core._2_0.TextType getCrossStreetDescriptionTextArray(int i);
    
    /**
     * Tests for nil ith "CrossStreetDescriptionText" element
     */
    boolean isNilCrossStreetDescriptionTextArray(int i);
    
    /**
     * Returns number of "CrossStreetDescriptionText" element
     */
    int sizeOfCrossStreetDescriptionTextArray();
    
    /**
     * Sets array of all "CrossStreetDescriptionText" element
     */
    void setCrossStreetDescriptionTextArray(gov.niem.niem.niem_core._2_0.TextType[] crossStreetDescriptionTextArray);
    
    /**
     * Sets ith "CrossStreetDescriptionText" element
     */
    void setCrossStreetDescriptionTextArray(int i, gov.niem.niem.niem_core._2_0.TextType crossStreetDescriptionText);
    
    /**
     * Nils the ith "CrossStreetDescriptionText" element
     */
    void setNilCrossStreetDescriptionTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossStreetDescriptionText" element
     */
    gov.niem.niem.niem_core._2_0.TextType insertNewCrossStreetDescriptionText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossStreetDescriptionText" element
     */
    gov.niem.niem.niem_core._2_0.TextType addNewCrossStreetDescriptionText();
    
    /**
     * Removes the ith "CrossStreetDescriptionText" element
     */
    void removeCrossStreetDescriptionText(int i);
    
    /**
     * Gets array of all "CrossStreetRelativeLocation" elements
     */
    gov.niem.niem.niem_core._2_0.RelativeLocationType[] getCrossStreetRelativeLocationArray();
    
    /**
     * Gets ith "CrossStreetRelativeLocation" element
     */
    gov.niem.niem.niem_core._2_0.RelativeLocationType getCrossStreetRelativeLocationArray(int i);
    
    /**
     * Tests for nil ith "CrossStreetRelativeLocation" element
     */
    boolean isNilCrossStreetRelativeLocationArray(int i);
    
    /**
     * Returns number of "CrossStreetRelativeLocation" element
     */
    int sizeOfCrossStreetRelativeLocationArray();
    
    /**
     * Sets array of all "CrossStreetRelativeLocation" element
     */
    void setCrossStreetRelativeLocationArray(gov.niem.niem.niem_core._2_0.RelativeLocationType[] crossStreetRelativeLocationArray);
    
    /**
     * Sets ith "CrossStreetRelativeLocation" element
     */
    void setCrossStreetRelativeLocationArray(int i, gov.niem.niem.niem_core._2_0.RelativeLocationType crossStreetRelativeLocation);
    
    /**
     * Nils the ith "CrossStreetRelativeLocation" element
     */
    void setNilCrossStreetRelativeLocationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossStreetRelativeLocation" element
     */
    gov.niem.niem.niem_core._2_0.RelativeLocationType insertNewCrossStreetRelativeLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossStreetRelativeLocation" element
     */
    gov.niem.niem.niem_core._2_0.RelativeLocationType addNewCrossStreetRelativeLocation();
    
    /**
     * Removes the ith "CrossStreetRelativeLocation" element
     */
    void removeCrossStreetRelativeLocation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niem_core._2_0.CrossStreetType newInstance() {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.CrossStreetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.CrossStreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
