package october.this_keyword;

public class Calling_Parameterized_Constructor_From_Default_Constructor {

	public Calling_Parameterized_Constructor_From_Default_Constructor() {
		this(1172560);
		System.out.println("Default constructor");
	}
	Calling_Parameterized_Constructor_From_Default_Constructor(int x)
	{
		System.out.println("Parameterized constructor is called from default constructor:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calling_Parameterized_Constructor_From_Default_Constructor obj=new Calling_Parameterized_Constructor_From_Default_Constructor();
	}

}
