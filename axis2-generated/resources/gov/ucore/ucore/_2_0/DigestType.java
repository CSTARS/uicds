/**
 * DigestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The DigestType definition.
 */
public class DigestType  implements java.io.Serializable {
    private gov.ucore.ucore._2_0.DigestMetadataType digestMetadata;

    private gov.ucore.ucore._2_0.ThingType[] thingAbstract;

    private gov.ucore.ucore._2_0.RelationshipType[] relationshipAbstract;

    private gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType[] thingAttachmentLinkAssociation;

    private _0._1.library.message.SameAsPayloadAssociationType[] sameAsPayloadAssociation;

    public DigestType() {
    }

    public DigestType(
           gov.ucore.ucore._2_0.DigestMetadataType digestMetadata,
           gov.ucore.ucore._2_0.ThingType[] thingAbstract,
           gov.ucore.ucore._2_0.RelationshipType[] relationshipAbstract,
           gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType[] thingAttachmentLinkAssociation,
           _0._1.library.message.SameAsPayloadAssociationType[] sameAsPayloadAssociation) {
           this.digestMetadata = digestMetadata;
           this.thingAbstract = thingAbstract;
           this.relationshipAbstract = relationshipAbstract;
           this.thingAttachmentLinkAssociation = thingAttachmentLinkAssociation;
           this.sameAsPayloadAssociation = sameAsPayloadAssociation;
    }


    /**
     * Gets the digestMetadata value for this DigestType.
     * 
     * @return digestMetadata
     */
    public gov.ucore.ucore._2_0.DigestMetadataType getDigestMetadata() {
        return digestMetadata;
    }


    /**
     * Sets the digestMetadata value for this DigestType.
     * 
     * @param digestMetadata
     */
    public void setDigestMetadata(gov.ucore.ucore._2_0.DigestMetadataType digestMetadata) {
        this.digestMetadata = digestMetadata;
    }


    /**
     * Gets the thingAbstract value for this DigestType.
     * 
     * @return thingAbstract
     */
    public gov.ucore.ucore._2_0.ThingType[] getThingAbstract() {
        return thingAbstract;
    }


    /**
     * Sets the thingAbstract value for this DigestType.
     * 
     * @param thingAbstract
     */
    public void setThingAbstract(gov.ucore.ucore._2_0.ThingType[] thingAbstract) {
        this.thingAbstract = thingAbstract;
    }

    public gov.ucore.ucore._2_0.ThingType getThingAbstract(int i) {
        return this.thingAbstract[i];
    }

    public void setThingAbstract(int i, gov.ucore.ucore._2_0.ThingType _value) {
        this.thingAbstract[i] = _value;
    }


    /**
     * Gets the relationshipAbstract value for this DigestType.
     * 
     * @return relationshipAbstract
     */
    public gov.ucore.ucore._2_0.RelationshipType[] getRelationshipAbstract() {
        return relationshipAbstract;
    }


    /**
     * Sets the relationshipAbstract value for this DigestType.
     * 
     * @param relationshipAbstract
     */
    public void setRelationshipAbstract(gov.ucore.ucore._2_0.RelationshipType[] relationshipAbstract) {
        this.relationshipAbstract = relationshipAbstract;
    }

    public gov.ucore.ucore._2_0.RelationshipType getRelationshipAbstract(int i) {
        return this.relationshipAbstract[i];
    }

    public void setRelationshipAbstract(int i, gov.ucore.ucore._2_0.RelationshipType _value) {
        this.relationshipAbstract[i] = _value;
    }


    /**
     * Gets the thingAttachmentLinkAssociation value for this DigestType.
     * 
     * @return thingAttachmentLinkAssociation
     */
    public gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType[] getThingAttachmentLinkAssociation() {
        return thingAttachmentLinkAssociation;
    }


    /**
     * Sets the thingAttachmentLinkAssociation value for this DigestType.
     * 
     * @param thingAttachmentLinkAssociation
     */
    public void setThingAttachmentLinkAssociation(gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType[] thingAttachmentLinkAssociation) {
        this.thingAttachmentLinkAssociation = thingAttachmentLinkAssociation;
    }

    public gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType getThingAttachmentLinkAssociation(int i) {
        return this.thingAttachmentLinkAssociation[i];
    }

    public void setThingAttachmentLinkAssociation(int i, gov.ucore.ucore._2_0.ThingAttachmentLinkAssociationType _value) {
        this.thingAttachmentLinkAssociation[i] = _value;
    }


    /**
     * Gets the sameAsPayloadAssociation value for this DigestType.
     * 
     * @return sameAsPayloadAssociation
     */
    public _0._1.library.message.SameAsPayloadAssociationType[] getSameAsPayloadAssociation() {
        return sameAsPayloadAssociation;
    }


    /**
     * Sets the sameAsPayloadAssociation value for this DigestType.
     * 
     * @param sameAsPayloadAssociation
     */
    public void setSameAsPayloadAssociation(_0._1.library.message.SameAsPayloadAssociationType[] sameAsPayloadAssociation) {
        this.sameAsPayloadAssociation = sameAsPayloadAssociation;
    }

    public _0._1.library.message.SameAsPayloadAssociationType getSameAsPayloadAssociation(int i) {
        return this.sameAsPayloadAssociation[i];
    }

    public void setSameAsPayloadAssociation(int i, _0._1.library.message.SameAsPayloadAssociationType _value) {
        this.sameAsPayloadAssociation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigestType)) return false;
        DigestType other = (DigestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.digestMetadata==null && other.getDigestMetadata()==null) || 
             (this.digestMetadata!=null &&
              this.digestMetadata.equals(other.getDigestMetadata()))) &&
            ((this.thingAbstract==null && other.getThingAbstract()==null) || 
             (this.thingAbstract!=null &&
              java.util.Arrays.equals(this.thingAbstract, other.getThingAbstract()))) &&
            ((this.relationshipAbstract==null && other.getRelationshipAbstract()==null) || 
             (this.relationshipAbstract!=null &&
              java.util.Arrays.equals(this.relationshipAbstract, other.getRelationshipAbstract()))) &&
            ((this.thingAttachmentLinkAssociation==null && other.getThingAttachmentLinkAssociation()==null) || 
             (this.thingAttachmentLinkAssociation!=null &&
              java.util.Arrays.equals(this.thingAttachmentLinkAssociation, other.getThingAttachmentLinkAssociation()))) &&
            ((this.sameAsPayloadAssociation==null && other.getSameAsPayloadAssociation()==null) || 
             (this.sameAsPayloadAssociation!=null &&
              java.util.Arrays.equals(this.sameAsPayloadAssociation, other.getSameAsPayloadAssociation())));
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
        if (getDigestMetadata() != null) {
            _hashCode += getDigestMetadata().hashCode();
        }
        if (getThingAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThingAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThingAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationshipAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationshipAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThingAttachmentLinkAssociation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThingAttachmentLinkAssociation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThingAttachmentLinkAssociation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSameAsPayloadAssociation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSameAsPayloadAssociation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSameAsPayloadAssociation(), i);
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
        new org.apache.axis.description.TypeDesc(DigestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DigestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DigestMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DigestMetadataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thingAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thingAttachmentLinkAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAttachmentLinkAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAttachmentLinkAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPayloadAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
