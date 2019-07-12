package OutputProcessor.StrategyPattern;

//Strategy pattern
//Abstract class

import DataStore.*;

public interface ZeroCF {
//	getter setter method for DataStore
	public DataStore getDataStore();
	public void setDataStore(DataStore ds);
//	Interface method to set cf to 0
	public void ZeroCF();
}
