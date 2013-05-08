/**
 * PersonNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The name of a person.
 */
public class PersonNameType  implements java.io.Serializable {
    /* Full name as a single string. */
    private gov.ucore.ucore._2_0.ExtendedStringType fullName;

    /* Family name portion of the full name. */
    private gov.ucore.ucore._2_0.ExtendedStringType familyName;

    /* Given name portion of the full name. */
    private gov.ucore.ucore._2_0.ExtendedStringType givenName;

    /* Middle name portion of the full name. */
    private gov.ucore.ucore._2_0.ExtendedStringType middleName;

    public PersonNameType() {
    }

    public PersonNameType(
           gov.ucore.ucore._2_0.ExtendedStringType fullName,
           gov.ucore.ucore._2_0.ExtendedStringType familyName,
           gov.ucore.ucore._2_0.ExtendedStringType givenName,
           gov.ucore.ucore._2_0.ExtendedStringType middleName) {
           this.fullName = fullName;
           this.familyName = familyName;
           this.givenName = givenName;
           this.middleName = middleName;
    }


    /**
     * Gets the fullName value for this PersonNameType.
     * 
     * @return fullName   * Full name as a single string.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this PersonNameType.
     * 
     * @param fullName   * Full name as a single string.
     */
    public void setFullName(gov.ucore.ucore._2_0.ExtendedStringType fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the familyName value for this PersonNameType.
     * 
     * @return familyName   * Family name portion of the full name.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType getFamilyName() {
        return familyName;
    }


    /**
     * Sets the familyName value for this PersonNameType.
     * 
     * @param familyName   * Family name portion of the full name.
     */
    public void setFamilyName(gov.ucore.ucore._2_0.ExtendedStringType familyName) {
        this.familyName = familyName;
    }


    /**
     * Gets the givenName value for this PersonNameType.
     * 
     * @return givenName   * Given name portion of the full name.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType getGivenName() {
        return givenName;
    }


    /**
     * Sets the givenName value for this PersonNameType.
     * 
     * @param givenName   * Given name portion of the full name.
     */
    public void setGivenName(gov.ucore.ucore._2_0.ExtendedStringType givenName) {
        this.givenName = givenName;
    }


    /**
     * Gets the middleName value for this PersonNameType.
     * 
     * @return middleName   * Middle name portion of the full name.
     */
    public gov.ucore.ucore._2_0.ExtendedStringType getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this PersonNameType.
     * 
     * @param middleName   * Middle name portion of the full name.
     */
    public void setMiddleName(gov.ucore.ucore._2_0.ExtendedStringType middleName) {
        this.middleName = middleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonNameType)) return false;
        PersonNameType other = (PersonNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.familyName==null && other.getFamilyName()==null) || 
             (this.familyName!=null &&
              this.familyName.equals(other.getFamilyName()))) &&
            ((this.givenName==null && other.getGivenName()==null) || 
             (this.givenName!=null &&
              this.givenName.equals(other.getGivenName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName())));
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
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getFamilyName() != null) {
            _hashCode += getFamilyName().hashCode();
        }
        if (getGivenName() != null) {
            _hashCode += getGivenName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "FamilyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GivenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MiddleName"));
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
