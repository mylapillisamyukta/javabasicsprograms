package factorial;

public class factorialexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int number=7;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
      System.out.println("factorial of "+ number +"is: "+fact);
      
	}

}
