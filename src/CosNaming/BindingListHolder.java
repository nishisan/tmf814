package CosNaming;


/**
* CosNaming/BindingListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNaming.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/

public final class BindingListHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.Binding value[] = null;

  public BindingListHolder ()
  {
  }

  public BindingListHolder (CosNaming.Binding[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingListHelper.type ();
  }

}
