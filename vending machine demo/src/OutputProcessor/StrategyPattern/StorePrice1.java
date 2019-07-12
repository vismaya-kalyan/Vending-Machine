package OutputProcessor.StrategyPattern;

import DataStore.*; 

//Strategy pattern
//Implements StorePrice abstract class and used for Vending Machine1

public class StorePrice1 implements StorePrice{
	private DataStore ds;
//	This class implements StorePrice
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

//	This method is used for storing the integer price
	@Override
	public void StorePrice() {
		// TODO Auto-generated method stub
		int price = ds.getIntTemp_p();
		ds.setPrice(price);
		System.out.println("Price of item " + ds.getIntPrice());
	}

}
