/**
 * TimeInstantType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A time instant that includes uncertainty.
 */
public class TimeInstantType  extends gov.ucore.ucore._2_0.TimeValueType  implements java.io.Serializable {
    /* The uncertainty in the time instant.  This uncertainty interval
     * is +/- the value in this duration element.  If this element contains
     * P30M, the uncertainty on the time is +/- 30 minutes. */
    private org.apache.axis.types.Duration uncertaintyInterval;

    public TimeInstantType() {
    }

    public TimeInstantType(
           gov.ucore.ucore._2_0.TimeValueTypeValue value,
           org.apache.axis.types.Duration uncertaintyInterval) {
        super(
            value);
        this.uncertaintyInterval = uncertaintyInterval;
    }


    /**
     * Gets the uncertaintyInterval value for this TimeInstantType.
     * 
     * @return uncertaintyInterval   * The uncertainty in the time instant.  This uncertainty interval
     * is +/- the value in this duration element.  If this element contains
     * P30M, the uncertainty on the time is +/- 30 minutes.
     */
    public org.apache.axis.types.Duration getUncertaintyInterval() {
        return uncertaintyInterval;
    }


    /**
     * Sets the uncertaintyInterval value for this TimeInstantType.
     * 
     * @param uncertaintyInterval   * The uncertainty in the time instant.  This uncertainty interval
     * is +/- the value in this duration element.  If this element contains
     * P30M, the uncertainty on the time is +/- 30 minutes.
     */
    public void setUncertaintyInterval(org.apache.axis.types.Duration uncertaintyInterval) {
        this.uncertaintyInterval = uncertaintyInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeInstantType)) return false;
        TimeInstantType other = (TimeInstantType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uncertaintyInterval==null && other.getUncertaintyInterval()==null) || 
             (this.uncertaintyInterval!=null &&
              this.uncertaintyInterval.equals(other.getUncertaintyInterval())));
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
        if (getUncertaintyInterval() != null) {
            _hashCode += getUncertaintyInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeInstantType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstantType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncertaintyInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "UncertaintyInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
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
