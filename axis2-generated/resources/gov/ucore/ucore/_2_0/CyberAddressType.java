/**
 * CyberAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * Any address within the cyber domain, from DDMS.
 */
public class CyberAddressType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType virtualCoverage;

    public CyberAddressType() {
    }

    public CyberAddressType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType virtualCoverage) {
           this.virtualCoverage = virtualCoverage;
    }


    /**
     * Gets the virtualCoverage value for this CyberAddressType.
     * 
     * @return virtualCoverage
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType getVirtualCoverage() {
        return virtualCoverage;
    }


    /**
     * Sets the virtualCoverage value for this CyberAddressType.
     * 
     * @param virtualCoverage
     */
    public void setVirtualCoverage(mil.dod.metadata.mdr.ns.DDMS._2_0.VirtualCoverageType virtualCoverage) {
        this.virtualCoverage = virtualCoverage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CyberAddressType)) return false;
        CyberAddressType other = (CyberAddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualCoverage==null && other.getVirtualCoverage()==null) || 
             (this.virtualCoverage!=null &&
              this.virtualCoverage.equals(other.getVirtualCoverage())));
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
        if (getVirtualCoverage() != null) {
            _hashCode += getVirtualCoverage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CyberAddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CyberAddressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "virtualCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VirtualCoverageType"));
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
