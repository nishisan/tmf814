package flowDomain;

/**
* flowDomain/FlowDomainMgr_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>The FlowDomainMgr_I is used to gain access to flow domains,
   * matrix flow domains, flow domain fragments and their operations.</p>
   *

   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation.</p>
   **/
public final class FlowDomainMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomain.FlowDomainMgr_I value = null;

  public FlowDomainMgr_IHolder ()
  {
  }

  public FlowDomainMgr_IHolder (flowDomain.FlowDomainMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomain.FlowDomainMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomain.FlowDomainMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomain.FlowDomainMgr_IHelper.type ();
  }

}
