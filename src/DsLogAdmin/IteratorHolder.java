package DsLogAdmin;

/**
* DsLogAdmin/IteratorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/


// result of querying the Log
public final class IteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.Iterator value = null;

  public IteratorHolder ()
  {
  }

  public IteratorHolder (DsLogAdmin.Iterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.IteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.IteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.IteratorHelper.type ();
  }

}
