/**
 * AbstractRingPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.opengis.www.gml._3_2;


/**
 * A property with the content model of gml:AbstractRingPropertyType
 * encapsulates a ring to represent the surface boundary property of
 * a surface.
 */
public class AbstractRingPropertyType  implements java.io.Serializable {
    private net.opengis.www.gml._3_2.AbstractRingType abstractRing;

    public AbstractRingPropertyType() {
    }

    public AbstractRingPropertyType(
           net.opengis.www.gml._3_2.AbstractRingType abstractRing) {
           this.abstractRing = abstractRing;
    }


    /**
     * Gets the abstractRing value for this AbstractRingPropertyType.
     * 
     * @return abstractRing
     */
    public net.opengis.www.gml._3_2.AbstractRingType getAbstractRing() {
        return abstractRing;
    }


    /**
     * Sets the abstractRing value for this AbstractRingPropertyType.
     * 
     * @param abstractRing
     */
    public void setAbstractRing(net.opengis.www.gml._3_2.AbstractRingType abstractRing) {
        this.abstractRing = abstractRing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractRingPropertyType)) return false;
        AbstractRingPropertyType other = (AbstractRingPropertyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abstractRing==null && other.getAbstractRing()==null) || 
             (this.abstractRing!=null &&
              this.abstractRing.equals(other.getAbstractRing())));
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
        if (getAbstractRing() != null) {
            _hashCode += getAbstractRing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractRingPropertyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRingPropertyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abstractRing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRingType"));
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
