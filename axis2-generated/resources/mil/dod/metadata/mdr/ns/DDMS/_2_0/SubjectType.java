/**
 * SubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mil.dod.metadata.mdr.ns.DDMS._2_0;

public class SubjectType  implements java.io.Serializable {
    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCategoryIdentifierType category;

    private mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundKeywordIdentifierType keyword;

    public SubjectType() {
    }

    public SubjectType(
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCategoryIdentifierType category,
           mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundKeywordIdentifierType keyword) {
           this.category = category;
           this.keyword = keyword;
    }


    /**
     * Gets the category value for this SubjectType.
     * 
     * @return category
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCategoryIdentifierType getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SubjectType.
     * 
     * @param category
     */
    public void setCategory(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundCategoryIdentifierType category) {
        this.category = category;
    }


    /**
     * Gets the keyword value for this SubjectType.
     * 
     * @return keyword
     */
    public mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundKeywordIdentifierType getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this SubjectType.
     * 
     * @param keyword
     */
    public void setKeyword(mil.dod.metadata.mdr.ns.DDMS._2_0.CompoundKeywordIdentifierType keyword) {
        this.keyword = keyword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectType)) return false;
        SubjectType other = (SubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "SubjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CompoundCategoryIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CompoundKeywordIdentifierType"));
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
