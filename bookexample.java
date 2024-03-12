package constructors;

public class bookexample {
	int id;
	bookexample( ) //default
	{
		System.out.print("Hello World");
	}
	bookexample( int i)// parametrized
	{ 
		id=101;
		System.out.print(id);
	}
	public static void main(String[] args) {
		bookexample b1=new bookexample( );	
		bookexample b2=new bookexample( 101);
	}

}
