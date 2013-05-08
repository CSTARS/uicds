/**
 * ResourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class ResourceType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType[] identifier;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType[] title;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType[] subtitle;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.DescriptionType description;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType[] language;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.DatesType dates;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.RightsType rights;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType[] source;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType[] type;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType[] creator;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType[] publisher;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType[] contributor;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType[] pointOfContact;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.FormatType format;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.SubjectCoverageType subjectCoverage;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType[] virtualCoverage;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType[] temporalCoverage;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType[] geospatialCoverage;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[][] relatedResources;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.Security security;

    private org.apache.axis.message.MessageElement [] _any;

    public ResourceType() {
    }

    public ResourceType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType[] identifier,
           mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType[] title,
           mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType[] subtitle,
           mil.dod.metadata.mdr.ns.DDMS._2_0.DescriptionType description,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType[] language,
           mil.dod.metadata.mdr.ns.DDMS._2_0.DatesType dates,
           mil.dod.metadata.mdr.ns.DDMS._2_0.RightsType rights,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType[] source,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType[] type,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType[] creator,
           mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType[] publisher,
           mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType[] contributor,
           mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType[] pointOfContact,
           mil.dod.metadata.mdr.ns.DDMS._2_0.FormatType format,
           mil.dod.metadata.mdr.ns.DDMS._2_0.SubjectCoverageType subjectCoverage,
           mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType[] virtualCoverage,
           mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType[] temporalCoverage,
           mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType[] geospatialCoverage,
           mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[][] relatedResources,
           mil.dod.metadata.mdr.ns.DDMS._2_0.Security security,
           org.apache.axis.message.MessageElement [] _any) {
           this.identifier = identifier;
           this.title = title;
           this.subtitle = subtitle;
           this.description = description;
           this.language = language;
           this.dates = dates;
           this.rights = rights;
           this.source = source;
           this.type = type;
           this.creator = creator;
           this.publisher = publisher;
           this.contributor = contributor;
           this.pointOfContact = pointOfContact;
           this.format = format;
           this.subjectCoverage = subjectCoverage;
           this.virtualCoverage = virtualCoverage;
           this.temporalCoverage = temporalCoverage;
           this.geospatialCoverage = geospatialCoverage;
           this.relatedResources = relatedResources;
           this.security = security;
           this._any = _any;
    }


    /**
     * Gets the identifier value for this ResourceType.
     * 
     * @return identifier
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType[] getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this ResourceType.
     * 
     * @param identifier
     */
    public void setIdentifier(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType[] identifier) {
        this.identifier = identifier;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType getIdentifier(int i) {
        return this.identifier[i];
    }

    public void setIdentifier(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundResourceIdentifierType _value) {
        this.identifier[i] = _value;
    }


    /**
     * Gets the title value for this ResourceType.
     * 
     * @return title
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ResourceType.
     * 
     * @param title
     */
    public void setTitle(mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType[] title) {
        this.title = title;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.TitleType _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the subtitle value for this ResourceType.
     * 
     * @return subtitle
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType[] getSubtitle() {
        return subtitle;
    }


    /**
     * Sets the subtitle value for this ResourceType.
     * 
     * @param subtitle
     */
    public void setSubtitle(mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType[] subtitle) {
        this.subtitle = subtitle;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType getSubtitle(int i) {
        return this.subtitle[i];
    }

    public void setSubtitle(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.SubtitleType _value) {
        this.subtitle[i] = _value;
    }


    /**
     * Gets the description value for this ResourceType.
     * 
     * @return description
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.DescriptionType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResourceType.
     * 
     * @param description
     */
    public void setDescription(mil.dod.metadata.mdr.ns.DDMS._2_0.DescriptionType description) {
        this.description = description;
    }


    /**
     * Gets the language value for this ResourceType.
     * 
     * @return language
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ResourceType.
     * 
     * @param language
     */
    public void setLanguage(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType[] language) {
        this.language = language;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundLanguageIdentifierType _value) {
        this.language[i] = _value;
    }


    /**
     * Gets the dates value for this ResourceType.
     * 
     * @return dates
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.DatesType getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this ResourceType.
     * 
     * @param dates
     */
    public void setDates(mil.dod.metadata.mdr.ns.DDMS._2_0.DatesType dates) {
        this.dates = dates;
    }


    /**
     * Gets the rights value for this ResourceType.
     * 
     * @return rights
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.RightsType getRights() {
        return rights;
    }


    /**
     * Sets the rights value for this ResourceType.
     * 
     * @param rights
     */
    public void setRights(mil.dod.metadata.mdr.ns.DDMS._2_0.RightsType rights) {
        this.rights = rights;
    }


    /**
     * Gets the source value for this ResourceType.
     * 
     * @return source
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this ResourceType.
     * 
     * @param source
     */
    public void setSource(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType[] source) {
        this.source = source;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundSourceIdentifierType _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the type value for this ResourceType.
     * 
     * @return type
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ResourceType.
     * 
     * @param type
     */
    public void setType(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType[] type) {
        this.type = type;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType getType(int i) {
        return this.type[i];
    }

    public void setType(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundTypeIdentifierType _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the creator value for this ResourceType.
     * 
     * @return creator
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType[] getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this ResourceType.
     * 
     * @param creator
     */
    public void setCreator(mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType[] creator) {
        this.creator = creator;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType getCreator(int i) {
        return this.creator[i];
    }

    public void setCreator(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CreatorType _value) {
        this.creator[i] = _value;
    }


    /**
     * Gets the publisher value for this ResourceType.
     * 
     * @return publisher
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType[] getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this ResourceType.
     * 
     * @param publisher
     */
    public void setPublisher(mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType[] publisher) {
        this.publisher = publisher;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType getPublisher(int i) {
        return this.publisher[i];
    }

    public void setPublisher(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.PublisherType _value) {
        this.publisher[i] = _value;
    }


    /**
     * Gets the contributor value for this ResourceType.
     * 
     * @return contributor
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType[] getContributor() {
        return contributor;
    }


    /**
     * Sets the contributor value for this ResourceType.
     * 
     * @param contributor
     */
    public void setContributor(mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType[] contributor) {
        this.contributor = contributor;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType getContributor(int i) {
        return this.contributor[i];
    }

    public void setContributor(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.ContributorType _value) {
        this.contributor[i] = _value;
    }


    /**
     * Gets the pointOfContact value for this ResourceType.
     * 
     * @return pointOfContact
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType[] getPointOfContact() {
        return pointOfContact;
    }


    /**
     * Sets the pointOfContact value for this ResourceType.
     * 
     * @param pointOfContact
     */
    public void setPointOfContact(mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType[] pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType getPointOfContact(int i) {
        return this.pointOfContact[i];
    }

    public void setPointOfContact(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.PointOfContactType _value) {
        this.pointOfContact[i] = _value;
    }


    /**
     * Gets the format value for this ResourceType.
     * 
     * @return format
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.FormatType getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ResourceType.
     * 
     * @param format
     */
    public void setFormat(mil.dod.metadata.mdr.ns.DDMS._2_0.FormatType format) {
        this.format = format;
    }


    /**
     * Gets the subjectCoverage value for this ResourceType.
     * 
     * @return subjectCoverage
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.SubjectCoverageType getSubjectCoverage() {
        return subjectCoverage;
    }


    /**
     * Sets the subjectCoverage value for this ResourceType.
     * 
     * @param subjectCoverage
     */
    public void setSubjectCoverage(mil.dod.metadata.mdr.ns.DDMS._2_0.SubjectCoverageType subjectCoverage) {
        this.subjectCoverage = subjectCoverage;
    }


    /**
     * Gets the virtualCoverage value for this ResourceType.
     * 
     * @return virtualCoverage
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType[] getVirtualCoverage() {
        return virtualCoverage;
    }


    /**
     * Sets the virtualCoverage value for this ResourceType.
     * 
     * @param virtualCoverage
     */
    public void setVirtualCoverage(mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType[] virtualCoverage) {
        this.virtualCoverage = virtualCoverage;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType getVirtualCoverage(int i) {
        return this.virtualCoverage[i];
    }

    public void setVirtualCoverage(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType _value) {
        this.virtualCoverage[i] = _value;
    }


    /**
     * Gets the temporalCoverage value for this ResourceType.
     * 
     * @return temporalCoverage
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType[] getTemporalCoverage() {
        return temporalCoverage;
    }


    /**
     * Sets the temporalCoverage value for this ResourceType.
     * 
     * @param temporalCoverage
     */
    public void setTemporalCoverage(mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType[] temporalCoverage) {
        this.temporalCoverage = temporalCoverage;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType getTemporalCoverage(int i) {
        return this.temporalCoverage[i];
    }

    public void setTemporalCoverage(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.TemporalCoverageType _value) {
        this.temporalCoverage[i] = _value;
    }


    /**
     * Gets the geospatialCoverage value for this ResourceType.
     * 
     * @return geospatialCoverage
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType[] getGeospatialCoverage() {
        return geospatialCoverage;
    }


    /**
     * Sets the geospatialCoverage value for this ResourceType.
     * 
     * @param geospatialCoverage
     */
    public void setGeospatialCoverage(mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType[] geospatialCoverage) {
        this.geospatialCoverage = geospatialCoverage;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType getGeospatialCoverage(int i) {
        return this.geospatialCoverage[i];
    }

    public void setGeospatialCoverage(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.GeospatialCoverageType _value) {
        this.geospatialCoverage[i] = _value;
    }


    /**
     * Gets the relatedResources value for this ResourceType.
     * 
     * @return relatedResources
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[][] getRelatedResources() {
        return relatedResources;
    }


    /**
     * Sets the relatedResources value for this ResourceType.
     * 
     * @param relatedResources
     */
    public void setRelatedResources(mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[][] relatedResources) {
        this.relatedResources = relatedResources;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[] getRelatedResources(int i) {
        return this.relatedResources[i];
    }

    public void setRelatedResources(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.RelatedResourcesTypeRelatedResource[] _value) {
        this.relatedResources[i] = _value;
    }


    /**
     * Gets the security value for this ResourceType.
     * 
     * @return security
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.Security getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this ResourceType.
     * 
     * @param security
     */
    public void setSecurity(mil.dod.metadata.mdr.ns.DDMS._2_0.Security security) {
        this.security = security;
    }


    /**
     * Gets the _any value for this ResourceType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ResourceType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceType)) return false;
        ResourceType other = (ResourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              java.util.Arrays.equals(this.identifier, other.getIdentifier()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.subtitle==null && other.getSubtitle()==null) || 
             (this.subtitle!=null &&
              java.util.Arrays.equals(this.subtitle, other.getSubtitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.rights==null && other.getRights()==null) || 
             (this.rights!=null &&
              this.rights.equals(other.getRights()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              java.util.Arrays.equals(this.creator, other.getCreator()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              java.util.Arrays.equals(this.publisher, other.getPublisher()))) &&
            ((this.contributor==null && other.getContributor()==null) || 
             (this.contributor!=null &&
              java.util.Arrays.equals(this.contributor, other.getContributor()))) &&
            ((this.pointOfContact==null && other.getPointOfContact()==null) || 
             (this.pointOfContact!=null &&
              java.util.Arrays.equals(this.pointOfContact, other.getPointOfContact()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.subjectCoverage==null && other.getSubjectCoverage()==null) || 
             (this.subjectCoverage!=null &&
              this.subjectCoverage.equals(other.getSubjectCoverage()))) &&
            ((this.virtualCoverage==null && other.getVirtualCoverage()==null) || 
             (this.virtualCoverage!=null &&
              java.util.Arrays.equals(this.virtualCoverage, other.getVirtualCoverage()))) &&
            ((this.temporalCoverage==null && other.getTemporalCoverage()==null) || 
             (this.temporalCoverage!=null &&
              java.util.Arrays.equals(this.temporalCoverage, other.getTemporalCoverage()))) &&
            ((this.geospatialCoverage==null && other.getGeospatialCoverage()==null) || 
             (this.geospatialCoverage!=null &&
              java.util.Arrays.equals(this.geospatialCoverage, other.getGeospatialCoverage()))) &&
            ((this.relatedResources==null && other.getRelatedResources()==null) || 
             (this.relatedResources!=null &&
              java.util.Arrays.equals(this.relatedResources, other.getRelatedResources()))) &&
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubtitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubtitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubtitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getRights() != null) {
            _hashCode += getRights().hashCode();
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublisher() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublisher());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublisher(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContributor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContributor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContributor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPointOfContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPointOfContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPointOfContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getSubjectCoverage() != null) {
            _hashCode += getSubjectCoverage().hashCode();
        }
        if (getVirtualCoverage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualCoverage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualCoverage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporalCoverage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemporalCoverage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemporalCoverage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeospatialCoverage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeospatialCoverage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeospatialCoverage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "ResourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "identifier"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "title"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "subtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "subtitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "DescriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "DatesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "rights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "RightsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "creator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "publisher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "contributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "contributor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointOfContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "pointOfContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "pointOfContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "FormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "subjectCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "SubjectCoverageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "virtualCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "virtualCoverage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporalCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "temporalCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "temporalCoverage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geospatialCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geospatialCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geospatialCoverage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedResources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "relatedResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "relatedResources"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", ">security"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
