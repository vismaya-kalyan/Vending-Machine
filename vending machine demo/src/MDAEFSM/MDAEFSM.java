package MDAEFSM;

//	State Pattern
//  This is the class MDAEFSM class which is resposible for changing states and calling methods from particular state.


import MDAEFSM.StatePattern.*;
import OutputProcessor.*;

public class MDAEFSM {
//	This class contains the events which would be 
//	triggered by the input processor vm1 and vm2
	private State S;
	private State[] LS;
	public int k =0;
	public int[] A;
	
//	Constructor sets all the states objects to the array LS
	public MDAEFSM(OutputProcessor op) {
		
		LS =new State[4];
		
		LS[0] = new start(this,op);
		LS[1] = new no_cups(this,op);
		LS[2] = new idle(this,op);
		LS[3] = new coins_inserted(this,op);
		
		S = LS[0];
		
	}
	
//	This method is used to change state.
	public void ChangeState(int State) {
		S = LS[State];
		System.out.println("Change State Called " + S);
	}
	
//	This method is used to create and set price.
	public void create() {
		S.create();
	}
	
//	This method is used to add coins.
	public void coin(int f) {
		S.coin(f);
	}
	
//	This method is used to insert cups
	public void insert_cups(int n) {
		S.insert_cups(n);
	}
	
//	This method id used to pay via card.
	public void card() {
		S.card();
	}
	
//	This method is used to cancel after addition of  money
	public void cancel() {
		S.cancel();
	}
	
//	This method is used to update the price.
	public void set_price() {
		S.set_price();
	}
	
//	This method select and dispose particular drink
	public void dispose_drink(int d) {
		S.dispose_drink(d);
	}
	
//	This method is used to select additive.
	public void additive(int a) {
		S.additive(a);
	}
	
	
}
