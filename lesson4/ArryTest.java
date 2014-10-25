import java.util.Arrays;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class ArryTest {
	public static void main(String[] args)
	{
//		Point [] p1=new Point[]{new Point(1,1),new Point(2,2),new Point(3,3)};
//		Point[] p2=new Point[3];
//		System.arraycopy(p1, 0,p2,0,p1.length);
//		for(int i=0;i<p2.length;i++)
//		{
//			System.out.println("x="+p2[i].x+","+"y="+p2[i].y);
//		}
//		p2[1].x=5;
//		p2[1].y=5;
//		System.out.println("x="+p1[1].x+","+"y="+p1[1].y);
		Students[] s=new Students[] {new Students(1,"zhangshan"),new Students(2,"lishi"),new Students(3,"wangwu")};
		Arrays.sort(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
class Students implements Comparable
{
	int num;
	String name;
	Students(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Students s =(Students) o;
		return num>s.num?1:(num==s.num?0:-1);
	}
	public String toString()
	{
		return ("num="+num+" "+"name="+name);
		
	}
	
}
//class Point
//{
//	int x,y;
//	Point(int x,int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
//}
