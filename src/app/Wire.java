package app;

public class Wire {
	

	int price;
	int amount;
	public Wire(int amount){
		price = 5*(amount);
		this.amount=amount;	
	}
	/**
	 * to get the price of the wire
	 * @return the price for the Wires
	 */
	public int getPrice(){
		return price;
	}
	/**
	 * To get the amouont of wires
	 * @return the amount of wires
	 */
	public int get(){
		return amount;
	}
	/**
	 * to get the price of the wire
	 * @return "Wire"
	 */
	public String toString(){
		return "Wire";
	}
	
}
