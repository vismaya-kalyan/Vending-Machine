package OutputProcessor.StrategyPattern;

// Strategy pattern
// Abstract class

import DataStore.*;

public interface StorePrice {
//	Abstract class to store price
	
//	Get DataStore object
	public DataStore getDataStore();
//	set DataStore object
	public void setDataStore(DataStore ds);
//	This is an abstract method for storing price.
	public void StorePrice();
}
