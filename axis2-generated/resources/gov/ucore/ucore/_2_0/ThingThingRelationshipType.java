/**
 * ThingThingRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between things.  This is the most
 * general type of relationship.
 */
public class ThingThingRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The things to which this relationship applies. */
    private gov.ucore.ucore._2_0.ThingRefType[] thingRef;

    public ThingThingRelationshipType() {
    }

    public ThingThingRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.ThingRefType[] thingRef) {
        super(
            id,
            metadata,
            time);
        this.thingRef = thingRef;
    }


    /**
     * Gets the thingRef value for this ThingThingRelationshipType.
     * 
     * @return thingRef   * The things to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.ThingRefType[] getThingRef() {
        return thingRef;
    }


    /**
     * Sets the thingRef value for this ThingThingRelationshipType.
     * 
     * @param thingRef   * The things to which this relationship applies.
     */
    public void setThingRef(gov.ucore.ucore._2_0.ThingRefType[] thingRef) {
        this.thingRef = thingRef;
    }

    public gov.ucore.ucore._2_0.ThingRefType getThingRef(int i) {
        return this.thingRef[i];
    }

    public void setThingRef(int i, gov.ucore.ucore._2_0.ThingRefType _value) {
        this.thingRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThingThingRelationshipType)) return false;
        ThingThingRelationshipType other = (ThingThingRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thingRef==null && other.getThingRef()==null) || 
             (this.thingRef!=null &&
              java.util.Arrays.equals(this.thingRef, other.getThingRef())));
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
        if (getThingRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThingRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThingRef(), i);
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
        new org.apache.axis.description.TypeDesc(ThingThingRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingThingRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thingRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRefType"));
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
