package flowDomain;


/**
* flowDomain/FDIterator_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of 
   * flow domain objects, iterators are used.</p>
   **/
public interface FDIterator_IOperations 
{
  boolean next_n (int how_many, flowDomain.FDList_THolder fdList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface FDIterator_IOperations