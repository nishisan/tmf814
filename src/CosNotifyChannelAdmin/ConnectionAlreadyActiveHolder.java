package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ConnectionAlreadyActiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class ConnectionAlreadyActiveHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ConnectionAlreadyActive value = null;

  public ConnectionAlreadyActiveHolder ()
  {
  }

  public ConnectionAlreadyActiveHolder (CosNotifyChannelAdmin.ConnectionAlreadyActive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.type ();
  }

}