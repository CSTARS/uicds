/**
 * LineStringType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;

public class LineStringType  extends net.opengis.www.gml._3_2.AbstractCurveType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.DirectPositionType[] pos;

    public LineStringType() {
    }

    public LineStringType(
           org.apache.axis.types.Id id,
           org.apache.axis.types.URI srsName,
           org.apache.axis.types.PositiveInteger srsDimension,
           java.lang.String[] axisLabels,
           java.lang.String[] uomLabels,
           net.opengis.www.gml._3_2.DirectPositionType[] pos) {
        super(
            id,
            srsName,
            srsDimension,
            axisLabels,
            uomLabels);
        this.pos = pos;
    }


    /**
     * Gets the pos value for this LineStringType.
     * 
     * @return pos
     */
    public net.opengis.www.gml._3_2.DirectPositionType[] getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this LineStringType.
     * 
     * @param pos
     */
    public void setPos(net.opengis.www.gml._3_2.DirectPositionType[] pos) {
        this.pos = pos;
    }

    public net.opengis.www.gml._3_2.DirectPositionType getPos(int i) {
        return this.pos[i];
    }

    public void setPos(int i, net.opengis.www.gml._3_2.DirectPositionType _value) {
        this.pos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineStringType)) return false;
        LineStringType other = (LineStringType) obj;
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
              java.util.Arrays.equals(this.pos, other.getPos())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineStringType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineStringType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
