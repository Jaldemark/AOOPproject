package app;

import java.util.Arrays;

import testProject.Node;

public class Shop {

	static String[] s = {"Boards: ", "Wires: "};
	static int[] itemCount = new int[10];//Array with amount of items
	static int count=0;
	static int currentSize=0;	//How many different items there are


	/**
	 * Add Items to the shop
	 * @param r The Node added to the grid
	 */
	public static void addToShop(Node a){
		
		for(int i=0;i<s.length;i++){
			switch(i){
			case 0: itemCount[i] =itemCount[i]+ a.getBoard().get();
					s[i] = "Boards: " + itemCount[i];
					
					break;
			case 1: itemCount[i] = itemCount[i] + a.getWire().get();
					s[i] = "Wires: " + itemCount[i];
					
					break;
			}
				
		}
	
	}
	/**
	 * 
	 * @return all items in our shop
	 */
	public static String getShop(){
		String all ="";
		count =0;
		if(s.length!=0){
			while(count!=s.length){
				all = all + s[count]+System.lineSeparator();
				count++;
			}
		}
		return all;
	}
	
	public static void clearShop(){
		
		for(int i=0;i<s.length;i++){
			itemCount[i]=0;
		}
	}
}
