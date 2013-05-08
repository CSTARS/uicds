/**
 * IdentificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.base;

public class IdentificationType  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.IdentifierType identifier;

    private com.saic.www.precis._2009._06.base.VersionType version;

    private com.saic.www.precis._2009._06.base.CodespaceValueType type;

    private com.saic.www.precis._2009._06.base.ChecksumType checksum;

    private com.saic.www.precis._2009._06.base.StateType state;

    public IdentificationType() {
    }

    public IdentificationType(
           com.saic.www.precis._2009._06.base.IdentifierType identifier,
           com.saic.www.precis._2009._06.base.VersionType version,
           com.saic.www.precis._2009._06.base.CodespaceValueType type,
           com.saic.www.precis._2009._06.base.ChecksumType checksum,
           com.saic.www.precis._2009._06.base.StateType state) {
           this.identifier = identifier;
           this.version = version;
           this.type = type;
           this.checksum = checksum;
           this.state = state;
    }


    /**
     * Gets the identifier value for this IdentificationType.
     * 
     * @return identifier
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this IdentificationType.
     * 
     * @param identifier
     */
    public void setIdentifier(com.saic.www.precis._2009._06.base.IdentifierType identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the version value for this IdentificationType.
     * 
     * @return version
     */
    public com.saic.www.precis._2009._06.base.VersionType getVersion() {
        return version;
    }


    /**
     * Sets the version value for this IdentificationType.
     * 
     * @param version
     */
    public void setVersion(com.saic.www.precis._2009._06.base.VersionType version) {
        this.version = version;
    }


    /**
     * Gets the type value for this IdentificationType.
     * 
     * @return type
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType getType() {
        return type;
    }


    /**
     * Sets the type value for this IdentificationType.
     * 
     * @param type
     */
    public void setType(com.saic.www.precis._2009._06.base.CodespaceValueType type) {
        this.type = type;
    }


    /**
     * Gets the checksum value for this IdentificationType.
     * 
     * @return checksum
     */
    public com.saic.www.precis._2009._06.base.ChecksumType getChecksum() {
        return checksum;
    }


    /**
     * Sets the checksum value for this IdentificationType.
     * 
     * @param checksum
     */
    public void setChecksum(com.saic.www.precis._2009._06.base.ChecksumType checksum) {
        this.checksum = checksum;
    }


    /**
     * Gets the state value for this IdentificationType.
     * 
     * @return state
     */
    public com.saic.www.precis._2009._06.base.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this IdentificationType.
     * 
     * @param state
     */
    public void setState(com.saic.www.precis._2009._06.base.StateType state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificationType)) return false;
        IdentificationType other = (IdentificationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.checksum==null && other.getChecksum()==null) || 
             (this.checksum!=null &&
              this.checksum.equals(other.getChecksum()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getChecksum() != null) {
            _hashCode += getChecksum().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentificationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "VersionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CodespaceValueType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Checksum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ChecksumType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "StateType"));
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
