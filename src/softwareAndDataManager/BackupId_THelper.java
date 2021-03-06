package softwareAndDataManager;


/**
* softwareAndDataManager/BackupId_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

abstract public class BackupId_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/softwareAndDataManager/BackupId_T:1.0";

  public static void insert (org.omg.CORBA.Any a, softwareAndDataManager.BackupId_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static softwareAndDataManager.BackupId_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "meName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.Time_THelper.id (), "Time_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "backupTime",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (softwareAndDataManager.BackupId_THelper.id (), "BackupId_T", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static softwareAndDataManager.BackupId_T read (org.omg.CORBA.portable.InputStream istream)
  {
    softwareAndDataManager.BackupId_T value = new softwareAndDataManager.BackupId_T ();
    value.meName = globaldefs.NVSList_THelper.read (istream);
    value.backupTime = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, softwareAndDataManager.BackupId_T value)
  {
    globaldefs.NVSList_THelper.write (ostream, value.meName);
    ostream.write_string (value.backupTime);
  }

}
