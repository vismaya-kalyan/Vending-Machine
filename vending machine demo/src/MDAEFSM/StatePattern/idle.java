package MDAEFSM.StatePattern;

//	State Pattern
//This class represents idle state
import MDAEFSM.*;
import OutputProcessor.*;

public class idle extends State{

//	extends of State class and represents idle state.
	public idle(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
//	Stores the price value
	public void set_price() {
		op.StorePrice();
		System.out.println("Price Stored");
	}
	
//	If the parameter is positive we add it to the
//	no of cups stored before
	public void insert_cups(int n) {
		if (n>0) {
			mda.k = mda.k+n;
			System.out.println("cups updated " + mda.k);
		}
	}

//	Set cf to zero and changes state to coins_inserted
	public void card() {
		op.ZeroCF();
		mda.A = new int[5];
		mda.ChangeState(3);
	}
	
//	If argv is 1 increase cf create an array for additives 
//	and change states to coins_inserted
	public void coin(int f) {
		if(f==1) {
			op.IncreaseCF();
			mda.A = new int[5];
			mda.ChangeState(3);
		}
		else if(f ==0) {
			op.IncreaseCF();
		}
	}

}
