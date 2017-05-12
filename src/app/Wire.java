package app;

public class Wire {
	

	int price;
	int amount;
	public Wire(int amount){
		price = 5*(amount);
		this.amount=amount;	
	}
	public int getPrice(){
		return price;
	}
	public int get(){
		return amount;
	}
	public String toString(){
		return "Wire";
	}
	
}
