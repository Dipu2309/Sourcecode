/*The this keyword can be used to refer current class instance variable. 
If there is ambiguity between the instance variables and parameters, 
this keyword resolves the problem of ambiguity.*/
package october.this_keyword;

public class Loacl_N_Instance_Variable_is_Same {
	int eid;
	public Loacl_N_Instance_Variable_is_Same(int eid) 
	{
		eid=eid;	//0 will print because JVM will confuse	
		this.eid=eid;
	}
	void show()
	{
		System.out.println(eid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loacl_N_Instance_Variable_is_Same obj=new Loacl_N_Instance_Variable_is_Same(1172560);
		obj.show();
	}

}
