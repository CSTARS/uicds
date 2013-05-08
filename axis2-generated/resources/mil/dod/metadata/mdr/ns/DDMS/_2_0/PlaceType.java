/**
 * PlaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class PlaceType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.GeographicIdentifier geographicIdentifier;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingGeometryType boundingGeometry;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.PostalAddress postalAddress;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalExtentType verticalExtent;

    public PlaceType() {
    }

    public PlaceType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.GeographicIdentifier geographicIdentifier,
           mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox,
           mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingGeometryType boundingGeometry,
           mil.dod.metadata.mdr.ns.DDMS._2_0.PostalAddress postalAddress,
           mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalExtentType verticalExtent) {
           this.geographicIdentifier = geographicIdentifier;
           this.boundingBox = boundingBox;
           this.boundingGeometry = boundingGeometry;
           this.postalAddress = postalAddress;
           this.verticalExtent = verticalExtent;
    }


    /**
     * Gets the geographicIdentifier value for this PlaceType.
     * 
     * @return geographicIdentifier
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.GeographicIdentifier getGeographicIdentifier() {
        return geographicIdentifier;
    }


    /**
     * Sets the geographicIdentifier value for this PlaceType.
     * 
     * @param geographicIdentifier
     */
    public void setGeographicIdentifier(mil.dod.metadata.mdr.ns.DDMS._2_0.GeographicIdentifier geographicIdentifier) {
        this.geographicIdentifier = geographicIdentifier;
    }


    /**
     * Gets the boundingBox value for this PlaceType.
     * 
     * @return boundingBox
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType getBoundingBox() {
        return boundingBox;
    }


    /**
     * Sets the boundingBox value for this PlaceType.
     * 
     * @param boundingBox
     */
    public void setBoundingBox(mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox) {
        this.boundingBox = boundingBox;
    }


    /**
     * Gets the boundingGeometry value for this PlaceType.
     * 
     * @return boundingGeometry
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingGeometryType getBoundingGeometry() {
        return boundingGeometry;
    }


    /**
     * Sets the boundingGeometry value for this PlaceType.
     * 
     * @param boundingGeometry
     */
    public void setBoundingGeometry(mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingGeometryType boundingGeometry) {
        this.boundingGeometry = boundingGeometry;
    }


    /**
     * Gets the postalAddress value for this PlaceType.
     * 
     * @return postalAddress
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.PostalAddress getPostalAddress() {
        return postalAddress;
    }


    /**
     * Sets the postalAddress value for this PlaceType.
     * 
     * @param postalAddress
     */
    public void setPostalAddress(mil.dod.metadata.mdr.ns.DDMS._2_0.PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }


    /**
     * Gets the verticalExtent value for this PlaceType.
     * 
     * @return verticalExtent
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalExtentType getVerticalExtent() {
        return verticalExtent;
    }


    /**
     * Sets the verticalExtent value for this PlaceType.
     * 
     * @param verticalExtent
     */
    public void setVerticalExtent(mil.dod.metadata.mdr.ns.DDMS._2_0.VerticalExtentType verticalExtent) {
        this.verticalExtent = verticalExtent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceType)) return false;
        PlaceType other = (PlaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geographicIdentifier==null && other.getGeographicIdentifier()==null) || 
             (this.geographicIdentifier!=null &&
              this.geographicIdentifier.equals(other.getGeographicIdentifier()))) &&
            ((this.boundingBox==null && other.getBoundingBox()==null) || 
             (this.boundingBox!=null &&
              this.boundingBox.equals(other.getBoundingBox()))) &&
            ((this.boundingGeometry==null && other.getBoundingGeometry()==null) || 
             (this.boundingGeometry!=null &&
              this.boundingGeometry.equals(other.getBoundingGeometry()))) &&
            ((this.postalAddress==null && other.getPostalAddress()==null) || 
             (this.postalAddress!=null &&
              this.postalAddress.equals(other.getPostalAddress()))) &&
            ((this.verticalExtent==null && other.getVerticalExtent()==null) || 
             (this.verticalExtent!=null &&
              this.verticalExtent.equals(other.getVerticalExtent())));
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
        if (getGeographicIdentifier() != null) {
            _hashCode += getGeographicIdentifier().hashCode();
        }
        if (getBoundingBox() != null) {
            _hashCode += getBoundingBox().hashCode();
        }
        if (getBoundingGeometry() != null) {
            _hashCode += getBoundingGeometry().hashCode();
        }
        if (getPostalAddress() != null) {
            _hashCode += getPostalAddress().hashCode();
        }
        if (getVerticalExtent() != null) {
            _hashCode += getVerticalExtent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "PlaceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geographicIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geographicIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", ">geographicIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "BoundingBoxType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingGeometry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingGeometry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "BoundingGeometryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "postalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", ">postalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "verticalExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "VerticalExtentType"));
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
