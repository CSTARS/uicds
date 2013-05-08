/**
 * GeoLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A physical location with coordinates, or a simple geospatial region.
 */
public class GeoLocationType  implements java.io.Serializable {
    private java.lang.Object geoLocationAbstract;

    public GeoLocationType() {
    }

    public GeoLocationType(
           java.lang.Object geoLocationAbstract) {
           this.geoLocationAbstract = geoLocationAbstract;
    }


    /**
     * Gets the geoLocationAbstract value for this GeoLocationType.
     * 
     * @return geoLocationAbstract
     */
    public java.lang.Object getGeoLocationAbstract() {
        return geoLocationAbstract;
    }


    /**
     * Sets the geoLocationAbstract value for this GeoLocationType.
     * 
     * @param geoLocationAbstract
     */
    public void setGeoLocationAbstract(java.lang.Object geoLocationAbstract) {
        this.geoLocationAbstract = geoLocationAbstract;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationType)) return false;
        GeoLocationType other = (GeoLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoLocationAbstract==null && other.getGeoLocationAbstract()==null) || 
             (this.geoLocationAbstract!=null &&
              this.geoLocationAbstract.equals(other.getGeoLocationAbstract())));
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
        if (getGeoLocationAbstract() != null) {
            _hashCode += getGeoLocationAbstract().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoLocationAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocationAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
