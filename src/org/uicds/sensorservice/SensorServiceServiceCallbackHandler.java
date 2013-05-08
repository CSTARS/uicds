
/**
 * SensorServiceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.uicds.sensorservice;

    /**
     *  SensorServiceServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SensorServiceServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SensorServiceServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SensorServiceServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getSOIList method
            * override this method for handling normal response from getSOIList operation
            */
           public void receiveResultgetSOIList(
                    org.uicds.sensorservice.GetSOIListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSOIList operation
           */
            public void receiveErrorgetSOIList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSOI method
            * override this method for handling normal response from getSOI operation
            */
           public void receiveResultgetSOI(
                    org.uicds.sensorservice.GetSOIResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSOI operation
           */
            public void receiveErrorgetSOI(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateSOI method
            * override this method for handling normal response from updateSOI operation
            */
           public void receiveResultupdateSOI(
                    org.uicds.sensorservice.UpdateSOIResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateSOI operation
           */
            public void receiveErrorupdateSOI(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createSOI method
            * override this method for handling normal response from createSOI operation
            */
           public void receiveResultcreateSOI(
                    org.uicds.sensorservice.CreateSOIResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createSOI operation
           */
            public void receiveErrorcreateSOI(java.lang.Exception e) {
            }
                


    }
    