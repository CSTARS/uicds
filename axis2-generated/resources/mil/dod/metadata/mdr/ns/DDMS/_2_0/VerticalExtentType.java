/**
 * VerticalExtentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class VerticalExtentType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType minVerticalExtent;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType maxVerticalExtent;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.LengthMeasureType unitOfMeasure;  // attribute

    private mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDatumType datum;  // attribute

    public VerticalExtentType() {
    }

    public VerticalExtentType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType minVerticalExtent,
           mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType maxVerticalExtent,
           mil.dod.metadata.mdr.ns.DDMS._2_0.LengthMeasureType unitOfMeasure,
           mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDatumType datum) {
           this.minVerticalExtent = minVerticalExtent;
           this.maxVerticalExtent = maxVerticalExtent;
           this.unitOfMeasure = unitOfMeasure;
           this.datum = datum;
    }


    /**
     * Gets the minVerticalExtent value for this VerticalExtentType.
     * 
     * @return minVerticalExtent
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType getMinVerticalExtent() {
        return minVerticalExtent;
    }


    /**
     * Sets the minVerticalExtent value for this VerticalExtentType.
     * 
     * @param minVerticalExtent
     */
    public void setMinVerticalExtent(mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType minVerticalExtent) {
        this.minVerticalExtent = minVerticalExtent;
    }


    /**
     * Gets the maxVerticalExtent value for this VerticalExtentType.
     * 
     * @return maxVerticalExtent
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType getMaxVerticalExtent() {
        return maxVerticalExtent;
    }


    /**
     * Sets the maxVerticalExtent value for this VerticalExtentType.
     * 
     * @param maxVerticalExtent
     */
    public void setMaxVerticalExtent(mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDistanceType maxVerticalExtent) {
        this.maxVerticalExtent = maxVerticalExtent;
    }


    /**
     * Gets the unitOfMeasure value for this VerticalExtentType.
     * 
     * @return unitOfMeasure
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.LengthMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this VerticalExtentType.
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(mil.dod.metadata.mdr.ns.DDMS._2_0.LengthMeasureType unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the datum value for this VerticalExtentType.
     * 
     * @return datum
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDatumType getDatum() {
        return datum;
    }


    /**
     * Sets the datum value for this VerticalExtentType.
     * 
     * @param datum
     */
    public void setDatum(mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalDatumType datum) {
        this.datum = datum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerticalExtentType)) return false;
        VerticalExtentType other = (VerticalExtentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minVerticalExtent==null && other.getMinVerticalExtent()==null) || 
             (this.minVerticalExtent!=null &&
              this.minVerticalExtent.equals(other.getMinVerticalExtent()))) &&
            ((this.maxVerticalExtent==null && other.getMaxVerticalExtent()==null) || 
             (this.maxVerticalExtent!=null &&
              this.maxVerticalExtent.equals(other.getMaxVerticalExtent()))) &&
            ((this.unitOfMeasure==null && other.getUnitOfMeasure()==null) || 
             (this.unitOfMeasure!=null &&
              this.unitOfMeasure.equals(other.getUnitOfMeasure()))) &&
            ((this.datum==null && other.getDatum()==null) || 
             (this.datum!=null &&
              this.datum.equals(other.getDatum())));
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
        if (getMinVerticalExtent() != null) {
            _hashCode += getMinVerticalExtent().hashCode();
        }
        if (getMaxVerticalExtent() != null) {
            _hashCode += getMaxVerticalExtent().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerticalExtentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VerticalExtentType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unitOfMeasure");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "unitOfMeasure"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "LengthMeasureType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("datum");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "datum"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VerticalDatumType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVerticalExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MinVerticalExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VerticalDistanceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVerticalExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MaxVerticalExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VerticalDistanceType"));
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
