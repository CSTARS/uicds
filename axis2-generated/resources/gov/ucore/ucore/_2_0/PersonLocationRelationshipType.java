/**
 * PersonLocationRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between a person and a location.
 */
public class PersonLocationRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The persons to whom this relationship applies. */
    private gov.ucore.ucore._2_0.PersonRefType personRef;

    /* The location to which this relationship applies. */
    private gov.ucore.ucore._2_0.LocationRefType locationRef;

    public PersonLocationRelationshipType() {
    }

    public PersonLocationRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.PersonRefType personRef,
           gov.ucore.ucore._2_0.LocationRefType locationRef) {
        super(
            id,
            metadata,
            time);
        this.personRef = personRef;
        this.locationRef = locationRef;
    }


    /**
     * Gets the personRef value for this PersonLocationRelationshipType.
     * 
     * @return personRef   * The persons to whom this relationship applies.
     */
    public gov.ucore.ucore._2_0.PersonRefType getPersonRef() {
        return personRef;
    }


    /**
     * Sets the personRef value for this PersonLocationRelationshipType.
     * 
     * @param personRef   * The persons to whom this relationship applies.
     */
    public void setPersonRef(gov.ucore.ucore._2_0.PersonRefType personRef) {
        this.personRef = personRef;
    }


    /**
     * Gets the locationRef value for this PersonLocationRelationshipType.
     * 
     * @return locationRef   * The location to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.LocationRefType getLocationRef() {
        return locationRef;
    }


    /**
     * Sets the locationRef value for this PersonLocationRelationshipType.
     * 
     * @param locationRef   * The location to which this relationship applies.
     */
    public void setLocationRef(gov.ucore.ucore._2_0.LocationRefType locationRef) {
        this.locationRef = locationRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonLocationRelationshipType)) return false;
        PersonLocationRelationshipType other = (PersonLocationRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.personRef==null && other.getPersonRef()==null) || 
             (this.personRef!=null &&
              this.personRef.equals(other.getPersonRef()))) &&
            ((this.locationRef==null && other.getLocationRef()==null) || 
             (this.locationRef!=null &&
              this.locationRef.equals(other.getLocationRef())));
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
        if (getPersonRef() != null) {
            _hashCode += getPersonRef().hashCode();
        }
        if (getLocationRef() != null) {
            _hashCode += getLocationRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonLocationRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonLocationRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRefType"));
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
