/**
 * AttachmentLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes details about Link to the Attachment
 * and uniquely identifies the attachment.
 */
public class AttachmentLinkType  implements java.io.Serializable {
    private org.apache.axis.types.URI attachmentURI;

    private boolean attachmentViewableIndicator;

    private java.lang.String attachmentDescriptionText;

    private org.apache.axis.types.Id id;  // attribute

    public AttachmentLinkType() {
    }

    public AttachmentLinkType(
           org.apache.axis.types.URI attachmentURI,
           boolean attachmentViewableIndicator,
           java.lang.String attachmentDescriptionText,
           org.apache.axis.types.Id id) {
           this.attachmentURI = attachmentURI;
           this.attachmentViewableIndicator = attachmentViewableIndicator;
           this.attachmentDescriptionText = attachmentDescriptionText;
           this.id = id;
    }


    /**
     * Gets the attachmentURI value for this AttachmentLinkType.
     * 
     * @return attachmentURI
     */
    public org.apache.axis.types.URI getAttachmentURI() {
        return attachmentURI;
    }


    /**
     * Sets the attachmentURI value for this AttachmentLinkType.
     * 
     * @param attachmentURI
     */
    public void setAttachmentURI(org.apache.axis.types.URI attachmentURI) {
        this.attachmentURI = attachmentURI;
    }


    /**
     * Gets the attachmentViewableIndicator value for this AttachmentLinkType.
     * 
     * @return attachmentViewableIndicator
     */
    public boolean isAttachmentViewableIndicator() {
        return attachmentViewableIndicator;
    }


    /**
     * Sets the attachmentViewableIndicator value for this AttachmentLinkType.
     * 
     * @param attachmentViewableIndicator
     */
    public void setAttachmentViewableIndicator(boolean attachmentViewableIndicator) {
        this.attachmentViewableIndicator = attachmentViewableIndicator;
    }


    /**
     * Gets the attachmentDescriptionText value for this AttachmentLinkType.
     * 
     * @return attachmentDescriptionText
     */
    public java.lang.String getAttachmentDescriptionText() {
        return attachmentDescriptionText;
    }


    /**
     * Sets the attachmentDescriptionText value for this AttachmentLinkType.
     * 
     * @param attachmentDescriptionText
     */
    public void setAttachmentDescriptionText(java.lang.String attachmentDescriptionText) {
        this.attachmentDescriptionText = attachmentDescriptionText;
    }


    /**
     * Gets the id value for this AttachmentLinkType.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this AttachmentLinkType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentLinkType)) return false;
        AttachmentLinkType other = (AttachmentLinkType) obj;
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
            this.attachmentViewableIndicator == other.isAttachmentViewableIndicator() &&
            ((this.attachmentDescriptionText==null && other.getAttachmentDescriptionText()==null) || 
             (this.attachmentDescriptionText!=null &&
              this.attachmentDescriptionText.equals(other.getAttachmentDescriptionText()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        _hashCode += (isAttachmentViewableIndicator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAttachmentDescriptionText() != null) {
            _hashCode += getAttachmentDescriptionText().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachmentLinkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLinkType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("ulex:message:library:1.0", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentViewableIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentViewableIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentDescriptionText");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDescriptionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
