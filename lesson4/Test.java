
public class Test {
	public static void main(String[] args)
	{
		int i=1;
		Integer in=new Integer(i);
		int j=in.intValue();
		System.out.println(j);
		String st= in.toString();
		System.out.println(st);
		st="12356";
		System.out.println(Integer.valueOf(st));
		
	}
	
}
