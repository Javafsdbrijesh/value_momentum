package trainings;

public class automobile {
	private String drive() {
		return"Driving vehicle";
	}
}

class Car extends automobile{
	protected String drive() {
		return "Driving car";
	}

}

