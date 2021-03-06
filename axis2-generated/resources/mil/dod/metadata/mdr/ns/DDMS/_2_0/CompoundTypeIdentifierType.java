/**
 * CompoundTypeIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class CompoundTypeIdentifierType  implements java.io.Serializable {
    private java.lang.String qualifier;  // attribute

    private java.lang.String value;  // attribute

    public CompoundTypeIdentifierType() {
    }

    public CompoundTypeIdentifierType(
           java.lang.String qualifier,
           java.lang.String value) {
           this.qualifier = qualifier;
           this.value = value;
    }


    /**
     * Gets the qualifier value for this CompoundTypeIdentifierType.
     * 
     * @return qualifier
     */
    public java.lang.String getQualifier() {
        return qualifier;
    }


    /**
     * Sets the qualifier value for this CompoundTypeIdentifierType.
     * 
     * @param qualifier
     */
    public void setQualifier(java.lang.String qualifier) {
        this.qualifier = qualifier;
    }


    /**
     * Gets the value value for this CompoundTypeIdentifierType.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CompoundTypeIdentifierType.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompoundTypeIdentifierType)) return false;
        CompoundTypeIdentifierType other = (CompoundTypeIdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualifier==null && other.getQualifier()==null) || 
             (this.qualifier!=null &&
              this.qualifier.equals(other.getQualifier()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getQualifier() != null) {
            _hashCode += getQualifier().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompoundTypeIdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CompoundTypeIdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("qualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "qualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
