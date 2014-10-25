
public class TickTest {
	public static void main(String [] args)
	{
		Tick tk=new Tick();
		new Thread(tk).start();
		try
		{
			Thread.sleep(10);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		tk.b=true;
		new Thread(tk).start();
		
	}
}
class Tick implements Runnable
{
	int sum=100;
    Object obj=new Object();
    boolean b=false;
	public void run()
	{
		if (b)
		{
			while(true)
				sell();
		}
		else{
				synchronized (this)
				{
					while(true)
					{
						try
						{
							Thread.sleep(20);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						if(sum>0)		
							System.out.println("obj:"+Thread.currentThread().getName()+" sell ticks  "+sum);
							sum--;
						
					}
				}
		}
	}
	public  synchronized void sell()
	{
		try
		{
			Thread.sleep(20);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(sum>0)		
			System.out.println("sell:"+Thread.currentThread().getName()+" sell ticks  "+sum);
			sum--;
	}
	
	
	
}
