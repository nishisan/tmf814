package CosTrading;

/**
* CosTrading/PropertyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class PropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.Property value = null;

  public PropertyHolder ()
  {
  }

  public PropertyHolder (CosTrading.Property initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.PropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.PropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.PropertyHelper.type ();
  }

}