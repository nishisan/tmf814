package CosTrading;


/**
* CosTrading/UnknownServiceType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownServiceType extends org.omg.CORBA.UserException
{
  public String type = null;

  public UnknownServiceType ()
  {
    super(UnknownServiceTypeHelper.id());
  } // ctor

  public UnknownServiceType (String _type)
  {
    super(UnknownServiceTypeHelper.id());
    type = _type;
  } // ctor


  public UnknownServiceType (String $reason, String _type)
  {
    super(UnknownServiceTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class UnknownServiceType