/*
 * XML Type:  PackageSecurityMetadataType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.PackageSecurityMetadataType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0;


/**
 * An XML PackageSecurityMetadataType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface PackageSecurityMetadataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackageSecurityMetadataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("packagesecuritymetadatatypecce6type");
    
    /**
     * Gets the "classification" attribute
     */
    v2.ism.ic.gov.us.ClassificationType.Enum getClassification();
    
    /**
     * Gets (as xml) the "classification" attribute
     */
    v2.ism.ic.gov.us.ClassificationType xgetClassification();
    
    /**
     * True if has "classification" attribute
     */
    boolean isSetClassification();
    
    /**
     * Sets the "classification" attribute
     */
    void setClassification(v2.ism.ic.gov.us.ClassificationType.Enum classification);
    
    /**
     * Sets (as xml) the "classification" attribute
     */
    void xsetClassification(v2.ism.ic.gov.us.ClassificationType classification);
    
    /**
     * Unsets the "classification" attribute
     */
    void unsetClassification();
    
    /**
     * Gets the "ownerProducer" attribute
     */
    java.util.List getOwnerProducer();
    
    /**
     * Gets (as xml) the "ownerProducer" attribute
     */
    v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer xgetOwnerProducer();
    
    /**
     * True if has "ownerProducer" attribute
     */
    boolean isSetOwnerProducer();
    
    /**
     * Sets the "ownerProducer" attribute
     */
    void setOwnerProducer(java.util.List ownerProducer);
    
    /**
     * Sets (as xml) the "ownerProducer" attribute
     */
    void xsetOwnerProducer(v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer ownerProducer);
    
    /**
     * Unsets the "ownerProducer" attribute
     */
    void unsetOwnerProducer();
    
    /**
     * Gets the "SCIcontrols" attribute
     */
    java.util.List getSCIcontrols();
    
    /**
     * Gets (as xml) the "SCIcontrols" attribute
     */
    v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols xgetSCIcontrols();
    
    /**
     * True if has "SCIcontrols" attribute
     */
    boolean isSetSCIcontrols();
    
    /**
     * Sets the "SCIcontrols" attribute
     */
    void setSCIcontrols(java.util.List scIcontrols);
    
    /**
     * Sets (as xml) the "SCIcontrols" attribute
     */
    void xsetSCIcontrols(v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols scIcontrols);
    
    /**
     * Unsets the "SCIcontrols" attribute
     */
    void unsetSCIcontrols();
    
    /**
     * Gets the "SARIdentifier" attribute
     */
    java.util.List getSARIdentifier();
    
    /**
     * Gets (as xml) the "SARIdentifier" attribute
     */
    v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier xgetSARIdentifier();
    
    /**
     * True if has "SARIdentifier" attribute
     */
    boolean isSetSARIdentifier();
    
    /**
     * Sets the "SARIdentifier" attribute
     */
    void setSARIdentifier(java.util.List sarIdentifier);
    
    /**
     * Sets (as xml) the "SARIdentifier" attribute
     */
    void xsetSARIdentifier(v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier sarIdentifier);
    
    /**
     * Unsets the "SARIdentifier" attribute
     */
    void unsetSARIdentifier();
    
    /**
     * Gets the "disseminationControls" attribute
     */
    java.util.List getDisseminationControls();
    
    /**
     * Gets (as xml) the "disseminationControls" attribute
     */
    v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls xgetDisseminationControls();
    
    /**
     * True if has "disseminationControls" attribute
     */
    boolean isSetDisseminationControls();
    
    /**
     * Sets the "disseminationControls" attribute
     */
    void setDisseminationControls(java.util.List disseminationControls);
    
    /**
     * Sets (as xml) the "disseminationControls" attribute
     */
    void xsetDisseminationControls(v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls disseminationControls);
    
    /**
     * Unsets the "disseminationControls" attribute
     */
    void unsetDisseminationControls();
    
    /**
     * Gets the "FGIsourceOpen" attribute
     */
    java.util.List getFGIsourceOpen();
    
    /**
     * Gets (as xml) the "FGIsourceOpen" attribute
     */
    v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen xgetFGIsourceOpen();
    
    /**
     * True if has "FGIsourceOpen" attribute
     */
    boolean isSetFGIsourceOpen();
    
    /**
     * Sets the "FGIsourceOpen" attribute
     */
    void setFGIsourceOpen(java.util.List fgIsourceOpen);
    
    /**
     * Sets (as xml) the "FGIsourceOpen" attribute
     */
    void xsetFGIsourceOpen(v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen fgIsourceOpen);
    
    /**
     * Unsets the "FGIsourceOpen" attribute
     */
    void unsetFGIsourceOpen();
    
    /**
     * Gets the "FGIsourceProtected" attribute
     */
    java.util.List getFGIsourceProtected();
    
    /**
     * Gets (as xml) the "FGIsourceProtected" attribute
     */
    v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected xgetFGIsourceProtected();
    
    /**
     * True if has "FGIsourceProtected" attribute
     */
    boolean isSetFGIsourceProtected();
    
    /**
     * Sets the "FGIsourceProtected" attribute
     */
    void setFGIsourceProtected(java.util.List fgIsourceProtected);
    
    /**
     * Sets (as xml) the "FGIsourceProtected" attribute
     */
    void xsetFGIsourceProtected(v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected fgIsourceProtected);
    
    /**
     * Unsets the "FGIsourceProtected" attribute
     */
    void unsetFGIsourceProtected();
    
    /**
     * Gets the "releasableTo" attribute
     */
    java.util.List getReleasableTo();
    
    /**
     * Gets (as xml) the "releasableTo" attribute
     */
    v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo xgetReleasableTo();
    
    /**
     * True if has "releasableTo" attribute
     */
    boolean isSetReleasableTo();
    
    /**
     * Sets the "releasableTo" attribute
     */
    void setReleasableTo(java.util.List releasableTo);
    
    /**
     * Sets (as xml) the "releasableTo" attribute
     */
    void xsetReleasableTo(v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo releasableTo);
    
    /**
     * Unsets the "releasableTo" attribute
     */
    void unsetReleasableTo();
    
    /**
     * Gets the "nonICmarkings" attribute
     */
    java.util.List getNonICmarkings();
    
    /**
     * Gets (as xml) the "nonICmarkings" attribute
     */
    v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings xgetNonICmarkings();
    
    /**
     * True if has "nonICmarkings" attribute
     */
    boolean isSetNonICmarkings();
    
    /**
     * Sets the "nonICmarkings" attribute
     */
    void setNonICmarkings(java.util.List nonICmarkings);
    
    /**
     * Sets (as xml) the "nonICmarkings" attribute
     */
    void xsetNonICmarkings(v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings nonICmarkings);
    
    /**
     * Unsets the "nonICmarkings" attribute
     */
    void unsetNonICmarkings();
    
    /**
     * Gets the "classifiedBy" attribute
     */
    java.lang.String getClassifiedBy();
    
    /**
     * Gets (as xml) the "classifiedBy" attribute
     */
    v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy xgetClassifiedBy();
    
    /**
     * True if has "classifiedBy" attribute
     */
    boolean isSetClassifiedBy();
    
    /**
     * Sets the "classifiedBy" attribute
     */
    void setClassifiedBy(java.lang.String classifiedBy);
    
    /**
     * Sets (as xml) the "classifiedBy" attribute
     */
    void xsetClassifiedBy(v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy classifiedBy);
    
    /**
     * Unsets the "classifiedBy" attribute
     */
    void unsetClassifiedBy();
    
    /**
     * Gets the "derivativelyClassifiedBy" attribute
     */
    java.lang.String getDerivativelyClassifiedBy();
    
    /**
     * Gets (as xml) the "derivativelyClassifiedBy" attribute
     */
    v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy xgetDerivativelyClassifiedBy();
    
    /**
     * True if has "derivativelyClassifiedBy" attribute
     */
    boolean isSetDerivativelyClassifiedBy();
    
    /**
     * Sets the "derivativelyClassifiedBy" attribute
     */
    void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy);
    
    /**
     * Sets (as xml) the "derivativelyClassifiedBy" attribute
     */
    void xsetDerivativelyClassifiedBy(v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy derivativelyClassifiedBy);
    
    /**
     * Unsets the "derivativelyClassifiedBy" attribute
     */
    void unsetDerivativelyClassifiedBy();
    
    /**
     * Gets the "classificationReason" attribute
     */
    java.lang.String getClassificationReason();
    
    /**
     * Gets (as xml) the "classificationReason" attribute
     */
    v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason xgetClassificationReason();
    
    /**
     * True if has "classificationReason" attribute
     */
    boolean isSetClassificationReason();
    
    /**
     * Sets the "classificationReason" attribute
     */
    void setClassificationReason(java.lang.String classificationReason);
    
    /**
     * Sets (as xml) the "classificationReason" attribute
     */
    void xsetClassificationReason(v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason classificationReason);
    
    /**
     * Unsets the "classificationReason" attribute
     */
    void unsetClassificationReason();
    
    /**
     * Gets the "derivedFrom" attribute
     */
    java.lang.String getDerivedFrom();
    
    /**
     * Gets (as xml) the "derivedFrom" attribute
     */
    v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom xgetDerivedFrom();
    
    /**
     * True if has "derivedFrom" attribute
     */
    boolean isSetDerivedFrom();
    
    /**
     * Sets the "derivedFrom" attribute
     */
    void setDerivedFrom(java.lang.String derivedFrom);
    
    /**
     * Sets (as xml) the "derivedFrom" attribute
     */
    void xsetDerivedFrom(v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom derivedFrom);
    
    /**
     * Unsets the "derivedFrom" attribute
     */
    void unsetDerivedFrom();
    
    /**
     * Gets the "declassDate" attribute
     */
    java.util.Calendar getDeclassDate();
    
    /**
     * Gets (as xml) the "declassDate" attribute
     */
    v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate xgetDeclassDate();
    
    /**
     * True if has "declassDate" attribute
     */
    boolean isSetDeclassDate();
    
    /**
     * Sets the "declassDate" attribute
     */
    void setDeclassDate(java.util.Calendar declassDate);
    
    /**
     * Sets (as xml) the "declassDate" attribute
     */
    void xsetDeclassDate(v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate declassDate);
    
    /**
     * Unsets the "declassDate" attribute
     */
    void unsetDeclassDate();
    
    /**
     * Gets the "declassEvent" attribute
     */
    java.lang.String getDeclassEvent();
    
    /**
     * Gets (as xml) the "declassEvent" attribute
     */
    v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent xgetDeclassEvent();
    
    /**
     * True if has "declassEvent" attribute
     */
    boolean isSetDeclassEvent();
    
    /**
     * Sets the "declassEvent" attribute
     */
    void setDeclassEvent(java.lang.String declassEvent);
    
    /**
     * Sets (as xml) the "declassEvent" attribute
     */
    void xsetDeclassEvent(v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent declassEvent);
    
    /**
     * Unsets the "declassEvent" attribute
     */
    void unsetDeclassEvent();
    
    /**
     * Gets the "declassException" attribute
     */
    java.util.List getDeclassException();
    
    /**
     * Gets (as xml) the "declassException" attribute
     */
    v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException xgetDeclassException();
    
    /**
     * True if has "declassException" attribute
     */
    boolean isSetDeclassException();
    
    /**
     * Sets the "declassException" attribute
     */
    void setDeclassException(java.util.List declassException);
    
    /**
     * Sets (as xml) the "declassException" attribute
     */
    void xsetDeclassException(v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException declassException);
    
    /**
     * Unsets the "declassException" attribute
     */
    void unsetDeclassException();
    
    /**
     * Gets the "typeOfExemptedSource" attribute
     */
    java.util.List getTypeOfExemptedSource();
    
    /**
     * Gets (as xml) the "typeOfExemptedSource" attribute
     */
    v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource xgetTypeOfExemptedSource();
    
    /**
     * True if has "typeOfExemptedSource" attribute
     */
    boolean isSetTypeOfExemptedSource();
    
    /**
     * Sets the "typeOfExemptedSource" attribute
     */
    void setTypeOfExemptedSource(java.util.List typeOfExemptedSource);
    
    /**
     * Sets (as xml) the "typeOfExemptedSource" attribute
     */
    void xsetTypeOfExemptedSource(v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource typeOfExemptedSource);
    
    /**
     * Unsets the "typeOfExemptedSource" attribute
     */
    void unsetTypeOfExemptedSource();
    
    /**
     * Gets the "dateOfExemptedSource" attribute
     */
    java.util.Calendar getDateOfExemptedSource();
    
    /**
     * Gets (as xml) the "dateOfExemptedSource" attribute
     */
    v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource xgetDateOfExemptedSource();
    
    /**
     * True if has "dateOfExemptedSource" attribute
     */
    boolean isSetDateOfExemptedSource();
    
    /**
     * Sets the "dateOfExemptedSource" attribute
     */
    void setDateOfExemptedSource(java.util.Calendar dateOfExemptedSource);
    
    /**
     * Sets (as xml) the "dateOfExemptedSource" attribute
     */
    void xsetDateOfExemptedSource(v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource dateOfExemptedSource);
    
    /**
     * Unsets the "dateOfExemptedSource" attribute
     */
    void unsetDateOfExemptedSource();
    
    /**
     * Gets the "declassManualReview" attribute
     */
    boolean getDeclassManualReview();
    
    /**
     * Gets (as xml) the "declassManualReview" attribute
     */
    v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview xgetDeclassManualReview();
    
    /**
     * True if has "declassManualReview" attribute
     */
    boolean isSetDeclassManualReview();
    
    /**
     * Sets the "declassManualReview" attribute
     */
    void setDeclassManualReview(boolean declassManualReview);
    
    /**
     * Sets (as xml) the "declassManualReview" attribute
     */
    void xsetDeclassManualReview(v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview declassManualReview);
    
    /**
     * Unsets the "declassManualReview" attribute
     */
    void unsetDeclassManualReview();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType newInstance() {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore._2_0.PackageSecurityMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore._2_0.PackageSecurityMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
