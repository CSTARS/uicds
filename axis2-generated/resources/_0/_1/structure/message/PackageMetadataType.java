/**
 * PackageMetadataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that describes Metadata about ULEX Package
 */
public class PackageMetadataType  implements java.io.Serializable {
    private java.lang.String dataItemID;

    private java.lang.Boolean dataItemCompleteIndicator;

    private java.lang.Object[] dataItemContactAbstract;

    private java.util.Date dataItemDate;

    private java.lang.String dataItemReferenceID;

    private _0._1.codes.message.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction;

    private java.lang.Object dataItemStatusAbstract;

    private _0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata;

    private java.lang.Object disseminationCriteriaAbstract;

    private _0._1.structure.message.DataItemCategoryType[] dataItemCategory;

    private java.lang.Object[] packageMetadataExtensionAbstract;

    public PackageMetadataType() {
    }

    public PackageMetadataType(
           java.lang.String dataItemID,
           java.lang.Boolean dataItemCompleteIndicator,
           java.lang.Object[] dataItemContactAbstract,
           java.util.Date dataItemDate,
           java.lang.String dataItemReferenceID,
           _0._1.codes.message.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction,
           java.lang.Object dataItemStatusAbstract,
           _0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata,
           java.lang.Object disseminationCriteriaAbstract,
           _0._1.structure.message.DataItemCategoryType[] dataItemCategory,
           java.lang.Object[] packageMetadataExtensionAbstract) {
           this.dataItemID = dataItemID;
           this.dataItemCompleteIndicator = dataItemCompleteIndicator;
           this.dataItemContactAbstract = dataItemContactAbstract;
           this.dataItemDate = dataItemDate;
           this.dataItemReferenceID = dataItemReferenceID;
           this.dataItemPublishInstruction = dataItemPublishInstruction;
           this.dataItemStatusAbstract = dataItemStatusAbstract;
           this.dataOwnerMetadata = dataOwnerMetadata;
           this.disseminationCriteriaAbstract = disseminationCriteriaAbstract;
           this.dataItemCategory = dataItemCategory;
           this.packageMetadataExtensionAbstract = packageMetadataExtensionAbstract;
    }


    /**
     * Gets the dataItemID value for this PackageMetadataType.
     * 
     * @return dataItemID
     */
    public java.lang.String getDataItemID() {
        return dataItemID;
    }


    /**
     * Sets the dataItemID value for this PackageMetadataType.
     * 
     * @param dataItemID
     */
    public void setDataItemID(java.lang.String dataItemID) {
        this.dataItemID = dataItemID;
    }


    /**
     * Gets the dataItemCompleteIndicator value for this PackageMetadataType.
     * 
     * @return dataItemCompleteIndicator
     */
    public java.lang.Boolean getDataItemCompleteIndicator() {
        return dataItemCompleteIndicator;
    }


    /**
     * Sets the dataItemCompleteIndicator value for this PackageMetadataType.
     * 
     * @param dataItemCompleteIndicator
     */
    public void setDataItemCompleteIndicator(java.lang.Boolean dataItemCompleteIndicator) {
        this.dataItemCompleteIndicator = dataItemCompleteIndicator;
    }


    /**
     * Gets the dataItemContactAbstract value for this PackageMetadataType.
     * 
     * @return dataItemContactAbstract
     */
    public java.lang.Object[] getDataItemContactAbstract() {
        return dataItemContactAbstract;
    }


    /**
     * Sets the dataItemContactAbstract value for this PackageMetadataType.
     * 
     * @param dataItemContactAbstract
     */
    public void setDataItemContactAbstract(java.lang.Object[] dataItemContactAbstract) {
        this.dataItemContactAbstract = dataItemContactAbstract;
    }

    public java.lang.Object getDataItemContactAbstract(int i) {
        return this.dataItemContactAbstract[i];
    }

    public void setDataItemContactAbstract(int i, java.lang.Object _value) {
        this.dataItemContactAbstract[i] = _value;
    }


    /**
     * Gets the dataItemDate value for this PackageMetadataType.
     * 
     * @return dataItemDate
     */
    public java.util.Date getDataItemDate() {
        return dataItemDate;
    }


    /**
     * Sets the dataItemDate value for this PackageMetadataType.
     * 
     * @param dataItemDate
     */
    public void setDataItemDate(java.util.Date dataItemDate) {
        this.dataItemDate = dataItemDate;
    }


