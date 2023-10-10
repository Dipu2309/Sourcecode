/*
->Abstract is the modifier applicable only for methods and classes but not for variables.
->For any java class if we are not allow to create an object such type of class we have to declare 
  with abstract modifier that is for abstract class instantiation is not possible.

->If a class contain at least on abstract method then compulsory the corresponding
  class should be declare with abstract modifier.


 */

package october.modifiers;

/*
public abstract class Abstract_Class {
	public static void main(String args[])
	{
		Abstract_Class obj=new Abstract_Class() //Error because we can't create object of abstract class
	}
}
*/
abstract class Abstract_Class_Parent
{
	public abstract void name();
}
class Child extends Abstract_Class_Parent
{
	public void name()
	{
		System.out.println("Name is Dileep");
	}
}