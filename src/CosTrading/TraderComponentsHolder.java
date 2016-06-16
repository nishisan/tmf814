package CosTrading;

/**
* CosTrading/TraderComponentsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface has references to the componet services
 * that make up a trader. Not all services may be present,
 * depending on the type of trader.
 */
public final class TraderComponentsHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.TraderComponents value = null;

  public TraderComponentsHolder ()
  {
  }

  public TraderComponentsHolder (CosTrading.TraderComponents initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.TraderComponentsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.TraderComponentsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.TraderComponentsHelper.type ();
  }

}