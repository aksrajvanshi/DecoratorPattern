package ToppingsManager;
import PizzaPackage.Pizza;

public class OnionTopping extends ToppingDecorator{
	
	public OnionTopping(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription(){
		
		return newPizza.getDescription() + " Onions";
	}
	
	public double getCost(){
		return newPizza.getCost() + 0.7;
	}

}
