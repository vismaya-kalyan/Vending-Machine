package AbstractFactory;


//This is the Abstract factory concreate class for vending machine1


import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class Vending1Factory extends AbstractFactory{

//	This is an method to create and return DataStore object
	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return new DataStore1();
	}
//This is an method to create and return StorePrice object (OutputProcessor)
	@Override
	public StorePrice getStorePrice() {
		// TODO Auto-generated method stub
		return new StorePrice1();
	}
// This is an method to create and return ZeroCF object (OutputProcessor)
	@Override
	public ZeroCF getZeroCf() {
		// TODO Auto-generated method stub
		return new ZeroCF1();
	}
//This is an method to create and return IncreaseCF object (OutputProcessor)
	@Override
	public IncreaseCF getIncreaseCF() {
		// TODO Auto-generated method stub
		return new IncreaseCF1();
	}
//This is an method to create and return ReturnCoins object (OutputProcessor)
	@Override
	public ReturnCoins getReturnCoins() {
		// TODO Auto-generated method stub
		return new ReturnCoins1();
	}
//This is an method to create and return DisposeDrink object (OutputProcessor)
	@Override
	public DisposeDrink getDisposeDrink() {
		// TODO Auto-generated method stub
		return new DisposeDrink1();
	}
//This is an method to create and return DisposeAdditive object (OutputProcessor)
	@Override
	public DisposeAdditive getDisposeAdditive() {
		// TODO Auto-generated method stub
		return new DisposeAdditive1();
	}
	

}
