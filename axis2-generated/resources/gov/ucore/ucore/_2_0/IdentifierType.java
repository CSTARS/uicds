/**
 * IdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.ucore.ucore._2_0;


/**
 * A means of identification for some Thing.  For example, an identifier
 * for a vehicle might be a Vehicle Identification Number (VIN) with
 * a value of  1M8GDM9AXKP042788.  For an employee, an organization may
 * assign an Employee Identification Number with a value of 30621.  
 * In the cyber world, screennames provide a mechanism for identification.
 * These would all be appropriate uses of the ucore:IdentifierType. 
 * The ucore:IdentifierType provides a means to reuse terms and definitions
 * from other codespaces via the codespace/code attribute pair and also
 * provides a human-readable format via the label attribute.  The ucore:IdentifierType
 * should only be used to represent simple identifiers that answer the
 * quiestion "Which Entity or Event is this?"  For simple properties
 * in general, the SimplePropertyType should be used instead to preserve
 * the semantic richness of the ucore:IdentifierType.  Each class term
 * in a codespace is identified by its URI.  The URI of the class is
 * yielded as follows: if the codespace attribute ends in '#' or '/',
 * then the URI of the class CLASS-URI = 
 * @codespace 
 * @code.  If the codespace attribute does not end in '#' or '/', then
 * the URI of the class CLASS-URI = 
 * @codespace  # 
 * @code.
 */
