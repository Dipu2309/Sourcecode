/*
  If the value of a variable is not varied from object to object such type of variables
  is not recommended to declare as the instance variables. We have to declare
  those variables at class level by using static modifier.
  
  In the case of instance variables for every object a seperate copy will be created
  but in the case of static variables a single copy will be created at class level and
  shared by every object of that class.
  
  If the static variable declare as final then compulsory we should perform initialization
  explicitly whether we are using or not otherwise we will get compile time error.(The
  JVM won't provide any default values)
 */
package october.modifiers;

public class FInal_Static_Variable {
	final static int i=10; //if nt initialize we will get compile time error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Instance_Variable obj=new Final_Instance_Variable();
		System.out.println(obj.i);
		
	}

}
