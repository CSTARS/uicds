/**
 * TemporalCoverageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class TemporalCoverageType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.TimePeriodType timePeriod;

    public TemporalCoverageType() {
    }

    public TemporalCoverageType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.TimePeriodType timePeriod) {
           this.timePeriod = timePeriod;
    }


    /**
     * Gets the timePeriod value for this TemporalCoverageType.
     * 
     * @return timePeriod
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.TimePeriodType getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this TemporalCoverageType.
     * 
     * @param timePeriod
     */
    public void setTimePeriod(mil.dod.metadata.mdr.ns.DDMS._2_0.TimePeriodType timePeriod) {
        this.timePeriod = timePeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemporalCoverageType)) return false;
        TemporalCoverageType other = (TemporalCoverageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod())));
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
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemporalCoverageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "TemporalCoverageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "TimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "TimePeriodType"));
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
