
public class ThreadTest {

	public static void main(String[] args)
	{
		MyThread mt= new MyThread();
//		mt.setName("thread");
//		mt.setPriority(Thread.MAX_PRIORITY);
//		mt.start();
		//new Thread(mt,"thread").start();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		
		while(true)
			System.out.println("main:"+Thread.currentThread().getName());
	}
}
class MyThread //implements Runnable//extends Thread
{
	int index =0;
	private class Inner extends Thread
	{
		public void run()
		{
			while(true)
			{	System.out.println(Thread.currentThread().getName()+index++);
				//yield();
			}
		}
		
	}
	Thread getThread()
	{
		return new Inner();
	}
	
//	public void run()
//	{
//		while(true)
//		{	System.out.println(Thread.currentThread().getName());
//			//yield();
//		}
//	}
}
