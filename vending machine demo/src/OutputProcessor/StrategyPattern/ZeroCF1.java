package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements ZeroCF abstract class and used for Vending Machine1 and Vending Machine2

public class ZeroCF1 implements ZeroCF{
	private DataStore ds;
//	This class implemets ZeroCF
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

//	This method reads the value of cf from the datastore and sets it to 0
	
	@Override
	public void ZeroCF() {
		// TODO Auto-generated method stub
		ds.setCf(0);
//		System.out.println("CF set to 0");
	}

}
