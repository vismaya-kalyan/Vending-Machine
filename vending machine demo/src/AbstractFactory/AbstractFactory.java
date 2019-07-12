package AbstractFactory;



//This is the Abstract factory abstract class



import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public abstract class AbstractFactory {
//	This is an abstract method to create and return DataStore object
	public abstract DataStore getDataStore();
//	This is an abstract method to create and return StorePrice object (OutputProcessor)
	public abstract StorePrice getStorePrice();
//	This is an abstract method to create and return ZeroCF object (OutputProcessor)
	public abstract ZeroCF getZeroCf();
//	This is an abstract method to create and return IncreaseCF object (OutputProcessor)
	public abstract IncreaseCF getIncreaseCF();
//	This is an abstract method to create and return ReturnCoins object (OutputProcessor)
	public abstract ReturnCoins getReturnCoins();
//	This is an abstract method to create and return DisposeDrink object (OutputProcessor)
	public abstract DisposeDrink getDisposeDrink();
//	This is an abstract method to create and return DisposeAdditive object (OutputProcessor)
	public abstract DisposeAdditive getDisposeAdditive();
	
}
