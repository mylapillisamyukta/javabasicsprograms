package multithreadassignment;

public class arrayrunnableassignment extends Thread {
     public void run()
     {
    	 String[] s= {"welcome","to","java","programming"};
    	 for(int i=0;i<s.length;i++)
    	 {
    		 System.out.println(s[i]+Thread.currentThread().getName());
    	 }
    	 }
	public static void main(String[] args) {
		arrayrunnableassignment t1=new arrayrunnableassignment();
		t1.start();
		t1.setPriority(5);
		t1.setName("1");
		arrayrunnableassignment t2=new arrayrunnableassignment();
		t2.start();
		t2.setPriority(9);
		t2.setName("2");
		arrayrunnableassignment t3=new arrayrunnableassignment();
		t3.start();
		t3.setPriority(3);
		t3.setName("3");

	}

}
