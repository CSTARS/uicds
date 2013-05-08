/**
 * NonValidatingReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.library.message;


/**
 * A structure that allows reference to an object that is located
 * within closed(xsd:any) container (for example under ulex:StructuredPayload)
 * and is beyond the scope of XML Schema validation. ulexlib:ref element
 * holds a valid ID value for the scope of the referenced document (located
 * under xsd:any) rather than a local document.
 */
public class NonValidatingReferenceType  implements java.io.Serializable {
    private org.apache.axis.types.NCName nvref;  // attribute

    public NonValidatingReferenceType() {
    }

    public NonValidatingReferenceType(
           org.apache.axis.types.NCName nvref) {
           this.nvref = nvref;
    }


    /**
     * Gets the nvref value for this NonValidatingReferenceType.
     * 
     * @return nvref
     */
    public org.apache.axis.types.NCName getNvref() {
        return nvref;
    }


    /**
     * Sets the nvref value for this NonValidatingReferenceType.
     * 
     * @param nvref
     */
    public void setNvref(org.apache.axis.types.NCName nvref) {
        this.nvref = nvref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonValidatingReferenceType)) return false;
        NonValidatingReferenceType other = (NonValidatingReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nvref==null && other.getNvref()==null) || 
             (this.nvref!=null &&
              this.nvref.equals(other.getNvref())));
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
        if (getNvref() != null) {
            _hashCode += getNvref().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NonValidatingReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "NonValidatingReferenceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nvref");
        attrField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "nvref"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NCName"));
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
