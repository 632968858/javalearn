public class ThreadStop {
	public static void main(String [] args)
	{
		Thread1 t=new Thread1();
		t.start();
		int index=1;
		while(true)
		{
			if(index++==100)
			{
				t.toStop();
				t.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName());
			
				
		}
		System.out.println("Main exit");
		
	}
}
class Thread1 extends Thread
{
	private boolean b=false;
	public synchronized void run()
	{
		while(!b)
		{
		
				try {
					wait();                       //µÈ´ýnotify
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					if(b)
						return;
				}
		
			System.out.println(getName());
		}
		
	}
	void toStop()
	{
		b=true;
	}
}