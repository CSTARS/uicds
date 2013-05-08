/**
 * PublishProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class PublishProductResponse  implements java.io.Serializable {
    private org.uicds.WorkProductService.WorkProductPublicationResponseType workProductPublicationResponse;

    public PublishProductResponse() {
    }

    public PublishProductResponse(
           org.uicds.WorkProductService.WorkProductPublicationResponseType workProductPublicationResponse) {
           this.workProductPublicationResponse = workProductPublicationResponse;
    }


    /**
     * Gets the workProductPublicationResponse value for this PublishProductResponse.
     * 
     * @return workProductPublicationResponse
     */
    public org.uicds.WorkProductService.WorkProductPublicationResponseType getWorkProductPublicationResponse() {
        return workProductPublicationResponse;
    }


    /**
     * Sets the workProductPublicationResponse value for this PublishProductResponse.
     * 
     * @param workProductPublicationResponse
     */
    public void setWorkProductPublicationResponse(org.uicds.WorkProductService.WorkProductPublicationResponseType workProductPublicationResponse) {
        this.workProductPublicationResponse = workProductPublicationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishProductResponse)) return false;
        PublishProductResponse other = (PublishProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workProductPublicationResponse==null && other.getWorkProductPublicationResponse()==null) || 
             (this.workProductPublicationResponse!=null &&
              this.workProductPublicationResponse.equals(other.getWorkProductPublicationResponse())));
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
        if (getWorkProductPublicationResponse() != null) {
            _hashCode += getWorkProductPublicationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">PublishProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProductPublicationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponseType"));
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
