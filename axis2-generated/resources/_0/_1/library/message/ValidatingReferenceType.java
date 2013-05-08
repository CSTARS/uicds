/**
 * ValidatingReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.library.message;


/**
 * A structure that allows reference to an object that is located
 * within container and is supported by XML Schema validation. ulexlib:ref
 * element holds a valid ID value for the scope of the referenced document
 * (located under xsd:any) rather than a local document.
 */
public class ValidatingReferenceType  implements java.io.Serializable {
    private org.apache.axis.types.IDRef vref;  // attribute

    public ValidatingReferenceType() {
    }

    public ValidatingReferenceType(
           org.apache.axis.types.IDRef vref) {
           this.vref = vref;
    }


    /**
     * Gets the vref value for this ValidatingReferenceType.
     * 
     * @return vref
     */
    public org.apache.axis.types.IDRef getVref() {
        return vref;
    }


    /**
     * Sets the vref value for this ValidatingReferenceType.
     * 
     * @param vref
     */
    public void setVref(org.apache.axis.types.IDRef vref) {
        this.vref = vref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatingReferenceType)) return false;
        ValidatingReferenceType other = (ValidatingReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vref==null && other.getVref()==null) || 
             (this.vref!=null &&
              this.vref.equals(other.getVref())));
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
        if (getVref() != null) {
            _hashCode += getVref().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatingReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "ValidatingReferenceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vref");
        attrField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "vref"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREF"));
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
