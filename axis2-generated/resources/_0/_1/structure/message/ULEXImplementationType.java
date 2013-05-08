/**
 * ULEXImplementationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A strucutre that describes the ULEX implementation.
 */
public class ULEXImplementationType  implements java.io.Serializable {
    private java.lang.String ULEXImplementationVersion;

    private java.lang.String ULEXImplementationName;

    public ULEXImplementationType() {
    }

    public ULEXImplementationType(
           java.lang.String ULEXImplementationVersion,
           java.lang.String ULEXImplementationName) {
           this.ULEXImplementationVersion = ULEXImplementationVersion;
           this.ULEXImplementationName = ULEXImplementationName;
    }


    /**
     * Gets the ULEXImplementationVersion value for this ULEXImplementationType.
     * 
     * @return ULEXImplementationVersion
     */
    public java.lang.String getULEXImplementationVersion() {
        return ULEXImplementationVersion;
    }


    /**
     * Sets the ULEXImplementationVersion value for this ULEXImplementationType.
     * 
     * @param ULEXImplementationVersion
     */
    public void setULEXImplementationVersion(java.lang.String ULEXImplementationVersion) {
        this.ULEXImplementationVersion = ULEXImplementationVersion;
    }


    /**
     * Gets the ULEXImplementationName value for this ULEXImplementationType.
     * 
     * @return ULEXImplementationName
     */
    public java.lang.String getULEXImplementationName() {
        return ULEXImplementationName;
    }


    /**
     * Sets the ULEXImplementationName value for this ULEXImplementationType.
     * 
     * @param ULEXImplementationName
     */
    public void setULEXImplementationName(java.lang.String ULEXImplementationName) {
        this.ULEXImplementationName = ULEXImplementationName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ULEXImplementationType)) return false;
        ULEXImplementationType other = (ULEXImplementationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ULEXImplementationVersion==null && other.getULEXImplementationVersion()==null) || 
             (this.ULEXImplementationVersion!=null &&
              this.ULEXImplementationVersion.equals(other.getULEXImplementationVersion()))) &&
            ((this.ULEXImplementationName==null && other.getULEXImplementationName()==null) || 
             (this.ULEXImplementationName!=null &&
              this.ULEXImplementationName.equals(other.getULEXImplementationName())));
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
        if (getULEXImplementationVersion() != null) {
            _hashCode += getULEXImplementationVersion().hashCode();
        }
        if (getULEXImplementationName() != null) {
            _hashCode += getULEXImplementationName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ULEXImplementationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULEXImplementationVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULEXImplementationName");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
