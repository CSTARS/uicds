/**
 * PackageAbstractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * An abstract structure that describes structure of the ULEX Package.
 * Abstract Package is a base type for PD and SR data exchange. Logical
 * group of data normally viewed as a whole, such as a report.  Also
 * referred to as a data item. This structure includes elements that
 * are common for PD and SR exchanges.
 */
public abstract class PackageAbstractType  implements java.io.Serializable {
    private _0._1.structure.message.PackageMetadataType packageMetadata;

    private java.lang.Object digestAbstract;

    private _0._1.structure.message.StructuredPayloadType[] structuredPayload;

    private _0._1.structure.message.AttachmentLinkType[] attachmentLink;

    public PackageAbstractType() {
    }

    public PackageAbstractType(
           _0._1.structure.message.PackageMetadataType packageMetadata,
           java.lang.Object digestAbstract,
           _0._1.structure.message.StructuredPayloadType[] structuredPayload,
           _0._1.structure.message.AttachmentLinkType[] attachmentLink) {
           this.packageMetadata = packageMetadata;
           this.digestAbstract = digestAbstract;
           this.structuredPayload = structuredPayload;
           this.attachmentLink = attachmentLink;
    }


    /**
     * Gets the packageMetadata value for this PackageAbstractType.
     * 
     * @return packageMetadata
     */
    public _0._1.structure.message.PackageMetadataType getPackageMetadata() {
        return packageMetadata;
    }


    /**
     * Sets the packageMetadata value for this PackageAbstractType.
     * 
     * @param packageMetadata
     */
    public void setPackageMetadata(_0._1.structure.message.PackageMetadataType packageMetadata) {
        this.packageMetadata = packageMetadata;
    }


    /**
     * Gets the digestAbstract value for this PackageAbstractType.
     * 
     * @return digestAbstract
     */
    public java.lang.Object getDigestAbstract() {
        return digestAbstract;
    }


    /**
     * Sets the digestAbstract value for this PackageAbstractType.
     * 
     * @param digestAbstract
     */
    public void setDigestAbstract(java.lang.Object digestAbstract) {
        this.digestAbstract = digestAbstract;
    }


    /**
     * Gets the structuredPayload value for this PackageAbstractType.
     * 
     * @return structuredPayload
     */
    public _0._1.structure.message.StructuredPayloadType[] getStructuredPayload() {
        return structuredPayload;
    }


    /**
     * Sets the structuredPayload value for this PackageAbstractType.
     * 
     * @param structuredPayload
     */
    public void setStructuredPayload(_0._1.structure.message.StructuredPayloadType[] structuredPayload) {
        this.structuredPayload = structuredPayload;
    }

    public _0._1.structure.message.StructuredPayloadType getStructuredPayload(int i) {
        return this.structuredPayload[i];
    }

    public void setStructuredPayload(int i, _0._1.structure.message.StructuredPayloadType _value) {
        this.structuredPayload[i] = _value;
    }


    /**
     * Gets the attachmentLink value for this PackageAbstractType.
     * 
     * @return attachmentLink
     */
    public _0._1.structure.message.AttachmentLinkType[] getAttachmentLink() {
        return attachmentLink;
    }


    /**
     * Sets the attachmentLink value for this PackageAbstractType.
     * 
     * @param attachmentLink
     */
    public void setAttachmentLink(_0._1.structure.message.AttachmentLinkType[] attachmentLink) {
        this.attachmentLink = attachmentLink;
    }

    public _0._1.structure.message.AttachmentLinkType getAttachmentLink(int i) {
        return this.attachmentLink[i];
    }

    public void setAttachmentLink(int i, _0._1.structure.message.AttachmentLinkType _value) {
        this.attachmentLink[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageAbstractType)) return false;
        PackageAbstractType other = (PackageAbstractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageMetadata==null && other.getPackageMetadata()==null) || 
             (this.packageMetadata!=null &&
              this.packageMetadata.equals(other.getPackageMetadata()))) &&
            ((this.digestAbstract==null && other.getDigestAbstract()==null) || 
             (this.digestAbstract!=null &&
              this.digestAbstract.equals(other.getDigestAbstract()))) &&
            ((this.structuredPayload==null && other.getStructuredPayload()==null) || 
             (this.structuredPayload!=null &&
              java.util.Arrays.equals(this.structuredPayload, other.getStructuredPayload()))) &&
            ((this.attachmentLink==null && other.getAttachmentLink()==null) || 
             (this.attachmentLink!=null &&
              java.util.Arrays.equals(this.attachmentLink, other.getAttachmentLink())));
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
        if (getPackageMetadata() != null) {
            _hashCode += getPackageMetadata().hashCode();
        }
        if (getDigestAbstract() != null) {
            _hashCode += getDigestAbstract().hashCode();
        }
        if (getStructuredPayload() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStructuredPayload());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStructuredPayload(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentLink(), i);
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
        new org.apache.axis.description.TypeDesc(PackageAbstractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageAbstractType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DigestAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structuredPayload");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayload"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayload"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentLink");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLink"));
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
