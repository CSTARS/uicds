/**
 * CurveInterpolationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;

public class CurveInterpolationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CurveInterpolationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _linear = "linear";
    public static final java.lang.String _geodesic = "geodesic";
    public static final java.lang.String _circularArc3Points = "circularArc3Points";
    public static final java.lang.String _circularArc2PointWithBulge = "circularArc2PointWithBulge";
    public static final java.lang.String _circularArcCenterPointWithRadius = "circularArcCenterPointWithRadius";
    public static final java.lang.String _elliptical = "elliptical";
    public static final java.lang.String _clothoid = "clothoid";
    public static final java.lang.String _conic = "conic";
    public static final java.lang.String _polynomialSpline = "polynomialSpline";
    public static final java.lang.String _cubicSpline = "cubicSpline";
    public static final java.lang.String _rationalSpline = "rationalSpline";
    public static final CurveInterpolationType linear = new CurveInterpolationType(_linear);
    public static final CurveInterpolationType geodesic = new CurveInterpolationType(_geodesic);
    public static final CurveInterpolationType circularArc3Points = new CurveInterpolationType(_circularArc3Points);
    public static final CurveInterpolationType circularArc2PointWithBulge = new CurveInterpolationType(_circularArc2PointWithBulge);
    public static final CurveInterpolationType circularArcCenterPointWithRadius = new CurveInterpolationType(_circularArcCenterPointWithRadius);
    public static final CurveInterpolationType elliptical = new CurveInterpolationType(_elliptical);
    public static final CurveInterpolationType clothoid = new CurveInterpolationType(_clothoid);
    public static final CurveInterpolationType conic = new CurveInterpolationType(_conic);
    public static final CurveInterpolationType polynomialSpline = new CurveInterpolationType(_polynomialSpline);
    public static final CurveInterpolationType cubicSpline = new CurveInterpolationType(_cubicSpline);
    public static final CurveInterpolationType rationalSpline = new CurveInterpolationType(_rationalSpline);
    public java.lang.String getValue() { return _value_;}
    public static CurveInterpolationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CurveInterpolationType enumeration = (CurveInterpolationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CurveInterpolationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurveInterpolationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CurveInterpolationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
