package emsSessionFactory;


/**
* emsSessionFactory/EmsSessionFactory_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from emsSessionFactory.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/**
   * <p>There is a single instance of the EmsSessionFactory_I.  It is the 
   * entry point to the server/EMS.
   * This instance the object reference that the client uses to connect to the 
   * server.</p>
   *
   * <p>This interface implements the version interface and will return 
   * the server IDL version when getVersion is called on it.</p>
   **/
public interface EmsSessionFactory_IOperations  extends mtnmVersion.Version_IOperations
{

  /**
     * This operation allows the NMS to obtain the EmsSession_I object from
     * which all managers of the EMS can be obtained.
     *
     * <br>user: The (registered) user or application that is trying 
     * to access the server, can be empty string to indicate that no 
     * authentication mechanism is implemented by the server/EMS
     * <br>password: The password of the user, can be empty string
     * <br>client: A handle to the NmsSession_I object instantiated at the 
     * NMS, to which the returned EmsSession_I object has to be associated
     * <br>emsSessionInterface: A CORBA IOR for the EmsSession_I interface
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     * EXCPT_INVALID_INPUT - Raised when client is invalid<br>
     * EXCPT_ACCESS_DENIED - Raised in case of security violation<br>
     **/
  void getEmsSession (String user, String password, nmsSession.NmsSession_I client, emsSession.EmsSession_IHolder emsSessionInterface) throws globaldefs.ProcessingFailureException;
} // interface EmsSessionFactory_IOperations
