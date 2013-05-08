/**
 * AgentEntityRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The basic type for relationships between an agent and an entity.
 */
public class AgentEntityRelationshipType  extends gov.ucore.ucore._2_0.RelationshipType  implements java.io.Serializable {
    /* The agent to whom this relationship applies. */
    private gov.ucore.ucore._2_0.AgentRefType agentRef;

    /* The entity to which this relationship applies. */
    private gov.ucore.ucore._2_0.EntityRefType entityRef;

    public AgentEntityRelationshipType() {
    }

    public AgentEntityRelationshipType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.TimeType time,
           gov.ucore.ucore._2_0.AgentRefType agentRef,
           gov.ucore.ucore._2_0.EntityRefType entityRef) {
        super(
            id,
            metadata,
            time);
        this.agentRef = agentRef;
        this.entityRef = entityRef;
    }


    /**
     * Gets the agentRef value for this AgentEntityRelationshipType.
     * 
     * @return agentRef   * The agent to whom this relationship applies.
     */
    public gov.ucore.ucore._2_0.AgentRefType getAgentRef() {
        return agentRef;
    }


    /**
     * Sets the agentRef value for this AgentEntityRelationshipType.
     * 
     * @param agentRef   * The agent to whom this relationship applies.
     */
    public void setAgentRef(gov.ucore.ucore._2_0.AgentRefType agentRef) {
        this.agentRef = agentRef;
    }


    /**
     * Gets the entityRef value for this AgentEntityRelationshipType.
     * 
     * @return entityRef   * The entity to which this relationship applies.
     */
    public gov.ucore.ucore._2_0.EntityRefType getEntityRef() {
        return entityRef;
    }


    /**
     * Sets the entityRef value for this AgentEntityRelationshipType.
     * 
     * @param entityRef   * The entity to which this relationship applies.
     */
    public void setEntityRef(gov.ucore.ucore._2_0.EntityRefType entityRef) {
        this.entityRef = entityRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentEntityRelationshipType)) return false;
        AgentEntityRelationshipType other = (AgentEntityRelationshipType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agentRef==null && other.getAgentRef()==null) || 
             (this.agentRef!=null &&
              this.agentRef.equals(other.getAgentRef()))) &&
            ((this.entityRef==null && other.getEntityRef()==null) || 
             (this.entityRef!=null &&
              this.entityRef.equals(other.getEntityRef())));
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
        if (getAgentRef() != null) {
            _hashCode += getAgentRef().hashCode();
        }
        if (getEntityRef() != null) {
            _hashCode += getEntityRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgentEntityRelationshipType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentEntityRelationshipType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRefType"));
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
