/**
 * EntityLocationExtendedRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * This type extends the basic entity-location relationship with attributes
 * for kinematics.
 */
public class EntityLocationExtendedRelationshipType  extends gov.ucore.ucore._2_0.EntityLocationRelationshipType  implements java.io.Serializable {
    /* Course Over Ground (COG) relative to true north. */
    private gov.ucore.ucore._2_0.AngleMeasureType courseOverGround;

    /* Heading relative to true north. */
    private gov.ucore.ucore._2_0.AngleMeasureType heading;

    /* Speed Over Ground (SOG) relative to true north. */
    private gov.ucore.ucore._2_0.VelocityMeasureType speedOverGround;

    public EntityLocationExtendedRelationshipType() {
    }

    public EntityLocationExtendedRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.EntityRefType entityRef,
           gov.ucore.ucore._2_0.LocationRefType locationRef,
           gov.ucore.ucore._2_0.AngleMeasureType courseOverGround,
           gov.ucore.ucore._2_0.AngleMeasureType heading,
           gov.ucore.ucore._2_0.VelocityMeasureType speedOverGround) {
        super(
            id,
            metadata,
            time,
            entityRef,
            locationRef);
        this.courseOverGround = courseOverGround;
        this.heading = heading;
        this.speedOverGround = speedOverGround;
    }


    /**
     * Gets the courseOverGround value for this EntityLocationExtendedRelationshipType.
     * 
     * @return courseOverGround   * Course Over Ground (COG) relative to true north.
     */
    public gov.ucore.ucore._2_0.AngleMeasureType getCourseOverGround() {
        return courseOverGround;
    }


    /**
     * Sets the courseOverGround value for this EntityLocationExtendedRelationshipType.
     * 
     * @param courseOverGround   * Course Over Ground (COG) relative to true north.
     */
    public void setCourseOverGround(gov.ucore.ucore._2_0.AngleMeasureType courseOverGround) {
        this.courseOverGround = courseOverGround;
    }


    /**
     * Gets the heading value for this EntityLocationExtendedRelationshipType.
     * 
     * @return heading   * Heading relative to true north.
     */
    public gov.ucore.ucore._2_0.AngleMeasureType getHeading() {
        return heading;
    }


    /**
     * Sets the heading value for this EntityLocationExtendedRelationshipType.
     * 
     * @param heading   * Heading relative to true north.
     */
    public void setHeading(gov.ucore.ucore._2_0.AngleMeasureType heading) {
        this.heading = heading;
    }


    /**
     * Gets the speedOverGround value for this EntityLocationExtendedRelationshipType.
     * 
     * @return speedOverGround   * Speed Over Ground (SOG) relative to true north.
     */
    public gov.ucore.ucore._2_0.VelocityMeasureType getSpeedOverGround() {
        return speedOverGround;
    }


    /**
     * Sets the speedOverGround value for this EntityLocationExtendedRelationshipType.
     * 
     * @param speedOverGround   * Speed Over Ground (SOG) relative to true north.
     */
    public void setSpeedOverGround(gov.ucore.ucore._2_0.VelocityMeasureType speedOverGround) {
        this.speedOverGround = speedOverGround;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityLocationExtendedRelationshipType)) return false;
        EntityLocationExtendedRelationshipType other = (EntityLocationExtendedRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.courseOverGround==null && other.getCourseOverGround()==null) || 
             (this.courseOverGround!=null &&
              this.courseOverGround.equals(other.getCourseOverGround()))) &&
            ((this.heading==null && other.getHeading()==null) || 
             (this.heading!=null &&
              this.heading.equals(other.getHeading()))) &&
            ((this.speedOverGround==null && other.getSpeedOverGround()==null) || 
             (this.speedOverGround!=null &&
              this.speedOverGround.equals(other.getSpeedOverGround())));
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
        if (getCourseOverGround() != null) {
            _hashCode += getCourseOverGround().hashCode();
        }
        if (getHeading() != null) {
            _hashCode += getHeading().hashCode();
        }
        if (getSpeedOverGround() != null) {
            _hashCode += getSpeedOverGround().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityLocationExtendedRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityLocationExtendedRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseOverGround");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CourseOverGround"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AngleMeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Heading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AngleMeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speedOverGround");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SpeedOverGround"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "VelocityMeasureType"));
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
