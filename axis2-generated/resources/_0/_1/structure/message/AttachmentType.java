/**
 * AttachmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that contains binary for the attachment and describes
 * details about attachment. Structure uniquely identifies an attachment
 * by an AttachmentURI and holds an attachment as defined in ulex:AttachmentContentAbstract.
 */
public class AttachmentType  implements java.io.Serializable {
    private org.apache.axis.types.URI attachmentURI;

    private java.lang.Object attachmentContentAbstract;

    private _0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata;

    private java.lang.Object[] attachmentExtensionAbstract;

    public AttachmentType() {
    }

    public AttachmentType(
           org.apache.axis.types.URI attachmentURI,
           java.lang.Object attachmentContentAbstract,
           _0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata,
           java.lang.Object[] attachmentExtensionAbstract) {
           this.attachmentURI = attachmentURI;
           this.attachmentContentAbstract = attachmentContentAbstract;
           this.dataOwnerMetadata = dataOwnerMetadata;
           this.attachmentExtensionAbstract = attachmentExtensionAbstract;
    }


    /**
     * Gets the attachmentURI value for this AttachmentType.
     * 
     * @return attachmentURI
     */
    public org.apache.axis.types.URI getAttachmentURI() {
        return attachmentURI;
    }


    /**
     * Sets the attachmentURI value for this AttachmentType.
     * 
     * @param attachmentURI
     */
    public void setAttachmentURI(org.apache.axis.types.URI attachmentURI) {
        this.attachmentURI = attachmentURI;
    }


    /**
     * Gets the attachmentContentAbstract value for this AttachmentType.
     * 
     * @return attachmentContentAbstract
     */
    public java.lang.Object getAttachmentContentAbstract() {
        return attachmentContentAbstract;
    }


    /**
     * Sets the attachmentContentAbstract value for this AttachmentType.
     * 
     * @param attachmentContentAbstract
     */
    public void setAttachmentContentAbstract(java.lang.Object attachmentContentAbstract) {
        this.attachmentContentAbstract = attachmentContentAbstract;
    }


    /**
     * Gets the dataOwnerMetadata value for this AttachmentType.
     * 
     * @return dataOwnerMetadata
     */
    public _0._1.structure.message.DataOwnerMetadataType getDataOwnerMetadata() {
        return dataOwnerMetadata;
    }


    /**
     * Sets the dataOwnerMetadata value for this AttachmentType.
     * 
     * @param dataOwnerMetadata
     */
    public void setDataOwnerMetadata(_0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata) {
        this.dataOwnerMetadata = dataOwnerMetadata;
    }


    /**
     * Gets the attachmentExtensionAbstract value for this AttachmentType.
     * 
     * @return attachmentExtensionAbstract
     */
    public java.lang.Object[] getAttachmentExtensionAbstract() {
        return attachmentExtensionAbstract;
    }


    /**
     * Sets the attachmentExtensionAbstract value for this AttachmentType.
     * 
     * @param attachmentExtensionAbstract
     */
    public void setAttachmentExtensionAbstract(java.lang.Object[] attachmentExtensionAbstract) {
        this.attachmentExtensionAbstract = attachmentExtensionAbstract;
    }

    public java.lang.Object getAttachmentExtensionAbstract(int i) {
        return this.attachmentExtensionAbstract[i];
    }

    public void setAttachmentExtensionAbstract(int i, java.lang.Object _value) {
        this.attachmentExtensionAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentType)) return false;
        AttachmentType other = (AttachmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachmentURI==null && other.getAttachmentURI()==null) || 
             (this.attachmentURI!=null &&
              this.attachmentURI.equals(other.getAttachmentURI()))) &&
            ((this.attachmentContentAbstract==null && other.getAttachmentContentAbstract()==null) || 
             (this.attachmentContentAbstract!=null &&
              this.attachmentContentAbstract.equals(other.getAttachmentContentAbstract()))) &&
            ((this.dataOwnerMetadata==null && other.getDataOwnerMetadata()==null) || 
             (this.dataOwnerMetadata!=null &&
              this.dataOwnerMetadata.equals(other.getDataOwnerMetadata()))) &&
            ((this.attachmentExtensionAbstract==null && other.getAttachmentExtensionAbstract()==null) || 
             (this.attachmentExtensionAbstract!=null &&
              java.util.Arrays.equals(this.attachmentExtensionAbstract, other.getAttachmentExtensionAbstract())));
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
        if (getAttachmentURI() != null) {
            _hashCode += getAttachmentURI().hashCode();
        }
        if (getAttachmentContentAbstract() != null) {
            _hashCode += getAttachmentContentAbstract().hashCode();
        }
        if (getDataOwnerMetadata() != null) {
            _hashCode += getDataOwnerMetadata().hashCode();
        }
        if (getAttachmentExtensionAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentExtensionAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentExtensionAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(AttachmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentContentAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentContentAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOwnerMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentExtensionAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract"));
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
