interface Sport    //�ӿ�first
{
	void jump();
	void run();	
}
class Athlete implements Sport
{
	public void jump()
	{	
		System.out.println("jump");
	}	
	public void run()
	{
		System.out.println("run");
	}
	public static void main(String[] args)
	{
		Athlete ath=new Athlete();	
		ath.jump();
		ath.run();	
	}
	
}