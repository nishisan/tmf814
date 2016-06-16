package flowDomainFragment;


/**
* flowDomainFragment/MFDFrIterator_IHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   **/
abstract public class MFDFrIterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/flowDomainFragment/MFDFrIterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, flowDomainFragment.MFDFrIterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static flowDomainFragment.MFDFrIterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (flowDomainFragment.MFDFrIterator_IHelper.id (), "MFDFrIterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static flowDomainFragment.MFDFrIterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_MFDFrIterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, flowDomainFragment.MFDFrIterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static flowDomainFragment.MFDFrIterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof flowDomainFragment.MFDFrIterator_I)
      return (flowDomainFragment.MFDFrIterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      flowDomainFragment._MFDFrIterator_IStub stub = new flowDomainFragment._MFDFrIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static flowDomainFragment.MFDFrIterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof flowDomainFragment.MFDFrIterator_I)
      return (flowDomainFragment.MFDFrIterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      flowDomainFragment._MFDFrIterator_IStub stub = new flowDomainFragment._MFDFrIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}