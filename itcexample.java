package collections;
		class itc1 extends Thread
		{
			int totear = 0;
			public void run()
			{
				synchronized(this)
				{
					for(int i =0 ; i <10;i++)
					{
					 totear = totear + 100;
					}
					notify();
				}
			}

		}
		public class itcexample {
			public static void main(String[] args) {
				itc1 ob = new itc1();
				ob.start();
				synchronized(ob)
				{
					try {
					ob.wait();
				}catch(Exception e)
				{
					System.out.println(e);
				}
					System.out.println(ob.totear);	
				}
			}
		}

