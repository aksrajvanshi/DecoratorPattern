package ToppingsManager;
import PizzaPackage.Pizza;

public class OnionTopping extends ToppingsManager{
	
	Pizza newPizza;
	
	public OnionTopping(Pizza newPizza) {
		this.newPizza = newPizza;
	}
	
	public String getDescription(){
		
		return newPizza.getDescription() + " Onions";
	}
	
	public double getCost(){
		return newPizza.getCost() + 0.7;
	}

}
