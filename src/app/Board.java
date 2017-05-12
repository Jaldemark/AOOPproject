package app;

public class Board {

	int price;
	int size;
	public Board(int size){
		price = 15*(size);
		this.size=size;	
	}
	public int get(){
		return size;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		return "Board";
	}
}
