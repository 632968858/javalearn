import java.util.*;
public class MyStack {

	private LinkedList ll=new LinkedList();
	public void push(Object o)
	{
		ll.addFirst(o);
	}
	public Object pop()
	{
		return ll.removeFirst();
	}
	public Object peek()
	{
		return ll.getFirst();
	}
	public boolean isEmpty()
	{
		return ll.isEmpty();
	}
	public static void main(String [] args)
	{
		MyStack ms=new MyStack();
		ms.push("first");
		ms.push("second");
		ms.push("three");
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		
	}
	
}
