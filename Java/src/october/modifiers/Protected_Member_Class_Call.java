package october.modifiers;

public class Protected_Member_Class_Call extends Protected_Member_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected_Member_Class objP=new Protected_Member_Class();
		objP.method();
		Protected_Member_Class_Call objC=new Protected_Member_Class_Call();
		objC.method();
		Protected_Member_Class objCP=new Protected_Member_Class_Call();
		objCP.method();
	}

}
