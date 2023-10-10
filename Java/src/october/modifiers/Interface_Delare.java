/*
  Def1: Any service requirement specification (srs) is called an interface.
  Example1: Sun people responsible to define JDBC API and database vendor will provide implementation for that.
  
  Example2: Sun people define Servlet API to develop web applications web server vendor is responsible to provide implementation.
  
Note1:
Whenever we are implementing an interface compulsory for every method of that
interface we should provide implementation otherwise we have to declare class as
abstract in that case child class is responsible to provide implementation for remaining
methods.

Note2:
Whenever we are implementing an interface method compulsory it should be declared
as public otherwise we will get compile time error.

A class can implements any no. Of interfaces at a time.

An interface can extend any no. Of interfaces at a time.
 */
package october.modifiers;

public interface Interface_Delare {
	void name();
	
}
