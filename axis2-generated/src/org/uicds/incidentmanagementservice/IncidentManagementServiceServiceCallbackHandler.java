
/**
 * IncidentManagementServiceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.uicds.incidentmanagementservice;

    /**
     *  IncidentManagementServiceServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class IncidentManagementServiceServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public IncidentManagementServiceServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public IncidentManagementServiceServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getIncidentCurrentVersion method
            * override this method for handling normal response from getIncidentCurrentVersion operation
            */
           public void receiveResultgetIncidentCurrentVersion(
                    org.uicds.incidentmanagementservice.GetIncidentCurrentVersionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIncidentCurrentVersion operation
           */
            public void receiveErrorgetIncidentCurrentVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListOfClosedIncident method
            * override this method for handling normal response from getListOfClosedIncident operation
            */
           public void receiveResultgetListOfClosedIncident(
                    org.uicds.incidentmanagementservice.GetListOfClosedIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListOfClosedIncident operation
           */
            public void receiveErrorgetListOfClosedIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for shareIncident method
            * override this method for handling normal response from shareIncident operation
            */
           public void receiveResultshareIncident(
                    org.uicds.incidentmanagementservice.ShareIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from shareIncident operation
           */
            public void receiveErrorshareIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for closeIncident method
            * override this method for handling normal response from closeIncident operation
            */
           public void receiveResultcloseIncident(
                    org.uicds.incidentmanagementservice.CloseIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from closeIncident operation
           */
            public void receiveErrorcloseIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIncidentList method
            * override this method for handling normal response from getIncidentList operation
            */
           public void receiveResultgetIncidentList(
                    org.uicds.incidentmanagementservice.GetIncidentListResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIncidentList operation
           */
            public void receiveErrorgetIncidentList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for archiveIncident method
            * override this method for handling normal response from archiveIncident operation
            */
           public void receiveResultarchiveIncident(
                    org.uicds.incidentmanagementservice.ArchiveIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from archiveIncident operation
           */
            public void receiveErrorarchiveIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIncident method
            * override this method for handling normal response from getIncident operation
            */
           public void receiveResultgetIncident(
                    org.uicds.incidentmanagementservice.GetIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIncident operation
           */
            public void receiveErrorgetIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createIncident method
            * override this method for handling normal response from createIncident operation
            */
           public void receiveResultcreateIncident(
                    org.uicds.incidentmanagementservice.CreateIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createIncident operation
           */
            public void receiveErrorcreateIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateIncident method
            * override this method for handling normal response from updateIncident operation
            */
           public void receiveResultupdateIncident(
                    org.uicds.incidentmanagementservice.UpdateIncidentResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateIncident operation
           */
            public void receiveErrorupdateIncident(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createIncidentFromCap method
            * override this method for handling normal response from createIncidentFromCap operation
            */
           public void receiveResultcreateIncidentFromCap(
                    org.uicds.incidentmanagementservice.CreateIncidentFromCapResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createIncidentFromCap operation
           */
            public void receiveErrorcreateIncidentFromCap(java.lang.Exception e) {
            }
                


    }
    