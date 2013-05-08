/**
 * SameAsPayloadAssociationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.library.message;


/**
 * A structure that defines association that identifies objects as
 * the same. Association is used to connect object in digest to object
 * located within payload ( downpoint reference ).
 */
public class SameAsPayloadAssociationType  implements java.io.Serializable {
    private _0._1.library.message.ValidatingReferenceType objectReference;

    private _0._1.library.message.NonValidatingReferenceType payloadObjectReference;

    private _0._1.library.message.ValidatingReferenceType payloadReference;

    public SameAsPayloadAssociationType() {
    }

    public SameAsPayloadAssociationType(
           _0._1.library.message.ValidatingReferenceType objectReference,
           _0._1.library.message.NonValidatingReferenceType payloadObjectReference,
           _0._1.library.message.ValidatingReferenceType payloadReference) {
           this.objectReference = objectReference;
           this.payloadObjectReference = payloadObjectReference;
           this.payloadReference = payloadReference;
    }


    /**
     * Gets the objectReference value for this SameAsPayloadAssociationType.
     * 
     * @return objectReference
     */
    public _0._1.library.message.ValidatingReferenceType getObjectReference() {
        return objectReference;
    }


    /**
     * Sets the objectReference value for this SameAsPayloadAssociationType.
     * 
     * @param objectReference
     */
    public void setObjectReference(_0._1.library.message.ValidatingReferenceType objectReference) {
        this.objectReference = objectReference;
    }


    /**
     * Gets the payloadObjectReference value for this SameAsPayloadAssociationType.
     * 
     * @return payloadObjectReference
     */
    public _0._1.library.message.NonValidatingReferenceType getPayloadObjectReference() {
        return payloadObjectReference;
    }


    /**
     * Sets the payloadObjectReference value for this SameAsPayloadAssociationType.
     * 
     * @param payloadObjectReference
     */
    public void setPayloadObjectReference(_0._1.library.message.NonValidatingReferenceType payloadObjectReference) {
        this.payloadObjectReference = payloadObjectReference;
    }


    /**
     * Gets the payloadReference value for this SameAsPayloadAssociationType.
     * 
     * @return payloadReference
     */
    public _0._1.library.message.ValidatingReferenceType getPayloadReference() {
        return payloadReference;
    }


    /**
     * Sets the payloadReference value for this SameAsPayloadAssociationType.
     * 
     * @param payloadReference
     */
    public void setPayloadReference(_0._1.library.message.ValidatingReferenceType payloadReference) {
        this.payloadReference = payloadReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SameAsPayloadAssociationType)) return false;
        SameAsPayloadAssociationType other = (SameAsPayloadAssociationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectReference==null && other.getObjectReference()==null) || 
             (this.objectReference!=null &&
              this.objectReference.equals(other.getObjectReference()))) &&
            ((this.payloadObjectReference==null && other.getPayloadObjectReference()==null) || 
             (this.payloadObjectReference!=null &&
              this.payloadObjectReference.equals(other.getPayloadObjectReference()))) &&
            ((this.payloadReference==null && other.getPayloadReference()==null) || 
             (this.payloadReference!=null &&
              this.payloadReference.equals(other.getPayloadReference())));
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
        if (getObjectReference() != null) {
            _hashCode += getObjectReference().hashCode();
        }
        if (getPayloadObjectReference() != null) {
            _hashCode += getPayloadObjectReference().hashCode();
        }
        if (getPayloadReference() != null) {
            _hashCode += getPayloadReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SameAsPayloadAssociationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReference");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "ValidatingReferenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payloadObjectReference");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadObjectReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "NonValidatingReferenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payloadReference");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "ValidatingReferenceType"));
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
