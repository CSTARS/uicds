/**
 * InterestGroupSubtypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.structures;

public class InterestGroupSubtypeType  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.CodespaceValueType codeSpaceValue;

    private java.lang.String codespace;  // attribute

    public InterestGroupSubtypeType() {
    }

    public InterestGroupSubtypeType(
           com.saic.www.precis._2009._06.base.CodespaceValueType codeSpaceValue,
           java.lang.String codespace) {
           this.codeSpaceValue = codeSpaceValue;
           this.codespace = codespace;
    }


    /**
     * Gets the codeSpaceValue value for this InterestGroupSubtypeType.
     * 
     * @return codeSpaceValue
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType getCodeSpaceValue() {
        return codeSpaceValue;
    }


    /**
     * Sets the codeSpaceValue value for this InterestGroupSubtypeType.
     * 
     * @param codeSpaceValue
     */
    public void setCodeSpaceValue(com.saic.www.precis._2009._06.base.CodespaceValueType codeSpaceValue) {
        this.codeSpaceValue = codeSpaceValue;
    }


    /**
     * Gets the codespace value for this InterestGroupSubtypeType.
     * 
     * @return codespace
     */
    public java.lang.String getCodespace() {
        return codespace;
    }


    /**
     * Sets the codespace value for this InterestGroupSubtypeType.
     * 
     * @param codespace
     */
    public void setCodespace(java.lang.String codespace) {
        this.codespace = codespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterestGroupSubtypeType)) return false;
        InterestGroupSubtypeType other = (InterestGroupSubtypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeSpaceValue==null && other.getCodeSpaceValue()==null) || 
             (this.codeSpaceValue!=null &&
              this.codeSpaceValue.equals(other.getCodeSpaceValue()))) &&
            ((this.codespace==null && other.getCodespace()==null) || 
             (this.codespace!=null &&
              this.codespace.equals(other.getCodespace())));
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
        if (getCodeSpaceValue() != null) {
            _hashCode += getCodeSpaceValue().hashCode();
        }
        if (getCodespace() != null) {
            _hashCode += getCodespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterestGroupSubtypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupSubtypeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codespace");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "codespace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSpaceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "CodeSpaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CodespaceValueType"));
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
