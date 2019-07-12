package MDAEFSM.StatePattern;

// //	State Pattern
//  This class represents coin inserted state

import MDAEFSM.*;
import OutputProcessor.*;

public class coins_inserted extends State{
//	extends of State class and represents coins_inserted state.
	public coins_inserted(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
//	Returns any coins inserted
	public void coin(int f) {
		op.ReturnCoins();
	}
	
//	Changes state to idle
	public void cancel() {
		op.IncreaseCF();
		op.ReturnCoins();
		op.ZeroCF();
		mda.ChangeState(2);
	}
	
	
//	Disposes drink with additive and changes the
//	state based on number of cups.
	public void dispose_drink(int d) {
		if(mda.k>1) {
			op.DisposeDrink(d);
			op.DisposeAdditive(mda.A);
			mda.k = mda.k -1;
			op.ZeroCF();
			mda.ChangeState(2);
		} 
		else if (mda.k<=1) {
			op.DisposeDrink(d);
			op.DisposeAdditive(mda.A);
			op.ZeroCF();
			mda.ChangeState(1);
			
		}
	}
	
//	Sets the particular additive to 1 if 0 or otherwise
	public void additive(int a) {
		if (mda.A[a]==0) {
			mda.A[a] = 1;
		}
		else {
			mda.A[a] = 0;
		}
	}
}
