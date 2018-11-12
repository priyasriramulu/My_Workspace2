package Practice.Practice;

public class Runnabledemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     runnable r1 = new runnable();
     Thread t1 = new Thread(r1);
     t1.setPriority(10);
     t1.start();
     
     Thread t2 = new Thread(r1);
     t2.setPriority(1);
     t2.start();
     
     for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread"+Thread.currentThread().getName());
		}
	}

}
