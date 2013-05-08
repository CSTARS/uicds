/**
 * EventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * Base type for an Event.
 */
public class EventType  extends gov.ucore.ucore._2_0.ThingType  implements java.io.Serializable {
    /* Codespace/value pair that defines what this Event is. Each
     * Event must include at least one term from the UCore Taxonomy, with
     * the associated UCore codespace, http://ucore.gov/2.0/codespace/. */
    private gov.ucore.ucore._2_0.WhatType[] what;

    public EventType() {
    }

    public EventType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           gov.ucore.ucore._2_0.WhatType[] what) {
        super(
            id,
            metadata,
            descriptor,
            identifier,
            simpleProperty);
        this.what = what;
    }


    /**
     * Gets the what value for this EventType.
     * 
     * @return what   * Codespace/value pair that defines what this Event is. Each
     * Event must include at least one term from the UCore Taxonomy, with
     * the associated UCore codespace, http://ucore.gov/2.0/codespace/.
     */
    public gov.ucore.ucore._2_0.WhatType[] getWhat() {
        return what;
    }


    /**
     * Sets the what value for this EventType.
     * 
     * @param what   * Codespace/value pair that defines what this Event is. Each
     * Event must include at least one term from the UCore Taxonomy, with
     * the associated UCore codespace, http://ucore.gov/2.0/codespace/.
     */
    public void setWhat(gov.ucore.ucore._2_0.WhatType[] what) {
        this.what = what;
    }

    public gov.ucore.ucore._2_0.WhatType getWhat(int i) {
        return this.what[i];
    }

    public void setWhat(int i, gov.ucore.ucore._2_0.WhatType _value) {
        this.what[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventType)) return false;
        EventType other = (EventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.what==null && other.getWhat()==null) || 
             (this.what!=null &&
              java.util.Arrays.equals(this.what, other.getWhat())));
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
        if (getWhat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhat(), i);
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
        new org.apache.axis.description.TypeDesc(EventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What"));
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
