package CosTrading;


/**
* CosTrading/IllegalOfferId.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalOfferId extends org.omg.CORBA.UserException
{
  public String id = null;

  public IllegalOfferId ()
  {
    super(IllegalOfferIdHelper.id());
  } // ctor

  public IllegalOfferId (String _id)
  {
    super(IllegalOfferIdHelper.id());
    id = _id;
  } // ctor


  public IllegalOfferId (String $reason, String _id)
  {
    super(IllegalOfferIdHelper.id() + "  " + $reason);
    id = _id;
  } // ctor

} // class IllegalOfferId
