

/**
 * SensorServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.uicds.sensorservice;

    /*
     *  SensorServiceService java interface
     */

    public interface SensorServiceService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getSOIListRequest0
                
         */

         
                     public org.uicds.sensorservice.GetSOIListResponseDocument getSOIList(

                        org.uicds.sensorservice.GetSOIListRequestDocument getSOIListRequest0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSOIListRequest0
            
          */
        public void startgetSOIList(

            org.uicds.sensorservice.GetSOIListRequestDocument getSOIListRequest0,

            final org.uicds.sensorservice.SensorServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSOIRequest2
                
         */

         
                     public org.uicds.sensorservice.GetSOIResponseDocument getSOI(

                        org.uicds.sensorservice.GetSOIRequestDocument getSOIRequest2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSOIRequest2
            
          */
        public void startgetSOI(

            org.uicds.sensorservice.GetSOIRequestDocument getSOIRequest2,

            final org.uicds.sensorservice.SensorServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateSOIRequest4
                
         */

         
                     public org.uicds.sensorservice.UpdateSOIResponseDocument updateSOI(

                        org.uicds.sensorservice.UpdateSOIRequestDocument updateSOIRequest4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateSOIRequest4
            
          */
        public void startupdateSOI(

            org.uicds.sensorservice.UpdateSOIRequestDocument updateSOIRequest4,

            final org.uicds.sensorservice.SensorServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createSOIRequest6
                
         */

         
                     public org.uicds.sensorservice.CreateSOIResponseDocument createSOI(

                        org.uicds.sensorservice.CreateSOIRequestDocument createSOIRequest6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createSOIRequest6
            
          */
        public void startcreateSOI(

            org.uicds.sensorservice.CreateSOIRequestDocument createSOIRequest6,

            final org.uicds.sensorservice.SensorServiceServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    