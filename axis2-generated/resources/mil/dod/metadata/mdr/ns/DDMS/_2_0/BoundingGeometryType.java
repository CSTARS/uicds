/**
 * BoundingGeometryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class BoundingGeometryType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.PolygonType polygon;

    private net.opengis.www.gml._3_2.PointType point;

    public BoundingGeometryType() {
    }

    public BoundingGeometryType(
           net.opengis.www.gml._3_2.PolygonType polygon,
           net.opengis.www.gml._3_2.PointType point) {
           this.polygon = polygon;
           this.point = point;
    }


    /**
     * Gets the polygon value for this BoundingGeometryType.
     * 
     * @return polygon
     */
    public net.opengis.www.gml._3_2.PolygonType getPolygon() {
        return polygon;
    }


    /**
     * Sets the polygon value for this BoundingGeometryType.
     * 
     * @param polygon
     */
    public void setPolygon(net.opengis.www.gml._3_2.PolygonType polygon) {
        this.polygon = polygon;
    }


    /**
     * Gets the point value for this BoundingGeometryType.
     * 
     * @return point
     */
    public net.opengis.www.gml._3_2.PointType getPoint() {
        return point;
    }


    /**
     * Sets the point value for this BoundingGeometryType.
     * 
     * @param point
     */
    public void setPoint(net.opengis.www.gml._3_2.PointType point) {
        this.point = point;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BoundingGeometryType)) return false;
        BoundingGeometryType other = (BoundingGeometryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.polygon==null && other.getPolygon()==null) || 
             (this.polygon!=null &&
              this.polygon.equals(other.getPolygon()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint())));
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
        if (getPolygon() != null) {
            _hashCode += getPolygon().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BoundingGeometryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "BoundingGeometryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polygon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolygonType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PointType"));
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
