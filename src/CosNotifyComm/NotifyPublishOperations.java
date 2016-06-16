package CosNotifyComm;


/**
* CosNotifyComm/NotifyPublishOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface used by event publishers.
    */
public interface NotifyPublishOperations 
{

  /**
         * Indicates that a supplier is changing the names of the types of
         * events it is publishing.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
  void offer_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType;
} // interface NotifyPublishOperations