class Point
{
	int x,y;
	Point(int a,int b)//���캯��
	{
			x=a;
			y=b;	
	}
	Point()
	{
		this(1,1);   //this ���Լ򻯹��캯���ĵ���
	}
	void output()
	{
			System.out.println(x);
			System.out.println(y);
	}
	void output(int x,int y)//��x��yΪ�βΣ�this.xΪ�ö���ı���
	{	
		this.x=x;      //this �������־ֲ��������Ա����    
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
