/**
 * DatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class DatesType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType created;  // attribute

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType posted;  // attribute

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType validTil;  // attribute

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType infoCutOff;  // attribute

    public DatesType() {
    }

    public DatesType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType created,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType posted,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType validTil,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType infoCutOff) {
           this.created = created;
           this.posted = posted;
           this.validTil = validTil;
           this.infoCutOff = infoCutOff;
    }


    /**
     * Gets the created value for this DatesType.
     * 
     * @return created
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType getCreated() {
        return created;
    }


    /**
     * Sets the created value for this DatesType.
     * 
     * @param created
     */
    public void setCreated(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType created) {
        this.created = created;
    }


    /**
     * Gets the posted value for this DatesType.
     * 
     * @return posted
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType getPosted() {
        return posted;
    }


    /**
     * Sets the posted value for this DatesType.
     * 
     * @param posted
     */
    public void setPosted(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType posted) {
        this.posted = posted;
    }


    /**
     * Gets the validTil value for this DatesType.
     * 
     * @return validTil
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType getValidTil() {
        return validTil;
    }


    /**
     * Sets the validTil value for this DatesType.
     * 
     * @param validTil
     */
    public void setValidTil(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType validTil) {
        this.validTil = validTil;
    }


    /**
     * Gets the infoCutOff value for this DatesType.
     * 
     * @return infoCutOff
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType getInfoCutOff() {
        return infoCutOff;
    }


    /**
     * Sets the infoCutOff value for this DatesType.
     * 
     * @param infoCutOff
     */
    public void setInfoCutOff(mil.dod.metadata.mdr.ns.DDMS._2_0.CombinedDateType infoCutOff) {
        this.infoCutOff = infoCutOff;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatesType)) return false;
        DatesType other = (DatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.posted==null && other.getPosted()==null) || 
             (this.posted!=null &&
              this.posted.equals(other.getPosted()))) &&
            ((this.validTil==null && other.getValidTil()==null) || 
             (this.validTil!=null &&
              this.validTil.equals(other.getValidTil()))) &&
            ((this.infoCutOff==null && other.getInfoCutOff()==null) || 
             (this.infoCutOff!=null &&
              this.infoCutOff.equals(other.getInfoCutOff())));
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
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getPosted() != null) {
            _hashCode += getPosted().hashCode();
        }
        if (getValidTil() != null) {
            _hashCode += getValidTil().hashCode();
        }
        if (getInfoCutOff() != null) {
            _hashCode += getInfoCutOff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "DatesType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("created");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "created"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CombinedDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("posted");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "posted"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CombinedDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validTil");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "validTil"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CombinedDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoCutOff");
        attrField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "infoCutOff"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CombinedDateType"));
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
