/**
 * RelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * Base relationship type.  All other relationships extend from this
 * type.
 */
public class RelationshipType  implements java.io.Serializable {
    /* Metadata on this relationship. */
    private gov.ucore.ucore._2_0.ContentMetadataType metadata;

    /* This is the time for which the relationship is in force.  If
     * left blank, then the relationship is unbounded.  This can be used,
     * for example, to define when two agents are affiliated, when an Entity
     * is at a Location, or when an Event occurs. */
    private gov.ucore.ucore._2_0.TimeType time;

    private org.apache.axis.types.Id id;  // attribute

    public RelationshipType() {
    }

    public RelationshipType(
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           org.apache.axis.types.Id id) {
           this.metadata = metadata;
           this.time = time;
           this.id = id;
    }


    /**
     * Gets the metadata value for this RelationshipType.
     * 
     * @return metadata   * Metadata on this relationship.
     */
    public gov.ucore.ucore._2_0.ContentMetadataType getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this RelationshipType.
     * 
     * @param metadata   * Metadata on this relationship.
     */
    public void setMetadata(gov.ucore.ucore._2_0.ContentMetadataType metadata) {
        this.metadata = metadata;
    }


    /**
     * Gets the time value for this RelationshipType.
     * 
     * @return time   * This is the time for which the relationship is in force.  If
     * left blank, then the relationship is unbounded.  This can be used,
     * for example, to define when two agents are affiliated, when an Entity
     * is at a Location, or when an Event occurs.
     */
    public gov.ucore.ucore._2_0.TimeType getTime() {
        return time;
    }


    /**
     * Sets the time value for this RelationshipType.
     * 
     * @param time   * This is the time for which the relationship is in force.  If
     * left blank, then the relationship is unbounded.  This can be used,
     * for example, to define when two agents are affiliated, when an Entity
     * is at a Location, or when an Event occurs.
     */
    public void setTime(gov.ucore.ucore._2_0.TimeType time) {
        this.time = time;
    }


    /**
     * Gets the id value for this RelationshipType.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this RelationshipType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationshipType)) return false;
        RelationshipType other = (RelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              this.metadata.equals(other.getMetadata()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getMetadata() != null) {
            _hashCode += getMetadata().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContentMetadataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeType"));
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
