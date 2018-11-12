package Practice.Practice;

public class runnable implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread"+Thread.currentThread().getName());
		}
		
	}

}
