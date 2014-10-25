import java.io.*;
public class PiperStreamTest {

	public static void main(String [] args)
	{
	PipedInputStream pis=new PipedInputStream();
	PipedOutputStream pos =new PipedOutputStream();
	try {
		pis.connect(pos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	consumer1 c= new consumer1(pis);
	c.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	producer1 p=new producer1(pos);

	new Thread(p).start();
	
	
	//p.run();
	//c.run();
	}
	
}
class producer1 implements Runnable
{
	private PipedOutputStream pos;
	producer1(PipedOutputStream pos)
	{
		this.pos=pos;
	}
	public void run()
	{
		try {
			pos.write("hello".getBytes());
			pos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class consumer1 extends Thread
{
	private PipedInputStream pis;
	consumer1(PipedInputStream pis)
	{
		this.pis=pis;
	}
	public void run()
	{
		try {
			byte [] b =new byte[100];
			int len=pis.read(b);
			System.out.println(new String(b,0,len));
			pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
