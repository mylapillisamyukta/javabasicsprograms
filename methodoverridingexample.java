package methodoverriding;
class mor
{
	void display(int x)
	{
		System.out.println(x*x);
	}
}
class mor1 extends mor
{
	void display(int x)
	{
		super.display(4);
		System.out.println(x*x*x);
	}
}
public class methodoverridingexample {
	public static void main(String[] args) {
		 mor1 ob1 = new  mor1();
		 ob1.display(4);

	}
	}