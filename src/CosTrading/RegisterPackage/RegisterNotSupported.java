package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/RegisterNotSupported.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class RegisterNotSupported extends org.omg.CORBA.UserException
{
  public String name[] = null;

  public RegisterNotSupported ()
  {
    super(RegisterNotSupportedHelper.id());
  } // ctor

  public RegisterNotSupported (String[] _name)
  {
    super(RegisterNotSupportedHelper.id());
    name = _name;
  } // ctor


  public RegisterNotSupported (String $reason, String[] _name)
  {
    super(RegisterNotSupportedHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class RegisterNotSupported
