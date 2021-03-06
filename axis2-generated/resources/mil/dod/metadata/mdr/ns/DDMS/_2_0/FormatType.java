/**
 * FormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class FormatType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.MediaType media;

    public FormatType() {
    }

    public FormatType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.MediaType media) {
           this.media = media;
    }


    /**
     * Gets the media value for this FormatType.
     * 
     * @return media
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.MediaType getMedia() {
        return media;
    }


    /**
     * Sets the media value for this FormatType.
     * 
     * @param media
     */
    public void setMedia(mil.dod.metadata.mdr.ns.DDMS._2_0.MediaType media) {
        this.media = media;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormatType)) return false;
        FormatType other = (FormatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia())));
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
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "FormatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Media"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MediaType"));
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
