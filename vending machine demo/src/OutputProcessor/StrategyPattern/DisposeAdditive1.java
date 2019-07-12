package OutputProcessor.StrategyPattern;

// Strategy pattern
// Implements DisposeAdditive abstract class and used for Vending Machine1

import DataStore.*;


public class DisposeAdditive1 implements DisposeAdditive {
	private DataStore ds;
	
//	Based on the items chosen in array different additives are added. 
	@Override
	public void DisposeAdditive(int[] array) {
		// TODO Auto-generated method stub
		if (array[1]==1) {
			System.out.println("Sugar Added");
		}
	}
	
}
