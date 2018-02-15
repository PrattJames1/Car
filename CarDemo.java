public class CarDemo
{
	public static void main(String[] args)
	{
		Car car1;

		car1 = new Car();

		car1.accelerate();
		System.out.println("Car speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Car speed: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Car speed: " + car1.getSpeed());

		car1.brake();
		System.out.println("Car speed: " + car1.getSpeed());
		car1.brake();
		System.out.println("Car speed: " + car1.getSpeed());
		car1.brake();
		System.out.println("Car speed: " + car1.getSpeed());

	}
}