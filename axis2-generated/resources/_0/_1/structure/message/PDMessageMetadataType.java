/**
 * PDMessageMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure describes metadata for ULEX Publish Mesage.
 */
public class PDMessageMetadataType  extends _0._1.structure.message.MessageMetadataAbstractType  implements java.io.Serializable {
    private java.lang.Object[] PDMessageMetadataExtensionAbstract;

    public PDMessageMetadataType() {
    }

    public PDMessageMetadataType(
           java.lang.String ULEXFramework,
           _0._1.structure.message.ULEXImplementationType ULEXImplementation,
           java.util.Calendar messageDateTime,
           org.apache.axis.types.NonNegativeInteger messageSequenceNumber,
           java.lang.Object dataSensitivityAbstract,
           java.lang.Object[] PDMessageMetadataExtensionAbstract) {
        super(
            ULEXFramework,
            ULEXImplementation,
            messageDateTime,
            messageSequenceNumber,
            dataSensitivityAbstract);
        this.PDMessageMetadataExtensionAbstract = PDMessageMetadataExtensionAbstract;
    }


    /**
     * Gets the PDMessageMetadataExtensionAbstract value for this PDMessageMetadataType.
     * 
     * @return PDMessageMetadataExtensionAbstract
     */
    public java.lang.Object[] getPDMessageMetadataExtensionAbstract() {
        return PDMessageMetadataExtensionAbstract;
    }


    /**
     * Sets the PDMessageMetadataExtensionAbstract value for this PDMessageMetadataType.
     * 
     * @param PDMessageMetadataExtensionAbstract
     */
    public void setPDMessageMetadataExtensionAbstract(java.lang.Object[] PDMessageMetadataExtensionAbstract) {
        this.PDMessageMetadataExtensionAbstract = PDMessageMetadataExtensionAbstract;
    }

    public java.lang.Object getPDMessageMetadataExtensionAbstract(int i) {
        return this.PDMessageMetadataExtensionAbstract[i];
    }

    public void setPDMessageMetadataExtensionAbstract(int i, java.lang.Object _value) {
        this.PDMessageMetadataExtensionAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDMessageMetadataType)) return false;
        PDMessageMetadataType other = (PDMessageMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.PDMessageMetadataExtensionAbstract==null && other.getPDMessageMetadataExtensionAbstract()==null) || 
             (this.PDMessageMetadataExtensionAbstract!=null &&
              java.util.Arrays.equals(this.PDMessageMetadataExtensionAbstract, other.getPDMessageMetadataExtensionAbstract())));
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
        if (getPDMessageMetadataExtensionAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDMessageMetadataExtensionAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDMessageMetadataExtensionAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(PDMessageMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDMessageMetadataExtensionAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract"));
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
