package PizzaPackage;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		
		return "Just a plain pizza with";
	}

	@Override
	public double getCost() {
		
		return 4.0;
	}

}
