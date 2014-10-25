import java.lang.reflect.*;
public class ClassTest {
	
	public static void main(String[] args)
	{
		if (args.length!=1)
		{
			return;
		}
		try
		{
			Class c =Class.forName(args[0]);
			Constructor[] cons=c.getDeclaredConstructors();
			/*for(int i=0;i<cons.length;i++)
			{
				System.out.println(cons[i]);
			}
			Method[] ms=c.getDeclaredMethods();
			for(int i=0;i<ms.length;i++)
			{
				System.out.println(ms[i ]);
			}*/
			Class[] params=cons[0].getParameterTypes();
			Object[] paramValues=new Object[params.length];
			for(int i=0;i<params.length;i++)
			{
				if(params[i].isPrimitive())
				{
					paramValues[i]=new Integer(i+3);
				}
			}
			Object o =cons[0].newInstance(paramValues);
			Method[] ms=c.getDeclaredMethods();
			ms[0].invoke(o,null);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Point
{
	static
	{
		System.out.println("loading point");
	}
	int x,y;
	void print()
	{
		System.out.println("x="+x+","+"y="+y);
	}
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
}