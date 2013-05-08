/**
 * RightsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class RightsType  implements java.io.Serializable {
    private boolean privacyAct;  // attribute

    private boolean intellectualProperty;  // attribute

    private boolean copyright;  // attribute

    public RightsType() {
    }

    public RightsType(
           boolean privacyAct,
           boolean intellectualProperty,
           boolean copyright) {
           this.privacyAct = privacyAct;
           this.intellectualProperty = intellectualProperty;
           this.copyright = copyright;
    }


    /**
     * Gets the privacyAct value for this RightsType.
     * 
     * @return privacyAct
     */
    public boolean isPrivacyAct() {
        return privacyAct;
    }


    /**
     * Sets the privacyAct value for this RightsType.
     * 
     * @param privacyAct
     */
    public void setPrivacyAct(boolean privacyAct) {
        this.privacyAct = privacyAct;
    }


    /**
     * Gets the intellectualProperty value for this RightsType.
     * 
     * @return intellectualProperty
     */
    public boolean isIntellectualProperty() {
        return intellectualProperty;
    }


    /**
     * Sets the intellectualProperty value for this RightsType.
     * 
     * @param intellectualProperty
     */
    public void setIntellectualProperty(boolean intellectualProperty) {
        this.intellectualProperty = intellectualProperty;
    }


    /**
     * Gets the copyright value for this RightsType.
     * 
     * @return copyright
     */
    public boolean isCopyright() {
        return copyright;
    }


    /**
     * Sets the copyright value for this RightsType.
     * 
     * @param copyright
     */
    public void setCopyright(boolean copyright) {
        this.copyright = copyright;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RightsType)) return false;
        RightsType other = (RightsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.privacyAct == other.isPrivacyAct() &&
            this.intellectualProperty == other.isIntellectualProperty() &&
            this.copyright == other.isCopyright();
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
        _hashCode += (isPrivacyAct() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIntellectualProperty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCopyright() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RightsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "RightsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("privacyAct");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "privacyAct"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("intellectualProperty");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "intellectualProperty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("copyright");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "copyright"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
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
