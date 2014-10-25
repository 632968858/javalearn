class Out
{
	private int index =10;
	class Inner
	{
		int index =20;
		void print()
		{
			int index=30;
			System.out.println(index);
			System.out.println(this.index);
			System.out.println(Out.this.index);
		}
	}	
	void print()
	{
		Inner inner=new Inner();
		inner.print();
	//	System.out.println(index);
	}
	
}
class fun
{
	public static void main(String[] args)
	{
		Out out=new Out();
		Out.Inner in=out.new Inner();
		in.print();	
	}
}