public class Welcome{

	public static void main(String[] args)
	{

		System.out.println("hello in world");
		//int num[] =new int[3];
		/*num[0]=1;
		num[1]=2;
		num[2]=3;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);*/
		int [] [] num;
		num=new int [3][];
		num[0]= new int [5];
		num[1]= new int [3];
		num[2]= new int [2];
		num[0][4]=1;
		num[1][2]=2;
		num[2][1]=3;
		System.out.println(num[0][4]);
	  System.out.println(num[1][2]);
	 	System.out.println(num[2][0]);
	}
}