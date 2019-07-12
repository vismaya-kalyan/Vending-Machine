package OutputProcessor;

// This is the Output Processor which implements Strategy pattern.

import AbstractFactory.*;
import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class OutputProcessor {
	private DataStore ds;
	private AbstractFactory af;
	
	private StorePrice StorePrice;
	private ZeroCF ZeroCF;
	private ReturnCoins ReturnCoins;
	private IncreaseCF IncreaseCF;
	private DisposeDrink DisposeDrink;
	private DisposeAdditive DisposeAdditive;
	
//	This class is the Output processor which is  used to execute actions called by the mdaefsm.
	
	public OutputProcessor(AbstractFactory af, DataStore ds) {
		this.af = af;
		this.ds = ds;
		
		// Initialize Abstract Factory class
		StorePrice = af.getStorePrice();
		ZeroCF = af.getZeroCf();
		ReturnCoins = af.getReturnCoins();
		IncreaseCF = af.getIncreaseCF();
		DisposeDrink = af.getDisposeDrink();
		DisposeAdditive = af.getDisposeAdditive();
		
		}
	
//	This method creates StorePrices object using AbstractFactory 
//	class and It executes the storePrices() method of StorePrices class.
	public void StorePrice() {
		StorePrice.setDataStore(ds);
		StorePrice.StorePrice();
	}
	
//	This method creates ZeroCf object using AbstractFactory class and It executes
//	the ZeroCF() method of ZeroCf class.
	public void ZeroCF() {
		ZeroCF.setDataStore(ds);
		ZeroCF.ZeroCF();
	}
	
//	This method creates ReturnCoinobject using AbstractFactory class and It executes the 
//	ReturnCoin () method of ReturnCoinclass.
	public void ReturnCoins() {
		ReturnCoins.ReturnCoins();
	}
	
//	This method creates IncreaseCf object using AbstractFactory class and It executes the 
//	IncreaseCf () method of IncreaseCf class.
	public void IncreaseCF() {
		IncreaseCF.setDataStore(ds);
		IncreaseCF.IncreaseCF();
	}
	
//	This method creates DisposeDrink object using AbstractFactory class and It executes the DisposeDrink ()
//	method of DisposeDrink class.	
	public void DisposeDrink(int d) {
//		DisposeDrink.setDataStore(ds);
		DisposeDrink.DisposeDrink(d);
	}
	
//	This method creates DisposeAdditive object using AbstractFactory class and It executes the DisposeAdditive ()
//	method of DisposeAdditive class.
	public void DisposeAdditive(int[] A) {
		DisposeAdditive.DisposeAdditive(A);
	}
	
// getter and setter methods of DataStore and abstract factory.
	public DataStore getDataStore() {
		return ds;
	}
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	public AbstractFactory getAbstractFactory() {
		return af;
	}
	public void setAbstractFactory(AbstractFactory af) {
		this.af = af;
	}
	
}
