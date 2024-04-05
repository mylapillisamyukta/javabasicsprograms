package threads;
public class threadclass extends Thread
	{
		public void run()
		{
			for(int i = 0; i<10; i++)
			{
				System.out.println(i+Thread.currentThread().getName());
				try
				{
				Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}

				}

		}

		public static void main(String[] args) {
			threadclass t1 = new threadclass();
			t1.setName("mythread1");
			t1.setPriority(1);
			t1.start();
			threadclass t2 = new threadclass();
			t2.setName("mythread2");
			t2.setPriority(8);
			t2.start();


		}

	}