package abstractkeyword;
abstract class shape
{
	void display()
	{
		System.out.println("displaying shape");
	}
	abstract void show();
	
}
class Circle extends shape
{
	void show()
	{
		System.out.println("circle");
	}
	
}

public class abstractexample1 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.display();
		c.show();

	}

}
