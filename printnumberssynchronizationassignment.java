package multithreadassignment;

public class printnumberssynchronizationassignment {

	public static void main(String[] args) {
			printnumberassignment ob=new printnumberassignment();
			 printnumbers1	 t1=new  printnumbers1(ob);
		t1.start();
	

	}

}
