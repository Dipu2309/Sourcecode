/*
  If the value of a variable is not varied from object to object such type of variables
  is not recommended to declare as the instance variables. We have to declare
  those variables at class level by using static modifier.
  
  In the case of instance variables for every object a seperate copy will be created
  but in the case of static variables a single copy will be created at class level and
  shared by every object of that class.
  
  For the static variables it is not required to perform initialization explicitly jvm
  will always provide default values.
  Example:
 */
package october.modifiers;

public class Static_Variable {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variable obj=new Static_Variable();
		System.out.println(obj.i);
	}

}
