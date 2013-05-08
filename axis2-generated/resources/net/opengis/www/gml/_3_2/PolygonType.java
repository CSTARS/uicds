/**
 * PolygonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;

public class PolygonType  extends net.opengis.www.gml._3_2.AbstractSurfaceType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.AbstractRingPropertyType exterior;

    public PolygonType() {
    }

    public PolygonType(
           org.apache.axis.types.Id id,
           org.apache.axis.types.URI srsName,
           org.apache.axis.types.PositiveInteger srsDimension,
           java.lang.String[] axisLabels,
           java.lang.String[] uomLabels,
           net.opengis.www.gml._3_2.AbstractRingPropertyType exterior) {
        super(
            id,
            srsName,
            srsDimension,
            axisLabels,
            uomLabels);
        this.exterior = exterior;
    }


    /**
     * Gets the exterior value for this PolygonType.
     * 
     * @return exterior
     */
    public net.opengis.www.gml._3_2.AbstractRingPropertyType getExterior() {
        return exterior;
    }


    /**
     * Sets the exterior value for this PolygonType.
     * 
     * @param exterior
     */
    public void setExterior(net.opengis.www.gml._3_2.AbstractRingPropertyType exterior) {
        this.exterior = exterior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolygonType)) return false;
        PolygonType other = (PolygonType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exterior==null && other.getExterior()==null) || 
             (this.exterior!=null &&
              this.exterior.equals(other.getExterior())));
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
        if (getExterior() != null) {
            _hashCode += getExterior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolygonType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolygonType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "exterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRingPropertyType"));
        elemField.setMinOccurs(0);
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
