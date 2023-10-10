/*
 *If a member declared as the protected then we can access that member within
  the current package anywhere but outside package only in child classes.
  Protected=default+kids.
 *We can access protected members within the current package anywhere either
  by child reference or by parent reference
 */

package october.modifiers;

public class Protected_Member_Class {
	protected void method()
	{
		System.out.println("Protected Method");
	}
}
