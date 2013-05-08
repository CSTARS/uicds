/**
 * LocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The base UCore location type, aggregates all other location types.
 * Allows either 0-N CyberAddresses, or 0-N PhysicalAddresses AND GeoLocations.
 * If multiple locations are included in a single element, they must
 * refer to the same logical location. (For example, the address and
 * coordinates of the White House.)
 */
public class LocationType  extends gov.ucore.ucore._2_0.ThingType  implements java.io.Serializable {
    /* Any address within the cyber domain, from DDMS. Must NOT be
     * used in the same element as GeoLocation and PhysicalAddress. */
    private gov.ucore.ucore._2_0.CyberAddressType[] cyberAddress;

    private gov.ucore.ucore._2_0.GeoLocationType[] geoLocation;

    private gov.ucore.ucore._2_0.PhysicalAddressType[] physicalAddress;

    public LocationType() {
    }

    public LocationType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           gov.ucore.ucore._2_0.CyberAddressType[] cyberAddress,
           gov.ucore.ucore._2_0.GeoLocationType[] geoLocation,
           gov.ucore.ucore._2_0.PhysicalAddressType[] physicalAddress) {
        super(
            id,
            metadata,
            descriptor,
            identifier,
            simpleProperty);
        this.cyberAddress = cyberAddress;
        this.geoLocation = geoLocation;
        this.physicalAddress = physicalAddress;
    }


    /**
     * Gets the cyberAddress value for this LocationType.
     * 
     * @return cyberAddress   * Any address within the cyber domain, from DDMS. Must NOT be
     * used in the same element as GeoLocation and PhysicalAddress.
     */
    public gov.ucore.ucore._2_0.CyberAddressType[] getCyberAddress() {
        return cyberAddress;
    }


    /**
     * Sets the cyberAddress value for this LocationType.
     * 
     * @param cyberAddress   * Any address within the cyber domain, from DDMS. Must NOT be
     * used in the same element as GeoLocation and PhysicalAddress.
     */
    public void setCyberAddress(gov.ucore.ucore._2_0.CyberAddressType[] cyberAddress) {
        this.cyberAddress = cyberAddress;
    }

    public gov.ucore.ucore._2_0.CyberAddressType getCyberAddress(int i) {
        return this.cyberAddress[i];
    }

    public void setCyberAddress(int i, gov.ucore.ucore._2_0.CyberAddressType _value) {
        this.cyberAddress[i] = _value;
    }


    /**
     * Gets the geoLocation value for this LocationType.
     * 
     * @return geoLocation
     */
    public gov.ucore.ucore._2_0.GeoLocationType[] getGeoLocation() {
        return geoLocation;
    }


    /**
     * Sets the geoLocation value for this LocationType.
     * 
     * @param geoLocation
     */
    public void setGeoLocation(gov.ucore.ucore._2_0.GeoLocationType[] geoLocation) {
        this.geoLocation = geoLocation;
    }

    public gov.ucore.ucore._2_0.GeoLocationType getGeoLocation(int i) {
        return this.geoLocation[i];
    }

    public void setGeoLocation(int i, gov.ucore.ucore._2_0.GeoLocationType _value) {
        this.geoLocation[i] = _value;
    }


    /**
     * Gets the physicalAddress value for this LocationType.
     * 
     * @return physicalAddress
     */
    public gov.ucore.ucore._2_0.PhysicalAddressType[] getPhysicalAddress() {
        return physicalAddress;
    }


    /**
     * Sets the physicalAddress value for this LocationType.
     * 
     * @param physicalAddress
     */
    public void setPhysicalAddress(gov.ucore.ucore._2_0.PhysicalAddressType[] physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public gov.ucore.ucore._2_0.PhysicalAddressType getPhysicalAddress(int i) {
        return this.physicalAddress[i];
    }

    public void setPhysicalAddress(int i, gov.ucore.ucore._2_0.PhysicalAddressType _value) {
        this.physicalAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationType)) return false;
        LocationType other = (LocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cyberAddress==null && other.getCyberAddress()==null) || 
             (this.cyberAddress!=null &&
              java.util.Arrays.equals(this.cyberAddress, other.getCyberAddress()))) &&
            ((this.geoLocation==null && other.getGeoLocation()==null) || 
             (this.geoLocation!=null &&
              java.util.Arrays.equals(this.geoLocation, other.getGeoLocation()))) &&
            ((this.physicalAddress==null && other.getPhysicalAddress()==null) || 
             (this.physicalAddress!=null &&
              java.util.Arrays.equals(this.physicalAddress, other.getPhysicalAddress())));
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
        if (getCyberAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCyberAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCyberAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeoLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeoLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeoLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhysicalAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalAddress(), i);
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
        new org.apache.axis.description.TypeDesc(LocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cyberAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CyberAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CyberAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PhysicalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PhysicalAddress"));
        elemField.setMinOccurs(0);
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
