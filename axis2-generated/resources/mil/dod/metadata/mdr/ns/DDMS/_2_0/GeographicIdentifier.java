/**
 * GeographicIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class GeographicIdentifier  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String region;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType countryCode;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.FacilityIdentifierType facilityIdentifier;

    public GeographicIdentifier() {
    }

    public GeographicIdentifier(
           java.lang.String name,
           java.lang.String region,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType countryCode,
           mil.dod.metadata.mdr.ns.DDMS._2_0.FacilityIdentifierType facilityIdentifier) {
           this.name = name;
           this.region = region;
           this.countryCode = countryCode;
           this.facilityIdentifier = facilityIdentifier;
    }


    /**
     * Gets the name value for this GeographicIdentifier.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GeographicIdentifier.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the region value for this GeographicIdentifier.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this GeographicIdentifier.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the countryCode value for this GeographicIdentifier.
     * 
     * @return countryCode
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this GeographicIdentifier.
     * 
     * @param countryCode
     */
    public void setCountryCode(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCountryCodeIdentifierType countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the facilityIdentifier value for this GeographicIdentifier.
     * 
     * @return facilityIdentifier
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.FacilityIdentifierType getFacilityIdentifier() {
        return facilityIdentifier;
    }


    /**
     * Sets the facilityIdentifier value for this GeographicIdentifier.
     * 
     * @param facilityIdentifier
     */
    public void setFacilityIdentifier(mil.dod.metadata.mdr.ns.DDMS._2_0.FacilityIdentifierType facilityIdentifier) {
        this.facilityIdentifier = facilityIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeographicIdentifier)) return false;
        GeographicIdentifier other = (GeographicIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.facilityIdentifier==null && other.getFacilityIdentifier()==null) || 
             (this.facilityIdentifier!=null &&
              this.facilityIdentifier.equals(other.getFacilityIdentifier())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getFacilityIdentifier() != null) {
            _hashCode += getFacilityIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeographicIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", ">geographicIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CompoundCountryCodeIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "facilityIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "FacilityIdentifierType"));
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
