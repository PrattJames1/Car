public class Car
{
	private int yearModel = 0;
	private String make = "Tesla";
	private int speed = 0;

	public int getYearModel()
	{
		return yearModel;
	}

	public String getMake()
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public int accelerate()
	{
		speed = speed + 5;

		return speed;
	}

	public int brake()
	{
		speed = speed - 5;

		return speed;
	}
}