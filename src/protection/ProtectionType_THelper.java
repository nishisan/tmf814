package protection;


/**
* protection/ProtectionType_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>The protection type identifies whether a protection switch
   * is an MS protection switch or an SNCP protection switch.</p>
   * <p>It should be noted that although the term MSP was chosen 
   * as the original specific protection scheme to which the related behaviour
   * applied was Multiplex Section Protection, the label is now more generally 
   * applied to any 1+1 or 1:N Trail protection scheme.</p>
   **/
abstract public class ProtectionType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/protection/ProtectionType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, protection.ProtectionType_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static protection.ProtectionType_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (protection.ProtectionType_THelper.id (), "ProtectionType_T", new String[] { "PT_MSP_APS", "PT_SNCP"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static protection.ProtectionType_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return protection.ProtectionType_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, protection.ProtectionType_T value)
  {
    ostream.write_long (value.value ());
  }

}
