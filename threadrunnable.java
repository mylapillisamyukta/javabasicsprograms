package threads;
class threaddemo2 implements Runnable
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getPriority()+Thread.currentThread().getName()+"="+i);
			try {
			Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
public class threadrunnable {

	public static void main(String[] args) {
		threaddemo2 ob1 = new threaddemo2();
		Thread t1 = new Thread(ob1);
		threaddemo2 ob2 = new threaddemo2();
		Thread t2 = new Thread(ob2);
		t1.setName("thread1");
		t2.setName("thread2");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
