package pl.snowy.car;

public class Car {

	private String name;

	private int hoursePowers;

	public Car(String name, int hoursePowers) {
		super();
		this.name = name;
		this.hoursePowers = hoursePowers;
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

	@Override
	public String toString() {
		return "Car [name=" + name + ", hoursePowers=" + hoursePowers + "]";
	}

}
