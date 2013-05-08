/**
 * TimeValueTypeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;

public class TimeValueTypeValue  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public TimeValueTypeValue() {
    }

    // Simple Types must have a String constructor
    public TimeValueTypeValue(java.lang.String _value) {
        this._value = _value;
    }
    public TimeValueTypeValue(java.util.Date _value) {
        setDateValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.Time _value) {
        setTimeValue(_value);
    }

    public TimeValueTypeValue(java.util.Calendar _value) {
        setDateTimeValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.Day _value) {
        setGDayValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.Month _value) {
        setGMonthValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.MonthDay _value) {
        setGMonthDayValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.Year _value) {
        setGYearValue(_value);
    }

    public TimeValueTypeValue(org.apache.axis.types.YearMonth _value) {
        setGYearMonthValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the dateValue value for this TimeValueTypeValue.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        try {
            return (java.text.DateFormat.getDateTimeInstance()).parse(_value);
        }
        catch (java.text.ParseException e){
            throw new java.lang.RuntimeException(e.toString());
        }
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setDateValue(java.util.Date _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the timeValue value for this TimeValueTypeValue.
     * 
     * @return timeValue
     */
    public org.apache.axis.types.Time getTimeValue() {
        return new org.apache.axis.types.Time(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setTimeValue(org.apache.axis.types.Time _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the dateTimeValue value for this TimeValueTypeValue.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        java.util.Calendar cal =
            (java.util.Calendar) new org.apache.axis.encoding.ser.CalendarDeserializer(
                java.lang.String.class, org.apache.axis.Constants.XSD_STRING).makeValue(_value);
        return cal;
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setDateTimeValue(java.util.Calendar _value) {
        this._value = _value == null ? null : new org.apache.axis.encoding.ser.CalendarSerializer().getValueAsString(_value, null);
    }


    /**
     * Gets the gDayValue value for this TimeValueTypeValue.
     * 
     * @return gDayValue
     */
    public org.apache.axis.types.Day getGDayValue() {
        return new org.apache.axis.types.Day(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setGDayValue(org.apache.axis.types.Day _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the gMonthValue value for this TimeValueTypeValue.
     * 
     * @return gMonthValue
     */
    public org.apache.axis.types.Month getGMonthValue() {
        return new org.apache.axis.types.Month(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setGMonthValue(org.apache.axis.types.Month _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the gMonthDayValue value for this TimeValueTypeValue.
     * 
     * @return gMonthDayValue
     */
    public org.apache.axis.types.MonthDay getGMonthDayValue() {
        return new org.apache.axis.types.MonthDay(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setGMonthDayValue(org.apache.axis.types.MonthDay _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the gYearValue value for this TimeValueTypeValue.
     * 
     * @return gYearValue
     */
    public org.apache.axis.types.Year getGYearValue() {
        return new org.apache.axis.types.Year(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setGYearValue(org.apache.axis.types.Year _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the gYearMonthValue value for this TimeValueTypeValue.
     * 
     * @return gYearMonthValue
     */
    public org.apache.axis.types.YearMonth getGYearMonthValue() {
        return new org.apache.axis.types.YearMonth(_value);
    }


    /**
     * Sets the _value value for this TimeValueTypeValue.
     * 
     * @param _value
     */
    public void setGYearMonthValue(org.apache.axis.types.YearMonth _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeValueTypeValue)) return false;
        TimeValueTypeValue other = (TimeValueTypeValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeValueTypeValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", ">TimeValueType>Value"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gDayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GMonthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gMonthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GMonthDayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gMonthDayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GYearValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gYearValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GYearMonthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gYearMonthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
