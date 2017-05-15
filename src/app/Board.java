package app;

public class Board {

	int price;
	int size;
	public Board(int size){
		price = 15*(size);
		this.size=size;	
	}
	/**
	 * To get the amouont of 
	 * @return the amount of wires
	 */
	public int get(){
		return size;
	}
	/**
	 * To get the price of the board
	 * @return the price of the board
	 */
	public int getPrice(){
		return price;
	}
	public String toString(){
		return "Board";
	}
}
