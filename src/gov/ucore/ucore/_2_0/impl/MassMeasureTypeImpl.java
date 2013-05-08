/*
 * XML Type:  MassMeasureType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.MassMeasureType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML MassMeasureType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class MassMeasureTypeImpl extends gov.ucore.ucore._2_0.impl.DecimalTypeImpl implements gov.ucore.ucore._2_0.MassMeasureType
{
    
    public MassMeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMALERRORBOUND$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "decimalErrorBound");
    private static final javax.xml.namespace.QName CLASSIFICATION$2 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classification");
    private static final javax.xml.namespace.QName OWNERPRODUCER$4 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ownerProducer");
    private static final javax.xml.namespace.QName SCICONTROLS$6 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SCIcontrols");
    private static final javax.xml.namespace.QName SARIDENTIFIER$8 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SARIdentifier");
    private static final javax.xml.namespace.QName DISSEMINATIONCONTROLS$10 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "disseminationControls");
    private static final javax.xml.namespace.QName FGISOURCEOPEN$12 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceOpen");
    private static final javax.xml.namespace.QName FGISOURCEPROTECTED$14 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceProtected");
    private static final javax.xml.namespace.QName RELEASABLETO$16 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "releasableTo");
    private static final javax.xml.namespace.QName NONICMARKINGS$18 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "nonICmarkings");
    private static final javax.xml.namespace.QName CLASSIFIEDBY$20 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classifiedBy");
    private static final javax.xml.namespace.QName DERIVATIVELYCLASSIFIEDBY$22 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivativelyClassifiedBy");
    private static final javax.xml.namespace.QName CLASSIFICATIONREASON$24 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classificationReason");
    private static final javax.xml.namespace.QName DERIVEDFROM$26 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivedFrom");
    private static final javax.xml.namespace.QName DECLASSDATE$28 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassDate");
    private static final javax.xml.namespace.QName DECLASSEVENT$30 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassEvent");
    private static final javax.xml.namespace.QName DECLASSEXCEPTION$32 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassException");
    private static final javax.xml.namespace.QName TYPEOFEXEMPTEDSOURCE$34 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "typeOfExemptedSource");
    private static final javax.xml.namespace.QName DATEOFEXEMPTEDSOURCE$36 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "dateOfExemptedSource");
    private static final javax.xml.namespace.QName DECLASSMANUALREVIEW$38 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassManualReview");
    private static final javax.xml.namespace.QName MASSUOM$40 = 
        new javax.xml.namespace.QName("", "massUOM");
    
    
    /**
     * Gets the "decimalErrorBound" attribute
     */
    public java.math.BigDecimal getDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalErrorBound" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            return target;
        }
    }
    
    /**
     * True if has "decimalErrorBound" attribute
     */
    public boolean isSetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMALERRORBOUND$0) != null;
        }
    }
    
    /**
     * Sets the "decimalErrorBound" attribute
     */
    public void setDecimalErrorBound(java.math.BigDecimal decimalErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALERRORBOUND$0);
            }
            target.setBigDecimalValue(decimalErrorBound);
        }
    }
    
    /**
     * Sets (as xml) the "decimalErrorBound" attribute
     */
    public void xsetDecimalErrorBound(org.apache.xmlbeans.XmlDecimal decimalErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(DECIMALERRORBOUND$0);
            }
            target.set(decimalErrorBound);
        }
    }
    
    /**
     * Unsets the "decimalErrorBound" attribute
     */
    public void unsetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMALERRORBOUND$0);
        }
    }
    
    /**
     * Gets the "classification" attribute
     */
    public v2.ism.ic.gov.us.ClassificationType.Enum getClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$2);
            if (target == null)
            {
                return null;
            }
            return (v2.ism.ic.gov.us.ClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classification" attribute
     */
    public v2.ism.ic.gov.us.ClassificationType xgetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassificationType target = null;
            target = (v2.ism.ic.gov.us.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$2);
            return target;
        }
    }
    
    /**
     * True if has "classification" attribute
     */
    public boolean isSetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATION$2) != null;
        }
    }
    
    /**
     * Sets the "classification" attribute
     */
    public void setClassification(v2.ism.ic.gov.us.ClassificationType.Enum classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATION$2);
            }
            target.setEnumValue(classification);
        }
    }
    
    /**
     * Sets (as xml) the "classification" attribute
     */
    public void xsetClassification(v2.ism.ic.gov.us.ClassificationType classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassificationType target = null;
            target = (v2.ism.ic.gov.us.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$2);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.ClassificationType)get_store().add_attribute_user(CLASSIFICATION$2);
            }
            target.set(classification);
        }
    }
    
    /**
     * Unsets the "classification" attribute
     */
    public void unsetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATION$2);
        }
    }
    
    /**
     * Gets the "ownerProducer" attribute
     */
    public java.util.List getOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$4);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownerProducer" attribute
     */
    public v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer xgetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer target = null;
            target = (v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$4);
            return target;
        }
    }
    
    /**
     * True if has "ownerProducer" attribute
     */
    public boolean isSetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNERPRODUCER$4) != null;
        }
    }
    
    /**
     * Sets the "ownerProducer" attribute
     */
    public void setOwnerProducer(java.util.List ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNERPRODUCER$4);
            }
            target.setListValue(ownerProducer);
        }
    }
    
    /**
     * Sets (as xml) the "ownerProducer" attribute
     */
    public void xsetOwnerProducer(v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer target = null;
            target = (v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$4);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.OwnerProducerAttribute.OwnerProducer)get_store().add_attribute_user(OWNERPRODUCER$4);
            }
            target.set(ownerProducer);
        }
    }
    
    /**
     * Unsets the "ownerProducer" attribute
     */
    public void unsetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNERPRODUCER$4);
        }
    }
    
    /**
     * Gets the "SCIcontrols" attribute
     */
    public java.util.List getSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SCIcontrols" attribute
     */
    public v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols xgetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$6);
            return target;
        }
    }
    
    /**
     * True if has "SCIcontrols" attribute
     */
    public boolean isSetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCICONTROLS$6) != null;
        }
    }
    
    /**
     * Sets the "SCIcontrols" attribute
     */
    public void setSCIcontrols(java.util.List scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCICONTROLS$6);
            }
            target.setListValue(scIcontrols);
        }
    }
    
    /**
     * Sets (as xml) the "SCIcontrols" attribute
     */
    public void xsetSCIcontrols(v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$6);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.SCIcontrolsAttribute.SCIcontrols)get_store().add_attribute_user(SCICONTROLS$6);
            }
            target.set(scIcontrols);
        }
    }
    
    /**
     * Unsets the "SCIcontrols" attribute
     */
    public void unsetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCICONTROLS$6);
        }
    }
    
    /**
     * Gets the "SARIdentifier" attribute
     */
    public java.util.List getSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SARIdentifier" attribute
     */
    public v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier xgetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier target = null;
            target = (v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$8);
            return target;
        }
    }
    
    /**
     * True if has "SARIdentifier" attribute
     */
    public boolean isSetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SARIDENTIFIER$8) != null;
        }
    }
    
    /**
     * Sets the "SARIdentifier" attribute
     */
    public void setSARIdentifier(java.util.List sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SARIDENTIFIER$8);
            }
            target.setListValue(sarIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "SARIdentifier" attribute
     */
    public void xsetSARIdentifier(v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier target = null;
            target = (v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$8);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.SARIdentifierAttribute.SARIdentifier)get_store().add_attribute_user(SARIDENTIFIER$8);
            }
            target.set(sarIdentifier);
        }
    }
    
    /**
     * Unsets the "SARIdentifier" attribute
     */
    public void unsetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SARIDENTIFIER$8);
        }
    }
    
    /**
     * Gets the "disseminationControls" attribute
     */
    public java.util.List getDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$10);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "disseminationControls" attribute
     */
    public v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls xgetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$10);
            return target;
        }
    }
    
    /**
     * True if has "disseminationControls" attribute
     */
    public boolean isSetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISSEMINATIONCONTROLS$10) != null;
        }
    }
    
    /**
     * Sets the "disseminationControls" attribute
     */
    public void setDisseminationControls(java.util.List disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISSEMINATIONCONTROLS$10);
            }
            target.setListValue(disseminationControls);
        }
    }
    
    /**
     * Sets (as xml) the "disseminationControls" attribute
     */
    public void xsetDisseminationControls(v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$10);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DisseminationControlsAttribute.DisseminationControls)get_store().add_attribute_user(DISSEMINATIONCONTROLS$10);
            }
            target.set(disseminationControls);
        }
    }
    
    /**
     * Unsets the "disseminationControls" attribute
     */
    public void unsetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISSEMINATIONCONTROLS$10);
        }
    }
    
    /**
     * Gets the "FGIsourceOpen" attribute
     */
    public java.util.List getFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceOpen" attribute
     */
    public v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen xgetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$12);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceOpen" attribute
     */
    public boolean isSetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEOPEN$12) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceOpen" attribute
     */
    public void setFGIsourceOpen(java.util.List fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEOPEN$12);
            }
            target.setListValue(fgIsourceOpen);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceOpen" attribute
     */
    public void xsetFGIsourceOpen(v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$12);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.FGIsourceOpenAttribute.FGIsourceOpen)get_store().add_attribute_user(FGISOURCEOPEN$12);
            }
            target.set(fgIsourceOpen);
        }
    }
    
    /**
     * Unsets the "FGIsourceOpen" attribute
     */
    public void unsetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEOPEN$12);
        }
    }
    
    /**
     * Gets the "FGIsourceProtected" attribute
     */
    public java.util.List getFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$14);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceProtected" attribute
     */
    public v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected xgetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$14);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceProtected" attribute
     */
    public boolean isSetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEPROTECTED$14) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceProtected" attribute
     */
    public void setFGIsourceProtected(java.util.List fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEPROTECTED$14);
            }
            target.setListValue(fgIsourceProtected);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceProtected" attribute
     */
    public void xsetFGIsourceProtected(v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$14);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().add_attribute_user(FGISOURCEPROTECTED$14);
            }
            target.set(fgIsourceProtected);
        }
    }
    
    /**
     * Unsets the "FGIsourceProtected" attribute
     */
    public void unsetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEPROTECTED$14);
        }
    }
    
    /**
     * Gets the "releasableTo" attribute
     */
    public java.util.List getReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$16);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "releasableTo" attribute
     */
    public v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo xgetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo target = null;
            target = (v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$16);
            return target;
        }
    }
    
    /**
     * True if has "releasableTo" attribute
     */
    public boolean isSetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELEASABLETO$16) != null;
        }
    }
    
    /**
     * Sets the "releasableTo" attribute
     */
    public void setReleasableTo(java.util.List releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELEASABLETO$16);
            }
            target.setListValue(releasableTo);
        }
    }
    
    /**
     * Sets (as xml) the "releasableTo" attribute
     */
    public void xsetReleasableTo(v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo target = null;
            target = (v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$16);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.ReleasableToAttribute.ReleasableTo)get_store().add_attribute_user(RELEASABLETO$16);
            }
            target.set(releasableTo);
        }
    }
    
    /**
     * Unsets the "releasableTo" attribute
     */
    public void unsetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELEASABLETO$16);
        }
    }
    
    /**
     * Gets the "nonICmarkings" attribute
     */
    public java.util.List getNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$18);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "nonICmarkings" attribute
     */
    public v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings xgetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$18);
            return target;
        }
    }
    
    /**
     * True if has "nonICmarkings" attribute
     */
    public boolean isSetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NONICMARKINGS$18) != null;
        }
    }
    
    /**
     * Sets the "nonICmarkings" attribute
     */
    public void setNonICmarkings(java.util.List nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONICMARKINGS$18);
            }
            target.setListValue(nonICmarkings);
        }
    }
    
    /**
     * Sets (as xml) the "nonICmarkings" attribute
     */
    public void xsetNonICmarkings(v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$18);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.NonICmarkingsAttribute.NonICmarkings)get_store().add_attribute_user(NONICMARKINGS$18);
            }
            target.set(nonICmarkings);
        }
    }
    
    /**
     * Unsets the "nonICmarkings" attribute
     */
    public void unsetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NONICMARKINGS$18);
        }
    }
    
    /**
     * Gets the "classifiedBy" attribute
     */
    public java.lang.String getClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classifiedBy" attribute
     */
    public v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy xgetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$20);
            return target;
        }
    }
    
    /**
     * True if has "classifiedBy" attribute
     */
    public boolean isSetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFIEDBY$20) != null;
        }
    }
    
    /**
     * Sets the "classifiedBy" attribute
     */
    public void setClassifiedBy(java.lang.String classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFIEDBY$20);
            }
            target.setStringValue(classifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "classifiedBy" attribute
     */
    public void xsetClassifiedBy(v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$20);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.ClassifiedByAttribute.ClassifiedBy)get_store().add_attribute_user(CLASSIFIEDBY$20);
            }
            target.set(classifiedBy);
        }
    }
    
    /**
     * Unsets the "classifiedBy" attribute
     */
    public void unsetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFIEDBY$20);
        }
    }
    
    /**
     * Gets the "derivativelyClassifiedBy" attribute
     */
    public java.lang.String getDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy xgetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            return target;
        }
    }
    
    /**
     * True if has "derivativelyClassifiedBy" attribute
     */
    public boolean isSetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$22) != null;
        }
    }
    
    /**
     * Sets the "derivativelyClassifiedBy" attribute
     */
    public void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            }
            target.setStringValue(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public void xsetDerivativelyClassifiedBy(v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$22);
            }
            target.set(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Unsets the "derivativelyClassifiedBy" attribute
     */
    public void unsetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVATIVELYCLASSIFIEDBY$22);
        }
    }
    
    /**
     * Gets the "classificationReason" attribute
     */
    public java.lang.String getClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classificationReason" attribute
     */
    public v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason xgetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$24);
            return target;
        }
    }
    
    /**
     * True if has "classificationReason" attribute
     */
    public boolean isSetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATIONREASON$24) != null;
        }
    }
    
    /**
     * Sets the "classificationReason" attribute
     */
    public void setClassificationReason(java.lang.String classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATIONREASON$24);
            }
            target.setStringValue(classificationReason);
        }
    }
    
    /**
     * Sets (as xml) the "classificationReason" attribute
     */
    public void xsetClassificationReason(v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$24);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.ClassificationReasonAttribute.ClassificationReason)get_store().add_attribute_user(CLASSIFICATIONREASON$24);
            }
            target.set(classificationReason);
        }
    }
    
    /**
     * Unsets the "classificationReason" attribute
     */
    public void unsetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATIONREASON$24);
        }
    }
    
    /**
     * Gets the "derivedFrom" attribute
     */
    public java.lang.String getDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivedFrom" attribute
     */
    public v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom xgetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom target = null;
            target = (v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$26);
            return target;
        }
    }
    
    /**
     * True if has "derivedFrom" attribute
     */
    public boolean isSetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVEDFROM$26) != null;
        }
    }
    
    /**
     * Sets the "derivedFrom" attribute
     */
    public void setDerivedFrom(java.lang.String derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVEDFROM$26);
            }
            target.setStringValue(derivedFrom);
        }
    }
    
    /**
     * Sets (as xml) the "derivedFrom" attribute
     */
    public void xsetDerivedFrom(v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom target = null;
            target = (v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$26);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DerivedFromAttribute.DerivedFrom)get_store().add_attribute_user(DERIVEDFROM$26);
            }
            target.set(derivedFrom);
        }
    }
    
    /**
     * Unsets the "derivedFrom" attribute
     */
    public void unsetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVEDFROM$26);
        }
    }
    
    /**
     * Gets the "declassDate" attribute
     */
    public java.util.Calendar getDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$28);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassDate" attribute
     */
    public v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate xgetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate target = null;
            target = (v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$28);
            return target;
        }
    }
    
    /**
     * True if has "declassDate" attribute
     */
    public boolean isSetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSDATE$28) != null;
        }
    }
    
    /**
     * Sets the "declassDate" attribute
     */
    public void setDeclassDate(java.util.Calendar declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSDATE$28);
            }
            target.setCalendarValue(declassDate);
        }
    }
    
    /**
     * Sets (as xml) the "declassDate" attribute
     */
    public void xsetDeclassDate(v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate target = null;
            target = (v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$28);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DeclassDateAttribute.DeclassDate)get_store().add_attribute_user(DECLASSDATE$28);
            }
            target.set(declassDate);
        }
    }
    
    /**
     * Unsets the "declassDate" attribute
     */
    public void unsetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSDATE$28);
        }
    }
    
    /**
     * Gets the "declassEvent" attribute
     */
    public java.lang.String getDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassEvent" attribute
     */
    public v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent xgetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent target = null;
            target = (v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$30);
            return target;
        }
    }
    
    /**
     * True if has "declassEvent" attribute
     */
    public boolean isSetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEVENT$30) != null;
        }
    }
    
    /**
     * Sets the "declassEvent" attribute
     */
    public void setDeclassEvent(java.lang.String declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEVENT$30);
            }
            target.setStringValue(declassEvent);
        }
    }
    
    /**
     * Sets (as xml) the "declassEvent" attribute
     */
    public void xsetDeclassEvent(v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent target = null;
            target = (v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$30);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DeclassEventAttribute.DeclassEvent)get_store().add_attribute_user(DECLASSEVENT$30);
            }
            target.set(declassEvent);
        }
    }
    
    /**
     * Unsets the "declassEvent" attribute
     */
    public void unsetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEVENT$30);
        }
    }
    
    /**
     * Gets the "declassException" attribute
     */
    public java.util.List getDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$32);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassException" attribute
     */
    public v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException xgetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException target = null;
            target = (v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$32);
            return target;
        }
    }
    
    /**
     * True if has "declassException" attribute
     */
    public boolean isSetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEXCEPTION$32) != null;
        }
    }
    
    /**
     * Sets the "declassException" attribute
     */
    public void setDeclassException(java.util.List declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEXCEPTION$32);
            }
            target.setListValue(declassException);
        }
    }
    
    /**
     * Sets (as xml) the "declassException" attribute
     */
    public void xsetDeclassException(v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException target = null;
            target = (v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$32);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DeclassExceptionAttribute.DeclassException)get_store().add_attribute_user(DECLASSEXCEPTION$32);
            }
            target.set(declassException);
        }
    }
    
    /**
     * Unsets the "declassException" attribute
     */
    public void unsetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEXCEPTION$32);
        }
    }
    
    /**
     * Gets the "typeOfExemptedSource" attribute
     */
    public java.util.List getTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeOfExemptedSource" attribute
     */
    public v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource xgetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            return target;
        }
    }
    
    /**
     * True if has "typeOfExemptedSource" attribute
     */
    public boolean isSetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$34) != null;
        }
    }
    
    /**
     * Sets the "typeOfExemptedSource" attribute
     */
    public void setTypeOfExemptedSource(java.util.List typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            }
            target.setListValue(typeOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "typeOfExemptedSource" attribute
     */
    public void xsetTypeOfExemptedSource(v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$34);
            }
            target.set(typeOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "typeOfExemptedSource" attribute
     */
    public void unsetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPEOFEXEMPTEDSOURCE$34);
        }
    }
    
    /**
     * Gets the "dateOfExemptedSource" attribute
     */
    public java.util.Calendar getDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfExemptedSource" attribute
     */
    public v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource xgetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            return target;
        }
    }
    
    /**
     * True if has "dateOfExemptedSource" attribute
     */
    public boolean isSetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$36) != null;
        }
    }
    
    /**
     * Sets the "dateOfExemptedSource" attribute
     */
    public void setDateOfExemptedSource(java.util.Calendar dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            }
            target.setCalendarValue(dateOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfExemptedSource" attribute
     */
    public void xsetDateOfExemptedSource(v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$36);
            }
            target.set(dateOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "dateOfExemptedSource" attribute
     */
    public void unsetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEOFEXEMPTEDSOURCE$36);
        }
    }
    
    /**
     * Gets the "declassManualReview" attribute
     */
    public boolean getDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$38);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassManualReview" attribute
     */
    public v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview xgetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$38);
            return target;
        }
    }
    
    /**
     * True if has "declassManualReview" attribute
     */
    public boolean isSetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSMANUALREVIEW$38) != null;
        }
    }
    
    /**
     * Sets the "declassManualReview" attribute
     */
    public void setDeclassManualReview(boolean declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSMANUALREVIEW$38);
            }
            target.setBooleanValue(declassManualReview);
        }
    }
    
    /**
     * Sets (as xml) the "declassManualReview" attribute
     */
    public void xsetDeclassManualReview(v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$38);
            if (target == null)
            {
                target = (v2.ism.ic.gov.us.DeclassManualReviewAttribute.DeclassManualReview)get_store().add_attribute_user(DECLASSMANUALREVIEW$38);
            }
            target.set(declassManualReview);
        }
    }
    
    /**
     * Unsets the "declassManualReview" attribute
     */
    public void unsetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSMANUALREVIEW$38);
        }
    }
    
    /**
     * Gets the "massUOM" attribute
     */
    public gov.ucore.ucore._2_0.MassUOMType.Enum getMassUOM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASSUOM$40);
            if (target == null)
            {
                return null;
            }
            return (gov.ucore.ucore._2_0.MassUOMType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "massUOM" attribute
     */
    public gov.ucore.ucore._2_0.MassUOMType xgetMassUOM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.MassUOMType target = null;
            target = (gov.ucore.ucore._2_0.MassUOMType)get_store().find_attribute_user(MASSUOM$40);
            return target;
        }
    }
    
    /**
     * Sets the "massUOM" attribute
     */
    public void setMassUOM(gov.ucore.ucore._2_0.MassUOMType.Enum massUOM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASSUOM$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASSUOM$40);
            }
            target.setEnumValue(massUOM);
        }
    }
    
    /**
     * Sets (as xml) the "massUOM" attribute
     */
    public void xsetMassUOM(gov.ucore.ucore._2_0.MassUOMType massUOM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.MassUOMType target = null;
            target = (gov.ucore.ucore._2_0.MassUOMType)get_store().find_attribute_user(MASSUOM$40);
            if (target == null)
            {
                target = (gov.ucore.ucore._2_0.MassUOMType)get_store().add_attribute_user(MASSUOM$40);
            }
            target.set(massUOM);
        }
    }
}
