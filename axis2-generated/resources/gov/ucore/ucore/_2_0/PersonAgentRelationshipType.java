/**
 * PersonAgentRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between a person and an agent
 * (person or organization).
 */
public class PersonAgentRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The persons to whom this relationship applies. */
    private gov.ucore.ucore._2_0.PersonRefType personRef;

    /* The agent to whom this relationship applies. */
    private gov.ucore.ucore._2_0.AgentRefType agentRef;

    public PersonAgentRelationshipType() {
    }

    public PersonAgentRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.PersonRefType personRef,
           gov.ucore.ucore._2_0.AgentRefType agentRef) {
        super(
            id,
            metadata,
            time);
        this.personRef = personRef;
        this.agentRef = agentRef;
    }


    /**
     * Gets the personRef value for this PersonAgentRelationshipType.
     * 
     * @return personRef   * The persons to whom this relationship applies.
     */
    public gov.ucore.ucore._2_0.PersonRefType getPersonRef() {
        return personRef;
    }


    /**
     * Sets the personRef value for this PersonAgentRelationshipType.
     * 
     * @param personRef   * The persons to whom this relationship applies.
     */
    public void setPersonRef(gov.ucore.ucore._2_0.PersonRefType personRef) {
        this.personRef = personRef;
    }


    /**
     * Gets the agentRef value for this PersonAgentRelationshipType.
     * 
     * @return agentRef   * The agent to whom this relationship applies.
     */
    public gov.ucore.ucore._2_0.AgentRefType getAgentRef() {
        return agentRef;
    }


    /**
     * Sets the agentRef value for this PersonAgentRelationshipType.
     * 
     * @param agentRef   * The agent to whom this relationship applies.
     */
    public void setAgentRef(gov.ucore.ucore._2_0.AgentRefType agentRef) {
        this.agentRef = agentRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonAgentRelationshipType)) return false;
        PersonAgentRelationshipType other = (PersonAgentRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.personRef==null && other.getPersonRef()==null) || 
             (this.personRef!=null &&
              this.personRef.equals(other.getPersonRef()))) &&
            ((this.agentRef==null && other.getAgentRef()==null) || 
             (this.agentRef!=null &&
              this.agentRef.equals(other.getAgentRef())));
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
        if (getPersonRef() != null) {
            _hashCode += getPersonRef().hashCode();
        }
        if (getAgentRef() != null) {
            _hashCode += getAgentRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonAgentRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonAgentRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRef"));
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
