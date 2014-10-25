import java.util.*;
public class HashSetTest {
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(new Student4(1,"xiaoyu1"));
		hs.add(new Student4(2,"xiaoyu2"));
		hs.add(new Student4(3,"xiaoyu3"));
		hs.add(new Student4(4,"xiaoyu4"));
		hs.add(new Student4(1,"xiaoyu1"));
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
}
class Student4
{
	int num;
	String name;
	Student4(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public String toString()
	{
		return "num="+num+","+"name="+name;
	}
	public int hashCode()
	{
		return num+name.hashCode();
	}
	public boolean equals(Object obj)
	{
		Student4 s= (Student4)obj;
		return num==s.num ?true:false;
	}		
}
