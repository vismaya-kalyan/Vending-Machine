package InputProcessor;

//This contains the InputProcessor for Vending Machine2


import DataStore.*;
import MDAEFSM.*;
import AbstractFactory.AbstractFactory;
/*
* This class is an Input Processor for Vending Machine 2
*/

public class VendingMachine2 {
	private MDAEFSM mda;
	private DataStore ds;
	AbstractFactory af;
	
	//	Constructor
	public VendingMachine2(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
		
	}
	
	public void setAf(AbstractFactory af) {
		this.af = af;
	} 
	
//	This method creates a vending machine and sets the price for the items 
	public void CREATE(float p) {
		ds.setTemp_p(p);
		mda.create();
	}
	
//	This method takes parameter indicating the coins inserted and compares it 
//	with the price based on which 2 paths are taken.
	public void COIN(float v) {
		ds.setTemp_v(v);
		if (ds.getFloatCf() + v >= ds.getFloatPrice()) {
			mda.coin(1);
		}
		else {
			mda.coin(0);
		}
	}
	
//	This method is used to add Sugar as an Additive.
	public void SUGAR() {
		mda.additive(2);
	}
	
//	This method is used to add cream as an Additive.
	public void CREAM() {
		mda.additive(1);
	}
	
//	This method is used to dispose coffee. 
	public void COFFEE() {
		mda.dispose_drink(1);
	}
	
//	This method is used to insert cups 
	public void InsertCups(int n) {
		mda.insert_cups(n);
	}
	
//	This price is used to override the previously
//	set price value during create
	public void SetPrice(float p) {
		ds.setTemp_p(p);
		mda.set_price();
	}
	
//	This methods used to end any transcations like revoking
//	command after inserting coin.
	public void CANCEL() {
		mda.cancel();
	}

}