    /**
     * Gets the dataItemReferenceID value for this PackageMetadataType.
     * 
     * @return dataItemReferenceID
     */
    public java.lang.String getDataItemReferenceID() {
        return dataItemReferenceID;
    }


    /**
     * Sets the dataItemReferenceID value for this PackageMetadataType.
     * 
     * @param dataItemReferenceID
     */
    public void setDataItemReferenceID(java.lang.String dataItemReferenceID) {
        this.dataItemReferenceID = dataItemReferenceID;
    }


    /**
     * Gets the dataItemPublishInstruction value for this PackageMetadataType.
     * 
     * @return dataItemPublishInstruction
     */
    public _0._1.codes.message.DataItemPublishInstructionCodeSimpleType getDataItemPublishInstruction() {
        return dataItemPublishInstruction;
    }


    /**
     * Sets the dataItemPublishInstruction value for this PackageMetadataType.
     * 
     * @param dataItemPublishInstruction
     */
    public void setDataItemPublishInstruction(_0._1.codes.message.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction) {
        this.dataItemPublishInstruction = dataItemPublishInstruction;
    }


    /**
     * Gets the dataItemStatusAbstract value for this PackageMetadataType.
     * 
     * @return dataItemStatusAbstract
     */
    public java.lang.Object getDataItemStatusAbstract() {
        return dataItemStatusAbstract;
    }


    /**
     * Sets the dataItemStatusAbstract value for this PackageMetadataType.
     * 
     * @param dataItemStatusAbstract
     */
    public void setDataItemStatusAbstract(java.lang.Object dataItemStatusAbstract) {
        this.dataItemStatusAbstract = dataItemStatusAbstract;
    }


    /**
     * Gets the dataOwnerMetadata value for this PackageMetadataType.
     * 
     * @return dataOwnerMetadata
     */
    public _0._1.structure.message.DataOwnerMetadataType getDataOwnerMetadata() {
        return dataOwnerMetadata;
    }


    /**
     * Sets the dataOwnerMetadata value for this PackageMetadataType.
     * 
     * @param dataOwnerMetadata
     */
    public void setDataOwnerMetadata(_0._1.structure.message.DataOwnerMetadataType dataOwnerMetadata) {
        this.dataOwnerMetadata = dataOwnerMetadata;
    }


    /**
     * Gets the disseminationCriteriaAbstract value for this PackageMetadataType.
     * 
     * @return disseminationCriteriaAbstract
     */
    public java.lang.Object getDisseminationCriteriaAbstract() {
        return disseminationCriteriaAbstract;
    }


    /**
     * Sets the disseminationCriteriaAbstract value for this PackageMetadataType.
     * 
     * @param disseminationCriteriaAbstract
     */
    public void setDisseminationCriteriaAbstract(java.lang.Object disseminationCriteriaAbstract) {
        this.disseminationCriteriaAbstract = disseminationCriteriaAbstract;
    }


    /**
     * Gets the dataItemCategory value for this PackageMetadataType.
     * 
     * @return dataItemCategory
     */
    public _0._1.structure.message.DataItemCategoryType[] getDataItemCategory() {
        return dataItemCategory;
    }


    /**
     * Sets the dataItemCategory value for this PackageMetadataType.
     * 
     * @param dataItemCategory
     */
    public void setDataItemCategory(_0._1.structure.message.DataItemCategoryType[] dataItemCategory) {
        this.dataItemCategory = dataItemCategory;
    }

    public _0._1.structure.message.DataItemCategoryType getDataItemCategory(int i) {
        return this.dataItemCategory[i];
    }

    public void setDataItemCategory(int i, _0._1.structure.message.DataItemCategoryType _value) {
        this.dataItemCategory[i] = _value;
    }


    /**
     * Gets the packageMetadataExtensionAbstract value for this PackageMetadataType.
     * 
     * @return packageMetadataExtensionAbstract
     */
    public java.lang.Object[] getPackageMetadataExtensionAbstract() {
        return packageMetadataExtensionAbstract;
    }


    /**
     * Sets the packageMetadataExtensionAbstract value for this PackageMetadataType.
     * 
     * @param packageMetadataExtensionAbstract
     */
    public void setPackageMetadataExtensionAbstract(java.lang.Object[] packageMetadataExtensionAbstract) {
        this.packageMetadataExtensionAbstract = packageMetadataExtensionAbstract;
    }

    public java.lang.Object getPackageMetadataExtensionAbstract(int i) {
        return this.packageMetadataExtensionAbstract[i];
    }

