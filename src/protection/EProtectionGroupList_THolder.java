package protection;


/**
* protection/EProtectionGroupList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Sequence of EProtectionGroup_T.</p>
   **/
public final class EProtectionGroupList_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.EProtectionGroup_T value[] = null;

  public EProtectionGroupList_THolder ()
  {
  }

  public EProtectionGroupList_THolder (protection.EProtectionGroup_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.EProtectionGroupList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.EProtectionGroupList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.EProtectionGroupList_THelper.type ();
  }

}