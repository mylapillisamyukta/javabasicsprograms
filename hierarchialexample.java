package inheritence;

	class Dogfamily
	{  
		void eat()
		{
			System.out.println("eating");
			}  
		}  
		class Dog extends Dogfamily
		{  
		void bark()
		{
			System.out.println("barking");
			}  
		}  
		class Puppy extends Dog{  
		void sleep()
		{
			System.out.println("sleeping");
			}  
		}  
		public class hierarchialexample {
		public static void main(String args[])
		{  
		Puppy x= new Puppy();
		x.sleep();  
		x.eat();  
		}
		}  


	
