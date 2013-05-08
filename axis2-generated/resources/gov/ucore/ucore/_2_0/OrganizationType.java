/**
 * OrganizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * Represents an organization.
 */
public class OrganizationType  extends gov.ucore.ucore._2_0.AgentType  implements java.io.Serializable {
    /* Any alternate names or acronyms for this organization. */
    private gov.ucore.ucore._2_0.ExtendedStringType[] alternateName;

    /* A point of contact for this organization. */
    private gov.ucore.ucore._2_0.ContactInfoType contactInfo;

    /* The name of the organization. */
    private gov.ucore.ucore._2_0.ExtendedStringType name;

    public OrganizationType() {
    }

    public OrganizationType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           gov.ucore.ucore._2_0.WhatType[] what,
           gov.ucore.ucore._2_0.ExtendedStringType[] alternateName,
           gov.ucore.ucore._2_0.ContactInfoType contactInfo,
           gov.ucore.ucore._2_0.ExtendedStringType name) {
        super(
            id,
            metadata,
            descriptor,
            identifier,
            simpleProperty,
            what);
        this.alternateName = alternateName;
        this.contactInfo = contactInfo;
        this.name = name;
    }


    /**
     * Gets the alternateName value for this OrganizationType.
     * 
     * @return alternateName   * Any alternate names or acronyms for this organization.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType[] getAlternateName() {
        return alternateName;
    }


    /**
     * Sets the alternateName value for this OrganizationType.
     * 
     * @param alternateName   * Any alternate names or acronyms for this organization.
     */
    public void setAlternateName(gov.ucore.ucore._2_0.ExtendedStringType[] alternateName) {
        this.alternateName = alternateName;
    }

    public gov.ucore.ucore._2_0.ExtendedStringType getAlternateName(int i) {
        return this.alternateName[i];
    }

    public void setAlternateName(int i, gov.ucore.ucore._2_0.ExtendedStringType _value) {
        this.alternateName[i] = _value;
    }


    /**
     * Gets the contactInfo value for this OrganizationType.
     * 
     * @return contactInfo   * A point of contact for this organization.
     */
    public gov.ucore.ucore._2_0.ContactInfoType getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this OrganizationType.
     * 
     * @param contactInfo   * A point of contact for this organization.
     */
    public void setContactInfo(gov.ucore.ucore._2_0.ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the name value for this OrganizationType.
     * 
     * @return name   * The name of the organization.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType getName() {
        return name;
    }


    /**
     * Sets the name value for this OrganizationType.
     * 
     * @param name   * The name of the organization.
     */
    public void setName(gov.ucore.ucore._2_0.ExtendedStringType name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationType)) return false;
        OrganizationType other = (OrganizationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alternateName==null && other.getAlternateName()==null) || 
             (this.alternateName!=null &&
              java.util.Arrays.equals(this.alternateName, other.getAlternateName()))) &&
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getAlternateName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "OrganizationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AlternateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContactInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        elemField.setMinOccurs(0);
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
