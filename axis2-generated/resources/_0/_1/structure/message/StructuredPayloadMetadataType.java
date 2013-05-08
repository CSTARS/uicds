/**
 * StructuredPayloadMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes metadata about a structured payload
 */
public class StructuredPayloadMetadataType  implements java.io.Serializable {
    private org.apache.axis.types.URI communityURI;

    private java.lang.String communityDescription;

    private java.lang.String communityVersion;

    private _0._1.structure.message.CommunityPedigreeURIType[] communityPedigreeURI;

    public StructuredPayloadMetadataType() {
    }

    public StructuredPayloadMetadataType(
           org.apache.axis.types.URI communityURI,
           java.lang.String communityDescription,
           java.lang.String communityVersion,
           _0._1.structure.message.CommunityPedigreeURIType[] communityPedigreeURI) {
           this.communityURI = communityURI;
           this.communityDescription = communityDescription;
           this.communityVersion = communityVersion;
           this.communityPedigreeURI = communityPedigreeURI;
    }


    /**
     * Gets the communityURI value for this StructuredPayloadMetadataType.
     * 
     * @return communityURI
     */
    public org.apache.axis.types.URI getCommunityURI() {
        return communityURI;
    }


    /**
     * Sets the communityURI value for this StructuredPayloadMetadataType.
     * 
     * @param communityURI
     */
    public void setCommunityURI(org.apache.axis.types.URI communityURI) {
        this.communityURI = communityURI;
    }


    /**
     * Gets the communityDescription value for this StructuredPayloadMetadataType.
     * 
     * @return communityDescription
     */
    public java.lang.String getCommunityDescription() {
        return communityDescription;
    }


    /**
     * Sets the communityDescription value for this StructuredPayloadMetadataType.
     * 
     * @param communityDescription
     */
    public void setCommunityDescription(java.lang.String communityDescription) {
        this.communityDescription = communityDescription;
    }


    /**
     * Gets the communityVersion value for this StructuredPayloadMetadataType.
     * 
     * @return communityVersion
     */
    public java.lang.String getCommunityVersion() {
        return communityVersion;
    }


    /**
     * Sets the communityVersion value for this StructuredPayloadMetadataType.
     * 
     * @param communityVersion
     */
    public void setCommunityVersion(java.lang.String communityVersion) {
        this.communityVersion = communityVersion;
    }


    /**
     * Gets the communityPedigreeURI value for this StructuredPayloadMetadataType.
     * 
     * @return communityPedigreeURI
     */
    public _0._1.structure.message.CommunityPedigreeURIType[] getCommunityPedigreeURI() {
        return communityPedigreeURI;
    }


    /**
     * Sets the communityPedigreeURI value for this StructuredPayloadMetadataType.
     * 
     * @param communityPedigreeURI
     */
    public void setCommunityPedigreeURI(_0._1.structure.message.CommunityPedigreeURIType[] communityPedigreeURI) {
        this.communityPedigreeURI = communityPedigreeURI;
    }

    public _0._1.structure.message.CommunityPedigreeURIType getCommunityPedigreeURI(int i) {
        return this.communityPedigreeURI[i];
    }

    public void setCommunityPedigreeURI(int i, _0._1.structure.message.CommunityPedigreeURIType _value) {
        this.communityPedigreeURI[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredPayloadMetadataType)) return false;
        StructuredPayloadMetadataType other = (StructuredPayloadMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communityURI==null && other.getCommunityURI()==null) || 
             (this.communityURI!=null &&
              this.communityURI.equals(other.getCommunityURI()))) &&
            ((this.communityDescription==null && other.getCommunityDescription()==null) || 
             (this.communityDescription!=null &&
              this.communityDescription.equals(other.getCommunityDescription()))) &&
            ((this.communityVersion==null && other.getCommunityVersion()==null) || 
             (this.communityVersion!=null &&
              this.communityVersion.equals(other.getCommunityVersion()))) &&
            ((this.communityPedigreeURI==null && other.getCommunityPedigreeURI()==null) || 
             (this.communityPedigreeURI!=null &&
              java.util.Arrays.equals(this.communityPedigreeURI, other.getCommunityPedigreeURI())));
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
        if (getCommunityURI() != null) {
            _hashCode += getCommunityURI().hashCode();
        }
        if (getCommunityDescription() != null) {
            _hashCode += getCommunityDescription().hashCode();
        }
        if (getCommunityVersion() != null) {
            _hashCode += getCommunityVersion().hashCode();
        }
        if (getCommunityPedigreeURI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunityPedigreeURI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunityPedigreeURI(), i);
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
        new org.apache.axis.description.TypeDesc(StructuredPayloadMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayloadMetadataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityURI");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityPedigreeURI");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURI"));
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
