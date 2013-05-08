/**
 * EntityLocationRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between entities and locations.
 */
public class EntityLocationRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The entity to which this relationship applies. */
    private gov.ucore.ucore._2_0.EntityRefType entityRef;

    /* The location to which this relationship applies. */
    private gov.ucore.ucore._2_0.LocationRefType locationRef;

    public EntityLocationRelationshipType() {
    }

    public EntityLocationRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.EntityRefType entityRef,
           gov.ucore.ucore._2_0.LocationRefType locationRef) {
        super(
            id,
            metadata,
            time);
        this.entityRef = entityRef;
        this.locationRef = locationRef;
    }


    /**
     * Gets the entityRef value for this EntityLocationRelationshipType.
     * 
     * @return entityRef   * The entity to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.EntityRefType getEntityRef() {
        return entityRef;
    }


    /**
     * Sets the entityRef value for this EntityLocationRelationshipType.
     * 
     * @param entityRef   * The entity to which this relationship applies.
     */
    public void setEntityRef(gov.ucore.ucore._2_0.EntityRefType entityRef) {
        this.entityRef = entityRef;
    }


    /**
     * Gets the locationRef value for this EntityLocationRelationshipType.
     * 
     * @return locationRef   * The location to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.LocationRefType getLocationRef() {
        return locationRef;
    }


    /**
     * Sets the locationRef value for this EntityLocationRelationshipType.
     * 
     * @param locationRef   * The location to which this relationship applies.
     */
    public void setLocationRef(gov.ucore.ucore._2_0.LocationRefType locationRef) {
        this.locationRef = locationRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityLocationRelationshipType)) return false;
        EntityLocationRelationshipType other = (EntityLocationRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityRef==null && other.getEntityRef()==null) || 
             (this.entityRef!=null &&
              this.entityRef.equals(other.getEntityRef()))) &&
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
        if (getEntityRef() != null) {
            _hashCode += getEntityRef().hashCode();
        }
        if (getLocationRef() != null) {
            _hashCode += getLocationRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityLocationRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityLocationRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRefType"));
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
