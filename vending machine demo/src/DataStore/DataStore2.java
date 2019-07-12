package DataStore;

// //This is the DataStore2 class which contains methods for virtual machine 2


public class DataStore2 extends DataStore{

	private float Temp_p, Temp_v;
	private float cf;
	private float price;
	
	@Override
	public int getIntTemp_p() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_p(int p) {
		// TODO Auto-generated method stub
		
	}
//This method is used to get the value of temporary variable float temp_p.
	@Override
	public float getFloatTemp_p() {
		// TODO Auto-generated method stub
		return Temp_p;
	}
//This method is used to set the value of temporary variable float temp_p.
	@Override
	public void setTemp_p(float p) {
		// TODO Auto-generated method stub
		this.Temp_p = p;
	}

	@Override
	public int getIntTemp_v() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_v(int v) {
		// TODO Auto-generated method stub
		
	}
//This method is used to get the value of temporary variable float temp_v.
	@Override
	public float getFloatTemp_v() {
		// TODO Auto-generated method stub
		return Temp_v;
	}
//This method is used to set the value of temporary variable float temp_v.
	@Override
	public void setTemp_v(float v) {
		// TODO Auto-generated method stub
		Temp_v = v;
	}
//This method is used to get the value of variable float Cf.
	@Override
	public float getFloatCf() {
		// TODO Auto-generated method stub
		return cf;
	}
//	This method is used to set the value of variable float Cf.
	@Override
	public void setCf(float c) {
		// TODO Auto-generated method stub
		cf = c;
	}

	@Override
	public void setCf(int c) {
		// TODO Auto-generated method stub
		cf = c;
	}

	@Override
	public int getIntCf() {
		// TODO Auto-generated method stub
		return 0;
	}
//This method is used to get the value of variable float price.
	@Override
	public float getFloatPrice() {
		// TODO Auto-generated method stub
		return price;
	}
//This method is used to set the value of variable float price.
	@Override
	public void setPrice(float p) {
		// TODO Auto-generated method stub
		price = p;
	}

	@Override
	public int getIntPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(int p) {
		// TODO Auto-generated method stub
		
	}

}
