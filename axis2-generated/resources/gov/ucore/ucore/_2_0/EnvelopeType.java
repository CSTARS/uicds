/**
 * EnvelopeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A wrapper type for GML Envelope.
 */
public class EnvelopeType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.EnvelopeType envelope;

    public EnvelopeType() {
    }

    public EnvelopeType(
           net.opengis.www.gml._3_2.EnvelopeType envelope) {
           this.envelope = envelope;
    }


    /**
     * Gets the envelope value for this EnvelopeType.
     * 
     * @return envelope
     */
    public net.opengis.www.gml._3_2.EnvelopeType getEnvelope() {
        return envelope;
    }


    /**
     * Sets the envelope value for this EnvelopeType.
     * 
     * @param envelope
     */
    public void setEnvelope(net.opengis.www.gml._3_2.EnvelopeType envelope) {
        this.envelope = envelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeType)) return false;
        EnvelopeType other = (EnvelopeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelope==null && other.getEnvelope()==null) || 
             (this.envelope!=null &&
              this.envelope.equals(other.getEnvelope())));
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
        if (getEnvelope() != null) {
            _hashCode += getEnvelope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EnvelopeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Envelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EnvelopeType"));
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
