package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF abstract class and used for Vending Machine2

public class IncreaseCF2 implements IncreaseCF{
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

	
//	This methods adds the coins to cumulative funds float.
	@Override
	public void IncreaseCF() {
		// TODO Auto-generated method stub
		float cf = ds.getFloatCf();
		float v = ds.getFloatTemp_v();
		float total = cf + v;
		ds.setCf(total);
		System.out.println("coins: "+ ds.getFloatCf());
	}
}
