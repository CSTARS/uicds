/**
 * CodeWithAuthorityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;


/**
 * gml:CodeWithAuthorityType requires that the codeSpace attribute
 * is provided in an instance.
 */
public class CodeWithAuthorityType  extends net.opengis.www.gml._3_2.CodeType  implements java.io.Serializable {
    private org.apache.axis.types.URI codeSpace;  // attribute

    public CodeWithAuthorityType() {
    }

    // Simple Types must have a String constructor
    public CodeWithAuthorityType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the codeSpace value for this CodeWithAuthorityType.
     * 
     * @return codeSpace
     */
    public org.apache.axis.types.URI getCodeSpace() {
        return codeSpace;
    }


    /**
     * Sets the codeSpace value for this CodeWithAuthorityType.
     * 
     * @param codeSpace
     */
    public void setCodeSpace(org.apache.axis.types.URI codeSpace) {
        this.codeSpace = codeSpace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeWithAuthorityType)) return false;
        CodeWithAuthorityType other = (CodeWithAuthorityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codeSpace==null && other.getCodeSpace()==null) || 
             (this.codeSpace!=null &&
              this.codeSpace.equals(other.getCodeSpace())));
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
        if (getCodeSpace() != null) {
            _hashCode += getCodeSpace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeWithAuthorityType.class, false);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CodeWithAuthorityType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codeSpace");
        attrField.setXmlName(new javax.xml.namespace.QName("", "codeSpace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
