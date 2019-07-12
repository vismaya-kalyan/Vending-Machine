package MDAEFSM.StatePattern;

import MDAEFSM.*;
import OutputProcessor.*;

//	State Pattern
//This class represents coin no_cups state


public class no_cups extends State{

//	extends of State class and represents no_cups state.
	public no_cups(MDAEFSM mda, OutputProcessor op) {
		this.mda=mda;
		this.op=op;
	}
	
	
//	Returns any coins inserted
	public void coin(int f) {
		op.IncreaseCF();
		op.ReturnCoins();
		System.out.println("First Instert Cups");
		op.ZeroCF();
	}
	
//	If parameter is > 0  store the number of cups set cf
//	to 0 and change state to idle.
	public void insert_cups(int n) {
		if(n>0) {
			mda.k = n;
			op.ZeroCF();
			mda.ChangeState(2);
			System.out.println("Cups Inserted " + mda.k);
		}
		else {
			System.out.println("Insert cups");
		}
	}
}
