/**
 * RenderingInstructionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes rendering instructions for ULEX Data
 * Item Package.
 */
public class RenderingInstructionsType  implements java.io.Serializable {
    private _0._1.codes.message.RenderingMethodCodeSimpleType renderingMethod;

    private org.apache.axis.types.URI attachmentURI;

    private _0._1.structure.message.RenderingParameterType[] renderingParameter;

    private java.lang.String renderingDescription;

    public RenderingInstructionsType() {
    }

    public RenderingInstructionsType(
           _0._1.codes.message.RenderingMethodCodeSimpleType renderingMethod,
           org.apache.axis.types.URI attachmentURI,
           _0._1.structure.message.RenderingParameterType[] renderingParameter,
           java.lang.String renderingDescription) {
           this.renderingMethod = renderingMethod;
           this.attachmentURI = attachmentURI;
           this.renderingParameter = renderingParameter;
           this.renderingDescription = renderingDescription;
    }


    /**
     * Gets the renderingMethod value for this RenderingInstructionsType.
     * 
     * @return renderingMethod
     */
    public _0._1.codes.message.RenderingMethodCodeSimpleType getRenderingMethod() {
        return renderingMethod;
    }


    /**
     * Sets the renderingMethod value for this RenderingInstructionsType.
     * 
     * @param renderingMethod
     */
    public void setRenderingMethod(_0._1.codes.message.RenderingMethodCodeSimpleType renderingMethod) {
        this.renderingMethod = renderingMethod;
    }


    /**
     * Gets the attachmentURI value for this RenderingInstructionsType.
     * 
     * @return attachmentURI
     */
    public org.apache.axis.types.URI getAttachmentURI() {
        return attachmentURI;
    }


    /**
     * Sets the attachmentURI value for this RenderingInstructionsType.
     * 
     * @param attachmentURI
     */
    public void setAttachmentURI(org.apache.axis.types.URI attachmentURI) {
        this.attachmentURI = attachmentURI;
    }


    /**
     * Gets the renderingParameter value for this RenderingInstructionsType.
     * 
     * @return renderingParameter
     */
    public _0._1.structure.message.RenderingParameterType[] getRenderingParameter() {
        return renderingParameter;
    }


    /**
     * Sets the renderingParameter value for this RenderingInstructionsType.
     * 
     * @param renderingParameter
     */
    public void setRenderingParameter(_0._1.structure.message.RenderingParameterType[] renderingParameter) {
        this.renderingParameter = renderingParameter;
    }

    public _0._1.structure.message.RenderingParameterType getRenderingParameter(int i) {
        return this.renderingParameter[i];
    }

    public void setRenderingParameter(int i, _0._1.structure.message.RenderingParameterType _value) {
        this.renderingParameter[i] = _value;
    }


    /**
     * Gets the renderingDescription value for this RenderingInstructionsType.
     * 
     * @return renderingDescription
     */
    public java.lang.String getRenderingDescription() {
        return renderingDescription;
    }


    /**
     * Sets the renderingDescription value for this RenderingInstructionsType.
     * 
     * @param renderingDescription
     */
    public void setRenderingDescription(java.lang.String renderingDescription) {
        this.renderingDescription = renderingDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenderingInstructionsType)) return false;
        RenderingInstructionsType other = (RenderingInstructionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.renderingMethod==null && other.getRenderingMethod()==null) || 
             (this.renderingMethod!=null &&
              this.renderingMethod.equals(other.getRenderingMethod()))) &&
            ((this.attachmentURI==null && other.getAttachmentURI()==null) || 
             (this.attachmentURI!=null &&
              this.attachmentURI.equals(other.getAttachmentURI()))) &&
            ((this.renderingParameter==null && other.getRenderingParameter()==null) || 
             (this.renderingParameter!=null &&
              java.util.Arrays.equals(this.renderingParameter, other.getRenderingParameter()))) &&
            ((this.renderingDescription==null && other.getRenderingDescription()==null) || 
             (this.renderingDescription!=null &&
              this.renderingDescription.equals(other.getRenderingDescription())));
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
        if (getRenderingMethod() != null) {
            _hashCode += getRenderingMethod().hashCode();
        }
        if (getAttachmentURI() != null) {
            _hashCode += getAttachmentURI().hashCode();
        }
        if (getRenderingParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRenderingParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRenderingParameter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRenderingDescription() != null) {
            _hashCode += getRenderingDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenderingInstructionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:codes:1.0", "RenderingMethodCodeSimpleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
