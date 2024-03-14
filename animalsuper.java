package superkeyword;
public class animalsuper {
    String color="white";
    	void display( )
    	{
        	System.out.println(" ");	
    }
}
class Dog extends animalsuper
{
	String color="black";
	void display()
	{
		super.display();
	}
	void printcolor( )
	{
		System.out.println(color);
		System.out.print(super.color);
		super.display();
		}
		
	public static void main(String[] args) {
		Dog d=new Dog( );
		d.printcolor( );
		d.display( );
	}
}
