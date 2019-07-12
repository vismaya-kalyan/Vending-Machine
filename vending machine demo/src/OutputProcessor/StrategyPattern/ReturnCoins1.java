package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements ReturnCoins abstract class and used for Vending Machine1 and Vending Machine2

public class ReturnCoins1 implements ReturnCoins{
// This class implements ReturnCoins
private DataStore ds;
	
//	This class implemets IncreaseCF
	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		// TODO Auto-generated method stub
		this.ds = ds;
	}

//	Displays a message to return coins
	@Override
	public void ReturnCoins() {
		// TODO Auto-generated method stub
		System.out.println("Return Coin Back");	
//		System.out.println(ds.getIntCf());
	}

}
