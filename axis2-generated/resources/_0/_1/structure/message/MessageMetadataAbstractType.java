/**
 * MessageMetadataAbstractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that holds basic metadata about any message.
 */
public abstract class MessageMetadataAbstractType  implements java.io.Serializable {
    private java.lang.String ULEXFramework;

    private _0._1.structure.message.ULEXImplementationType ULEXImplementation;

    private java.util.Calendar messageDateTime;

    private org.apache.axis.types.NonNegativeInteger messageSequenceNumber;

    private java.lang.Object dataSensitivityAbstract;

    public MessageMetadataAbstractType() {
    }

    public MessageMetadataAbstractType(
           java.lang.String ULEXFramework,
           _0._1.structure.message.ULEXImplementationType ULEXImplementation,
           java.util.Calendar messageDateTime,
           org.apache.axis.types.NonNegativeInteger messageSequenceNumber,
           java.lang.Object dataSensitivityAbstract) {
           this.ULEXFramework = ULEXFramework;
           this.ULEXImplementation = ULEXImplementation;
           this.messageDateTime = messageDateTime;
           this.messageSequenceNumber = messageSequenceNumber;
           this.dataSensitivityAbstract = dataSensitivityAbstract;
    }


    /**
     * Gets the ULEXFramework value for this MessageMetadataAbstractType.
     * 
     * @return ULEXFramework
     */
    public java.lang.String getULEXFramework() {
        return ULEXFramework;
    }


    /**
     * Sets the ULEXFramework value for this MessageMetadataAbstractType.
     * 
     * @param ULEXFramework
     */
    public void setULEXFramework(java.lang.String ULEXFramework) {
        this.ULEXFramework = ULEXFramework;
    }


    /**
     * Gets the ULEXImplementation value for this MessageMetadataAbstractType.
     * 
     * @return ULEXImplementation
     */
    public _0._1.structure.message.ULEXImplementationType getULEXImplementation() {
        return ULEXImplementation;
    }


    /**
     * Sets the ULEXImplementation value for this MessageMetadataAbstractType.
     * 
     * @param ULEXImplementation
     */
    public void setULEXImplementation(_0._1.structure.message.ULEXImplementationType ULEXImplementation) {
        this.ULEXImplementation = ULEXImplementation;
    }


    /**
     * Gets the messageDateTime value for this MessageMetadataAbstractType.
     * 
     * @return messageDateTime
     */
    public java.util.Calendar getMessageDateTime() {
        return messageDateTime;
    }


    /**
     * Sets the messageDateTime value for this MessageMetadataAbstractType.
     * 
     * @param messageDateTime
     */
    public void setMessageDateTime(java.util.Calendar messageDateTime) {
        this.messageDateTime = messageDateTime;
    }


    /**
     * Gets the messageSequenceNumber value for this MessageMetadataAbstractType.
     * 
     * @return messageSequenceNumber
     */
    public org.apache.axis.types.NonNegativeInteger getMessageSequenceNumber() {
        return messageSequenceNumber;
    }


    /**
     * Sets the messageSequenceNumber value for this MessageMetadataAbstractType.
     * 
     * @param messageSequenceNumber
     */
    public void setMessageSequenceNumber(org.apache.axis.types.NonNegativeInteger messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }


    /**
     * Gets the dataSensitivityAbstract value for this MessageMetadataAbstractType.
     * 
     * @return dataSensitivityAbstract
     */
    public java.lang.Object getDataSensitivityAbstract() {
        return dataSensitivityAbstract;
    }


    /**
     * Sets the dataSensitivityAbstract value for this MessageMetadataAbstractType.
     * 
     * @param dataSensitivityAbstract
     */
    public void setDataSensitivityAbstract(java.lang.Object dataSensitivityAbstract) {
        this.dataSensitivityAbstract = dataSensitivityAbstract;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageMetadataAbstractType)) return false;
        MessageMetadataAbstractType other = (MessageMetadataAbstractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ULEXFramework==null && other.getULEXFramework()==null) || 
             (this.ULEXFramework!=null &&
              this.ULEXFramework.equals(other.getULEXFramework()))) &&
            ((this.ULEXImplementation==null && other.getULEXImplementation()==null) || 
             (this.ULEXImplementation!=null &&
              this.ULEXImplementation.equals(other.getULEXImplementation()))) &&
            ((this.messageDateTime==null && other.getMessageDateTime()==null) || 
             (this.messageDateTime!=null &&
              this.messageDateTime.equals(other.getMessageDateTime()))) &&
            ((this.messageSequenceNumber==null && other.getMessageSequenceNumber()==null) || 
             (this.messageSequenceNumber!=null &&
              this.messageSequenceNumber.equals(other.getMessageSequenceNumber()))) &&
            ((this.dataSensitivityAbstract==null && other.getDataSensitivityAbstract()==null) || 
             (this.dataSensitivityAbstract!=null &&
              this.dataSensitivityAbstract.equals(other.getDataSensitivityAbstract())));
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
        if (getULEXFramework() != null) {
            _hashCode += getULEXFramework().hashCode();
        }
        if (getULEXImplementation() != null) {
            _hashCode += getULEXImplementation().hashCode();
        }
        if (getMessageDateTime() != null) {
            _hashCode += getMessageDateTime().hashCode();
        }
        if (getMessageSequenceNumber() != null) {
            _hashCode += getMessageSequenceNumber().hashCode();
        }
        if (getDataSensitivityAbstract() != null) {
            _hashCode += getDataSensitivityAbstract().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageMetadataAbstractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageMetadataAbstractType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULEXFramework");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXFramework"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULEXImplementation");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementation"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSensitivityAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSensitivityAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
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
