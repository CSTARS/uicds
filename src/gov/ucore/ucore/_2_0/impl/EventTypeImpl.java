/*
 * XML Type:  EventType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.EventType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML EventType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class EventTypeImpl extends gov.ucore.ucore._2_0.impl.ThingTypeImpl implements gov.ucore.ucore._2_0.EventType
{
    
    public EventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What");
    
    
    /**
     * Gets array of all "What" elements
     */
    public gov.ucore.ucore._2_0.WhatType[] getWhatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHAT$0, targetList);
            gov.ucore.ucore._2_0.WhatType[] result = new gov.ucore.ucore._2_0.WhatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "What" element
     */
    public gov.ucore.ucore._2_0.WhatType getWhatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.WhatType target = null;
            target = (gov.ucore.ucore._2_0.WhatType)get_store().find_element_user(WHAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "What" element
     */
    public int sizeOfWhatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHAT$0);
        }
    }
    
    /**
     * Sets array of all "What" element
     */
    public void setWhatArray(gov.ucore.ucore._2_0.WhatType[] whatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(whatArray, WHAT$0);
        }
    }
    
    /**
     * Sets ith "What" element
     */
    public void setWhatArray(int i, gov.ucore.ucore._2_0.WhatType what)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.WhatType target = null;
            target = (gov.ucore.ucore._2_0.WhatType)get_store().find_element_user(WHAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(what);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "What" element
     */
    public gov.ucore.ucore._2_0.WhatType insertNewWhat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.WhatType target = null;
            target = (gov.ucore.ucore._2_0.WhatType)get_store().insert_element_user(WHAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "What" element
     */
    public gov.ucore.ucore._2_0.WhatType addNewWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.WhatType target = null;
            target = (gov.ucore.ucore._2_0.WhatType)get_store().add_element_user(WHAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "What" element
     */
    public void removeWhat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHAT$0, i);
        }
    }
}
