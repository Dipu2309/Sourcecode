package october.this_keyword;

public class This_Refer_To_Current_Object {

	void method()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Refer_To_Current_Object obj=new This_Refer_To_Current_Object();
		System.out.println(obj);
		obj.method();
	}

}
