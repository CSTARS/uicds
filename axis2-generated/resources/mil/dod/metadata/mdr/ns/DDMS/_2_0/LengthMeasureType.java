/**
 * LengthMeasureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class LengthMeasureType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LengthMeasureType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Meter = "Meter";
    public static final java.lang.String _Kilometer = "Kilometer";
    public static final java.lang.String _Foot = "Foot";
    public static final java.lang.String _StatuteMile = "StatuteMile";
    public static final java.lang.String _NauticalMile = "NauticalMile";
    public static final java.lang.String _Fathom = "Fathom";
    public static final java.lang.String _Inch = "Inch";
    public static final LengthMeasureType Meter = new LengthMeasureType(_Meter);
    public static final LengthMeasureType Kilometer = new LengthMeasureType(_Kilometer);
    public static final LengthMeasureType Foot = new LengthMeasureType(_Foot);
    public static final LengthMeasureType StatuteMile = new LengthMeasureType(_StatuteMile);
    public static final LengthMeasureType NauticalMile = new LengthMeasureType(_NauticalMile);
    public static final LengthMeasureType Fathom = new LengthMeasureType(_Fathom);
    public static final LengthMeasureType Inch = new LengthMeasureType(_Inch);
    public java.lang.String getValue() { return _value_;}
    public static LengthMeasureType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LengthMeasureType enumeration = (LengthMeasureType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LengthMeasureType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LengthMeasureType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "LengthMeasureType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
