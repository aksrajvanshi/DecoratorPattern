package ToppingsManager;
import PizzaPackage.Pizza;

public class OlivesTopping extends ToppingsManager{

	Pizza newPizza;
	
	public OlivesTopping(Pizza newPizza) {
		this.newPizza = newPizza;
	}
	
	public String getDescription(){
		
		return newPizza.getDescription() + ", Olives";
	}
	
	public double getCost(){
		return newPizza.getCost() + 1.2;
	}
	

}
