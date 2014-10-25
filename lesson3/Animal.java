interface Animal
{
	void eat();
	void sleep();
}
class Zoo
{
	private class Tiger implements Animal
	{
		public void eat()
		{
			System.out.println("tiger eat");
		}
		public void sleep()
		{
			System.out.println("tiger eat");
		}
	}
	Animal getanimal()
	{
		return new Tiger();
	}
}
class test
{
	public static void main(String[] args)
	{
		Zoo z= new Zoo();
		Animal a=z.getanimal();
		a.eat();
		a.sleep();
	}
}