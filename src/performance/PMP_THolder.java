package performance;

/**
* performance/PMP_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class PMP_THolder implements org.omg.CORBA.portable.Streamable
{
  public performance.PMP_T value = null;

  public PMP_THolder ()
  {
  }

  public PMP_THolder (performance.PMP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = performance.PMP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    performance.PMP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return performance.PMP_THelper.type ();
  }

}
