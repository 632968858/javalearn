class Car
{
	class Wheel
	{}	
}
class PlayWheel extends Car.Wheel
{
	PlayWheel(Car car)
	{
		car.super();
	}
	public static void main(String[] args)
	{
		Car car=new Car();
		PlayWheel pw= new PlayWheel(car);
	}
}