/**
 * WorkProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.structures;

public class WorkProduct  extends _0._1.structure.message.DataItemPackageType  implements java.io.Serializable {
    public WorkProduct() {
    }

    public WorkProduct(
           _0._1.structure.message.PackageMetadataType packageMetadata,
           java.lang.Object digestAbstract,
           _0._1.structure.message.StructuredPayloadType[] structuredPayload,
           _0._1.structure.message.AttachmentLinkType[] attachmentLink,
           _0._1.structure.message.RenderingInstructionsType[] renderingInstructions,
           java.lang.Object narrativeAbstract) {
        super(
            packageMetadata,
            digestAbstract,
            structuredPayload,
            attachmentLink,
            renderingInstructions,
            narrativeAbstract);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkProduct)) return false;
        WorkProduct other = (WorkProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", ">WorkProduct"));
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
