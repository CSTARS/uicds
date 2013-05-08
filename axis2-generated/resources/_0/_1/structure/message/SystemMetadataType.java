/**
 * SystemMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes metadata about an organization and a
 * system where date originated, was submitted from, or is being sent.
 */
public class SystemMetadataType  implements java.io.Serializable {
    private java.lang.Object systemIdentifierAbstract;

    private java.lang.Object systemContactAbstract;

    private java.lang.Object[] systemMetadataExtensionAbstract;

    public SystemMetadataType() {
    }

    public SystemMetadataType(
           java.lang.Object systemIdentifierAbstract,
           java.lang.Object systemContactAbstract,
           java.lang.Object[] systemMetadataExtensionAbstract) {
           this.systemIdentifierAbstract = systemIdentifierAbstract;
           this.systemContactAbstract = systemContactAbstract;
           this.systemMetadataExtensionAbstract = systemMetadataExtensionAbstract;
    }


    /**
     * Gets the systemIdentifierAbstract value for this SystemMetadataType.
     * 
     * @return systemIdentifierAbstract
     */
    public java.lang.Object getSystemIdentifierAbstract() {
        return systemIdentifierAbstract;
    }


    /**
     * Sets the systemIdentifierAbstract value for this SystemMetadataType.
     * 
     * @param systemIdentifierAbstract
     */
    public void setSystemIdentifierAbstract(java.lang.Object systemIdentifierAbstract) {
        this.systemIdentifierAbstract = systemIdentifierAbstract;
    }


    /**
     * Gets the systemContactAbstract value for this SystemMetadataType.
     * 
     * @return systemContactAbstract
     */
    public java.lang.Object getSystemContactAbstract() {
        return systemContactAbstract;
    }


    /**
     * Sets the systemContactAbstract value for this SystemMetadataType.
     * 
     * @param systemContactAbstract
     */
    public void setSystemContactAbstract(java.lang.Object systemContactAbstract) {
        this.systemContactAbstract = systemContactAbstract;
    }


    /**
     * Gets the systemMetadataExtensionAbstract value for this SystemMetadataType.
     * 
     * @return systemMetadataExtensionAbstract
     */
    public java.lang.Object[] getSystemMetadataExtensionAbstract() {
        return systemMetadataExtensionAbstract;
    }


    /**
     * Sets the systemMetadataExtensionAbstract value for this SystemMetadataType.
     * 
     * @param systemMetadataExtensionAbstract
     */
    public void setSystemMetadataExtensionAbstract(java.lang.Object[] systemMetadataExtensionAbstract) {
        this.systemMetadataExtensionAbstract = systemMetadataExtensionAbstract;
    }

    public java.lang.Object getSystemMetadataExtensionAbstract(int i) {
        return this.systemMetadataExtensionAbstract[i];
    }

    public void setSystemMetadataExtensionAbstract(int i, java.lang.Object _value) {
        this.systemMetadataExtensionAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemMetadataType)) return false;
        SystemMetadataType other = (SystemMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.systemIdentifierAbstract==null && other.getSystemIdentifierAbstract()==null) || 
             (this.systemIdentifierAbstract!=null &&
              this.systemIdentifierAbstract.equals(other.getSystemIdentifierAbstract()))) &&
            ((this.systemContactAbstract==null && other.getSystemContactAbstract()==null) || 
             (this.systemContactAbstract!=null &&
              this.systemContactAbstract.equals(other.getSystemContactAbstract()))) &&
            ((this.systemMetadataExtensionAbstract==null && other.getSystemMetadataExtensionAbstract()==null) || 
             (this.systemMetadataExtensionAbstract!=null &&
              java.util.Arrays.equals(this.systemMetadataExtensionAbstract, other.getSystemMetadataExtensionAbstract())));
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
        if (getSystemIdentifierAbstract() != null) {
            _hashCode += getSystemIdentifierAbstract().hashCode();
        }
        if (getSystemContactAbstract() != null) {
            _hashCode += getSystemContactAbstract().hashCode();
        }
        if (getSystemMetadataExtensionAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSystemMetadataExtensionAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSystemMetadataExtensionAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(SystemMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemIdentifierAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemIdentifierAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemContactAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemContactAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemMetadataExtensionAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract"));
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
