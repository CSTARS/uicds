/**
 * FacilityIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class FacilityIdentifierType  implements java.io.Serializable {
    private java.lang.String beNumber;  // attribute

    private java.lang.String osuffix;  // attribute

    public FacilityIdentifierType() {
    }

    public FacilityIdentifierType(
           java.lang.String beNumber,
           java.lang.String osuffix) {
           this.beNumber = beNumber;
           this.osuffix = osuffix;
    }


    /**
     * Gets the beNumber value for this FacilityIdentifierType.
     * 
     * @return beNumber
     */
    public java.lang.String getBeNumber() {
        return beNumber;
    }


    /**
     * Sets the beNumber value for this FacilityIdentifierType.
     * 
     * @param beNumber
     */
    public void setBeNumber(java.lang.String beNumber) {
        this.beNumber = beNumber;
    }


    /**
     * Gets the osuffix value for this FacilityIdentifierType.
     * 
     * @return osuffix
     */
    public java.lang.String getOsuffix() {
        return osuffix;
    }


    /**
     * Sets the osuffix value for this FacilityIdentifierType.
     * 
     * @param osuffix
     */
    public void setOsuffix(java.lang.String osuffix) {
        this.osuffix = osuffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacilityIdentifierType)) return false;
        FacilityIdentifierType other = (FacilityIdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beNumber==null && other.getBeNumber()==null) || 
             (this.beNumber!=null &&
              this.beNumber.equals(other.getBeNumber()))) &&
            ((this.osuffix==null && other.getOsuffix()==null) || 
             (this.osuffix!=null &&
              this.osuffix.equals(other.getOsuffix())));
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
        if (getBeNumber() != null) {
            _hashCode += getBeNumber().hashCode();
        }
        if (getOsuffix() != null) {
            _hashCode += getOsuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacilityIdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "FacilityIdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "beNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("osuffix");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "osuffix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
