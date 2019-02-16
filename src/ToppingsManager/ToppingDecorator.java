package ToppingsManager;
import PizzaPackage.Pizza;

abstract public class ToppingDecorator implements Pizza {
	
	Pizza newPizza;
	
	public ToppingDecorator(Pizza newPizza){
		
			this.newPizza = newPizza;
	}
	
	
	public String getDescription(){
		
		return newPizza.getDescription();
	}
	
	public double getCost(){
		return newPizza.getCost();
	}

}
