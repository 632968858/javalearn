
public class StringTest {
	public static void main(String[] args)
	{
//	  	String str1= new String("abc");
//		String str2= new String("abc");
//		String str3=str1;
//		if(str1.equals(str2))
//		{
//			System.out.println("eqal");
//		}
//		else
//		{
//			System.out.println("no");
//		}
		Student st1=new Student("zhangshang",5);
		Student st2= (Student)st1.clone();
		st1.name="lishi";
		System.out.println("st1 name"+st1.name+"st2 name"+st2.name);
	}
}
class Student implements Cloneable
{
	String name;
	int age;
	Student (String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public  Object clone()
	{
		Object o=null;
		try
		{
			o=super.clone();
		}catch(Exception e)
		{
			
		}
		return o;
		
		
	}
}
