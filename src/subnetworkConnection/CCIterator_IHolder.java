package subnetworkConnection;

/**
* subnetworkConnection/CCIterator_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from subnetworkConnection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class CCIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.CCIterator_I value = null;

  public CCIterator_IHolder ()
  {
  }

  public CCIterator_IHolder (subnetworkConnection.CCIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.CCIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.CCIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.CCIterator_IHelper.type ();
  }

}
