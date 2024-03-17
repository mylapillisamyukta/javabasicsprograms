package methodoverriding;
/* changing no.of arguments
class Adder{  
static int add(int a,int b)
{
	return a+b;
	}  
static int add(int a,int b,int c)
{
	return a+b+c;
	}  
}  
public class methodoverloadingexample { 
	public static void main(String[] args) {
		System.out.println(Adder.add(50,50));  
		System.out.println(Adder.add(50,50,50));  
		}
	}    ---->100,150  */
class Adder{  
static int add(int a, int b)
{
	return a+b;
	}  
static double add(double a, double b)
{
	return a+b;
	}  
}  
 public class   methodoverloadingexample{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}}  
