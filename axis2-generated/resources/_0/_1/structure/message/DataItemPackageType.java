/**
 * DataItemPackageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that provides packaging for a single Data Item. DataItemPackage
 * is contained in a PublishMessage as part of a doPublish request, and
 * in a DataItemResponseMessage as part of a getDataItemResponse.
 */
public class DataItemPackageType  extends _0._1.structure.message.PackageAbstractType  implements java.io.Serializable {
    private _0._1.structure.message.RenderingInstructionsType[] renderingInstructions;

    private java.lang.Object narrativeAbstract;

    public DataItemPackageType() {
    }

    public DataItemPackageType(
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
            attachmentLink);
        this.renderingInstructions = renderingInstructions;
        this.narrativeAbstract = narrativeAbstract;
    }


    /**
     * Gets the renderingInstructions value for this DataItemPackageType.
     * 
     * @return renderingInstructions
     */
    public _0._1.structure.message.RenderingInstructionsType[] getRenderingInstructions() {
        return renderingInstructions;
    }


    /**
     * Sets the renderingInstructions value for this DataItemPackageType.
     * 
     * @param renderingInstructions
     */
    public void setRenderingInstructions(_0._1.structure.message.RenderingInstructionsType[] renderingInstructions) {
        this.renderingInstructions = renderingInstructions;
    }

    public _0._1.structure.message.RenderingInstructionsType getRenderingInstructions(int i) {
        return this.renderingInstructions[i];
    }

    public void setRenderingInstructions(int i, _0._1.structure.message.RenderingInstructionsType _value) {
        this.renderingInstructions[i] = _value;
    }


    /**
     * Gets the narrativeAbstract value for this DataItemPackageType.
     * 
     * @return narrativeAbstract
     */
    public java.lang.Object getNarrativeAbstract() {
        return narrativeAbstract;
    }


    /**
     * Sets the narrativeAbstract value for this DataItemPackageType.
     * 
     * @param narrativeAbstract
     */
    public void setNarrativeAbstract(java.lang.Object narrativeAbstract) {
        this.narrativeAbstract = narrativeAbstract;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataItemPackageType)) return false;
        DataItemPackageType other = (DataItemPackageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.renderingInstructions==null && other.getRenderingInstructions()==null) || 
             (this.renderingInstructions!=null &&
              java.util.Arrays.equals(this.renderingInstructions, other.getRenderingInstructions()))) &&
            ((this.narrativeAbstract==null && other.getNarrativeAbstract()==null) || 
             (this.narrativeAbstract!=null &&
              this.narrativeAbstract.equals(other.getNarrativeAbstract())));
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
        if (getRenderingInstructions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRenderingInstructions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRenderingInstructions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNarrativeAbstract() != null) {
            _hashCode += getNarrativeAbstract().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataItemPackageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPackageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("narrativeAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "NarrativeAbstract"));
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
