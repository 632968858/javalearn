
public class ProducerandConsumer {
	public static void main(String[] args)
	{
		Date d=new Date();
		Producer p=new Producer(d);
		Consumer c=new Consumer(d);
		p.setName("producer");
		c.setName("consumer");
		p.start();
		c.start();
		
		
	}
}
class Date
{
	int date;
	boolean bFull=false;
	public synchronized void put(int value)
	{
		if(!bFull)
		{
			date=value;
			bFull=true;
			notify();	
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized int get()
	{
		if(!bFull)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bFull=false;
		notify();
		return date;
		
	}
}
class Producer extends Thread
{
	Date d;
	Producer(Date d)
	{
		this.d=d;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			d.put(i);
			System.out.println(Thread.currentThread().getName()+"  input  "+i);
		}
	}
}
class Consumer extends Thread
{
	Date d;
	Consumer(Date d)
	{
		this.d=d;
	}
	public void run()
	{
		
			while(true)
				System.out.println(Thread.currentThread().getName()+"  output  "+d.get());
	}
}
