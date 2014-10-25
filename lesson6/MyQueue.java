import java.util.*;
public class MyQueue {

	private LinkedList ll=new LinkedList();
	public void push(Object o)
	{
		ll.addLast(o);
	}
	public Object get()
	{
		return ll.removeFirst();
	}
	public boolean isEmpty()
	{
		return ll.isEmpty();
	}
	public static void main(String [] args)
	{
		MyQueue mq=new MyQueue();
		mq.push("fist");
		mq.push("second");
		mq.push("third");
		System.out.println(mq.get());
		
	}
}
