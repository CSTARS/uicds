/**
 * ArcByCenterPointType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;

public class ArcByCenterPointType  extends net.opengis.www.gml._3_2.AbstractCurveSegmentType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.DirectPositionType pos;

    private net.opengis.www.gml._3_2.LengthType radius;

    private net.opengis.www.gml._3_2.CurveInterpolationType interpolation;  // attribute

    private java.math.BigInteger numArc;  // attribute

    public ArcByCenterPointType() {
    }

    public ArcByCenterPointType(
           java.math.BigInteger numDerivativesAtStart,
           java.math.BigInteger numDerivativesAtEnd,
           java.math.BigInteger numDerivativeInterior,
           net.opengis.www.gml._3_2.CurveInterpolationType interpolation,
           java.math.BigInteger numArc,
           net.opengis.www.gml._3_2.DirectPositionType pos,
           net.opengis.www.gml._3_2.LengthType radius) {
        super(
            numDerivativesAtStart,
            numDerivativesAtEnd,
            numDerivativeInterior);
        this.interpolation = interpolation;
        this.numArc = numArc;
        this.pos = pos;
        this.radius = radius;
    }


    /**
     * Gets the pos value for this ArcByCenterPointType.
     * 
     * @return pos
     */
    public net.opengis.www.gml._3_2.DirectPositionType getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this ArcByCenterPointType.
     * 
     * @param pos
     */
    public void setPos(net.opengis.www.gml._3_2.DirectPositionType pos) {
        this.pos = pos;
    }


    /**
     * Gets the radius value for this ArcByCenterPointType.
     * 
     * @return radius
     */
    public net.opengis.www.gml._3_2.LengthType getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this ArcByCenterPointType.
     * 
     * @param radius
     */
    public void setRadius(net.opengis.www.gml._3_2.LengthType radius) {
        this.radius = radius;
    }


    /**
     * Gets the interpolation value for this ArcByCenterPointType.
     * 
     * @return interpolation
     */
    public net.opengis.www.gml._3_2.CurveInterpolationType getInterpolation() {
        return interpolation;
    }


    /**
     * Sets the interpolation value for this ArcByCenterPointType.
     * 
     * @param interpolation
     */
    public void setInterpolation(net.opengis.www.gml._3_2.CurveInterpolationType interpolation) {
        this.interpolation = interpolation;
    }


    /**
     * Gets the numArc value for this ArcByCenterPointType.
     * 
     * @return numArc
     */
    public java.math.BigInteger getNumArc() {
        return numArc;
    }


    /**
     * Sets the numArc value for this ArcByCenterPointType.
     * 
     * @param numArc
     */
    public void setNumArc(java.math.BigInteger numArc) {
        this.numArc = numArc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcByCenterPointType)) return false;
        ArcByCenterPointType other = (ArcByCenterPointType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos()))) &&
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius()))) &&
            ((this.interpolation==null && other.getInterpolation()==null) || 
             (this.interpolation!=null &&
              this.interpolation.equals(other.getInterpolation()))) &&
            ((this.numArc==null && other.getNumArc()==null) || 
             (this.numArc!=null &&
              this.numArc.equals(other.getNumArc())));
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
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getInterpolation() != null) {
            _hashCode += getInterpolation().hashCode();
        }
        if (getNumArc() != null) {
            _hashCode += getNumArc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcByCenterPointType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPointType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("interpolation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "interpolation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CurveInterpolationType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numArc");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numArc"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectPositionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LengthType"));
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
