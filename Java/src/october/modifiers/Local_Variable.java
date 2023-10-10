/*
  To meet temporary requirement of the Programmer sometime we can declare
  the variable inside a method or block or constructor such type of variables are
  called local variables.
  
  For the local variables jvm won't provide any default value compulsory we
  should perform initialization explicitly before using that variable.
  
  Note: The only applicable modifier for local variables is final if we are using any other
  modifier we will get compile time error.
  
  The formal parameters of a method are simply acts as local variables of that
  method hence it is possible to declare formal parameters as final.

  If we declare formal parameters as final then we can't change its value within the
  method.
 */

package october.modifiers;

public class Local_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; //local variable
		final int j=9; //local variable
	}

}
