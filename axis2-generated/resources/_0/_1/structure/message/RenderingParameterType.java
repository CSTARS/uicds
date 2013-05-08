/**
 * RenderingParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes rendering parameters for XSLT
 */
public class RenderingParameterType  implements java.io.Serializable {
    private java.lang.String renderingParameterName;

    private java.lang.String renderingParameterValue;

    public RenderingParameterType() {
    }

    public RenderingParameterType(
           java.lang.String renderingParameterName,
           java.lang.String renderingParameterValue) {
           this.renderingParameterName = renderingParameterName;
           this.renderingParameterValue = renderingParameterValue;
    }


    /**
     * Gets the renderingParameterName value for this RenderingParameterType.
     * 
     * @return renderingParameterName
     */
    public java.lang.String getRenderingParameterName() {
        return renderingParameterName;
    }


    /**
     * Sets the renderingParameterName value for this RenderingParameterType.
     * 
     * @param renderingParameterName
     */
    public void setRenderingParameterName(java.lang.String renderingParameterName) {
        this.renderingParameterName = renderingParameterName;
    }


    /**
     * Gets the renderingParameterValue value for this RenderingParameterType.
     * 
     * @return renderingParameterValue
     */
    public java.lang.String getRenderingParameterValue() {
        return renderingParameterValue;
    }


    /**
     * Sets the renderingParameterValue value for this RenderingParameterType.
     * 
     * @param renderingParameterValue
     */
    public void setRenderingParameterValue(java.lang.String renderingParameterValue) {
        this.renderingParameterValue = renderingParameterValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenderingParameterType)) return false;
        RenderingParameterType other = (RenderingParameterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.renderingParameterName==null && other.getRenderingParameterName()==null) || 
             (this.renderingParameterName!=null &&
              this.renderingParameterName.equals(other.getRenderingParameterName()))) &&
            ((this.renderingParameterValue==null && other.getRenderingParameterValue()==null) || 
             (this.renderingParameterValue!=null &&
              this.renderingParameterValue.equals(other.getRenderingParameterValue())));
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
        if (getRenderingParameterName() != null) {
            _hashCode += getRenderingParameterName().hashCode();
        }
        if (getRenderingParameterValue() != null) {
            _hashCode += getRenderingParameterValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenderingParameterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingParameterName");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingParameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterValue"));
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
