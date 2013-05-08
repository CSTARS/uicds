/**
 * TimeIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * Represents an interval between two specified instants in time.
 */
public class TimeIntervalType  implements java.io.Serializable {
    /* The start instant of the interval, with associated uncertainty. */
    private gov.ucore.ucore._2_0.TimeInstantType startTime;

    /* The end instant of the interval, with associated uncertainty. */
    private gov.ucore.ucore._2_0.TimeInstantType endTime;

    public TimeIntervalType() {
    }

    public TimeIntervalType(
           gov.ucore.ucore._2_0.TimeInstantType startTime,
           gov.ucore.ucore._2_0.TimeInstantType endTime) {
           this.startTime = startTime;
           this.endTime = endTime;
    }


    /**
     * Gets the startTime value for this TimeIntervalType.
     * 
     * @return startTime   * The start instant of the interval, with associated uncertainty.
     */
    public gov.ucore.ucore._2_0.TimeInstantType getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TimeIntervalType.
     * 
     * @param startTime   * The start instant of the interval, with associated uncertainty.
     */
    public void setStartTime(gov.ucore.ucore._2_0.TimeInstantType startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this TimeIntervalType.
     * 
     * @return endTime   * The end instant of the interval, with associated uncertainty.
     */
    public gov.ucore.ucore._2_0.TimeInstantType getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TimeIntervalType.
     * 
     * @param endTime   * The end instant of the interval, with associated uncertainty.
     */
    public void setEndTime(gov.ucore.ucore._2_0.TimeInstantType endTime) {
        this.endTime = endTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeIntervalType)) return false;
        TimeIntervalType other = (TimeIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeIntervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstantType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstantType"));
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
