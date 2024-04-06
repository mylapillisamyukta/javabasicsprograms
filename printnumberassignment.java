package multithreadassignment;

 class printnumberassignment {

		synchronized void print(int n)
			{
				for(int i =1;i <=10;i++)
				{
					System.out.println(i);
				}
			}
		}
		
 class printnumbers1 extends Thread
	{
		printnumberassignment p;
		printnumbers1(printnumberassignment p)
		{
			this.p = p;
		}
	   public void run()
	   {
		   p.print(1);
	   }
	}

