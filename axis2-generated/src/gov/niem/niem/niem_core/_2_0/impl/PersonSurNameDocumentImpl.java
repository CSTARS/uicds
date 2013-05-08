/*
 * An XML document type.
 * Localname: PersonSurName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niem_core._2_0.PersonSurNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niem_core._2_0.impl;
/**
 * A document containing one PersonSurName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonSurNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niem_core._2_0.PersonSurNameDocument
{
    
    public PersonSurNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSURNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonSurName");
    
    
    /**
     * Gets the "PersonSurName" element
     */
    public gov.niem.niem.niem_core._2_0.PersonNameTextType getPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.PersonNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonSurName" element
     */
    public boolean isNilPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.PersonNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonSurName" element
     */
    public void setPersonSurName(gov.niem.niem.niem_core._2_0.PersonNameTextType personSurName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.PersonNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            }
            target.set(personSurName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonSurName" element
     */
    public gov.niem.niem.niem_core._2_0.PersonNameTextType addNewPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.PersonNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonSurName" element
     */
    public void setNilPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niem_core._2_0.PersonNameTextType target = null;
            target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niem_core._2_0.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            }
            target.setNil();
        }
    }
}