public class IdentifierType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private v2.ism.ic.gov.us.ClassificationType classification;  // attribute

    private org.apache.axis.types.NMTokens ownerProducer;  // attribute

    private org.apache.axis.types.NMTokens SCIcontrols;  // attribute

    private org.apache.axis.types.NMTokens SARIdentifier;  // attribute

    private org.apache.axis.types.NMTokens disseminationControls;  // attribute

    private org.apache.axis.types.NMTokens FGIsourceOpen;  // attribute

    private org.apache.axis.types.NMTokens FGIsourceProtected;  // attribute

    private org.apache.axis.types.NMTokens releasableTo;  // attribute

    private org.apache.axis.types.NMTokens nonICmarkings;  // attribute

    private java.lang.String classifiedBy;  // attribute

    private java.lang.String derivativelyClassifiedBy;  // attribute

    private java.lang.String classificationReason;  // attribute

    private java.lang.String derivedFrom;  // attribute

    private java.util.Date declassDate;  // attribute

    private java.lang.String declassEvent;  // attribute

    private org.apache.axis.types.NMTokens declassException;  // attribute

    private org.apache.axis.types.NMTokens typeOfExemptedSource;  // attribute

    private java.util.Date dateOfExemptedSource;  // attribute

    private java.lang.Boolean declassManualReview;  // attribute

    private org.apache.axis.types.Token code;  // attribute

    private org.apache.axis.types.URI codespace;  // attribute

    private java.lang.Object label;  // attribute

    public IdentifierType() {
    }

    // Simple Types must have a String constructor
    public IdentifierType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this IdentifierType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this IdentifierType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the classification value for this IdentifierType.
     * 
     * @return classification
     */
    public v2.ism.ic.gov.us.ClassificationType getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this IdentifierType.
     * 
     * @param classification
     */
    public void setClassification(v2.ism.ic.gov.us.ClassificationType classification) {
        this.classification = classification;
    }


    /**
     * Gets the ownerProducer value for this IdentifierType.
     * 
     * @return ownerProducer
     */
    public org.apache.axis.types.NMTokens getOwnerProducer() {
        return ownerProducer;
    }


    /**
     * Sets the ownerProducer value for this IdentifierType.
     * 
     * @param ownerProducer
     */
    public void setOwnerProducer(org.apache.axis.types.NMTokens ownerProducer) {
        this.ownerProducer = ownerProducer;
    }


    /**
     * Gets the SCIcontrols value for this IdentifierType.
     * 
     * @return SCIcontrols
     */
    public org.apache.axis.types.NMTokens getSCIcontrols() {
        return SCIcontrols;
    }


    /**
     * Sets the SCIcontrols value for this IdentifierType.
     * 
     * @param SCIcontrols
     */
    public void setSCIcontrols(org.apache.axis.types.NMTokens SCIcontrols) {
        this.SCIcontrols = SCIcontrols;
    }


    /**
     * Gets the SARIdentifier value for this IdentifierType.
     * 
     * @return SARIdentifier
     */
    public org.apache.axis.types.NMTokens getSARIdentifier() {
        return SARIdentifier;
    }


    /**
     * Sets the SARIdentifier value for this IdentifierType.
     * 
     * @param SARIdentifier
     */
    public void setSARIdentifier(org.apache.axis.types.NMTokens SARIdentifier) {
        this.SARIdentifier = SARIdentifier;
    }


    /**
     * Gets the disseminationControls value for this IdentifierType.
     * 
     * @return disseminationControls
     */
    public org.apache.axis.types.NMTokens getDisseminationControls() {
        return disseminationControls;
    }


    /**
     * Sets the disseminationControls value for this IdentifierType.
     * 
     * @param disseminationControls
     */
    public void setDisseminationControls(org.apache.axis.types.NMTokens disseminationControls) {
        this.disseminationControls = disseminationControls;
    }


    /**
     * Gets the FGIsourceOpen value for this IdentifierType.
     * 
     * @return FGIsourceOpen
     */
    public org.apache.axis.types.NMTokens getFGIsourceOpen() {
        return FGIsourceOpen;
    }


    /**
     * Sets the FGIsourceOpen value for this IdentifierType.
     * 
     * @param FGIsourceOpen
     */
    public void setFGIsourceOpen(org.apache.axis.types.NMTokens FGIsourceOpen) {
        this.FGIsourceOpen = FGIsourceOpen;
    }


    /**
     * Gets the FGIsourceProtected value for this IdentifierType.
     * 
     * @return FGIsourceProtected
     */
    public org.apache.axis.types.NMTokens getFGIsourceProtected() {
        return FGIsourceProtected;
    }


    /**
     * Sets the FGIsourceProtected value for this IdentifierType.
     * 
     * @param FGIsourceProtected
     */
    public void setFGIsourceProtected(org.apache.axis.types.NMTokens FGIsourceProtected) {
        this.FGIsourceProtected = FGIsourceProtected;
    }


    /**
     * Gets the releasableTo value for this IdentifierType.
     * 
     * @return releasableTo
     */
    public org.apache.axis.types.NMTokens getReleasableTo() {
        return releasableTo;
    }


    /**
     * Sets the releasableTo value for this IdentifierType.
     * 
     * @param releasableTo
     */
    public void setReleasableTo(org.apache.axis.types.NMTokens releasableTo) {
        this.releasableTo = releasableTo;
    }


    /**
     * Gets the nonICmarkings value for this IdentifierType.
     * 
     * @return nonICmarkings
     */
    public org.apache.axis.types.NMTokens getNonICmarkings() {
        return nonICmarkings;
    }


    /**
     * Sets the nonICmarkings value for this IdentifierType.
     * 
     * @param nonICmarkings
     */
    public void setNonICmarkings(org.apache.axis.types.NMTokens nonICmarkings) {
        this.nonICmarkings = nonICmarkings;
    }


    /**
     * Gets the classifiedBy value for this IdentifierType.
     * 
     * @return classifiedBy
     */
    public java.lang.String getClassifiedBy() {
        return classifiedBy;
    }


    /**
     * Sets the classifiedBy value for this IdentifierType.
     * 
     * @param classifiedBy
     */
    public void setClassifiedBy(java.lang.String classifiedBy) {
        this.classifiedBy = classifiedBy;
    }


    /**
     * Gets the derivativelyClassifiedBy value for this IdentifierType.
     * 
     * @return derivativelyClassifiedBy
     */
    public java.lang.String getDerivativelyClassifiedBy() {
        return derivativelyClassifiedBy;
    }


    /**
     * Sets the derivativelyClassifiedBy value for this IdentifierType.
     * 
     * @param derivativelyClassifiedBy
     */
    public void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy) {
        this.derivativelyClassifiedBy = derivativelyClassifiedBy;
    }


    /**
     * Gets the classificationReason value for this IdentifierType.
     * 
     * @return classificationReason
     */
    public java.lang.String getClassificationReason() {
        return classificationReason;
    }


    /**
     * Sets the classificationReason value for this IdentifierType.
     * 
     * @param classificationReason
     */
    public void setClassificationReason(java.lang.String classificationReason) {
        this.classificationReason = classificationReason;
    }


    /**
     * Gets the derivedFrom value for this IdentifierType.
     * 
     * @return derivedFrom
     */
    public java.lang.String getDerivedFrom() {
        return derivedFrom;
    }


    /**
     * Sets the derivedFrom value for this IdentifierType.
     * 
     * @param derivedFrom
     */
    public void setDerivedFrom(java.lang.String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }


    /**
     * Gets the declassDate value for this IdentifierType.
     * 
     * @return declassDate
     */
    public java.util.Date getDeclassDate() {
        return declassDate;
    }


    /**
     * Sets the declassDate value for this IdentifierType.
     * 
     * @param declassDate
     */
    public void setDeclassDate(java.util.Date declassDate) {
        this.declassDate = declassDate;
    }


    /**
     * Gets the declassEvent value for this IdentifierType.
     * 
     * @return declassEvent
     */
    public java.lang.String getDeclassEvent() {
        return declassEvent;
    }


    /**
     * Sets the declassEvent value for this IdentifierType.
     * 
     * @param declassEvent
     */
    public void setDeclassEvent(java.lang.String declassEvent) {
        this.declassEvent = declassEvent;
    }


    /**
     * Gets the declassException value for this IdentifierType.
     * 
     * @return declassException
     */
    public org.apache.axis.types.NMTokens getDeclassException() {
        return declassException;
    }


    /**
     * Sets the declassException value for this IdentifierType.
     * 
     * @param declassException
     */
    public void setDeclassException(org.apache.axis.types.NMTokens declassException) {
        this.declassException = declassException;
    }


    /**
     * Gets the typeOfExemptedSource value for this IdentifierType.
     * 
     * @return typeOfExemptedSource
     */
    public org.apache.axis.types.NMTokens getTypeOfExemptedSource() {
        return typeOfExemptedSource;
    }


    /**
     * Sets the typeOfExemptedSource value for this IdentifierType.
     * 
     * @param typeOfExemptedSource
     */
    public void setTypeOfExemptedSource(org.apache.axis.types.NMTokens typeOfExemptedSource) {
        this.typeOfExemptedSource = typeOfExemptedSource;
    }


    /**
     * Gets the dateOfExemptedSource value for this IdentifierType.
     * 
     * @return dateOfExemptedSource
     */
    public java.util.Date getDateOfExemptedSource() {
        return dateOfExemptedSource;
    }


    /**
     * Sets the dateOfExemptedSource value for this IdentifierType.
     * 
     * @param dateOfExemptedSource
     */
    public void setDateOfExemptedSource(java.util.Date dateOfExemptedSource) {
        this.dateOfExemptedSource = dateOfExemptedSource;
    }


    /**
     * Gets the declassManualReview value for this IdentifierType.
     * 
     * @return declassManualReview
     */
    public java.lang.Boolean getDeclassManualReview() {
        return declassManualReview;
    }


    /**
     * Sets the declassManualReview value for this IdentifierType.
     * 
     * @param declassManualReview
     */
    public void setDeclassManualReview(java.lang.Boolean declassManualReview) {
        this.declassManualReview = declassManualReview;
    }


    /**
     * Gets the code value for this IdentifierType.
     * 
     * @return code
     */
    public org.apache.axis.types.Token getCode() {
        return code;
    }


    /**
     * Sets the code value for this IdentifierType.
     * 
     * @param code
     */
    public void setCode(org.apache.axis.types.Token code) {
        this.code = code;
    }


    /**
     * Gets the codespace value for this IdentifierType.
     * 
     * @return codespace
     */
    public org.apache.axis.types.URI getCodespace() {
        return codespace;
    }


    /**
     * Sets the codespace value for this IdentifierType.
     * 
     * @param codespace
     */
    public void setCodespace(org.apache.axis.types.URI codespace) {
        this.codespace = codespace;
    }


    /**
     * Gets the label value for this IdentifierType.
     * 
     * @return label
     */
    public java.lang.Object getLabel() {
        return label;
    }


    /**
     * Sets the label value for this IdentifierType.
     * 
     * @param label
     */
    public void setLabel(java.lang.Object label) {
        this.label = label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentifierType)) return false;
        IdentifierType other = (IdentifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.ownerProducer==null && other.getOwnerProducer()==null) || 
             (this.ownerProducer!=null &&
              this.ownerProducer.equals(other.getOwnerProducer()))) &&
            ((this.SCIcontrols==null && other.getSCIcontrols()==null) || 
             (this.SCIcontrols!=null &&
              this.SCIcontrols.equals(other.getSCIcontrols()))) &&
            ((this.SARIdentifier==null && other.getSARIdentifier()==null) || 
             (this.SARIdentifier!=null &&
              this.SARIdentifier.equals(other.getSARIdentifier()))) &&
            ((this.disseminationControls==null && other.getDisseminationControls()==null) || 
             (this.disseminationControls!=null &&
              this.disseminationControls.equals(other.getDisseminationControls()))) &&
            ((this.FGIsourceOpen==null && other.getFGIsourceOpen()==null) || 
             (this.FGIsourceOpen!=null &&
              this.FGIsourceOpen.equals(other.getFGIsourceOpen()))) &&
            ((this.FGIsourceProtected==null && other.getFGIsourceProtected()==null) || 
             (this.FGIsourceProtected!=null &&
              this.FGIsourceProtected.equals(other.getFGIsourceProtected()))) &&
            ((this.releasableTo==null && other.getReleasableTo()==null) || 
             (this.releasableTo!=null &&
              this.releasableTo.equals(other.getReleasableTo()))) &&
            ((this.nonICmarkings==null && other.getNonICmarkings()==null) || 
             (this.nonICmarkings!=null &&
              this.nonICmarkings.equals(other.getNonICmarkings()))) &&
            ((this.classifiedBy==null && other.getClassifiedBy()==null) || 
             (this.classifiedBy!=null &&
              this.classifiedBy.equals(other.getClassifiedBy()))) &&
            ((this.derivativelyClassifiedBy==null && other.getDerivativelyClassifiedBy()==null) || 
             (this.derivativelyClassifiedBy!=null &&
              this.derivativelyClassifiedBy.equals(other.getDerivativelyClassifiedBy()))) &&
            ((this.classificationReason==null && other.getClassificationReason()==null) || 
             (this.classificationReason!=null &&
              this.classificationReason.equals(other.getClassificationReason()))) &&
            ((this.derivedFrom==null && other.getDerivedFrom()==null) || 
             (this.derivedFrom!=null &&
              this.derivedFrom.equals(other.getDerivedFrom()))) &&
            ((this.declassDate==null && other.getDeclassDate()==null) || 
             (this.declassDate!=null &&
              this.declassDate.equals(other.getDeclassDate()))) &&
            ((this.declassEvent==null && other.getDeclassEvent()==null) || 
             (this.declassEvent!=null &&
              this.declassEvent.equals(other.getDeclassEvent()))) &&
            ((this.declassException==null && other.getDeclassException()==null) || 
             (this.declassException!=null &&
              this.declassException.equals(other.getDeclassException()))) &&
            ((this.typeOfExemptedSource==null && other.getTypeOfExemptedSource()==null) || 
             (this.typeOfExemptedSource!=null &&
              this.typeOfExemptedSource.equals(other.getTypeOfExemptedSource()))) &&
            ((this.dateOfExemptedSource==null && other.getDateOfExemptedSource()==null) || 
             (this.dateOfExemptedSource!=null &&
              this.dateOfExemptedSource.equals(other.getDateOfExemptedSource()))) &&
            ((this.declassManualReview==null && other.getDeclassManualReview()==null) || 
             (this.declassManualReview!=null &&
              this.declassManualReview.equals(other.getDeclassManualReview()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codespace==null && other.getCodespace()==null) || 
             (this.codespace!=null &&
              this.codespace.equals(other.getCodespace()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getOwnerProducer() != null) {
            _hashCode += getOwnerProducer().hashCode();
        }
        if (getSCIcontrols() != null) {
            _hashCode += getSCIcontrols().hashCode();
        }
        if (getSARIdentifier() != null) {
            _hashCode += getSARIdentifier().hashCode();
        }
        if (getDisseminationControls() != null) {
            _hashCode += getDisseminationControls().hashCode();
        }
        if (getFGIsourceOpen() != null) {
            _hashCode += getFGIsourceOpen().hashCode();
        }
        if (getFGIsourceProtected() != null) {
            _hashCode += getFGIsourceProtected().hashCode();
        }
        if (getReleasableTo() != null) {
            _hashCode += getReleasableTo().hashCode();
        }
        if (getNonICmarkings() != null) {
            _hashCode += getNonICmarkings().hashCode();
        }
        if (getClassifiedBy() != null) {
            _hashCode += getClassifiedBy().hashCode();
        }
        if (getDerivativelyClassifiedBy() != null) {
            _hashCode += getDerivativelyClassifiedBy().hashCode();
        }
        if (getClassificationReason() != null) {
            _hashCode += getClassificationReason().hashCode();
        }
        if (getDerivedFrom() != null) {
            _hashCode += getDerivedFrom().hashCode();
        }
        if (getDeclassDate() != null) {
            _hashCode += getDeclassDate().hashCode();
        }
        if (getDeclassEvent() != null) {
            _hashCode += getDeclassEvent().hashCode();
        }
        if (getDeclassException() != null) {
            _hashCode += getDeclassException().hashCode();
        }
        if (getTypeOfExemptedSource() != null) {
            _hashCode += getTypeOfExemptedSource().hashCode();
        }
        if (getDateOfExemptedSource() != null) {
            _hashCode += getDateOfExemptedSource().hashCode();
        }
        if (getDeclassManualReview() != null) {
            _hashCode += getDeclassManualReview().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodespace() != null) {
            _hashCode += getCodespace().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "IdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classification");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classification"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ClassificationType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ownerProducer");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ownerProducer"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">ownerProducer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SCIcontrols");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SCIcontrols"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">SCIcontrols"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SARIdentifier");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SARIdentifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">SARIdentifier"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("disseminationControls");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "disseminationControls"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">disseminationControls"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("FGIsourceOpen");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceOpen"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">FGIsourceOpen"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("FGIsourceProtected");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceProtected"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">FGIsourceProtected"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("releasableTo");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "releasableTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">releasableTo"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nonICmarkings");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "nonICmarkings"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">nonICmarkings"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classifiedBy");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classifiedBy"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">classifiedBy"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("derivativelyClassifiedBy");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivativelyClassifiedBy"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">derivativelyClassifiedBy"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classificationReason");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classificationReason"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">classificationReason"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("derivedFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivedFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">derivedFrom"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("declassDate");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">declassDate"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("declassEvent");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassEvent"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">declassEvent"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("declassException");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassException"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">declassException"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("typeOfExemptedSource");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "typeOfExemptedSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">typeOfExemptedSource"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateOfExemptedSource");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "dateOfExemptedSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">dateOfExemptedSource"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("declassManualReview");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassManualReview"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", ">declassManualReview"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codespace");
        attrField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "codespace"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("label");
        attrField.setXmlName(new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "label"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
