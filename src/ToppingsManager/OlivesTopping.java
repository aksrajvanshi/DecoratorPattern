package ToppingsManager;
import PizzaPackage.Pizza;

public class OlivesTopping extends ToppingDecorator{

	public OlivesTopping(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription(){
		
		return newPizza.getDescription() + ", Olives";
	}
	
	public double getCost(){
		return newPizza.getCost() + 1.2;
	}
	

}
