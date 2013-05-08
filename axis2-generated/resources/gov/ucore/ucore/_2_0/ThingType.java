/**
 * ThingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * The UCore Thing type.
 */
public class ThingType  implements java.io.Serializable {
    /* Metadata about this entity, including information source, optional
     * comment, and the validity time for this element. */
    private gov.ucore.ucore._2_0.ContentMetadataType metadata;

    /* A free text description of this Thing. */
    private gov.ucore.ucore._2_0.StringType descriptor;

    /* A means of identification for some Thing.  For example, an
     * identifier for a vehicle might be a Vehicle Identification Number
     * (VIN) with a value of  1M8GDM9AXKP042788.  For an employee, an organization
     * may assign an Employee Identification Number with a value of 30621.
     * In the cyber world, screennames provide a mechanism for identification.
     * These would all be appropriate uses of the ucore:IdentifierType. 
     * The ucore:IdentifierType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:IdentifierType
     * should only be used to represent simple identifiers that answer the
     * quiestion "Which Entity or Event is this?"  For simple properties
     * in general, the SimplePropertyType should be used instead to preserve
     * the semantic richness of the ucore:IdentifierType. Each class term
     * in a codespace is identified by its URI.  The URI of the class is
     * yielded as follows: if the codespace attribute ends in '#' or '/',
     * then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code. */
    private gov.ucore.ucore._2_0.IdentifierType[] identifier;

    /* An essential or distinctive attribute or quality of a Thing.
     * The ucore:SimplePropertyType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:SimplePropertyType
     * should only be used to reepresent properties that are self-contained
     * to a Thing (e.g., color of a car, the number of rooms in a building,
     * the type of propulsion system on a vessel), NOT for properties that
     * imply relationships to other things.   For properties that imply relationships
     * to other things, a relationship with associated roles should be used
     * instead. Each class term in a codespace is identified by its URI.
     * The URI of the class is yielded as follows: if the codespace attribute
     * ends in '#' or '/', then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code. */
    private gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty;

    private org.apache.axis.types.Id id;  // attribute

    public ThingType() {
    }

    public ThingType(
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           org.apache.axis.types.Id id) {
           this.metadata = metadata;
           this.descriptor = descriptor;
           this.identifier = identifier;
           this.simpleProperty = simpleProperty;
           this.id = id;
    }


    /**
     * Gets the metadata value for this ThingType.
     * 
     * @return metadata   * Metadata about this entity, including information source, optional
     * comment, and the validity time for this element.
     */
    public gov.ucore.ucore._2_0.ContentMetadataType getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this ThingType.
     * 
     * @param metadata   * Metadata about this entity, including information source, optional
     * comment, and the validity time for this element.
     */
    public void setMetadata(gov.ucore.ucore._2_0.ContentMetadataType metadata) {
        this.metadata = metadata;
    }


    /**
     * Gets the descriptor value for this ThingType.
     * 
     * @return descriptor   * A free text description of this Thing.
     */
    public gov.ucore.ucore._2_0.StringType getDescriptor() {
        return descriptor;
    }


    /**
     * Sets the descriptor value for this ThingType.
     * 
     * @param descriptor   * A free text description of this Thing.
     */
    public void setDescriptor(gov.ucore.ucore._2_0.StringType descriptor) {
        this.descriptor = descriptor;
    }


    /**
     * Gets the identifier value for this ThingType.
     * 
     * @return identifier   * A means of identification for some Thing.  For example, an
     * identifier for a vehicle might be a Vehicle Identification Number
     * (VIN) with a value of  1M8GDM9AXKP042788.  For an employee, an organization
     * may assign an Employee Identification Number with a value of 30621.
     * In the cyber world, screennames provide a mechanism for identification.
     * These would all be appropriate uses of the ucore:IdentifierType. 
     * The ucore:IdentifierType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:IdentifierType
     * should only be used to represent simple identifiers that answer the
     * quiestion "Which Entity or Event is this?"  For simple properties
     * in general, the SimplePropertyType should be used instead to preserve
     * the semantic richness of the ucore:IdentifierType. Each class term
     * in a codespace is identified by its URI.  The URI of the class is
     * yielded as follows: if the codespace attribute ends in '#' or '/',
     * then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code.
     */
    public gov.ucore.ucore._2_0.IdentifierType[] getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this ThingType.
     * 
     * @param identifier   * A means of identification for some Thing.  For example, an
     * identifier for a vehicle might be a Vehicle Identification Number
     * (VIN) with a value of  1M8GDM9AXKP042788.  For an employee, an organization
     * may assign an Employee Identification Number with a value of 30621.
     * In the cyber world, screennames provide a mechanism for identification.
     * These would all be appropriate uses of the ucore:IdentifierType. 
     * The ucore:IdentifierType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:IdentifierType
     * should only be used to represent simple identifiers that answer the
     * quiestion "Which Entity or Event is this?"  For simple properties
     * in general, the SimplePropertyType should be used instead to preserve
     * the semantic richness of the ucore:IdentifierType. Each class term
     * in a codespace is identified by its URI.  The URI of the class is
     * yielded as follows: if the codespace attribute ends in '#' or '/',
     * then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code.
     */
    public void setIdentifier(gov.ucore.ucore._2_0.IdentifierType[] identifier) {
        this.identifier = identifier;
    }

