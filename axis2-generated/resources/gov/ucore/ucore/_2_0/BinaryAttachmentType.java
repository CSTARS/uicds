/**
 * BinaryAttachmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A data type for a digital representation of an object encoded in
 * a binary format.
 */
public class BinaryAttachmentType  extends gov.ucore.ucore._2_0.AttachmentContentType  implements java.io.Serializable {
    /* The actual content, base 64 binary. */
    private byte[] binaryContent;

    /* A description of this binary object. */
    private java.lang.String binaryDescription;

    /* Size of the binary object in kilobytes (kB). */
    private java.lang.Integer binarySize;

    /* The type of encoded object, e.g. XSLT, XML, PNG, JPG. */
    private java.lang.String category;

    public BinaryAttachmentType() {
    }

    public BinaryAttachmentType(
           org.apache.axis.types.Id id,
           v2.ism.ic.gov.us.ClassificationType classification,
           org.apache.axis.types.NMTokens ownerProducer,
           org.apache.axis.types.NMTokens SCIcontrols,
           org.apache.axis.types.NMTokens SARIdentifier,
           org.apache.axis.types.NMTokens disseminationControls,
           org.apache.axis.types.NMTokens FGIsourceOpen,
           org.apache.axis.types.NMTokens FGIsourceProtected,
           org.apache.axis.types.NMTokens releasableTo,
           org.apache.axis.types.NMTokens nonICmarkings,
           java.lang.String classifiedBy,
           java.lang.String derivativelyClassifiedBy,
           java.lang.String classificationReason,
           java.lang.String derivedFrom,
           java.util.Date declassDate,
           java.lang.String declassEvent,
           org.apache.axis.types.NMTokens declassException,
           org.apache.axis.types.NMTokens typeOfExemptedSource,
           java.util.Date dateOfExemptedSource,
           java.lang.Boolean declassManualReview,
           byte[] binaryContent,
           java.lang.String binaryDescription,
           java.lang.Integer binarySize,
           java.lang.String category) {
        super(
            id,
            classification,
            ownerProducer,
            SCIcontrols,
            SARIdentifier,
            disseminationControls,
            FGIsourceOpen,
            FGIsourceProtected,
            releasableTo,
            nonICmarkings,
            classifiedBy,
            derivativelyClassifiedBy,
            classificationReason,
            derivedFrom,
            declassDate,
            declassEvent,
            declassException,
            typeOfExemptedSource,
            dateOfExemptedSource,
            declassManualReview);
        this.binaryContent = binaryContent;
        this.binaryDescription = binaryDescription;
        this.binarySize = binarySize;
        this.category = category;
    }


    /**
     * Gets the binaryContent value for this BinaryAttachmentType.
     * 
     * @return binaryContent   * The actual content, base 64 binary.
     */
    public byte[] getBinaryContent() {
        return binaryContent;
    }


    /**
     * Sets the binaryContent value for this BinaryAttachmentType.
     * 
     * @param binaryContent   * The actual content, base 64 binary.
     */
    public void setBinaryContent(byte[] binaryContent) {
        this.binaryContent = binaryContent;
    }


    /**
     * Gets the binaryDescription value for this BinaryAttachmentType.
     * 
     * @return binaryDescription   * A description of this binary object.
     */
    public java.lang.String getBinaryDescription() {
        return binaryDescription;
    }


    /**
     * Sets the binaryDescription value for this BinaryAttachmentType.
     * 
     * @param binaryDescription   * A description of this binary object.
     */
    public void setBinaryDescription(java.lang.String binaryDescription) {
        this.binaryDescription = binaryDescription;
    }


    /**
     * Gets the binarySize value for this BinaryAttachmentType.
     * 
     * @return binarySize   * Size of the binary object in kilobytes (kB).
     */
    public java.lang.Integer getBinarySize() {
        return binarySize;
    }


    /**
     * Sets the binarySize value for this BinaryAttachmentType.
     * 
     * @param binarySize   * Size of the binary object in kilobytes (kB).
     */
    public void setBinarySize(java.lang.Integer binarySize) {
        this.binarySize = binarySize;
    }


    /**
     * Gets the category value for this BinaryAttachmentType.
     * 
     * @return category   * The type of encoded object, e.g. XSLT, XML, PNG, JPG.
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this BinaryAttachmentType.
     * 
     * @param category   * The type of encoded object, e.g. XSLT, XML, PNG, JPG.
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinaryAttachmentType)) return false;
        BinaryAttachmentType other = (BinaryAttachmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.binaryContent==null && other.getBinaryContent()==null) || 
             (this.binaryContent!=null &&
              java.util.Arrays.equals(this.binaryContent, other.getBinaryContent()))) &&
            ((this.binaryDescription==null && other.getBinaryDescription()==null) || 
             (this.binaryDescription!=null &&
              this.binaryDescription.equals(other.getBinaryDescription()))) &&
            ((this.binarySize==null && other.getBinarySize()==null) || 
             (this.binarySize!=null &&
              this.binarySize.equals(other.getBinarySize()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getBinaryContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinaryContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinaryContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinaryDescription() != null) {
            _hashCode += getBinaryDescription().hashCode();
        }
        if (getBinarySize() != null) {
            _hashCode += getBinarySize().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinaryAttachmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryAttachmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binarySize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinarySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
