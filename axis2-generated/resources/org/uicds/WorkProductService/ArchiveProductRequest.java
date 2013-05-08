/**
 * ArchiveProductRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class ArchiveProductRequest  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification;

    public ArchiveProductRequest() {
    }

    public ArchiveProductRequest(
           com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification) {
           this.workProductIdentification = workProductIdentification;
    }


    /**
     * Gets the workProductIdentification value for this ArchiveProductRequest.
     * 
     * @return workProductIdentification
     */
    public com.saic.www.precis._2009._06.base.IdentificationType getWorkProductIdentification() {
        return workProductIdentification;
    }


    /**
     * Sets the workProductIdentification value for this ArchiveProductRequest.
     * 
     * @param workProductIdentification
     */
    public void setWorkProductIdentification(com.saic.www.precis._2009._06.base.IdentificationType workProductIdentification) {
        this.workProductIdentification = workProductIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveProductRequest)) return false;
        ArchiveProductRequest other = (ArchiveProductRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workProductIdentification==null && other.getWorkProductIdentification()==null) || 
             (this.workProductIdentification!=null &&
              this.workProductIdentification.equals(other.getWorkProductIdentification())));
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
        if (getWorkProductIdentification() != null) {
            _hashCode += getWorkProductIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveProductRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">ArchiveProductRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProductIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentificationType"));
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
