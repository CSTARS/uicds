/**
 * AbstractGeometryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;


/**
 * All geometry elements are derived directly or indirectly from this
 * abstract supertype. A geometry element may have an identifying attribute
 * (gml:id), one or more names (elements identifier and name) and a description
 * (elements description and descriptionReference) . It may be associated
 * with a spatial reference system (attribute group gml:SRSReferenceGroup).
 * The following rules shall be adhered to:
 * -	Every geometry type shall derive from this abstract type.
 * -	Every geometry element (i.e. an element of a geometry type) shall
 * be directly or indirectly in the substitution group of AbstractGeometry.
 */
public abstract class AbstractGeometryType  extends net.opengis.www.gml._3_2.AbstractGMLType  implements java.io.Serializable {
    private org.apache.axis.types.URI srsName;  // attribute

    private org.apache.axis.types.PositiveInteger srsDimension;  // attribute

    private java.lang.String[] axisLabels;  // attribute

    private java.lang.String[] uomLabels;  // attribute

    public AbstractGeometryType() {
    }

    public AbstractGeometryType(
           org.apache.axis.types.Id id,
           org.apache.axis.types.URI srsName,
           org.apache.axis.types.PositiveInteger srsDimension,
           java.lang.String[] axisLabels,
           java.lang.String[] uomLabels) {
        super(
            id);
        this.srsName = srsName;
        this.srsDimension = srsDimension;
        this.axisLabels = axisLabels;
        this.uomLabels = uomLabels;
    }


    /**
     * Gets the srsName value for this AbstractGeometryType.
     * 
     * @return srsName
     */
    public org.apache.axis.types.URI getSrsName() {
        return srsName;
    }


    /**
     * Sets the srsName value for this AbstractGeometryType.
     * 
     * @param srsName
     */
    public void setSrsName(org.apache.axis.types.URI srsName) {
        this.srsName = srsName;
    }


    /**
     * Gets the srsDimension value for this AbstractGeometryType.
     * 
     * @return srsDimension
     */
    public org.apache.axis.types.PositiveInteger getSrsDimension() {
        return srsDimension;
    }


    /**
     * Sets the srsDimension value for this AbstractGeometryType.
     * 
     * @param srsDimension
     */
    public void setSrsDimension(org.apache.axis.types.PositiveInteger srsDimension) {
        this.srsDimension = srsDimension;
    }


    /**
     * Gets the axisLabels value for this AbstractGeometryType.
     * 
     * @return axisLabels
     */
    public java.lang.String[] getAxisLabels() {
        return axisLabels;
    }


    /**
     * Sets the axisLabels value for this AbstractGeometryType.
     * 
     * @param axisLabels
     */
    public void setAxisLabels(java.lang.String[] axisLabels) {
        this.axisLabels = axisLabels;
    }


    /**
     * Gets the uomLabels value for this AbstractGeometryType.
     * 
     * @return uomLabels
     */
    public java.lang.String[] getUomLabels() {
        return uomLabels;
    }


    /**
     * Sets the uomLabels value for this AbstractGeometryType.
     * 
     * @param uomLabels
     */
    public void setUomLabels(java.lang.String[] uomLabels) {
        this.uomLabels = uomLabels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractGeometryType)) return false;
        AbstractGeometryType other = (AbstractGeometryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.srsName==null && other.getSrsName()==null) || 
             (this.srsName!=null &&
              this.srsName.equals(other.getSrsName()))) &&
            ((this.srsDimension==null && other.getSrsDimension()==null) || 
             (this.srsDimension!=null &&
              this.srsDimension.equals(other.getSrsDimension()))) &&
            ((this.axisLabels==null && other.getAxisLabels()==null) || 
             (this.axisLabels!=null &&
              java.util.Arrays.equals(this.axisLabels, other.getAxisLabels()))) &&
            ((this.uomLabels==null && other.getUomLabels()==null) || 
             (this.uomLabels!=null &&
              java.util.Arrays.equals(this.uomLabels, other.getUomLabels())));
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
        if (getSrsName() != null) {
            _hashCode += getSrsName().hashCode();
        }
        if (getSrsDimension() != null) {
            _hashCode += getSrsDimension().hashCode();
        }
        if (getAxisLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAxisLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAxisLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUomLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUomLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUomLabels(), i);
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
        new org.apache.axis.description.TypeDesc(AbstractGeometryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("srsName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "srsName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("srsDimension");
        attrField.setXmlName(new javax.xml.namespace.QName("", "srsDimension"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("axisLabels");
        attrField.setXmlName(new javax.xml.namespace.QName("", "axisLabels"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "NCNameList"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uomLabels");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uomLabels"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "NCNameList"));
        typeDesc.addFieldDesc(attrField);
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
