package DsLogAdmin;


/**
* DsLogAdmin/Time24IntervalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

abstract public class Time24IntervalHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/Time24Interval:1.0";

  public static void insert (org.omg.CORBA.Any a, DsLogAdmin.Time24Interval that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsLogAdmin.Time24Interval extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = DsLogAdmin.Time24Helper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "start",
            _tcOf_members0,
            null);
          _tcOf_members0 = DsLogAdmin.Time24Helper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "stop",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (DsLogAdmin.Time24IntervalHelper.id (), "Time24Interval", _members0);
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

  public static DsLogAdmin.Time24Interval read (org.omg.CORBA.portable.InputStream istream)
  {
    DsLogAdmin.Time24Interval value = new DsLogAdmin.Time24Interval ();
    value.start = DsLogAdmin.Time24Helper.read (istream);
    value.stop = DsLogAdmin.Time24Helper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsLogAdmin.Time24Interval value)
  {
    DsLogAdmin.Time24Helper.write (ostream, value.start);
    DsLogAdmin.Time24Helper.write (ostream, value.stop);
  }

}
