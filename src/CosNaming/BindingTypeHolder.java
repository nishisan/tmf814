package CosNaming;

/**
* CosNaming/BindingTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNaming.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/

public final class BindingTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.BindingType value = null;

  public BindingTypeHolder ()
  {
  }

  public BindingTypeHolder (CosNaming.BindingType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingTypeHelper.type ();
  }

}
