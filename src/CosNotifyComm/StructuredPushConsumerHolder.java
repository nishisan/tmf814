package CosNotifyComm;

/**
* CosNotifyComm/StructuredPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for structured push consumers.
    */
public final class StructuredPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPushConsumer value = null;

  public StructuredPushConsumerHolder ()
  {
  }

  public StructuredPushConsumerHolder (CosNotifyComm.StructuredPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPushConsumerHelper.type ();
  }

}