    public gov.ucore.ucore._2_0.IdentifierType getIdentifier(int i) {
        return this.identifier[i];
    }

    public void setIdentifier(int i, gov.ucore.ucore._2_0.IdentifierType _value) {
        this.identifier[i] = _value;
    }


    /**
     * Gets the simpleProperty value for this ThingType.
     * 
     * @return simpleProperty   * An essential or distinctive attribute or quality of a Thing.
     * The ucore:SimplePropertyType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:SimplePropertyType
     * should only be used to reepresent properties that are self-contained
     * to a Thing (e.g., color of a car, the number of rooms in a building,
     * the type of propulsion system on a vessel), NOT for properties that
     * imply relationships to other things.   For properties that imply relationships
     * to other things, a relationship with associated roles should be used
     * instead. Each class term in a codespace is identified by its URI.
     * The URI of the class is yielded as follows: if the codespace attribute
     * ends in '#' or '/', then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code.
     */
    public gov.ucore.ucore._2_0.SimplePropertyType[] getSimpleProperty() {
        return simpleProperty;
    }


    /**
     * Sets the simpleProperty value for this ThingType.
     * 
     * @param simpleProperty   * An essential or distinctive attribute or quality of a Thing.
     * The ucore:SimplePropertyType provides a means to reuse terms and definitions
     * from other codespaces via the codespace/code attribute pair and also
     * provides a human-readable format via the label attribute.  The ucore:SimplePropertyType
     * should only be used to reepresent properties that are self-contained
     * to a Thing (e.g., color of a car, the number of rooms in a building,
     * the type of propulsion system on a vessel), NOT for properties that
     * imply relationships to other things.   For properties that imply relationships
     * to other things, a relationship with associated roles should be used
     * instead. Each class term in a codespace is identified by its URI.
     * The URI of the class is yielded as follows: if the codespace attribute
     * ends in '#' or '/', then the URI of the class CLASS-URI = 
     * @codespace 
     * @code.  If the codespace attribute does not end in '#' or '/', then
     * the URI of the class CLASS-URI = 
     * @codespace  # 
     * @code.
     */
    public void setSimpleProperty(gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty) {
        this.simpleProperty = simpleProperty;
    }

    public gov.ucore.ucore._2_0.SimplePropertyType getSimpleProperty(int i) {
        return this.simpleProperty[i];
    }

    public void setSimpleProperty(int i, gov.ucore.ucore._2_0.SimplePropertyType _value) {
        this.simpleProperty[i] = _value;
    }


    /**
     * Gets the id value for this ThingType.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this ThingType.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThingType)) return false;
        ThingType other = (ThingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              this.metadata.equals(other.getMetadata()))) &&
            ((this.descriptor==null && other.getDescriptor()==null) || 
             (this.descriptor!=null &&
              this.descriptor.equals(other.getDescriptor()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              java.util.Arrays.equals(this.identifier, other.getIdentifier()))) &&
            ((this.simpleProperty==null && other.getSimpleProperty()==null) || 
             (this.simpleProperty!=null &&
              java.util.Arrays.equals(this.simpleProperty, other.getSimpleProperty()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getMetadata() != null) {
            _hashCode += getMetadata().hashCode();
        }
        if (getDescriptor() != null) {
            _hashCode += getDescriptor().hashCode();
        }
        if (getIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimpleProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContentMetadataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Descriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SimpleProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SimplePropertyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
