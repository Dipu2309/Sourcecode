/*
  Static is the modifier applicable for methods, variables and blocks.
  We can't declare a class with static but inner classes can be declaring as the static.
 */
package october.modifiers;

public class Static_Modifier {

	static int x=10;
	int y=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Modifier A=new Static_Modifier();
		A.x=888;
		A.y=30;
		Static_Modifier B=new Static_Modifier();
		System.out.println(B.x+"----"+B.y);
	}

}
