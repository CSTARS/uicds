/**
 * VelocityUOMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;

public class VelocityUOMType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VelocityUOMType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("metre per second");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("kilometre per hour");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("knot");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("foot per second");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("mile per hour");
    public static final VelocityUOMType value1 = new VelocityUOMType(_value1);
    public static final VelocityUOMType value2 = new VelocityUOMType(_value2);
    public static final VelocityUOMType value3 = new VelocityUOMType(_value3);
    public static final VelocityUOMType value4 = new VelocityUOMType(_value4);
    public static final VelocityUOMType value5 = new VelocityUOMType(_value5);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static VelocityUOMType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        VelocityUOMType enumeration = (VelocityUOMType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VelocityUOMType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(VelocityUOMType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "VelocityUOMType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
