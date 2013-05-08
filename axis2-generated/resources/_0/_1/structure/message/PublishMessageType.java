/**
 * PublishMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure describes Publish Mesage format.
 */
public class PublishMessageType  implements java.io.Serializable {
    private _0._1.structure.message.PDMessageMetadataType PDMessageMetadata;

    private _0._1.structure.message.SystemMetadataType dataSubmitterMetadata;

    private java.lang.Object[] publishMessageItemAbstract;

    public PublishMessageType() {
    }

    public PublishMessageType(
           _0._1.structure.message.PDMessageMetadataType PDMessageMetadata,
           _0._1.structure.message.SystemMetadataType dataSubmitterMetadata,
           java.lang.Object[] publishMessageItemAbstract) {
           this.PDMessageMetadata = PDMessageMetadata;
           this.dataSubmitterMetadata = dataSubmitterMetadata;
           this.publishMessageItemAbstract = publishMessageItemAbstract;
    }


    /**
     * Gets the PDMessageMetadata value for this PublishMessageType.
     * 
     * @return PDMessageMetadata
     */
    public _0._1.structure.message.PDMessageMetadataType getPDMessageMetadata() {
        return PDMessageMetadata;
    }


    /**
     * Sets the PDMessageMetadata value for this PublishMessageType.
     * 
     * @param PDMessageMetadata
     */
    public void setPDMessageMetadata(_0._1.structure.message.PDMessageMetadataType PDMessageMetadata) {
        this.PDMessageMetadata = PDMessageMetadata;
    }


    /**
     * Gets the dataSubmitterMetadata value for this PublishMessageType.
     * 
     * @return dataSubmitterMetadata
     */
    public _0._1.structure.message.SystemMetadataType getDataSubmitterMetadata() {
        return dataSubmitterMetadata;
    }


    /**
     * Sets the dataSubmitterMetadata value for this PublishMessageType.
     * 
     * @param dataSubmitterMetadata
     */
    public void setDataSubmitterMetadata(_0._1.structure.message.SystemMetadataType dataSubmitterMetadata) {
        this.dataSubmitterMetadata = dataSubmitterMetadata;
    }


    /**
     * Gets the publishMessageItemAbstract value for this PublishMessageType.
     * 
     * @return publishMessageItemAbstract
     */
    public java.lang.Object[] getPublishMessageItemAbstract() {
        return publishMessageItemAbstract;
    }


    /**
     * Sets the publishMessageItemAbstract value for this PublishMessageType.
     * 
     * @param publishMessageItemAbstract
     */
    public void setPublishMessageItemAbstract(java.lang.Object[] publishMessageItemAbstract) {
        this.publishMessageItemAbstract = publishMessageItemAbstract;
    }

    public java.lang.Object getPublishMessageItemAbstract(int i) {
        return this.publishMessageItemAbstract[i];
    }

    public void setPublishMessageItemAbstract(int i, java.lang.Object _value) {
        this.publishMessageItemAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishMessageType)) return false;
        PublishMessageType other = (PublishMessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDMessageMetadata==null && other.getPDMessageMetadata()==null) || 
             (this.PDMessageMetadata!=null &&
              this.PDMessageMetadata.equals(other.getPDMessageMetadata()))) &&
            ((this.dataSubmitterMetadata==null && other.getDataSubmitterMetadata()==null) || 
             (this.dataSubmitterMetadata!=null &&
              this.dataSubmitterMetadata.equals(other.getDataSubmitterMetadata()))) &&
            ((this.publishMessageItemAbstract==null && other.getPublishMessageItemAbstract()==null) || 
             (this.publishMessageItemAbstract!=null &&
              java.util.Arrays.equals(this.publishMessageItemAbstract, other.getPublishMessageItemAbstract())));
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
        if (getPDMessageMetadata() != null) {
            _hashCode += getPDMessageMetadata().hashCode();
        }
        if (getDataSubmitterMetadata() != null) {
            _hashCode += getDataSubmitterMetadata().hashCode();
        }
        if (getPublishMessageItemAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishMessageItemAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishMessageItemAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(PublishMessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDMessageMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSubmitterMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSubmitterMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishMessageItemAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract"));
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
