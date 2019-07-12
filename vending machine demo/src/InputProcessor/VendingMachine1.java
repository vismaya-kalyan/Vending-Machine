package InputProcessor;

// This contains the InputProcessor for Vending Machine1


import DataStore.*;
import MDAEFSM.*;
import AbstractFactory.AbstractFactory;

/*
 * This class is an Input Processor for Vending Machine 1
 */

public class VendingMachine1 {
	
	private MDAEFSM mda;
	private DataStore ds;
	AbstractFactory af;
	
	//	Constructor
	public VendingMachine1(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
	}
	
	public void setAf(AbstractFactory af) {
		this.af = af;
	}
	
//	This method creates a vending machine and sets the price for the items 
	public void create(int p) {
		ds.setTemp_p(p);
		mda.create();
	}
	
//	This method takes parameter indicating the coins inserted and compares 
//	it with the price based on which 2 paths are taken.
	public void coin(int v) {
		ds.setTemp_v(v);
		if (ds.getIntCf() + v >= ds.getIntPrice()) {
			mda.coin(1);
		}
		else {
			mda.coin(0);
		}
	}
	
//	This method selects card as the method of payment.	
	public void card(float x) {
		if (x >= ds.getIntPrice()) {
			mda.card();
		}
	}
	
//	This method is used to add Sugar as a Additive.
	public void sugar() {
		mda.additive(1);
	}
	
//	This method is used to dispose tea. 
	public void tea() {
		mda.dispose_drink(1); 
	}
	
//	This method is used to dispose chocolate	
	public void chocolate() {
		mda.dispose_drink(2);
	}
	
//	This method is used to insert cups 
	public void insert_cups(int n) {
		mda.insert_cups(n);
	}
	
//	This price is used to override the previously 
//	set price value during create
	public void set_price(int p) {
		ds.setTemp_p(p);
		mda.set_price();
	}
	
// This methods used to end any transcations like
//	revoking command after inserting coin.	
	public void cancel() {
		mda.cancel();
	}
}
