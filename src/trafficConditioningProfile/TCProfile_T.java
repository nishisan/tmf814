package trafficConditioningProfile;


/**
* trafficConditioningProfile/TCProfile_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficConditioningProfile.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/

public final class TCProfile_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public boolean defaultProfile = false;
  public transmissionParameters.LayeredParameters_T transmissionParams[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public TCProfile_T ()
  {
  } // ctor

  public TCProfile_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, boolean _defaultProfile, transmissionParameters.LayeredParameters_T[] _transmissionParams, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    defaultProfile = _defaultProfile;
    transmissionParams = _transmissionParams;
    additionalInfo = _additionalInfo;
  } // ctor

} // class TCProfile_T
