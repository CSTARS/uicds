/*
 * XML Type:  RelatedResourcesType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0;


/**
 * An XML RelatedResourcesType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public interface RelatedResourcesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedResourcesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("relatedresourcestypebd52type");
    
    /**
     * Gets array of all "RelatedResource" elements
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource[] getRelatedResourceArray();
    
    /**
     * Gets ith "RelatedResource" element
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource getRelatedResourceArray(int i);
    
    /**
     * Returns number of "RelatedResource" element
     */
    int sizeOfRelatedResourceArray();
    
    /**
     * Sets array of all "RelatedResource" element
     */
    void setRelatedResourceArray(mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource[] relatedResourceArray);
    
    /**
     * Sets ith "RelatedResource" element
     */
    void setRelatedResourceArray(int i, mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource relatedResource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelatedResource" element
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource insertNewRelatedResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelatedResource" element
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource addNewRelatedResource();
    
    /**
     * Removes the ith "RelatedResource" element
     */
    void removeRelatedResource(int i);
    
    /**
     * Gets the "relationship" attribute
     */
    java.lang.String getRelationship();
    
    /**
     * Gets (as xml) the "relationship" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetRelationship();
    
    /**
     * Sets the "relationship" attribute
     */
    void setRelationship(java.lang.String relationship);
    
    /**
     * Sets (as xml) the "relationship" attribute
     */
    void xsetRelationship(org.apache.xmlbeans.XmlAnyURI relationship);
    
    /**
     * Gets the "direction" attribute
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction.Enum getDirection();
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction xgetDirection();
    
    /**
     * True if has "direction" attribute
     */
    boolean isSetDirection();
    
    /**
     * Sets the "direction" attribute
     */
    void setDirection(mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction.Enum direction);
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    void xsetDirection(mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction direction);
    
    /**
     * Unsets the "direction" attribute
     */
    void unsetDirection();
    
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
     * An XML RelatedResource(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public interface RelatedResource extends mil.dod.metadata.mdr.ns.ddms._2_0.CompoundResourceIdentifierType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("relatedresourceeaf7elemtype");
        
        /**
         * Gets array of all "link" elements
         */
        mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link[] getLinkArray();
        
        /**
         * Gets ith "link" element
         */
        mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link getLinkArray(int i);
        
        /**
         * Returns number of "link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "link" element
         */
        void setLinkArray(mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link[] linkArray);
        
        /**
         * Sets ith "link" element
         */
        void setLinkArray(int i, mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "link" element
         */
        mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "link" element
         */
        mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link addNewLink();
        
        /**
         * Removes the ith "link" element
         */
        void removeLink(int i);
        
        /**
         * An XML link(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
         *
         * This is a complex type.
         */
        public interface Link extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("link2e0delemtype");
            
            /**
             * Gets the "type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "type" attribute
             */
            org.apache.xmlbeans.XmlString xgetType();
            
            /**
             * True if has "type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "type" attribute
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "type" attribute
             */
            void xsetType(org.apache.xmlbeans.XmlString type);
            
            /**
             * Unsets the "type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "href" attribute
             */
            java.lang.String getHref();
            
            /**
             * Gets (as xml) the "href" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetHref();
            
            /**
             * Sets the "href" attribute
             */
            void setHref(java.lang.String href);
            
            /**
             * Sets (as xml) the "href" attribute
             */
            void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
            
            /**
             * Gets the "role" attribute
             */
            java.lang.String getRole();
            
            /**
             * Gets (as xml) the "role" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetRole();
            
            /**
             * True if has "role" attribute
             */
            boolean isSetRole();
            
            /**
             * Sets the "role" attribute
             */
            void setRole(java.lang.String role);
            
            /**
             * Sets (as xml) the "role" attribute
             */
            void xsetRole(org.apache.xmlbeans.XmlAnyURI role);
            
            /**
             * Unsets the "role" attribute
             */
            void unsetRole();
            
            /**
             * Gets the "title" attribute
             */
            java.lang.String getTitle();
            
            /**
             * Gets (as xml) the "title" attribute
             */
            org.apache.xmlbeans.XmlString xgetTitle();
            
            /**
             * True if has "title" attribute
             */
            boolean isSetTitle();
            
            /**
             * Sets the "title" attribute
             */
            void setTitle(java.lang.String title);
            
            /**
             * Sets (as xml) the "title" attribute
             */
            void xsetTitle(org.apache.xmlbeans.XmlString title);
            
            /**
             * Unsets the "title" attribute
             */
            void unsetTitle();
            
            /**
             * Gets the "label" attribute
             */
            java.lang.String getLabel();
            
            /**
             * Gets (as xml) the "label" attribute
             */
            org.apache.xmlbeans.XmlString xgetLabel();
            
            /**
             * True if has "label" attribute
             */
            boolean isSetLabel();
            
            /**
             * Sets the "label" attribute
             */
            void setLabel(java.lang.String label);
            
            /**
             * Sets (as xml) the "label" attribute
             */
            void xsetLabel(org.apache.xmlbeans.XmlString label);
            
            /**
             * Unsets the "label" attribute
             */
            void unsetLabel();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link newInstance() {
                  return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource newInstance() {
              return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.RelatedResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML direction(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is an atomic type that is a restriction of mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType$Direction.
     */
    public interface Direction extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Direction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF4F76781A98B61A37F3965C2C6AC6897").resolveHandle("direction1049attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INBOUND = Enum.forString("inbound");
        static final Enum OUTBOUND = Enum.forString("outbound");
        static final Enum BIDIRECTIONAL = Enum.forString("bidirectional");
        
        static final int INT_INBOUND = Enum.INT_INBOUND;
        static final int INT_OUTBOUND = Enum.INT_OUTBOUND;
        static final int INT_BIDIRECTIONAL = Enum.INT_BIDIRECTIONAL;
        
        /**
         * Enumeration value class for mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType$Direction.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INBOUND
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
            
            static final int INT_INBOUND = 1;
            static final int INT_OUTBOUND = 2;
            static final int INT_BIDIRECTIONAL = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("inbound", INT_INBOUND),
                    new Enum("outbound", INT_OUTBOUND),
                    new Enum("bidirectional", INT_BIDIRECTIONAL),
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
            public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction newValue(java.lang.Object obj) {
              return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction) type.newValue( obj ); }
            
            public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction newInstance() {
              return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType.Direction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms._2_0.RelatedResourcesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
