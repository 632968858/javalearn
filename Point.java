class Point
{
	int x,y;
	Point(int a,int b)//构造函数
	{
			x=a;
			y=b;	
	}
	Point()
	{
		this(1,1);   //this 可以简化构造函数的调用
	}
	void output()
	{
			System.out.println(x);
			System.out.println(y);
	}
	void output(int x,int y)//此x，y为形参，this.x为该对象的变量
	{	
		this.x=x;      //this 可以区分局部变量与成员变量    
		this.y=y;
	}
	public static void main(String[] args)
	{
			Point p;
			p=new Point(2,3);
			//p.x=10;
			//p.y=3;
			Point p2= new Point();
			p.output(3,3);
			p.output();
			P2.output();
			
	}
}
