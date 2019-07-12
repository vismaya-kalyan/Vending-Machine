package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF abstract class and used for Vending Machine1

public class IncreaseCF1 implements IncreaseCF{
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

	
//	This methods adds the coins to cumulative funds integers only.
	@Override
	public void IncreaseCF() {
		// TODO Auto-generated method stub
		int cf = ds.getIntCf();
		int v = ds.getIntTemp_v();
		int total = cf + v;
		ds.setCf(total);
		System.out.println("coins: "+ ds.getIntCf());
		
	}

}