    public void setPackageMetadataExtensionAbstract(int i, java.lang.Object _value) {
        this.packageMetadataExtensionAbstract[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageMetadataType)) return false;
        PackageMetadataType other = (PackageMetadataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataItemID==null && other.getDataItemID()==null) || 
             (this.dataItemID!=null &&
              this.dataItemID.equals(other.getDataItemID()))) &&
            ((this.dataItemCompleteIndicator==null && other.getDataItemCompleteIndicator()==null) || 
             (this.dataItemCompleteIndicator!=null &&
              this.dataItemCompleteIndicator.equals(other.getDataItemCompleteIndicator()))) &&
            ((this.dataItemContactAbstract==null && other.getDataItemContactAbstract()==null) || 
             (this.dataItemContactAbstract!=null &&
              java.util.Arrays.equals(this.dataItemContactAbstract, other.getDataItemContactAbstract()))) &&
            ((this.dataItemDate==null && other.getDataItemDate()==null) || 
             (this.dataItemDate!=null &&
              this.dataItemDate.equals(other.getDataItemDate()))) &&
            ((this.dataItemReferenceID==null && other.getDataItemReferenceID()==null) || 
             (this.dataItemReferenceID!=null &&
              this.dataItemReferenceID.equals(other.getDataItemReferenceID()))) &&
            ((this.dataItemPublishInstruction==null && other.getDataItemPublishInstruction()==null) || 
             (this.dataItemPublishInstruction!=null &&
              this.dataItemPublishInstruction.equals(other.getDataItemPublishInstruction()))) &&
            ((this.dataItemStatusAbstract==null && other.getDataItemStatusAbstract()==null) || 
             (this.dataItemStatusAbstract!=null &&
              this.dataItemStatusAbstract.equals(other.getDataItemStatusAbstract()))) &&
            ((this.dataOwnerMetadata==null && other.getDataOwnerMetadata()==null) || 
             (this.dataOwnerMetadata!=null &&
              this.dataOwnerMetadata.equals(other.getDataOwnerMetadata()))) &&
            ((this.disseminationCriteriaAbstract==null && other.getDisseminationCriteriaAbstract()==null) || 
             (this.disseminationCriteriaAbstract!=null &&
              this.disseminationCriteriaAbstract.equals(other.getDisseminationCriteriaAbstract()))) &&
            ((this.dataItemCategory==null && other.getDataItemCategory()==null) || 
             (this.dataItemCategory!=null &&
              java.util.Arrays.equals(this.dataItemCategory, other.getDataItemCategory()))) &&
            ((this.packageMetadataExtensionAbstract==null && other.getPackageMetadataExtensionAbstract()==null) || 
             (this.packageMetadataExtensionAbstract!=null &&
              java.util.Arrays.equals(this.packageMetadataExtensionAbstract, other.getPackageMetadataExtensionAbstract())));
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
        if (getDataItemID() != null) {
            _hashCode += getDataItemID().hashCode();
        }
        if (getDataItemCompleteIndicator() != null) {
            _hashCode += getDataItemCompleteIndicator().hashCode();
        }
        if (getDataItemContactAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataItemContactAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataItemContactAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataItemDate() != null) {
            _hashCode += getDataItemDate().hashCode();
        }
        if (getDataItemReferenceID() != null) {
            _hashCode += getDataItemReferenceID().hashCode();
        }
        if (getDataItemPublishInstruction() != null) {
            _hashCode += getDataItemPublishInstruction().hashCode();
        }
        if (getDataItemStatusAbstract() != null) {
            _hashCode += getDataItemStatusAbstract().hashCode();
        }
        if (getDataOwnerMetadata() != null) {
            _hashCode += getDataOwnerMetadata().hashCode();
        }
        if (getDisseminationCriteriaAbstract() != null) {
            _hashCode += getDisseminationCriteriaAbstract().hashCode();
        }
        if (getDataItemCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataItemCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataItemCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageMetadataExtensionAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageMetadataExtensionAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageMetadataExtensionAbstract(), i);
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
        new org.apache.axis.description.TypeDesc(PackageMetadataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemCompleteIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCompleteIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemContactAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemContactAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemContactAbstract"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemDate");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemPublishInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPublishInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:codes:1.0", "DataItemPublishInstructionCodeSimpleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemStatusAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemStatusAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOwnerMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disseminationCriteriaAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DisseminationCriteriaAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageMetadataExtensionAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract"));
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
