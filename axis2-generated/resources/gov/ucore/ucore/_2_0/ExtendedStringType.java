/**
 * ExtendedStringType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * An extension to the basic UCore StringType that allows for any
 * number of alternate spellings to be added.
 */
public class ExtendedStringType  implements java.io.Serializable {
    /* The actual string value. */
    private gov.ucore.ucore._2_0.StringType value;

    /* Possible alternate spellings for the same string. */
    private gov.ucore.ucore._2_0.StringType[] altSpelling;

    public ExtendedStringType() {
    }

    public ExtendedStringType(
           gov.ucore.ucore._2_0.StringType value,
           gov.ucore.ucore._2_0.StringType[] altSpelling) {
           this.value = value;
           this.altSpelling = altSpelling;
    }


    /**
     * Gets the value value for this ExtendedStringType.
     * 
     * @return value   * The actual string value.
     */
    public gov.ucore.ucore._2_0.StringType getValue() {
        return value;
    }


    /**
     * Sets the value value for this ExtendedStringType.
     * 
     * @param value   * The actual string value.
     */
    public void setValue(gov.ucore.ucore._2_0.StringType value) {
        this.value = value;
    }


    /**
     * Gets the altSpelling value for this ExtendedStringType.
     * 
     * @return altSpelling   * Possible alternate spellings for the same string.
     */
    public gov.ucore.ucore._2_0.StringType[] getAltSpelling() {
        return altSpelling;
    }


    /**
     * Sets the altSpelling value for this ExtendedStringType.
     * 
     * @param altSpelling   * Possible alternate spellings for the same string.
     */
    public void setAltSpelling(gov.ucore.ucore._2_0.StringType[] altSpelling) {
        this.altSpelling = altSpelling;
    }

    public gov.ucore.ucore._2_0.StringType getAltSpelling(int i) {
        return this.altSpelling[i];
    }

    public void setAltSpelling(int i, gov.ucore.ucore._2_0.StringType _value) {
        this.altSpelling[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedStringType)) return false;
        ExtendedStringType other = (ExtendedStringType) obj;
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
              this.value.equals(other.getValue()))) &&
            ((this.altSpelling==null && other.getAltSpelling()==null) || 
             (this.altSpelling!=null &&
              java.util.Arrays.equals(this.altSpelling, other.getAltSpelling())));
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
        if (getAltSpelling() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSpelling());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSpelling(), i);
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
        new org.apache.axis.description.TypeDesc(ExtendedStringType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ExtendedStringType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StringType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSpelling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AltSpelling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StringType"));
        elemField.setMinOccurs(0);
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
