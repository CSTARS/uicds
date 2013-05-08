/**
 * DataOwnerMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes an organization that owns data.
 */
public class DataOwnerMetadataType  implements java.io.Serializable {
    private java.lang.Object dataOwnerIdentifierAbstract;

    private java.lang.Object dataOwnerContactAbstract;

    private java.lang.Object[] dataOwnerMetadataExtensionAbstract;

    public DataOwnerMetadataType() {
    }

    public DataOwnerMetadataType(
           java.lang.Object dataOwnerIdentifierAbstract,
           java.lang.Object dataOwnerContactAbstract,
           java.lang.Object[] dataOwnerMetadataExtensionAbstract) {
           this.dataOwnerIdentifierAbstract = dataOwnerIdentifierAbstract;
           this.dataOwnerContactAbstract = dataOwnerContactAbstract;
           this.dataOwnerMetadataExtensionAbstract = dataOwnerMetadataExtensionAbstract;
    }


    /**
     * Gets the dataOwnerIdentifierAbstract value for this DataOwnerMetadataType.
     * 
     * @return dataOwnerIdentifierAbstract
     */
    public java.lang.Object getDataOwnerIdentifierAbstract() {
        return dataOwnerIdentifierAbstract;
    }


    /**
     * Sets the dataOwnerIdentifierAbstract value for this DataOwnerMetadataType.
     * 
     * @param dataOwnerIdentifierAbstract
     */
    public void setDataOwnerIdentifierAbstract(java.lang.Object dataOwnerIdentifierAbstract) {
        this.dataOwnerIdentifierAbstract = dataOwnerIdentifierAbstract;
    }


    /**
     * Gets the dataOwnerContactAbstract value for this DataOwnerMetadataType.
     * 
     * @return dataOwnerContactAbstract
     */
    public java.lang.Object getDataOwnerContactAbstract() {
        return dataOwnerContactAbstract;
    }


    /**
     * Sets the dataOwnerContactAbstract value for this DataOwnerMetadataType.
     * 
     * @param dataOwnerContactAbstract
     */
    public void setDataOwnerContactAbstract(java.lang.Object dataOwnerContactAbstract) {
        this.dataOwnerContactAbstract = dataOwnerContactAbstract;
    }


    /**
     * Gets the dataOwnerMetadataExtensionAbstract value for this DataOwnerMetadataType.
     * 
     * @return dataOwnerMetadataExtensionAbstract
     */
    public java.lang.Object[] getDataOwnerMetadataExtensionAbstract() {
        return dataOwnerMetadataExtensionAbstract;
    }


    /**
     * Sets the dataOwnerMetadataExtensionAbstract value for this DataOwnerMetadataType.
     * 
     * @param dataOwnerMetadataExtensionAbstract
     */
    public void setDataOwnerMetadataExtensionAbstract(java.lang.Object[] dataOwnerMetadataExtensionAbstract) {
        this.dataOwnerMetadataExtensionAbstract = dataOwnerMetadataExtensionAbstract;
    }

    public java.lang.Object getDataOwnerMetadataExtensionAbstract(int i) {
        return this.dataOwnerMetadataExtensionAbstract[i];
    }

    public void setDataOwnerMetadataExtensionAbstract(int i, java.lang.Object _value) {
        this.dataOwnerMetadataExtensionAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataOwnerMetadataType)) return false;
        DataOwnerMetadataType other = (DataOwnerMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataOwnerIdentifierAbstract==null && other.getDataOwnerIdentifierAbstract()==null) || 
             (this.dataOwnerIdentifierAbstract!=null &&
              this.dataOwnerIdentifierAbstract.equals(other.getDataOwnerIdentifierAbstract()))) &&
            ((this.dataOwnerContactAbstract==null && other.getDataOwnerContactAbstract()==null) || 
             (this.dataOwnerContactAbstract!=null &&
              this.dataOwnerContactAbstract.equals(other.getDataOwnerContactAbstract()))) &&
            ((this.dataOwnerMetadataExtensionAbstract==null && other.getDataOwnerMetadataExtensionAbstract()==null) || 
             (this.dataOwnerMetadataExtensionAbstract!=null &&
              java.util.Arrays.equals(this.dataOwnerMetadataExtensionAbstract, other.getDataOwnerMetadataExtensionAbstract())));
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
        if (getDataOwnerIdentifierAbstract() != null) {
            _hashCode += getDataOwnerIdentifierAbstract().hashCode();
        }
        if (getDataOwnerContactAbstract() != null) {
            _hashCode += getDataOwnerContactAbstract().hashCode();
        }
        if (getDataOwnerMetadataExtensionAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataOwnerMetadataExtensionAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataOwnerMetadataExtensionAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(DataOwnerMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOwnerIdentifierAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerIdentifierAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOwnerContactAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerContactAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOwnerMetadataExtensionAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract"));
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
