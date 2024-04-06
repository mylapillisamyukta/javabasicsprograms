package multithreadassignment;

public class arraythreadassignment extends Thread {
	public void run()
	{
		int a[]= {2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static void main(String[] args) {
		arraythreadassignment t1=new arraythreadassignment();
		t1.start();
		arraythreadassignment t2=new arraythreadassignment();
		t2.start();
	}

}
