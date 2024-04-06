package multithreadassignment;

public class extendthread  extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		extendthread t1=new extendthread();
		t1.start();
		extendthread t2=new extendthread();
		t2.start();

	}

}
