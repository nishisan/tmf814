package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/SupplierAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for the supplier administration object.
    */
public final class SupplierAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.SupplierAdmin value = null;

  public SupplierAdminHolder ()
  {
  }

  public SupplierAdminHolder (CosEventChannelAdmin.SupplierAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.SupplierAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.SupplierAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.SupplierAdminHelper.type ();
  }

}