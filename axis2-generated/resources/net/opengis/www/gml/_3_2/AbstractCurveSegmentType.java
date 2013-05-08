/**
 * AbstractCurveSegmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;

public abstract class AbstractCurveSegmentType  implements java.io.Serializable {
    private java.math.BigInteger numDerivativesAtStart;  // attribute

    private java.math.BigInteger numDerivativesAtEnd;  // attribute

    private java.math.BigInteger numDerivativeInterior;  // attribute

    public AbstractCurveSegmentType() {
    }

    public AbstractCurveSegmentType(
           java.math.BigInteger numDerivativesAtStart,
           java.math.BigInteger numDerivativesAtEnd,
           java.math.BigInteger numDerivativeInterior) {
           this.numDerivativesAtStart = numDerivativesAtStart;
           this.numDerivativesAtEnd = numDerivativesAtEnd;
           this.numDerivativeInterior = numDerivativeInterior;
    }


    /**
     * Gets the numDerivativesAtStart value for this AbstractCurveSegmentType.
     * 
     * @return numDerivativesAtStart
     */
    public java.math.BigInteger getNumDerivativesAtStart() {
        return numDerivativesAtStart;
    }


    /**
     * Sets the numDerivativesAtStart value for this AbstractCurveSegmentType.
     * 
     * @param numDerivativesAtStart
     */
    public void setNumDerivativesAtStart(java.math.BigInteger numDerivativesAtStart) {
        this.numDerivativesAtStart = numDerivativesAtStart;
    }


    /**
     * Gets the numDerivativesAtEnd value for this AbstractCurveSegmentType.
     * 
     * @return numDerivativesAtEnd
     */
    public java.math.BigInteger getNumDerivativesAtEnd() {
        return numDerivativesAtEnd;
    }


    /**
     * Sets the numDerivativesAtEnd value for this AbstractCurveSegmentType.
     * 
     * @param numDerivativesAtEnd
     */
    public void setNumDerivativesAtEnd(java.math.BigInteger numDerivativesAtEnd) {
        this.numDerivativesAtEnd = numDerivativesAtEnd;
    }


    /**
     * Gets the numDerivativeInterior value for this AbstractCurveSegmentType.
     * 
     * @return numDerivativeInterior
     */
    public java.math.BigInteger getNumDerivativeInterior() {
        return numDerivativeInterior;
    }


    /**
     * Sets the numDerivativeInterior value for this AbstractCurveSegmentType.
     * 
     * @param numDerivativeInterior
     */
    public void setNumDerivativeInterior(java.math.BigInteger numDerivativeInterior) {
        this.numDerivativeInterior = numDerivativeInterior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractCurveSegmentType)) return false;
        AbstractCurveSegmentType other = (AbstractCurveSegmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numDerivativesAtStart==null && other.getNumDerivativesAtStart()==null) || 
             (this.numDerivativesAtStart!=null &&
              this.numDerivativesAtStart.equals(other.getNumDerivativesAtStart()))) &&
            ((this.numDerivativesAtEnd==null && other.getNumDerivativesAtEnd()==null) || 
             (this.numDerivativesAtEnd!=null &&
              this.numDerivativesAtEnd.equals(other.getNumDerivativesAtEnd()))) &&
            ((this.numDerivativeInterior==null && other.getNumDerivativeInterior()==null) || 
             (this.numDerivativeInterior!=null &&
              this.numDerivativeInterior.equals(other.getNumDerivativeInterior())));
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
        if (getNumDerivativesAtStart() != null) {
            _hashCode += getNumDerivativesAtStart().hashCode();
        }
        if (getNumDerivativesAtEnd() != null) {
            _hashCode += getNumDerivativesAtEnd().hashCode();
        }
        if (getNumDerivativeInterior() != null) {
            _hashCode += getNumDerivativeInterior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractCurveSegmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegmentType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numDerivativesAtStart");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numDerivativesAtStart"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numDerivativesAtEnd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numDerivativesAtEnd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numDerivativeInterior");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numDerivativeInterior"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
