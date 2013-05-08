/**
 * InterestGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.saic.www.precis._2009._06.structures;

public class InterestGroupType  implements java.io.Serializable {
    private java.lang.String interestGroupType;

    private com.saic.www.precis._2009._06.base.CodespaceValueType[] interestGroupSubType;

    private org.apache.axis.types.Name name;

    private java.lang.String description;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox;

    private com.saic.www.precis._2009._06.base.IdentifierType specializedWorkProduct;

    private java.lang.String specializedUICDSService;

    private java.lang.String[] sharedCoreName;

    public InterestGroupType() {
    }

    public InterestGroupType(
           java.lang.String interestGroupType,
           com.saic.www.precis._2009._06.base.CodespaceValueType[] interestGroupSubType,
           org.apache.axis.types.Name name,
           java.lang.String description,
           mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox,
           com.saic.www.precis._2009._06.base.IdentifierType specializedWorkProduct,
           java.lang.String specializedUICDSService,
           java.lang.String[] sharedCoreName) {
           this.interestGroupType = interestGroupType;
           this.interestGroupSubType = interestGroupSubType;
           this.name = name;
           this.description = description;
           this.boundingBox = boundingBox;
           this.specializedWorkProduct = specializedWorkProduct;
           this.specializedUICDSService = specializedUICDSService;
           this.sharedCoreName = sharedCoreName;
    }


    /**
     * Gets the interestGroupType value for this InterestGroupType.
     * 
     * @return interestGroupType
     */
    public java.lang.String getInterestGroupType() {
        return interestGroupType;
    }


    /**
     * Sets the interestGroupType value for this InterestGroupType.
     * 
     * @param interestGroupType
     */
    public void setInterestGroupType(java.lang.String interestGroupType) {
        this.interestGroupType = interestGroupType;
    }


    /**
     * Gets the interestGroupSubType value for this InterestGroupType.
     * 
     * @return interestGroupSubType
     */
    public com.saic.www.precis._2009._06.base.CodespaceValueType[] getInterestGroupSubType() {
        return interestGroupSubType;
    }


    /**
     * Sets the interestGroupSubType value for this InterestGroupType.
     * 
     * @param interestGroupSubType
     */
    public void setInterestGroupSubType(com.saic.www.precis._2009._06.base.CodespaceValueType[] interestGroupSubType) {
        this.interestGroupSubType = interestGroupSubType;
    }

    public com.saic.www.precis._2009._06.base.CodespaceValueType getInterestGroupSubType(int i) {
        return this.interestGroupSubType[i];
    }

    public void setInterestGroupSubType(int i, com.saic.www.precis._2009._06.base.CodespaceValueType _value) {
        this.interestGroupSubType[i] = _value;
    }


    /**
     * Gets the name value for this InterestGroupType.
     * 
     * @return name
     */
    public org.apache.axis.types.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this InterestGroupType.
     * 
     * @param name
     */
    public void setName(org.apache.axis.types.Name name) {
        this.name = name;
    }


    /**
     * Gets the description value for this InterestGroupType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InterestGroupType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the boundingBox value for this InterestGroupType.
     * 
     * @return boundingBox
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType getBoundingBox() {
        return boundingBox;
    }


    /**
     * Sets the boundingBox value for this InterestGroupType.
     * 
     * @param boundingBox
     */
    public void setBoundingBox(mil.dod.metadata.mdr.ns.DDMS._2_0.BoundingBoxType boundingBox) {
        this.boundingBox = boundingBox;
    }


    /**
     * Gets the specializedWorkProduct value for this InterestGroupType.
     * 
     * @return specializedWorkProduct
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getSpecializedWorkProduct() {
        return specializedWorkProduct;
    }


    /**
     * Sets the specializedWorkProduct value for this InterestGroupType.
     * 
     * @param specializedWorkProduct
     */
    public void setSpecializedWorkProduct(com.saic.www.precis._2009._06.base.IdentifierType specializedWorkProduct) {
        this.specializedWorkProduct = specializedWorkProduct;
    }


    /**
     * Gets the specializedUICDSService value for this InterestGroupType.
     * 
     * @return specializedUICDSService
     */
    public java.lang.String getSpecializedUICDSService() {
        return specializedUICDSService;
    }


    /**
     * Sets the specializedUICDSService value for this InterestGroupType.
     * 
     * @param specializedUICDSService
     */
    public void setSpecializedUICDSService(java.lang.String specializedUICDSService) {
        this.specializedUICDSService = specializedUICDSService;
    }


    /**
     * Gets the sharedCoreName value for this InterestGroupType.
     * 
     * @return sharedCoreName
     */
    public java.lang.String[] getSharedCoreName() {
        return sharedCoreName;
    }


    /**
     * Sets the sharedCoreName value for this InterestGroupType.
     * 
     * @param sharedCoreName
     */
    public void setSharedCoreName(java.lang.String[] sharedCoreName) {
        this.sharedCoreName = sharedCoreName;
    }

    public java.lang.String getSharedCoreName(int i) {
        return this.sharedCoreName[i];
    }

    public void setSharedCoreName(int i, java.lang.String _value) {
        this.sharedCoreName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterestGroupType)) return false;
        InterestGroupType other = (InterestGroupType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interestGroupType==null && other.getInterestGroupType()==null) || 
             (this.interestGroupType!=null &&
              this.interestGroupType.equals(other.getInterestGroupType()))) &&
            ((this.interestGroupSubType==null && other.getInterestGroupSubType()==null) || 
             (this.interestGroupSubType!=null &&
              java.util.Arrays.equals(this.interestGroupSubType, other.getInterestGroupSubType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.boundingBox==null && other.getBoundingBox()==null) || 
             (this.boundingBox!=null &&
              this.boundingBox.equals(other.getBoundingBox()))) &&
            ((this.specializedWorkProduct==null && other.getSpecializedWorkProduct()==null) || 
             (this.specializedWorkProduct!=null &&
              this.specializedWorkProduct.equals(other.getSpecializedWorkProduct()))) &&
            ((this.specializedUICDSService==null && other.getSpecializedUICDSService()==null) || 
             (this.specializedUICDSService!=null &&
              this.specializedUICDSService.equals(other.getSpecializedUICDSService()))) &&
            ((this.sharedCoreName==null && other.getSharedCoreName()==null) || 
             (this.sharedCoreName!=null &&
              java.util.Arrays.equals(this.sharedCoreName, other.getSharedCoreName())));
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
        if (getInterestGroupType() != null) {
            _hashCode += getInterestGroupType().hashCode();
        }
        if (getInterestGroupSubType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterestGroupSubType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterestGroupSubType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBoundingBox() != null) {
            _hashCode += getBoundingBox().hashCode();
        }
        if (getSpecializedWorkProduct() != null) {
            _hashCode += getSpecializedWorkProduct().hashCode();
        }
        if (getSpecializedUICDSService() != null) {
            _hashCode += getSpecializedUICDSService().hashCode();
        }
        if (getSharedCoreName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedCoreName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedCoreName(), i);
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
        new org.apache.axis.description.TypeDesc(InterestGroupType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestGroupSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CodespaceValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "Name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundingBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "BoundingBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "BoundingBoxType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specializedWorkProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SpecializedWorkProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specializedUICDSService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SpecializedUICDSService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedCoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SharedCoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
