/**
 * AssociateWorkProductToInterestGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.uicds.WorkProductService;

public class AssociateWorkProductToInterestGroupRequest  implements java.io.Serializable {
    private com.saic.www.precis._2009._06.base.IdentifierType workProductID;

    private com.saic.www.precis._2009._06.base.IdentifierType incidentID;

    public AssociateWorkProductToInterestGroupRequest() {
    }

    public AssociateWorkProductToInterestGroupRequest(
           com.saic.www.precis._2009._06.base.IdentifierType workProductID,
           com.saic.www.precis._2009._06.base.IdentifierType incidentID) {
           this.workProductID = workProductID;
           this.incidentID = incidentID;
    }


    /**
     * Gets the workProductID value for this AssociateWorkProductToInterestGroupRequest.
     * 
     * @return workProductID
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getWorkProductID() {
        return workProductID;
    }


    /**
     * Sets the workProductID value for this AssociateWorkProductToInterestGroupRequest.
     * 
     * @param workProductID
     */
    public void setWorkProductID(com.saic.www.precis._2009._06.base.IdentifierType workProductID) {
        this.workProductID = workProductID;
    }


    /**
     * Gets the incidentID value for this AssociateWorkProductToInterestGroupRequest.
     * 
     * @return incidentID
     */
    public com.saic.www.precis._2009._06.base.IdentifierType getIncidentID() {
        return incidentID;
    }


    /**
     * Sets the incidentID value for this AssociateWorkProductToInterestGroupRequest.
     * 
     * @param incidentID
     */
    public void setIncidentID(com.saic.www.precis._2009._06.base.IdentifierType incidentID) {
        this.incidentID = incidentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociateWorkProductToInterestGroupRequest)) return false;
        AssociateWorkProductToInterestGroupRequest other = (AssociateWorkProductToInterestGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workProductID==null && other.getWorkProductID()==null) || 
             (this.workProductID!=null &&
              this.workProductID.equals(other.getWorkProductID()))) &&
            ((this.incidentID==null && other.getIncidentID()==null) || 
             (this.incidentID!=null &&
              this.incidentID.equals(other.getIncidentID())));
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
        if (getWorkProductID() != null) {
            _hashCode += getWorkProductID().hashCode();
        }
        if (getIncidentID() != null) {
            _hashCode += getIncidentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociateWorkProductToInterestGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", ">AssociateWorkProductToInterestGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "IdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "IncidentID"));
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
