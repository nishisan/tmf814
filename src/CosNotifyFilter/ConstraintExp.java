package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintExp.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyFilter.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class ConstraintExp implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventType event_types[] = null;
  public String constraint_expr = null;

  public ConstraintExp ()
  {
  } // ctor

  public ConstraintExp (CosNotification.EventType[] _event_types, String _constraint_expr)
  {
    event_types = _event_types;
    constraint_expr = _constraint_expr;
  } // ctor

} // class ConstraintExp
