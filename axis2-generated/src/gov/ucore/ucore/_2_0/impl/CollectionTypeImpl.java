/*
 * XML Type:  CollectionType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore._2_0.CollectionType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore._2_0.impl;
/**
 * An XML CollectionType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class CollectionTypeImpl extends gov.ucore.ucore._2_0.impl.ThingTypeImpl implements gov.ucore.ucore._2_0.CollectionType
{
    
    public CollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What");
    private static final javax.xml.namespace.QName THINGREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRef");
    
    
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
    
    /**
     * Gets array of all "ThingRef" elements
     */
    public gov.ucore.ucore._2_0.ThingRefType[] getThingRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(THINGREF$2, targetList);
            gov.ucore.ucore._2_0.ThingRefType[] result = new gov.ucore.ucore._2_0.ThingRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ThingRef" element
     */
    public gov.ucore.ucore._2_0.ThingRefType getThingRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingRefType target = null;
            target = (gov.ucore.ucore._2_0.ThingRefType)get_store().find_element_user(THINGREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ThingRef" element
     */
    public int sizeOfThingRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THINGREF$2);
        }
    }
    
    /**
     * Sets array of all "ThingRef" element
     */
    public void setThingRefArray(gov.ucore.ucore._2_0.ThingRefType[] thingRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(thingRefArray, THINGREF$2);
        }
    }
    
    /**
     * Sets ith "ThingRef" element
     */
    public void setThingRefArray(int i, gov.ucore.ucore._2_0.ThingRefType thingRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingRefType target = null;
            target = (gov.ucore.ucore._2_0.ThingRefType)get_store().find_element_user(THINGREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(thingRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingRef" element
     */
    public gov.ucore.ucore._2_0.ThingRefType insertNewThingRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingRefType target = null;
            target = (gov.ucore.ucore._2_0.ThingRefType)get_store().insert_element_user(THINGREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingRef" element
     */
    public gov.ucore.ucore._2_0.ThingRefType addNewThingRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore._2_0.ThingRefType target = null;
            target = (gov.ucore.ucore._2_0.ThingRefType)get_store().add_element_user(THINGREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ThingRef" element
     */
    public void removeThingRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THINGREF$2, i);
        }
    }
}
