/*If the value of a variable is varied from object to object such type of variables are
  called instance variables.
  For every object a separate copy of instance variables will be created.
  For the instance variables it is not required to perform initialization explicitly jvm will always provide default values
*/

package october.modifiers;

public class Instance_Variable {
	int i;
	public static void main(String args[])
	{
		Instance_Variable obj=new Instance_Variable();
		System.out.println(obj.i);  //JVM will provide value
	}
}

