package flowDomain;

/**
* flowDomain/FlowDomain_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/

public final class FlowDomain_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomain.FlowDomain_T value = null;

  public FlowDomain_THolder ()
  {
  }

  public FlowDomain_THolder (flowDomain.FlowDomain_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomain.FlowDomain_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomain.FlowDomain_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomain.FlowDomain_THelper.type ();
  }

}