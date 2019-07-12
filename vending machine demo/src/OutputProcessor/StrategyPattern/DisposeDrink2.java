package OutputProcessor.StrategyPattern;
import DataStore.*;

//Strategy pattern
//Implements DisposeDrink abstract class and used for Vending Machine2

public class DisposeDrink2 implements DisposeDrink{
	
//Based on the integer passed a drink to disposed
	@Override
	public void DisposeDrink(int d) {
		// TODO Auto-generated method stub
		if(d==1) {
			System.out.println("Dispose Coffee");
		}
		
		
	}
	
}
