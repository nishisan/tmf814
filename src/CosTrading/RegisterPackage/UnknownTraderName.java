package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/UnknownTraderName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownTraderName extends org.omg.CORBA.UserException
{
  public String name[] = null;

  public UnknownTraderName ()
  {
    super(UnknownTraderNameHelper.id());
  } // ctor

  public UnknownTraderName (String[] _name)
  {
    super(UnknownTraderNameHelper.id());
    name = _name;
  } // ctor


  public UnknownTraderName (String $reason, String[] _name)
  {
    super(UnknownTraderNameHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class UnknownTraderName