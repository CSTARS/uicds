/**
 * ClassificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package v2.ism.ic.gov.us;

public class ClassificationType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClassificationType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("U");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("C");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("S");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("TS");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("R");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("CTS");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("CTS-B");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("CTS-BALK");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("NU");
    public static final org.apache.axis.types.NMToken _value10 = new org.apache.axis.types.NMToken("NR");
    public static final org.apache.axis.types.NMToken _value11 = new org.apache.axis.types.NMToken("NC");
    public static final org.apache.axis.types.NMToken _value12 = new org.apache.axis.types.NMToken("NS");
    public static final org.apache.axis.types.NMToken _value13 = new org.apache.axis.types.NMToken("NS-S");
    public static final org.apache.axis.types.NMToken _value14 = new org.apache.axis.types.NMToken("NS-A");
    public static final org.apache.axis.types.NMToken _value15 = new org.apache.axis.types.NMToken("CTSA");
    public static final org.apache.axis.types.NMToken _value16 = new org.apache.axis.types.NMToken("NSAT");
    public static final org.apache.axis.types.NMToken _value17 = new org.apache.axis.types.NMToken("NCA");
    public static final ClassificationType value1 = new ClassificationType(_value1);
    public static final ClassificationType value2 = new ClassificationType(_value2);
    public static final ClassificationType value3 = new ClassificationType(_value3);
    public static final ClassificationType value4 = new ClassificationType(_value4);
    public static final ClassificationType value5 = new ClassificationType(_value5);
    public static final ClassificationType value6 = new ClassificationType(_value6);
    public static final ClassificationType value7 = new ClassificationType(_value7);
    public static final ClassificationType value8 = new ClassificationType(_value8);
    public static final ClassificationType value9 = new ClassificationType(_value9);
    public static final ClassificationType value10 = new ClassificationType(_value10);
    public static final ClassificationType value11 = new ClassificationType(_value11);
    public static final ClassificationType value12 = new ClassificationType(_value12);
    public static final ClassificationType value13 = new ClassificationType(_value13);
    public static final ClassificationType value14 = new ClassificationType(_value14);
    public static final ClassificationType value15 = new ClassificationType(_value15);
    public static final ClassificationType value16 = new ClassificationType(_value16);
    public static final ClassificationType value17 = new ClassificationType(_value17);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ClassificationType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ClassificationType enumeration = (ClassificationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClassificationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
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
        new org.apache.axis.description.TypeDesc(ClassificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ClassificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
