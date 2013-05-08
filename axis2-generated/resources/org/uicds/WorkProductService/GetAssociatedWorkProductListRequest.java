/**
 * GetAssociatedWorkProductListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class GetAssociatedWorkProductListRequest  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.IdentifierType identifier;

    public GetAssociatedWorkProductListRequest() {
    }

    public GetAssociatedWorkProductListRequest(
           com.saic.www.precis._2009._06.base.IdentifierType identifier) {
           this.identifier = identifier;
    }


    /**
     * Gets the identifier value for this GetAssociatedWorkProductListRequest.
     * 
     * @return identifier
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this GetAssociatedWorkProductListRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(com.saic.www.precis._2009._06.base.IdentifierType identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssociatedWorkProductListRequest)) return false;
        GetAssociatedWorkProductListRequest other = (GetAssociatedWorkProductListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssociatedWorkProductListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">GetAssociatedWorkProductListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
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
