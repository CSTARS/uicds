/**
 * PropertiesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.base;

public class PropertiesType  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.DateTimeType created;

    private com.saic.www.precis._2009._06.base.IdentifierType createdBy;

    private com.saic.www.precis._2009._06.base.DateTimeType lastUpdated;

    private com.saic.www.precis._2009._06.base.IdentifierType lastUpdatedBy;

    private com.saic.www.precis._2009._06.base.IntegerType kilobytes;

    private com.saic.www.precis._2009._06.base.CodespaceValueType mimeType;

    private com.saic.www.precis._2009._06.base.IdentifierType[] associatedGroups;

    public PropertiesType() {
    }

    public PropertiesType(
           com.saic.www.precis._2009._06.base.DateTimeType created,
           com.saic.www.precis._2009._06.base.IdentifierType createdBy,
           com.saic.www.precis._2009._06.base.DateTimeType lastUpdated,
           com.saic.www.precis._2009._06.base.IdentifierType lastUpdatedBy,
           com.saic.www.precis._2009._06.base.IntegerType kilobytes,
           com.saic.www.precis._2009._06.base.CodespaceValueType mimeType,
           com.saic.www.precis._2009._06.base.IdentifierType[] associatedGroups) {
           this.created = created;
           this.createdBy = createdBy;
           this.lastUpdated = lastUpdated;
           this.lastUpdatedBy = lastUpdatedBy;
           this.kilobytes = kilobytes;
           this.mimeType = mimeType;
           this.associatedGroups = associatedGroups;
    }


    /**
     * Gets the created value for this PropertiesType.
     * 
     * @return created
     */
    public com.saic.www.precis._2009._06.base.DateTimeType getCreated() {
        return created;
    }


    /**
     * Sets the created value for this PropertiesType.
     * 
     * @param created
     */
    public void setCreated(com.saic.www.precis._2009._06.base.DateTimeType created) {
        this.created = created;
    }


    /**
     * Gets the createdBy value for this PropertiesType.
     * 
     * @return createdBy
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this PropertiesType.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.saic.www.precis._2009._06.base.IdentifierType createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the lastUpdated value for this PropertiesType.
     * 
     * @return lastUpdated
     */
    public com.saic.www.precis._2009._06.base.DateTimeType getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this PropertiesType.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(com.saic.www.precis._2009._06.base.DateTimeType lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the lastUpdatedBy value for this PropertiesType.
     * 
     * @return lastUpdatedBy
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getLastUpdatedBy() {
        return lastUpdatedBy;
    }


    /**
     * Sets the lastUpdatedBy value for this PropertiesType.
     * 
     * @param lastUpdatedBy
     */
    public void setLastUpdatedBy(com.saic.www.precis._2009._06.base.IdentifierType lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }


    /**
     * Gets the kilobytes value for this PropertiesType.
     * 
     * @return kilobytes
     */
    public com.saic.www.precis._2009._06.base.IntegerType getKilobytes() {
        return kilobytes;
    }


    /**
     * Sets the kilobytes value for this PropertiesType.
     * 
     * @param kilobytes
     */
    public void setKilobytes(com.saic.www.precis._2009._06.base.IntegerType kilobytes) {
        this.kilobytes = kilobytes;
    }


    /**
     * Gets the mimeType value for this PropertiesType.
     * 
     * @return mimeType
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this PropertiesType.
     * 
     * @param mimeType
     */
    public void setMimeType(com.saic.www.precis._2009._06.base.CodespaceValueType mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the associatedGroups value for this PropertiesType.
     * 
     * @return associatedGroups
     */
    public com.saic.www.precis._2009._06.base.IdentifierType[] getAssociatedGroups() {
        return associatedGroups;
    }


    /**
     * Sets the associatedGroups value for this PropertiesType.
     * 
     * @param associatedGroups
     */
    public void setAssociatedGroups(com.saic.www.precis._2009._06.base.IdentifierType[] associatedGroups) {
        this.associatedGroups = associatedGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertiesType)) return false;
        PropertiesType other = (PropertiesType) obj;
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
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.lastUpdatedBy==null && other.getLastUpdatedBy()==null) || 
             (this.lastUpdatedBy!=null &&
              this.lastUpdatedBy.equals(other.getLastUpdatedBy()))) &&
            ((this.kilobytes==null && other.getKilobytes()==null) || 
             (this.kilobytes!=null &&
              this.kilobytes.equals(other.getKilobytes()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.associatedGroups==null && other.getAssociatedGroups()==null) || 
             (this.associatedGroups!=null &&
              java.util.Arrays.equals(this.associatedGroups, other.getAssociatedGroups())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getLastUpdatedBy() != null) {
            _hashCode += getLastUpdatedBy().hashCode();
        }
        if (getKilobytes() != null) {
            _hashCode += getKilobytes().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getAssociatedGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedGroups(), i);
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
        new org.apache.axis.description.TypeDesc(PropertiesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "PropertiesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilobytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Kilobytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IntegerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "MimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CodespaceValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "AssociatedGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", ">AssociatedGroups"));
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
