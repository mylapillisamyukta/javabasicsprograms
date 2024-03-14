package inheritence;
class A
{  
void babydog()
{System.out.println("BABYDOG");
}  
}  
class B extends A
{  
void dog()
{
	System.out.println("DOG");
}  
}  
class C extends B
{  
void animal()
{System.out.println("ANIMAL");
}  
}  
public class multipleexample {

	public static void main(String[] args) {
		C d=new C();  
		d.animal();  
		d.dog();  
		d.babydog();  
	}

}
