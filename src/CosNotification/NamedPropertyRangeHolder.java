package CosNotification;

/**
* CosNotification/NamedPropertyRangeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class NamedPropertyRangeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.NamedPropertyRange value = null;

  public NamedPropertyRangeHolder ()
  {
  }

  public NamedPropertyRangeHolder (CosNotification.NamedPropertyRange initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.NamedPropertyRangeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.NamedPropertyRangeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.NamedPropertyRangeHelper.type ();
  }

}