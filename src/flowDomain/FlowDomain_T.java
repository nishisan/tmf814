package flowDomain;


/**
* flowDomain/FlowDomain_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/

public final class FlowDomain_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public transmissionParameters.LayeredParameters_T transmissionParams[] = null;
  public String networkAccessDomain = null;
  public flowDomain.ConnectivityState_T fDConnectivityState = null;
  public String fdType = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public FlowDomain_T ()
  {
  } // ctor

  public FlowDomain_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, transmissionParameters.LayeredParameters_T[] _transmissionParams, String _networkAccessDomain, flowDomain.ConnectivityState_T _fDConnectivityState, String _fdType, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    transmissionParams = _transmissionParams;
    networkAccessDomain = _networkAccessDomain;
    fDConnectivityState = _fDConnectivityState;
    fdType = _fdType;
    additionalInfo = _additionalInfo;
  } // ctor

} // class FlowDomain_T
