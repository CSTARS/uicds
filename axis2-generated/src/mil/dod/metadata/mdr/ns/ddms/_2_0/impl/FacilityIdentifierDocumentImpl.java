/*
 * An XML document type.
 * Localname: facilityIdentifier
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one facilityIdentifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class FacilityIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierDocument
{
    
    public FacilityIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACILITYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "facilityIdentifier");
    
    
    /**
     * Gets the "facilityIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType getFacilityIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType)get_store().find_element_user(FACILITYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "facilityIdentifier" element
     */
    public void setFacilityIdentifier(mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType facilityIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType)get_store().find_element_user(FACILITYIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType)get_store().add_element_user(FACILITYIDENTIFIER$0);
            }
            target.set(facilityIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "facilityIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType addNewFacilityIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.FacilityIdentifierType)get_store().add_element_user(FACILITYIDENTIFIER$0);
            return target;
        }
    }
}
