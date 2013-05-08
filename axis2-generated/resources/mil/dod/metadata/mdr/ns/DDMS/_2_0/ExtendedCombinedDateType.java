/**
 * ExtendedCombinedDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class ExtendedCombinedDateType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public ExtendedCombinedDateType() {
    }

    // Simple Types must have a String constructor
    public ExtendedCombinedDateType(java.lang.String _value) {
        this._value = _value;
    }
    public ExtendedCombinedDateType(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType _value) {
        setCombinedDateTypeValue(_value);
    }

    public ExtendedCombinedDateType(mil.dod.metadata.mdr.ns.DDMS._2_0.DateValueExtensionType _value) {
        setDateValueExtensionTypeValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the combinedDateTypeValue value for this ExtendedCombinedDateType.
     * 
     * @return combinedDateTypeValue
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType getCombinedDateTypeValue() {
        return new mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType(_value);
    }


    /**
     * Sets the _value value for this ExtendedCombinedDateType.
     * 
     * @param _value
     */
    public void setCombinedDateTypeValue(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the dateValueExtensionTypeValue value for this ExtendedCombinedDateType.
     * 
     * @return dateValueExtensionTypeValue
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.DateValueExtensionType getDateValueExtensionTypeValue() {
        return mil.dod.metadata.mdr.ns.DDMS._2_0.DateValueExtensionType.fromString(_value);
    }


    /**
     * Sets the _value value for this ExtendedCombinedDateType.
     * 
     * @param _value
     */
    public void setDateValueExtensionTypeValue(mil.dod.metadata.mdr.ns.DDMS._2_0.DateValueExtensionType _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedCombinedDateType)) return false;
        ExtendedCombinedDateType other = (ExtendedCombinedDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendedCombinedDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "ExtendedCombinedDateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedDateTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CombinedDateTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CombinedDateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValueExtensionTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateValueExtensionTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "DateValueExtensionType"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
