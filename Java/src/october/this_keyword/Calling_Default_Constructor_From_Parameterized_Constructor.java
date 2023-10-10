package october.this_keyword;

public class Calling_Default_Constructor_From_Parameterized_Constructor {

	public Calling_Default_Constructor_From_Parameterized_Constructor()
	{
		System.out.println("Default constructor is called from parameterized constructor");
	}
	Calling_Default_Constructor_From_Parameterized_Constructor(int x)
	{
		this();
		System.out.println("Parameterized constructor:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calling_Default_Constructor_From_Parameterized_Constructor obj=new Calling_Default_Constructor_From_Parameterized_Constructor(1172560);
		
	}

}
