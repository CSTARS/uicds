/**
 * SubordinateSuperiorRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for expressing a subordinate/superior relationship
 * between two agents.
 */
public class SubordinateSuperiorRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The subordinate person or organization in this relationship. */
    private gov.ucore.ucore._2_0.AgentRefType subordinate;

    /* The superior person or organization in this relationship. */
    private gov.ucore.ucore._2_0.AgentRefType superior;

    public SubordinateSuperiorRelationshipType() {
    }

    public SubordinateSuperiorRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.AgentRefType subordinate,
           gov.ucore.ucore._2_0.AgentRefType superior) {
        super(
            id,
            metadata,
            time);
        this.subordinate = subordinate;
        this.superior = superior;
    }


    /**
     * Gets the subordinate value for this SubordinateSuperiorRelationshipType.
     * 
     * @return subordinate   * The subordinate person or organization in this relationship.
     */
    public gov.ucore.ucore._2_0.AgentRefType getSubordinate() {
        return subordinate;
    }


    /**
     * Sets the subordinate value for this SubordinateSuperiorRelationshipType.
     * 
     * @param subordinate   * The subordinate person or organization in this relationship.
     */
    public void setSubordinate(gov.ucore.ucore._2_0.AgentRefType subordinate) {
        this.subordinate = subordinate;
    }


    /**
     * Gets the superior value for this SubordinateSuperiorRelationshipType.
     * 
     * @return superior   * The superior person or organization in this relationship.
     */
    public gov.ucore.ucore._2_0.AgentRefType getSuperior() {
        return superior;
    }


    /**
     * Sets the superior value for this SubordinateSuperiorRelationshipType.
     * 
     * @param superior   * The superior person or organization in this relationship.
     */
    public void setSuperior(gov.ucore.ucore._2_0.AgentRefType superior) {
        this.superior = superior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubordinateSuperiorRelationshipType)) return false;
        SubordinateSuperiorRelationshipType other = (SubordinateSuperiorRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subordinate==null && other.getSubordinate()==null) || 
             (this.subordinate!=null &&
              this.subordinate.equals(other.getSubordinate()))) &&
            ((this.superior==null && other.getSuperior()==null) || 
             (this.superior!=null &&
              this.superior.equals(other.getSuperior())));
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
        if (getSubordinate() != null) {
            _hashCode += getSubordinate().hashCode();
        }
        if (getSuperior() != null) {
            _hashCode += getSuperior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubordinateSuperiorRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SubordinateSuperiorRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subordinate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Subordinate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Superior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRefType"));
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
