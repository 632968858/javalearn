import java.io.*;
class DiveException extends Exception
{
	DiveException(String st)
	{
		 super(st);
	}
}
class Excep {
	
	public int div(int a,int b) throws ArithmeticException,DiveException
	{	if (b<0)
			throw new DiveException("can't b<0");
		return a/b;
	}
	public int fn(int a,int b) throws ArithmeticException,DiveException
	{
		return div(a,b);	
	}
}

class ExcepTest
{
	public static void main(String[] args)//throws Exception
	{
		Excep ex= new Excep();
		try
		{
			ex.fn(5,-1);
	     }
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			//e.printStackTrace();
			
		}
		catch(DiveException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		System.out.println("finish");
	}
	
}
