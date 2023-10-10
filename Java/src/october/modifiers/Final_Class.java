/*If a class declared as the final then we cann't creates the child class that is inheritance
concept is not applicable for final classes.
*/

package october.modifiers;

final class Final_Class {
	public void method()
	{
		System.out.println("This is Final class");
	}
}
/*
class Child extends Final_Class  //error because The type Child cannot subclass the final class Final_Class
{
	
}
*/