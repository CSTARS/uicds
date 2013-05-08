/*
 * An XML document type.
 * Localname: geospatialCoverage
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms._2_0.impl;
/**
 * A document containing one geospatialCoverage(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class GeospatialCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageDocument
{
    
    public GeospatialCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOSPATIALCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geospatialCoverage");
    
    
    /**
     * Gets the "geospatialCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType getGeospatialCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType)get_store().find_element_user(GEOSPATIALCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geospatialCoverage" element
     */
    public void setGeospatialCoverage(mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType geospatialCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType)get_store().find_element_user(GEOSPATIALCOVERAGE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType)get_store().add_element_user(GEOSPATIALCOVERAGE$0);
            }
            target.set(geospatialCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "geospatialCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType addNewGeospatialCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms._2_0.GeospatialCoverageType)get_store().add_element_user(GEOSPATIALCOVERAGE$0);
            return target;
        }
    }
}
