/*
 * XML Type:  PersonNameType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0;


/**
 * An XML PersonNameType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface PersonNameType extends gov.niem.niem.structures._2_0.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4EF21377E0C3896346FE808A4E61C987").resolveHandle("personnametype5cb9type");
    
    /**
     * Gets array of all "PersonNamePrefixText" elements
     */
    gov.niem.niem.niem_core._2_0.TextType[] getPersonNamePrefixTextArray();
    
    /**
     * Gets ith "PersonNamePrefixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType getPersonNamePrefixTextArray(int i);
    
    /**
     * Tests for nil ith "PersonNamePrefixText" element
     */
    boolean isNilPersonNamePrefixTextArray(int i);
    
    /**
     * Returns number of "PersonNamePrefixText" element
     */
    int sizeOfPersonNamePrefixTextArray();
    
    /**
     * Sets array of all "PersonNamePrefixText" element
     */
    void setPersonNamePrefixTextArray(gov.niem.niem.niem_core._2_0.TextType[] personNamePrefixTextArray);
    
    /**
     * Sets ith "PersonNamePrefixText" element
     */
    void setPersonNamePrefixTextArray(int i, gov.niem.niem.niem_core._2_0.TextType personNamePrefixText);
    
    /**
     * Nils the ith "PersonNamePrefixText" element
     */
    void setNilPersonNamePrefixTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonNamePrefixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType insertNewPersonNamePrefixText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonNamePrefixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType addNewPersonNamePrefixText();
    
    /**
     * Removes the ith "PersonNamePrefixText" element
     */
    void removePersonNamePrefixText(int i);
    
    /**
     * Gets array of all "PersonGivenName" elements
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType[] getPersonGivenNameArray();
    
    /**
     * Gets ith "PersonGivenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonGivenNameArray(int i);
    
    /**
     * Tests for nil ith "PersonGivenName" element
     */
    boolean isNilPersonGivenNameArray(int i);
    
    /**
     * Returns number of "PersonGivenName" element
     */
    int sizeOfPersonGivenNameArray();
    
    /**
     * Sets array of all "PersonGivenName" element
     */
    void setPersonGivenNameArray(gov.niem.niem.niem_core._2_0.PersonNameTextType[] personGivenNameArray);
    
    /**
     * Sets ith "PersonGivenName" element
     */
    void setPersonGivenNameArray(int i, gov.niem.niem.niem_core._2_0.PersonNameTextType personGivenName);
    
    /**
     * Nils the ith "PersonGivenName" element
     */
    void setNilPersonGivenNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonGivenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType insertNewPersonGivenName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonGivenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonGivenName();
    
    /**
     * Removes the ith "PersonGivenName" element
     */
    void removePersonGivenName(int i);
    
    /**
     * Gets array of all "PersonMiddleName" elements
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType[] getPersonMiddleNameArray();
    
    /**
     * Gets ith "PersonMiddleName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonMiddleNameArray(int i);
    
    /**
     * Tests for nil ith "PersonMiddleName" element
     */
    boolean isNilPersonMiddleNameArray(int i);
    
    /**
     * Returns number of "PersonMiddleName" element
     */
    int sizeOfPersonMiddleNameArray();
    
    /**
     * Sets array of all "PersonMiddleName" element
     */
    void setPersonMiddleNameArray(gov.niem.niem.niem_core._2_0.PersonNameTextType[] personMiddleNameArray);
    
    /**
     * Sets ith "PersonMiddleName" element
     */
    void setPersonMiddleNameArray(int i, gov.niem.niem.niem_core._2_0.PersonNameTextType personMiddleName);
    
    /**
     * Nils the ith "PersonMiddleName" element
     */
    void setNilPersonMiddleNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonMiddleName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType insertNewPersonMiddleName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonMiddleName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonMiddleName();
    
    /**
     * Removes the ith "PersonMiddleName" element
     */
    void removePersonMiddleName(int i);
    
    /**
     * Gets array of all "PersonSurName" elements
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType[] getPersonSurNameArray();
    
    /**
     * Gets ith "PersonSurName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonSurNameArray(int i);
    
    /**
     * Tests for nil ith "PersonSurName" element
     */
    boolean isNilPersonSurNameArray(int i);
    
    /**
     * Returns number of "PersonSurName" element
     */
    int sizeOfPersonSurNameArray();
    
    /**
     * Sets array of all "PersonSurName" element
     */
    void setPersonSurNameArray(gov.niem.niem.niem_core._2_0.PersonNameTextType[] personSurNameArray);
    
    /**
     * Sets ith "PersonSurName" element
     */
    void setPersonSurNameArray(int i, gov.niem.niem.niem_core._2_0.PersonNameTextType personSurName);
    
    /**
     * Nils the ith "PersonSurName" element
     */
    void setNilPersonSurNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonSurName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType insertNewPersonSurName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonSurName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonSurName();
    
    /**
     * Removes the ith "PersonSurName" element
     */
    void removePersonSurName(int i);
    
    /**
     * Gets array of all "PersonNameSuffixText" elements
     */
    gov.niem.niem.niem_core._2_0.TextType[] getPersonNameSuffixTextArray();
    
    /**
     * Gets ith "PersonNameSuffixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType getPersonNameSuffixTextArray(int i);
    
    /**
     * Tests for nil ith "PersonNameSuffixText" element
     */
    boolean isNilPersonNameSuffixTextArray(int i);
    
    /**
     * Returns number of "PersonNameSuffixText" element
     */
    int sizeOfPersonNameSuffixTextArray();
    
    /**
     * Sets array of all "PersonNameSuffixText" element
     */
    void setPersonNameSuffixTextArray(gov.niem.niem.niem_core._2_0.TextType[] personNameSuffixTextArray);
    
    /**
     * Sets ith "PersonNameSuffixText" element
     */
    void setPersonNameSuffixTextArray(int i, gov.niem.niem.niem_core._2_0.TextType personNameSuffixText);
    
    /**
     * Nils the ith "PersonNameSuffixText" element
     */
    void setNilPersonNameSuffixTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonNameSuffixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType insertNewPersonNameSuffixText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonNameSuffixText" element
     */
    gov.niem.niem.niem_core._2_0.TextType addNewPersonNameSuffixText();
    
    /**
     * Removes the ith "PersonNameSuffixText" element
     */
    void removePersonNameSuffixText(int i);
    
    /**
     * Gets array of all "PersonMaidenName" elements
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType[] getPersonMaidenNameArray();
    
    /**
     * Gets ith "PersonMaidenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonMaidenNameArray(int i);
    
    /**
     * Tests for nil ith "PersonMaidenName" element
     */
    boolean isNilPersonMaidenNameArray(int i);
    
    /**
     * Returns number of "PersonMaidenName" element
     */
    int sizeOfPersonMaidenNameArray();
    
    /**
     * Sets array of all "PersonMaidenName" element
     */
    void setPersonMaidenNameArray(gov.niem.niem.niem_core._2_0.PersonNameTextType[] personMaidenNameArray);
    
    /**
     * Sets ith "PersonMaidenName" element
     */
    void setPersonMaidenNameArray(int i, gov.niem.niem.niem_core._2_0.PersonNameTextType personMaidenName);
    
    /**
     * Nils the ith "PersonMaidenName" element
     */
    void setNilPersonMaidenNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonMaidenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType insertNewPersonMaidenName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonMaidenName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonMaidenName();
    
    /**
     * Removes the ith "PersonMaidenName" element
     */
    void removePersonMaidenName(int i);
    
    /**
     * Gets array of all "PersonFullName" elements
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType[] getPersonFullNameArray();
    
    /**
     * Gets ith "PersonFullName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonFullNameArray(int i);
    
    /**
     * Tests for nil ith "PersonFullName" element
     */
    boolean isNilPersonFullNameArray(int i);
    
    /**
     * Returns number of "PersonFullName" element
     */
    int sizeOfPersonFullNameArray();
    
    /**
     * Sets array of all "PersonFullName" element
     */
    void setPersonFullNameArray(gov.niem.niem.niem_core._2_0.PersonNameTextType[] personFullNameArray);
    
    /**
     * Sets ith "PersonFullName" element
     */
    void setPersonFullNameArray(int i, gov.niem.niem.niem_core._2_0.PersonNameTextType personFullName);
    
    /**
     * Nils the ith "PersonFullName" element
     */
    void setNilPersonFullNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonFullName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType insertNewPersonFullName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonFullName" element
     */
    gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonFullName();
    
    /**
     * Removes the ith "PersonFullName" element
     */
    void removePersonFullName(int i);
    
    /**
     * Gets the "personNameCommentText" attribute
     */
    java.lang.String getPersonNameCommentText();
    
    /**
     * Gets (as xml) the "personNameCommentText" attribute
     */
    org.apache.xmlbeans.XmlString xgetPersonNameCommentText();
    
    /**
     * True if has "personNameCommentText" attribute
     */
    boolean isSetPersonNameCommentText();
    
    /**
     * Sets the "personNameCommentText" attribute
     */
    void setPersonNameCommentText(java.lang.String personNameCommentText);
    
    /**
     * Sets (as xml) the "personNameCommentText" attribute
     */
    void xsetPersonNameCommentText(org.apache.xmlbeans.XmlString personNameCommentText);
    
    /**
     * Unsets the "personNameCommentText" attribute
     */
    void unsetPersonNameCommentText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niem_core._2_0.PersonNameType newInstance() {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niem_core._2_0.PersonNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niem_core._2_0.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
