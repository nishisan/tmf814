package CosNotification;


/**
* CosNotification/QoSAdminPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for objects that have quality of service settings.
    */
public abstract class QoSAdminPOA extends org.omg.PortableServer.Servant
 implements CosNotification.QoSAdminOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_qos", new java.lang.Integer (0));
    _methods.put ("set_qos", new java.lang.Integer (1));
    _methods.put ("validate_qos", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
       case 0:  // CosNotification/QoSAdmin/get_qos
       {
         CosNotification.Property $result[] = null;
         $result = this.get_qos ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
       case 1:  // CosNotification/QoSAdmin/set_qos
       {
         try {
           CosNotification.Property qos[] = CosNotification.QoSPropertiesHelper.read (in);
           this.set_qos (qos);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
       case 2:  // CosNotification/QoSAdmin/validate_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotification/QoSAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public QoSAdmin _this() 
  {
    return QoSAdminHelper.narrow(
    super._this_object());
  }

  public QoSAdmin _this(org.omg.CORBA.ORB orb) 
  {
    return QoSAdminHelper.narrow(
    super._this_object(orb));
  }


} // class QoSAdminPOA
