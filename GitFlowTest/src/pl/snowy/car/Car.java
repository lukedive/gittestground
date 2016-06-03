package pl.snowy.car;

public class Car {

	private String name;

	private int hoursePowers;
	
	private int maxSpeed;

	public Car(String name, int hoursePowers, int maxSpeed) {
		super();
		this.name = name;
		this.hoursePowers = hoursePowers;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursePowers() {
		return hoursePowers;
	}

	public void setHoursePowers(int hoursePowers) {
		this.hoursePowers = hoursePowers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", hoursePowers=" + hoursePowers + ", maxSpeed=" + maxSpeed + "]";
	}


}
