package inheritence;
	class Aone
	{
		void m1()
		{
			System.out.println("I am in A class");
		}
	}
	class Bone extends Aone
	{
		void m2()
		{
			System.out.println("I am in B class");
		}
	}
	public class singleexample {
	public static void main(String[] args){
	Bone ob=new Bone();
	ob.m1();
	ob.m2();

	}
	}


