package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ConnectionAlreadyInactive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class ConnectionAlreadyInactive extends org.omg.CORBA.UserException
{

  public ConnectionAlreadyInactive ()
  {
    super(ConnectionAlreadyInactiveHelper.id());
  } // ctor


  public ConnectionAlreadyInactive (String $reason)
  {
    super(ConnectionAlreadyInactiveHelper.id() + "  " + $reason);
  } // ctor

} // class ConnectionAlreadyInactive