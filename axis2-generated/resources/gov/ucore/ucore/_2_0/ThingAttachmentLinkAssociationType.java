/**
 * ThingAttachmentLinkAssociationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * This type provides a linking between any Thing in the Digest, and
 * an AttachmentLink in the same DataItemPackage.
 */
public class ThingAttachmentLinkAssociationType  implements java.io.Serializable {
    private _0._1.library.message.ValidatingReferenceType objectReference;

    private _0._1.library.message.ValidatingReferenceType attachmentLinkReference;

    /* A free text description of the association between a thing
     * and an attachmentLink */
    private gov.ucore.ucore._2_0.StringType descriptor;

    public ThingAttachmentLinkAssociationType() {
    }

    public ThingAttachmentLinkAssociationType(
           _0._1.library.message.ValidatingReferenceType objectReference,
           _0._1.library.message.ValidatingReferenceType attachmentLinkReference,
           gov.ucore.ucore._2_0.StringType descriptor) {
           this.objectReference = objectReference;
           this.attachmentLinkReference = attachmentLinkReference;
           this.descriptor = descriptor;
    }


    /**
     * Gets the objectReference value for this ThingAttachmentLinkAssociationType.
     * 
     * @return objectReference
     */
    public _0._1.library.message.ValidatingReferenceType getObjectReference() {
        return objectReference;
    }


    /**
     * Sets the objectReference value for this ThingAttachmentLinkAssociationType.
     * 
     * @param objectReference
     */
    public void setObjectReference(_0._1.library.message.ValidatingReferenceType objectReference) {
        this.objectReference = objectReference;
    }


    /**
     * Gets the attachmentLinkReference value for this ThingAttachmentLinkAssociationType.
     * 
     * @return attachmentLinkReference
     */
    public _0._1.library.message.ValidatingReferenceType getAttachmentLinkReference() {
        return attachmentLinkReference;
    }


    /**
     * Sets the attachmentLinkReference value for this ThingAttachmentLinkAssociationType.
     * 
     * @param attachmentLinkReference
     */
    public void setAttachmentLinkReference(_0._1.library.message.ValidatingReferenceType attachmentLinkReference) {
        this.attachmentLinkReference = attachmentLinkReference;
    }


    /**
     * Gets the descriptor value for this ThingAttachmentLinkAssociationType.
     * 
     * @return descriptor   * A free text description of the association between a thing
     * and an attachmentLink
     */
    public gov.ucore.ucore._2_0.StringType getDescriptor() {
        return descriptor;
    }


    /**
     * Sets the descriptor value for this ThingAttachmentLinkAssociationType.
     * 
     * @param descriptor   * A free text description of the association between a thing
     * and an attachmentLink
     */
    public void setDescriptor(gov.ucore.ucore._2_0.StringType descriptor) {
        this.descriptor = descriptor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThingAttachmentLinkAssociationType)) return false;
        ThingAttachmentLinkAssociationType other = (ThingAttachmentLinkAssociationType) obj;
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
            ((this.attachmentLinkReference==null && other.getAttachmentLinkReference()==null) || 
             (this.attachmentLinkReference!=null &&
              this.attachmentLinkReference.equals(other.getAttachmentLinkReference()))) &&
            ((this.descriptor==null && other.getDescriptor()==null) || 
             (this.descriptor!=null &&
              this.descriptor.equals(other.getDescriptor())));
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
        if (getAttachmentLinkReference() != null) {
            _hashCode += getAttachmentLinkReference().hashCode();
        }
        if (getDescriptor() != null) {
            _hashCode += getDescriptor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThingAttachmentLinkAssociationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAttachmentLinkAssociationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReference");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "ValidatingReferenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentLinkReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentLinkReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:library:1.0", "ValidatingReferenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Descriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StringType"));
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
