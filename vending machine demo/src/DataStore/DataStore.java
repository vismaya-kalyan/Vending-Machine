package DataStore;


// This is the Abstract DataStore class which contains methods of both class


/*
* This is an abstract class for storing data for Vending Machines
*/
public abstract class DataStore {
//	This is an abstract class and is used to store platform dependent data.
	
//	This is abstract method to get the value of temporary variable int temp_p.
	public abstract int getIntTemp_p();
//	This is abstract method to set the value of temporary variable int temp_p.
	public abstract void setTemp_p(int p);
//	This is abstract method to get the value of temporary variable float temp_p.
	public abstract float getFloatTemp_p();
//	This is abstract method to set the value of temporary variable float temp_p.
	public abstract void setTemp_p(float p);
	
	
//	This is abstract method to get the value of temporary variable int temp_v
	public abstract int getIntTemp_v();
//	This is abstract method to set the value of temporary variable int temp_v.
	public abstract void setTemp_v(int v);
//	This is abstract method to get the value of temporary variable float temp_v.
	public abstract float getFloatTemp_v();
//	This is abstract method to set the value of temporary variable float temp_v.
	public abstract void setTemp_v(float v);
	
	
//	This is abstract method to get the value of float cf.
	public abstract float getFloatCf();
//	This is abstract method to get the value of int cf.
	public abstract void setCf(float c);
//	This is abstract method to set the value of int cf.
	public abstract void setCf(int c);
//	This is abstract method to set the value of float cf.
	public abstract int getIntCf();
	
	
//	This is abstract method to get the value of float price
	public abstract float getFloatPrice();
//	This is abstract method to set the value of float Price
	public abstract void setPrice(float p);
//	This is abstract method to get the value of int price.
	public abstract int getIntPrice();
//	This is abstract method to set the value of int Price
	public abstract void setPrice(int p);
	
}
