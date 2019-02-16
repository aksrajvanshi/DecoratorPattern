package mainClass;
import PizzaPackage.Pizza;
import PizzaPackage.PlainPizza;
import ToppingsManager.OlivesTopping;
import ToppingsManager.OnionTopping;

public class MainPizzaMaker {

	public static void main(String []args){
		
		Pizza newPizza = new OlivesTopping(new OnionTopping(new PlainPizza()));
		
		System.out.println("Your Pizza is ready with the details: ");
		
		System.out.println(newPizza.getDescription());
		
		System.out.println("Cost: $" + newPizza.getCost());
		
	}
	
	
}
