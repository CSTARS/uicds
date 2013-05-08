/**
 * PersonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The base UCore Person type.
 */
public class PersonType  extends gov.ucore.ucore._2_0.AgentType  implements java.io.Serializable {
    /* Alternate names for this person, including aliases. */
    private gov.ucore.ucore._2_0.PersonNameType[] alternateName;

    /* Country of citizenship for this person. */
    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType[] citizenship;

    /* Information on how to contact this person. */
    private gov.ucore.ucore._2_0.ContactInfoType contactInfo;

    /* Date of Birth for this person. */
    private gov.ucore.ucore._2_0.TimeInstantType dateOfBirth;

    /* Height of this person. */
    private gov.ucore.ucore._2_0.LengthMeasureType height;

    /* The name of this person. */
    private gov.ucore.ucore._2_0.PersonNameType name;

    /* Phyiscal sex of the person. */
    private gov.ucore.ucore._2_0.PersonSexType sex;

    /* Weight of this person. */
    private gov.ucore.ucore._2_0.MassMeasureType weight;

    public PersonType() {
    }

    public PersonType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           gov.ucore.ucore._2_0.WhatType[] what,
           gov.ucore.ucore._2_0.PersonNameType[] alternateName,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType[] citizenship,
           gov.ucore.ucore._2_0.ContactInfoType contactInfo,
           gov.ucore.ucore._2_0.TimeInstantType dateOfBirth,
           gov.ucore.ucore._2_0.LengthMeasureType height,
           gov.ucore.ucore._2_0.PersonNameType name,
           gov.ucore.ucore._2_0.PersonSexType sex,
           gov.ucore.ucore._2_0.MassMeasureType weight) {
        super(
            id,
            metadata,
            descriptor,
            identifier,
            simpleProperty,
            what);
        this.alternateName = alternateName;
        this.citizenship = citizenship;
        this.contactInfo = contactInfo;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }


    /**
     * Gets the alternateName value for this PersonType.
     * 
     * @return alternateName   * Alternate names for this person, including aliases.
     */
    public gov.ucore.ucore._2_0.PersonNameType[] getAlternateName() {
        return alternateName;
    }


    /**
     * Sets the alternateName value for this PersonType.
     * 
     * @param alternateName   * Alternate names for this person, including aliases.
     */
    public void setAlternateName(gov.ucore.ucore._2_0.PersonNameType[] alternateName) {
        this.alternateName = alternateName;
    }

    public gov.ucore.ucore._2_0.PersonNameType getAlternateName(int i) {
        return this.alternateName[i];
    }

    public void setAlternateName(int i, gov.ucore.ucore._2_0.PersonNameType _value) {
        this.alternateName[i] = _value;
    }


    /**
     * Gets the citizenship value for this PersonType.
     * 
     * @return citizenship   * Country of citizenship for this person.
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType[] getCitizenship() {
        return citizenship;
    }


    /**
     * Sets the citizenship value for this PersonType.
     * 
     * @param citizenship   * Country of citizenship for this person.
     */
    public void setCitizenship(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType[] citizenship) {
        this.citizenship = citizenship;
    }

    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType getCitizenship(int i) {
        return this.citizenship[i];
    }

    public void setCitizenship(int i, mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType _value) {
        this.citizenship[i] = _value;
    }


    /**
     * Gets the contactInfo value for this PersonType.
     * 
     * @return contactInfo   * Information on how to contact this person.
     */
    public gov.ucore.ucore._2_0.ContactInfoType getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this PersonType.
     * 
     * @param contactInfo   * Information on how to contact this person.
     */
    public void setContactInfo(gov.ucore.ucore._2_0.ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the dateOfBirth value for this PersonType.
     * 
     * @return dateOfBirth   * Date of Birth for this person.
     */
    public gov.ucore.ucore._2_0.TimeInstantType getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this PersonType.
     * 
     * @param dateOfBirth   * Date of Birth for this person.
     */
    public void setDateOfBirth(gov.ucore.ucore._2_0.TimeInstantType dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the height value for this PersonType.
     * 
     * @return height   * Height of this person.
     */
    public gov.ucore.ucore._2_0.LengthMeasureType getHeight() {
        return height;
    }


    /**
     * Sets the height value for this PersonType.
     * 
     * @param height   * Height of this person.
     */
    public void setHeight(gov.ucore.ucore._2_0.LengthMeasureType height) {
        this.height = height;
    }


    /**
     * Gets the name value for this PersonType.
     * 
     * @return name   * The name of this person.
     */
    public gov.ucore.ucore._2_0.PersonNameType getName() {
        return name;
    }


    /**
     * Sets the name value for this PersonType.
     * 
     * @param name   * The name of this person.
     */
    public void setName(gov.ucore.ucore._2_0.PersonNameType name) {
        this.name = name;
    }


    /**
     * Gets the sex value for this PersonType.
     * 
     * @return sex   * Phyiscal sex of the person.
     */
    public gov.ucore.ucore._2_0.PersonSexType getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this PersonType.
     * 
     * @param sex   * Phyiscal sex of the person.
     */
    public void setSex(gov.ucore.ucore._2_0.PersonSexType sex) {
        this.sex = sex;
    }


    /**
     * Gets the weight value for this PersonType.
     * 
     * @return weight   * Weight of this person.
     */
    public gov.ucore.ucore._2_0.MassMeasureType getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this PersonType.
     * 
     * @param weight   * Weight of this person.
     */
    public void setWeight(gov.ucore.ucore._2_0.MassMeasureType weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonType)) return false;
        PersonType other = (PersonType) obj;
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
            ((this.citizenship==null && other.getCitizenship()==null) || 
             (this.citizenship!=null &&
              java.util.Arrays.equals(this.citizenship, other.getCitizenship()))) &&
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getCitizenship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitizenship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitizenship(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AlternateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citizenship");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Citizenship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CompoundCountryCodeIdentifierType"));
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
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstantType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LengthMeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonSexType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MassMeasureType"));
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
