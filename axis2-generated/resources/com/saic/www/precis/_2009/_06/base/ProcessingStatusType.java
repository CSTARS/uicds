/**
 * ProcessingStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.base;

public class ProcessingStatusType  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.ProcessingStateType status;

    private com.saic.www.precis._2009._06.base.IdentifierType ACT;

    private com.saic.www.precis._2009._06.base.UserMessageType message;

    public ProcessingStatusType() {
    }

    public ProcessingStatusType(
           com.saic.www.precis._2009._06.base.ProcessingStateType status,
           com.saic.www.precis._2009._06.base.IdentifierType ACT,
           com.saic.www.precis._2009._06.base.UserMessageType message) {
           this.status = status;
           this.ACT = ACT;
           this.message = message;
    }


    /**
     * Gets the status value for this ProcessingStatusType.
     * 
     * @return status
     */
    public com.saic.www.precis._2009._06.base.ProcessingStateType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessingStatusType.
     * 
     * @param status
     */
    public void setStatus(com.saic.www.precis._2009._06.base.ProcessingStateType status) {
        this.status = status;
    }


    /**
     * Gets the ACT value for this ProcessingStatusType.
     * 
     * @return ACT
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getACT() {
        return ACT;
    }


    /**
     * Sets the ACT value for this ProcessingStatusType.
     * 
     * @param ACT
     */
    public void setACT(com.saic.www.precis._2009._06.base.IdentifierType ACT) {
        this.ACT = ACT;
    }


    /**
     * Gets the message value for this ProcessingStatusType.
     * 
     * @return message
     */
    public com.saic.www.precis._2009._06.base.UserMessageType getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProcessingStatusType.
     * 
     * @param message
     */
    public void setMessage(com.saic.www.precis._2009._06.base.UserMessageType message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessingStatusType)) return false;
        ProcessingStatusType other = (ProcessingStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ACT==null && other.getACT()==null) || 
             (this.ACT!=null &&
              this.ACT.equals(other.getACT()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getACT() != null) {
            _hashCode += getACT().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessingStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ProcessingStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ProcessingStateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "UserMessageType"));
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
