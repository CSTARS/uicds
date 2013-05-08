/**
 * AttachmentResourceMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * This is an extended type that allows an attachment to be marked
 * with IC-ISM security markings, and as a DDMS Resource.
 */
public class AttachmentResourceMetadataType  extends mil.dod.metadata.mdr.ns.DDMS._2_0.ResourceType  implements java.io.Serializable {
    public AttachmentResourceMetadataType() {
    }

    public AttachmentResourceMetadataType(
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
        super(
            identifier,
            title,
            subtitle,
            description,
            language,
            dates,
            rights,
            source,
            type,
            creator,
            publisher,
            contributor,
            pointOfContact,
            format,
            subjectCoverage,
            virtualCoverage,
            temporalCoverage,
            geospatialCoverage,
            relatedResources,
            security,
            _any);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentResourceMetadataType)) return false;
        AttachmentResourceMetadataType other = (AttachmentResourceMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachmentResourceMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentResourceMetadataType"));
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
