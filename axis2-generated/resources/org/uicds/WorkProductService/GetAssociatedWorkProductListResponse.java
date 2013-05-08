/**
 * GetAssociatedWorkProductListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class GetAssociatedWorkProductListResponse  implements java.io.Serializable {
    private org.uicds.WorkProductService.WorkProductList workProductList;

    public GetAssociatedWorkProductListResponse() {
    }

    public GetAssociatedWorkProductListResponse(
           org.uicds.WorkProductService.WorkProductList workProductList) {
           this.workProductList = workProductList;
    }


    /**
     * Gets the workProductList value for this GetAssociatedWorkProductListResponse.
     * 
     * @return workProductList
     */
    public org.uicds.WorkProductService.WorkProductList getWorkProductList() {
        return workProductList;
    }


    /**
     * Sets the workProductList value for this GetAssociatedWorkProductListResponse.
     * 
     * @param workProductList
     */
    public void setWorkProductList(org.uicds.WorkProductService.WorkProductList workProductList) {
        this.workProductList = workProductList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssociatedWorkProductListResponse)) return false;
        GetAssociatedWorkProductListResponse other = (GetAssociatedWorkProductListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workProductList==null && other.getWorkProductList()==null) || 
             (this.workProductList!=null &&
              this.workProductList.equals(other.getWorkProductList())));
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
        if (getWorkProductList() != null) {
            _hashCode += getWorkProductList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssociatedWorkProductListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">GetAssociatedWorkProductListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProductList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">WorkProductList"));
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
