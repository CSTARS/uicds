/**
 * BoundingBoxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class BoundingBoxType  implements java.io.Serializable {
    private double westBL;

    private double eastBL;

    private double southBL;

    private double northBL;

    public BoundingBoxType() {
    }

    public BoundingBoxType(
           double westBL,
           double eastBL,
           double southBL,
           double northBL) {
           this.westBL = westBL;
           this.eastBL = eastBL;
           this.southBL = southBL;
           this.northBL = northBL;
    }


    /**
     * Gets the westBL value for this BoundingBoxType.
     * 
     * @return westBL
     */
    public double getWestBL() {
        return westBL;
    }


    /**
     * Sets the westBL value for this BoundingBoxType.
     * 
     * @param westBL
     */
    public void setWestBL(double westBL) {
        this.westBL = westBL;
    }


    /**
     * Gets the eastBL value for this BoundingBoxType.
     * 
     * @return eastBL
     */
    public double getEastBL() {
        return eastBL;
    }


    /**
     * Sets the eastBL value for this BoundingBoxType.
     * 
     * @param eastBL
     */
    public void setEastBL(double eastBL) {
        this.eastBL = eastBL;
    }


    /**
     * Gets the southBL value for this BoundingBoxType.
     * 
     * @return southBL
     */
    public double getSouthBL() {
        return southBL;
    }


    /**
     * Sets the southBL value for this BoundingBoxType.
     * 
     * @param southBL
     */
    public void setSouthBL(double southBL) {
        this.southBL = southBL;
    }


    /**
     * Gets the northBL value for this BoundingBoxType.
     * 
     * @return northBL
     */
    public double getNorthBL() {
        return northBL;
    }


    /**
     * Sets the northBL value for this BoundingBoxType.
     * 
     * @param northBL
     */
    public void setNorthBL(double northBL) {
        this.northBL = northBL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BoundingBoxType)) return false;
        BoundingBoxType other = (BoundingBoxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.westBL == other.getWestBL() &&
            this.eastBL == other.getEastBL() &&
            this.southBL == other.getSouthBL() &&
            this.northBL == other.getNorthBL();
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
        _hashCode += new Double(getWestBL()).hashCode();
        _hashCode += new Double(getEastBL()).hashCode();
        _hashCode += new Double(getSouthBL()).hashCode();
        _hashCode += new Double(getNorthBL()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BoundingBoxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "BoundingBoxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("westBL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "WestBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eastBL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "EastBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("southBL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "SouthBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("northBL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "NorthBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
