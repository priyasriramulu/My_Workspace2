package Practice.Practice;

public class Multithread extends Thread{
	
	/*
	 * 1. extending Thread class
	 * convert into thread class
	 * override run() method and then call Start() method
	 * run() method will have evrything will do we need to call by Start() method
	 * 2. By Implement Runnable Interface
	 */
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		Multithread t1 = new Multithread();
		t1.setName("First");
		t1.start();
		Multithread t2 = new Multithread();
		t2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread"+Thread.currentThread().getName());
		}
		// TODO Auto-generated method stub
		
	}

}
