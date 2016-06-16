package softwareAndDataManager;


/**
* softwareAndDataManager/BackupIdIterator_IHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   *
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   *
   * <p> This iterator is used to retrieve all ME configuration data backup 
   * Ids.</p>
   **/
abstract public class BackupIdIterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/softwareAndDataManager/BackupIdIterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, softwareAndDataManager.BackupIdIterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static softwareAndDataManager.BackupIdIterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (softwareAndDataManager.BackupIdIterator_IHelper.id (), "BackupIdIterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static softwareAndDataManager.BackupIdIterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BackupIdIterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, softwareAndDataManager.BackupIdIterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static softwareAndDataManager.BackupIdIterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof softwareAndDataManager.BackupIdIterator_I)
      return (softwareAndDataManager.BackupIdIterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      softwareAndDataManager._BackupIdIterator_IStub stub = new softwareAndDataManager._BackupIdIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static softwareAndDataManager.BackupIdIterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof softwareAndDataManager.BackupIdIterator_I)
      return (softwareAndDataManager.BackupIdIterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      softwareAndDataManager._BackupIdIterator_IStub stub = new softwareAndDataManager._BackupIdIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}