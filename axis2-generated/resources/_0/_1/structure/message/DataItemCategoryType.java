/**
 * DataItemCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _0._1.structure.message;


/**
 * A structure that provides information about the type of event or
 * data type.  This may be used by service providers to indicate what
 * types of events or data are incorporated in the service provider and/or
 * its data sources, or in an individual data item.  Groups may work
 * together to define an appropriate list of categories that can be used
 * in searches among the groups to allow users to limit search results.
 * Structure could also be used by user interfaces for sorting purposes.
 */
public class DataItemCategoryType  implements java.io.Serializable {
    private java.lang.String dataItemCategoryText;

    private java.lang.String dataItemCategoryDescription;

    public DataItemCategoryType() {
    }

    public DataItemCategoryType(
           java.lang.String dataItemCategoryText,
           java.lang.String dataItemCategoryDescription) {
           this.dataItemCategoryText = dataItemCategoryText;
           this.dataItemCategoryDescription = dataItemCategoryDescription;
    }


    /**
     * Gets the dataItemCategoryText value for this DataItemCategoryType.
     * 
     * @return dataItemCategoryText
     */
    public java.lang.String getDataItemCategoryText() {
        return dataItemCategoryText;
    }


    /**
     * Sets the dataItemCategoryText value for this DataItemCategoryType.
     * 
     * @param dataItemCategoryText
     */
    public void setDataItemCategoryText(java.lang.String dataItemCategoryText) {
        this.dataItemCategoryText = dataItemCategoryText;
    }


    /**
     * Gets the dataItemCategoryDescription value for this DataItemCategoryType.
     * 
     * @return dataItemCategoryDescription
     */
    public java.lang.String getDataItemCategoryDescription() {
        return dataItemCategoryDescription;
    }


    /**
     * Sets the dataItemCategoryDescription value for this DataItemCategoryType.
     * 
     * @param dataItemCategoryDescription
     */
    public void setDataItemCategoryDescription(java.lang.String dataItemCategoryDescription) {
        this.dataItemCategoryDescription = dataItemCategoryDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataItemCategoryType)) return false;
        DataItemCategoryType other = (DataItemCategoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataItemCategoryText==null && other.getDataItemCategoryText()==null) || 
             (this.dataItemCategoryText!=null &&
              this.dataItemCategoryText.equals(other.getDataItemCategoryText()))) &&
            ((this.dataItemCategoryDescription==null && other.getDataItemCategoryDescription()==null) || 
             (this.dataItemCategoryDescription!=null &&
              this.dataItemCategoryDescription.equals(other.getDataItemCategoryDescription())));
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
        if (getDataItemCategoryText() != null) {
            _hashCode += getDataItemCategoryText().hashCode();
        }
        if (getDataItemCategoryDescription() != null) {
            _hashCode += getDataItemCategoryDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataItemCategoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemCategoryText");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataItemCategoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryDescription"));
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
