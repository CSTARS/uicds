/**
 * EventLocationRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between events and locations.
 */
public class EventLocationRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The event to which this relationship applies. */
    private gov.ucore.ucore._2_0.EventRefType eventRef;

    /* The location to which this relationship applies. */
    private gov.ucore.ucore._2_0.LocationRefType locationRef;

    public EventLocationRelationshipType() {
    }

    public EventLocationRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.EventRefType eventRef,
           gov.ucore.ucore._2_0.LocationRefType locationRef) {
        super(
            id,
            metadata,
            time);
        this.eventRef = eventRef;
        this.locationRef = locationRef;
    }


    /**
     * Gets the eventRef value for this EventLocationRelationshipType.
     * 
     * @return eventRef   * The event to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.EventRefType getEventRef() {
        return eventRef;
    }


    /**
     * Sets the eventRef value for this EventLocationRelationshipType.
     * 
     * @param eventRef   * The event to which this relationship applies.
     */
    public void setEventRef(gov.ucore.ucore._2_0.EventRefType eventRef) {
        this.eventRef = eventRef;
    }


    /**
     * Gets the locationRef value for this EventLocationRelationshipType.
     * 
     * @return locationRef   * The location to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.LocationRefType getLocationRef() {
        return locationRef;
    }


    /**
     * Sets the locationRef value for this EventLocationRelationshipType.
     * 
     * @param locationRef   * The location to which this relationship applies.
     */
    public void setLocationRef(gov.ucore.ucore._2_0.LocationRefType locationRef) {
        this.locationRef = locationRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventLocationRelationshipType)) return false;
        EventLocationRelationshipType other = (EventLocationRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventRef==null && other.getEventRef()==null) || 
             (this.eventRef!=null &&
              this.eventRef.equals(other.getEventRef()))) &&
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
        if (getEventRef() != null) {
            _hashCode += getEventRef().hashCode();
        }
        if (getLocationRef() != null) {
            _hashCode += getLocationRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventLocationRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventLocationRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRefType"));
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
