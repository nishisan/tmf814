package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ProxyNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class ProxyNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ProxyNotFound value = null;

  public ProxyNotFoundHolder ()
  {
  }

  public ProxyNotFoundHolder (CosNotifyChannelAdmin.ProxyNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ProxyNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ProxyNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ProxyNotFoundHelper.type ();
  }

}
