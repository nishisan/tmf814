package flowDomainFragment;

/**
* flowDomainFragment/MFDFrIterator_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   **/
public final class MFDFrIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomainFragment.MFDFrIterator_I value = null;

  public MFDFrIterator_IHolder ()
  {
  }

  public MFDFrIterator_IHolder (flowDomainFragment.MFDFrIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomainFragment.MFDFrIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomainFragment.MFDFrIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomainFragment.MFDFrIterator_IHelper.type ();
  }

}
