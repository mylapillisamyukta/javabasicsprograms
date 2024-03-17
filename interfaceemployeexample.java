package interfaceexample;
interface Address
{
	void showAddress();
}
interface employee
{
	String company="full stack development";
	void salary();
	void showAddress();
}
class developer implements employee,Address
{
	public void salary()
	{
		System.out.println("developer salary is 10,000");
	}
 public	void showAddress()
	{
		System.out.print("vizag");
	}
}

public class interfaceemployeexample {

	public static void main(String[] args) {
		developer ob=new developer( );
		ob.salary();
		ob.showAddress();
		
		

	}

}
