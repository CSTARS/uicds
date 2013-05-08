/**
 * CommunityPedigreeURIType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes details about a Community Pedigree URI.
 * Pedigree number attribute indicates community pedigree order. Digest
 * is assigned pedigree 0,  community recieve pedigree 1, and etc.
 */
public class CommunityPedigreeURIType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.apache.axis.types.URI _value;

    private java.math.BigInteger pedigreeNumber;  // attribute

    public CommunityPedigreeURIType() {
    }

    // Simple Types must have a String constructor
    public CommunityPedigreeURIType(org.apache.axis.types.URI _value) {
        this._value = _value;
    }
    public CommunityPedigreeURIType(java.lang.String _value) {
        try {
            this._value = new org.apache.axis.types.URI(_value);
        }
        catch (org.apache.axis.types.URI.MalformedURIException mue) {
            throw new java.lang.RuntimeException(mue.toString());
       }
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : _value.toString();
    }


    /**
     * Gets the _value value for this CommunityPedigreeURIType.
     * 
     * @return _value
     */
    public org.apache.axis.types.URI get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this CommunityPedigreeURIType.
     * 
     * @param _value
     */
    public void set_value(org.apache.axis.types.URI _value) {
        this._value = _value;
    }


    /**
     * Gets the pedigreeNumber value for this CommunityPedigreeURIType.
     * 
     * @return pedigreeNumber
     */
    public java.math.BigInteger getPedigreeNumber() {
        return pedigreeNumber;
    }


    /**
     * Sets the pedigreeNumber value for this CommunityPedigreeURIType.
     * 
     * @param pedigreeNumber
     */
    public void setPedigreeNumber(java.math.BigInteger pedigreeNumber) {
        this.pedigreeNumber = pedigreeNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommunityPedigreeURIType)) return false;
        CommunityPedigreeURIType other = (CommunityPedigreeURIType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.pedigreeNumber==null && other.getPedigreeNumber()==null) || 
             (this.pedigreeNumber!=null &&
              this.pedigreeNumber.equals(other.getPedigreeNumber())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getPedigreeNumber() != null) {
            _hashCode += getPedigreeNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommunityPedigreeURIType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURIType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pedigreeNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "pedigreeNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
