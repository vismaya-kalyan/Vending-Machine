package MDAEFSM.StatePattern;

//	State Pattern
//This is a abstract class represents all functions that is performed by all states.

import MDAEFSM.*;
import OutputProcessor.*;

public abstract class State {
	MDAEFSM mda;
	OutputProcessor op;
	
//	This method is used to create and set price.
	public void create() {
		
	}
	
//	This method is used to add coins.
	public void coin(int f) {
		
	}
	
//	This method is used to insert cups
	public void insert_cups(int n) {
		
	}
	
//	This method id used to pay via card.
	public void card() {
		
	}
	
//	This method is used to cancel after addition of  money
	public void cancel() {
		
	}
	
//	This method is used to update the price.
	public void set_price() {
		
	}
	
//	This method select and dispose particular drink
	public void dispose_drink(int d) {
		
	}
	
//	This method is used to select additive.
	public void additive(int a) {
	
	}
	
//	This method is used to get MDAEFSM object.
	public MDAEFSM getMDAEFSM() {
		return mda;
	}

//	This method is used to set MDAEFSM object
	public void setMDAEFSM(MDAEFSM mda) {
		this.mda = mda;
	}
	
//	This method is used to get OutputProcessor object.
	public OutputProcessor getOp() {
		return op;
	}
	
//	This method is used to set OutputProcessor object.
	public void setOP(OutputProcessor op) {
		this.op=op;
	}
}
