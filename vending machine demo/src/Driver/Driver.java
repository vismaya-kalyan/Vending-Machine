package Driver;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import AbstractFactory.*;
import DataStore.*;
import InputProcessor.*;
import MDAEFSM.*;
import OutputProcessor.*;

public class Driver {
//	 this is the driver which drives vending machine1 and vending machine 2
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		int ch = 1;
		System.out.println(" ******** Select Vending Machine *******");
		System.out.println(" 1. Vending Machine - 1");
		System.out.println(" 2. Vending Machine - 2");
		
		input = bufferedReader.readLine();
		
		if (input.equalsIgnoreCase("1")) {
			
			AbstractFactory af = new Vending1Factory();
			DataStore ds = af.getDataStore();
			OutputProcessor op = new OutputProcessor(af, ds);
			MDAEFSM mda = new MDAEFSM(op);
			VendingMachine1 vm1 = new  VendingMachine1(mda, ds);
//			vm1.setAf(af);

			int p;
			int v;
			int n;
			float x;
			
			System.out.print(" Vending Machine-1");
			System.out.print("\n");
			System.out.print(" MENU of Operations");
			System.out.print("\n");
			System.out.print(" 0. create(int)");
			System.out.print("\n");
			System.out.print(" 1. coin(int)");
			System.out.print("\n");
			System.out.print(" 2. sugar()");
			System.out.print("\n");
			System.out.print(" 3. tea()");
			System.out.print("\n");
			System.out.print(" 4. chocolate()");
			System.out.print("\n");
			System.out.print(" 5. insert_cups(int)");
			System.out.print("\n");
			System.out.print(" 6. set_price(int)");
			System.out.print("\n");
			System.out.print(" 7. cancel()");
			System.out.print("\n");
			System.out.print(" 8. card(float)");
			System.out.print("\n");
			System.out.print(" q. Quit the demo program");
			System.out.print("\n");
			System.out.print(" Please make a note of these operations");
			System.out.print("\n");
			System.out.print(" Vending Machine-1 Execution");
			System.out.print("\n");
			
			
			while (true){
				System.out.print(" Select Operation: ");
				System.out.print("\n");
				System.out.print("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card,q-Quit");
				System.out.print("\n");
				
				input = bufferedReader.readLine();
				
				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;
				try {
				ch = Integer.parseInt(input);
				}
				catch (Exception e)
				   {
//				    in.next();
				    System.out.print("That’s not "
				     + "an integer between 0 - 8 or q. Try again:\n ");
				   continue;
				   }
		
				switch (ch){
						case 0: //create
							System.out.print(" Operation: create(int p)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter p:");
							System.out.print("\n");
							try {
							p = in.nextInt();
							if ( p > 0) {
								vm1.create(p);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("That’s not "
							     + "an integer. Try again:\n ");
							   }
						break;
						case 1: //coin
							System.out.print(" Operation: coin(int v)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter v:");
							System.out.print("\n");
							try {
							v = in.nextInt();
							if (v > 0) {
								vm1.coin(v);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("That’s not "
							     + "an integer. Try again: \n");
							   }
						break;
						case 2: //sugar
							System.out.print(" Operation: sugar()");
							System.out.print("\n");
							vm1.sugar();
						break;
						case 3: // tea
							System.out.print(" Operation: tea()");
							System.out.print("\n");
							vm1.tea();
						break;
						case 4: // chocolate
							System.out.print(" Operation:chocolate()");
							System.out.print("\n");
							vm1.chocolate();
						break;
						case 5: // insert_cups
							System.out.print(" Operation:insert_cups(int n)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter n:");
							System.out.print("\n");
							try {
							n = in.nextInt();
							vm1.insert_cups(n);
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("That’s not "
							     + "an integer. Try again: \n");
							   }
						break;
						case 6: // set_price
							System.out.print(" Operation:set_price(int p)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter p:");
							System.out.print("\n");
							try {
							p = in.nextInt();
							if (p > 0) {
							vm1.set_price(p);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("That’s not "
							     + "an integer. Try again: \n");
							   }
							
							
						break;
						case 7: // cancel
							System.out.print(" Operation: cancel()");
							System.out.print("\n");
							vm1.cancel();
						break;
						case 8: // card
							System.out.print(" Operation: card(float x)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter x:");
							System.out.print("\n");
							try {
							x = in.nextFloat();
							if (x>0) {
								vm1.card(x);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("Enter correct value type\n");
							   }
							
						break;
						case 'q':
							System.exit(0);
						
						default: // Invalid choice
							System.out.println("Invalid Choice");
						break;
						}; // end switch
							
			 }; //end while
		}// end if vm1
		
		else if (input.equalsIgnoreCase("2")) {
			
			AbstractFactory af = new Vending2Factory();
			DataStore ds = af.getDataStore();
			OutputProcessor op = new OutputProcessor(af, ds);
			MDAEFSM mda = new MDAEFSM(op);
			VendingMachine2 vm2 = new  VendingMachine2(mda, ds);

			float p;
			float v;
			int n;
			
			System.out.print(" Vending Machine-2");
			System.out.print("\n");
			System.out.print(" MENU of Operations");
			System.out.print("\n");
			System.out.print(" 0. CREATE(float)");
			System.out.print("\n");
			System.out.print(" 1. COIN(float)");
			System.out.print("\n");
			System.out.print(" 2. SUGAR()");
			System.out.print("\n");
			System.out.print(" 3. CREAM()");
			System.out.print("\n");
			System.out.print(" 4. COFFEE()");
			System.out.print("\n");
			System.out.print(" 5. InsertCups(int)");
			System.out.print("\n");
			System.out.print(" 6. SetPrice(float)");
			System.out.print("\n");
			System.out.print(" 7. CANCEL()");
			System.out.print("\n");
			System.out.print(" q. Quit the demo program");
			System.out.print("\n");
			System.out.print(" Please make a note of these operations");
			System.out.print("\n");
			System.out.print(" Vending Machine-2 Execution");
			System.out.print("\n");
			
			
			while (true){
				System.out.print(" Select Operation: ");
				System.out.print("\n");
				System.out.print("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-Quit");
				System.out.print("\n");
				
				input = bufferedReader.readLine();
				
				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;
				try {
				ch = Integer.parseInt(input);
				}
				catch (Exception e)
				   {
//				    in.next();
				    System.out.print("That’s not "
				     + "an integer 0 - 7 or q. Try again:\n ");
				   continue;
				   }
				switch (ch){
						case 0: //create
							System.out.print(" Operation: CREATE(float)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter p:");
							System.out.print("\n");
							try {
							p = in.nextFloat();
							if (p>0) {
							vm2.CREATE(p);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("Enter correct value type\n");
							   }
						break;
						case 1: //coin
							System.out.print(" Operation: COIN(float)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter v:");
							System.out.print("\n");
							try {
							v = in.nextFloat();
							if (v>0) {
								vm2.COIN(v);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("Enter correct value type\n");
							   }
						break;
						case 2: //sugar
							System.out.print(" Operation: SUGAR()");
							System.out.print("\n");
							vm2.SUGAR();
						break;
						case 3: // tea
							System.out.print(" Operation: CREAM()");
							System.out.print("\n");
							vm2.CREAM();
						break;
						case 4: // chocolate
							System.out.print(" Operation: COFFEE()");
							System.out.print("\n");
							vm2.COFFEE();
						break;
						case 5: // insert_cups
							System.out.print(" Operation:InsertCups(int n)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter n:");
							System.out.print("\n");
							try {
							n = in.nextInt();
							if (n>0) {
							vm2.InsertCups(n);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("Enter correct value type\n");
							   }
						break;
						case 6: // set_price
							System.out.print(" Operation: SetPrice(float p)");
							System.out.print("\n");
							System.out.print(" Enter value of parameter p:");
							System.out.print("\n");
							try {
							p = in.nextFloat();
							if (p>0) {
								vm2.SetPrice(p);
							}
							else {
								System.out.println("Enter a value greater then 0\n");
							}
							}
							catch (Exception e)
							   {
							    in.next();
							    System.out.print("Enter correct value type\n");
							   }
						break;
						case 7: // cancel
							System.out.print(" Operation: CANCEL()");
							System.out.print("\n");
							vm2.CANCEL();
						break;
						case 'q':
							System.exit(0);
						
						default: // Invalid choice
							System.out.println("Invalid Choice");
						break;
						}; // end switch
			 }; //end while
		}// end if vm2
		else {
			System.out.println("No such VM machine implemented yet.\n Restart the program to select from the above 2 Vending Machine.");
		}
		
	} //end main
} //end driver class
