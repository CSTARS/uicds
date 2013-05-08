/**
 * CollectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A named collection of other Things, including one or more What
 * terms.
 */
public class CollectionType  extends gov.ucore.ucore._2_0.ThingType  implements java.io.Serializable {
    /* Codespace/value pair that defines what this Collection is.
     * Each Collection must include at least one term from the UCore Taxonomy,
     * with the associated UCore codespace of http://ucore.gov/2.0/codespace/. */
    private gov.ucore.ucore._2_0.WhatType[] what;

    /* References to the Things that make up this collection.  An
     * empty collection is valid, and is treated as a named set with 0 elements. */
    private gov.ucore.ucore._2_0.ThingRefType[] thingRef;

    public CollectionType() {
    }

    public CollectionType(
           org.apache.axis.types.Id id,
           gov.ucore.ucore._2_0.ContentMetadataType metadata,
           gov.ucore.ucore._2_0.StringType descriptor,
           gov.ucore.ucore._2_0.IdentifierType[] identifier,
           gov.ucore.ucore._2_0.SimplePropertyType[] simpleProperty,
           gov.ucore.ucore._2_0.WhatType[] what,
           gov.ucore.ucore._2_0.ThingRefType[] thingRef) {
        super(
            id,
            metadata,
            descriptor,
            identifier,
            simpleProperty);
        this.what = what;
        this.thingRef = thingRef;
    }


    /**
     * Gets the what value for this CollectionType.
     * 
     * @return what   * Codespace/value pair that defines what this Collection is.
     * Each Collection must include at least one term from the UCore Taxonomy,
     * with the associated UCore codespace of http://ucore.gov/2.0/codespace/.
     */
    public gov.ucore.ucore._2_0.WhatType[] getWhat() {
        return what;
    }


    /**
     * Sets the what value for this CollectionType.
     * 
     * @param what   * Codespace/value pair that defines what this Collection is.
     * Each Collection must include at least one term from the UCore Taxonomy,
     * with the associated UCore codespace of http://ucore.gov/2.0/codespace/.
     */
    public void setWhat(gov.ucore.ucore._2_0.WhatType[] what) {
        this.what = what;
    }

    public gov.ucore.ucore._2_0.WhatType getWhat(int i) {
        return this.what[i];
    }

    public void setWhat(int i, gov.ucore.ucore._2_0.WhatType _value) {
        this.what[i] = _value;
    }


    /**
     * Gets the thingRef value for this CollectionType.
     * 
     * @return thingRef   * References to the Things that make up this collection.  An
     * empty collection is valid, and is treated as a named set with 0 elements.
     */
    public gov.ucore.ucore._2_0.ThingRefType[] getThingRef() {
        return thingRef;
    }


    /**
     * Sets the thingRef value for this CollectionType.
     * 
     * @param thingRef   * References to the Things that make up this collection.  An
     * empty collection is valid, and is treated as a named set with 0 elements.
     */
    public void setThingRef(gov.ucore.ucore._2_0.ThingRefType[] thingRef) {
        this.thingRef = thingRef;
    }

    public gov.ucore.ucore._2_0.ThingRefType getThingRef(int i) {
        return this.thingRef[i];
    }

    public void setThingRef(int i, gov.ucore.ucore._2_0.ThingRefType _value) {
        this.thingRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionType)) return false;
        CollectionType other = (CollectionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.what==null && other.getWhat()==null) || 
             (this.what!=null &&
              java.util.Arrays.equals(this.what, other.getWhat()))) &&
            ((this.thingRef==null && other.getThingRef()==null) || 
             (this.thingRef!=null &&
              java.util.Arrays.equals(this.thingRef, other.getThingRef())));
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
        if (getWhat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThingRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThingRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThingRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollectionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CollectionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thingRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRefType"));
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
