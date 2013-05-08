/**
 * RenderingMethodCodeSimpleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.codes.message;

public class RenderingMethodCodeSimpleType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RenderingMethodCodeSimpleType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _XHTMLStyleSheet = new org.apache.axis.types.Token("XHTMLStyleSheet");
    public static final org.apache.axis.types.Token _HTMLStyleSheet = new org.apache.axis.types.Token("HTMLStyleSheet");
    public static final org.apache.axis.types.Token _PDFStyleSheet = new org.apache.axis.types.Token("PDFStyleSheet");
    public static final org.apache.axis.types.Token _TextStyleSheet = new org.apache.axis.types.Token("TextStyleSheet");
    public static final org.apache.axis.types.Token _OtherStyleSheet = new org.apache.axis.types.Token("OtherStyleSheet");
    public static final org.apache.axis.types.Token _RenderedBinary = new org.apache.axis.types.Token("RenderedBinary");
    public static final org.apache.axis.types.Token _Narrative = new org.apache.axis.types.Token("Narrative");
    public static final RenderingMethodCodeSimpleType XHTMLStyleSheet = new RenderingMethodCodeSimpleType(_XHTMLStyleSheet);
    public static final RenderingMethodCodeSimpleType HTMLStyleSheet = new RenderingMethodCodeSimpleType(_HTMLStyleSheet);
    public static final RenderingMethodCodeSimpleType PDFStyleSheet = new RenderingMethodCodeSimpleType(_PDFStyleSheet);
    public static final RenderingMethodCodeSimpleType TextStyleSheet = new RenderingMethodCodeSimpleType(_TextStyleSheet);
    public static final RenderingMethodCodeSimpleType OtherStyleSheet = new RenderingMethodCodeSimpleType(_OtherStyleSheet);
    public static final RenderingMethodCodeSimpleType RenderedBinary = new RenderingMethodCodeSimpleType(_RenderedBinary);
    public static final RenderingMethodCodeSimpleType Narrative = new RenderingMethodCodeSimpleType(_Narrative);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static RenderingMethodCodeSimpleType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        RenderingMethodCodeSimpleType enumeration = (RenderingMethodCodeSimpleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RenderingMethodCodeSimpleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RenderingMethodCodeSimpleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:codes:1.0", "RenderingMethodCodeSimpleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
