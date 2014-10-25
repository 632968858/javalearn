import java.util.*;
public class TreeSetTest {
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(new Student5(1,"xiaoyu1"));
		ts.add(new Student5(2,"xiaoyu2"));
		ts.add(new Student5(4,"xiaoyu4"));
		ts.add(new Student5(3,"xiaoyu3"));
		Iterator it =ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}
class Student5 implements Comparable
{
	int num;
	String name;
	Student5(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	static class StudentComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			Student5 s1=(Student5)obj1;
			Student5 s2=(Student5)obj2;
			return s1.num>s2.num ? 1: (s1.num==s2.num ? 0 :-1);
			
		}

		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student5 s=(Student5) o;
		return num>s.num ? 1 : (num==s.num ? 0:-1);
		
		/* int result=num>s.num ? 1 : (num==s.num ? 0:-1);
		  if(result==0)
		 * {
		 * 		result=name>
		 * }
		 * 
		 */ 
		 
	}
	public String toString()
	{
		return "num="+num+","+"name="+name;
	}
	
}