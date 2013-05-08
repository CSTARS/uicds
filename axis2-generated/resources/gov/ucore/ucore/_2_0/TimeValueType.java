/**
 * TimeValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A fixed point in time, with no uncertainty.
 */
public class TimeValueType  implements java.io.Serializable {
    /* A time.  This element is a union of xs:date, xs:time, xs:dateTime,
     * xs:gDay, xs:gMonth, xs:gMonthDay, xs:gYear, and xs:gYearMonth. This
     * element must match the format corresponding to one of those simple
     * types. */
    private gov.ucore.ucore._2_0.TimeValueTypeValue value;

    public TimeValueType() {
    }

    public TimeValueType(
           gov.ucore.ucore._2_0.TimeValueTypeValue value) {
           this.value = value;
    }


    /**
     * Gets the value value for this TimeValueType.
     * 
     * @return value   * A time.  This element is a union of xs:date, xs:time, xs:dateTime,
     * xs:gDay, xs:gMonth, xs:gMonthDay, xs:gYear, and xs:gYearMonth. This
     * element must match the format corresponding to one of those simple
     * types.
     */
    public gov.ucore.ucore._2_0.TimeValueTypeValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this TimeValueType.
     * 
     * @param value   * A time.  This element is a union of xs:date, xs:time, xs:dateTime,
     * xs:gDay, xs:gMonth, xs:gMonthDay, xs:gYear, and xs:gYearMonth. This
     * element must match the format corresponding to one of those simple
     * types.
     */
    public void setValue(gov.ucore.ucore._2_0.TimeValueTypeValue value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeValueType)) return false;
        TimeValueType other = (TimeValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", ">TimeValueType>Value"));
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
