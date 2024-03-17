package methodoverriding;
class hero
{
	int i = 200;
	 void display(int x)
	{
	    System.out.println(x*x);
	}
	 void display(int x,int y)
		{
		    System.out.println(x*x + y*y);
		}
}

public class finalkeywordexample {

	public static void main(String[] args) {
		hero ob = new hero();
		ob.display(5);
		ob.display(10,20);

	}

}

