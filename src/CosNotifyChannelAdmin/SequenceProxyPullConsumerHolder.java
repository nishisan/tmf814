package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/SequenceProxyPullConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for sequence proxy pull consumers.
    */
public final class SequenceProxyPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.SequenceProxyPullConsumer value = null;

  public SequenceProxyPullConsumerHolder ()
  {
  }

  public SequenceProxyPullConsumerHolder (CosNotifyChannelAdmin.SequenceProxyPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.SequenceProxyPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.SequenceProxyPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.SequenceProxyPullConsumerHelper.type ();
  }

}