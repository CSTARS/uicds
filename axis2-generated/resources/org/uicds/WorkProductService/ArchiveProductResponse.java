/**
 * ArchiveProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class ArchiveProductResponse  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.ProcessingStatusType workProductProcessingStatus;

    public ArchiveProductResponse() {
    }

    public ArchiveProductResponse(
           com.saic.www.precis._2009._06.base.ProcessingStatusType workProductProcessingStatus) {
           this.workProductProcessingStatus = workProductProcessingStatus;
    }


    /**
     * Gets the workProductProcessingStatus value for this ArchiveProductResponse.
     * 
     * @return workProductProcessingStatus
     */
    public com.saic.www.precis._2009._06.base.ProcessingStatusType getWorkProductProcessingStatus() {
        return workProductProcessingStatus;
    }


    /**
     * Sets the workProductProcessingStatus value for this ArchiveProductResponse.
     * 
     * @param workProductProcessingStatus
     */
    public void setWorkProductProcessingStatus(com.saic.www.precis._2009._06.base.ProcessingStatusType workProductProcessingStatus) {
        this.workProductProcessingStatus = workProductProcessingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveProductResponse)) return false;
        ArchiveProductResponse other = (ArchiveProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workProductProcessingStatus==null && other.getWorkProductProcessingStatus()==null) || 
             (this.workProductProcessingStatus!=null &&
              this.workProductProcessingStatus.equals(other.getWorkProductProcessingStatus())));
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
        if (getWorkProductProcessingStatus() != null) {
            _hashCode += getWorkProductProcessingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">ArchiveProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProductProcessingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProcessingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ProcessingStatusType"));
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
