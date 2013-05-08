/**
 * MassMeasureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A mass measurement, with an associated error bound.  The units
 * on the error bound are assumed to be the same as those on the measurement.
 */
public class MassMeasureType  extends gov.ucore.ucore._2_0.DecimalType  implements java.io.Serializable {
    private gov.ucore.ucore._2_0.MassUOMType massUOM;  // attribute

    public MassMeasureType() {
    }


    /**
     * Gets the massUOM value for this MassMeasureType.
     * 
     * @return massUOM
     */
    public gov.ucore.ucore._2_0.MassUOMType getMassUOM() {
        return massUOM;
    }


    /**
     * Sets the massUOM value for this MassMeasureType.
     * 
     * @param massUOM
     */
    public void setMassUOM(gov.ucore.ucore._2_0.MassUOMType massUOM) {
        this.massUOM = massUOM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MassMeasureType)) return false;
        MassMeasureType other = (MassMeasureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.massUOM==null && other.getMassUOM()==null) || 
             (this.massUOM!=null &&
              this.massUOM.equals(other.getMassUOM())));
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
        if (getMassUOM() != null) {
            _hashCode += getMassUOM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MassMeasureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MassMeasureType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("massUOM");
        attrField.setXmlName(new javax.xml.namespace.QName("", "massUOM"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MassUOMType"));
        typeDesc.addFieldDesc(attrField);
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
