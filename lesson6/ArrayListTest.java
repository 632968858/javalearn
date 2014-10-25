import java.util.*;
public class ArrayListTest {
	public static void printElement(Collection c)
	{
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		//ArrayList al =new ArrayList();
	/*	al.add("xiaoming");
		al.add("haha");
		al.add("nimei");*/
/*		for(int i =0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		/*al.add(new Point2(1,2));
		al.add(new Point2(3,2));
		al.add(new Point2(4,2));
		Object[]  obj=al.toArray();    //返回一个数组
		
		for(int i=0;i<obj.length;i++)
			System.out.println(obj[i]);
		
		List l=Arrays.asList(obj);    //返回一个列表
		System.out.println(l);
		printElement(al);
		printElement(l);*/
	/*	Iterator it=l.iterator();
		it.next();
		it.remove();            //list未实现
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		ArrayList al=new ArrayList();
		al.add(new Student3(1,"xiaoyu"));
		al.add(new Student3(3,"xiaou"));
		al.add(new Student3(2,"xiaoy"));
		Collections.sort(al,new Student3.StudentComparator());
		printElement(al);
	}
}
class Point2
{
	int x;
	int y;
	Point2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public String toString()
	{
		return "x="+x+","+"y="+y;
		
	}
}
class Student3 implements Comparable
{
	int num;
	String name;
	Student3(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	static class StudentComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			Student3 s1=(Student3)obj1;
			Student3 s2=(Student3)obj2;
			return s1.num>s2.num ? 1: (s1.num==s2.num ? 0 :-1);
			
		}

		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student3 s=(Student3) o;
		return num>s.num ? 1 : (num==s.num ? 0:-1);
		/*
		 * int result=num>s.num ? 1 : (num==s.num ? 0:-1);
		 * if(result==0)
		 * {
		 * 		result=name>
		 * }
		 * 
		 * 
		 * */
	}
	public String toString()
	{
		return "num="+num+","+"name="+name;
	}
	
}