import java.util.*;
class drawcard {
	public static void main (String [] args){
		int [] deck = new int [52];
		String [] shape = {"Spade", "Heart", "Club", "Diamond"};
		String [] number = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		for(int i=0; i<deck.length; i++){
			deck[i]= i;
		}
		for (int j=0; j<deck.length; j++){
			int index = (int)(Math.random() * deck.length);
 			int temp = deck[j];
 			deck[j] = deck[index];
 			deck[index] = temp;
		}
		for(int k=0; k<1; k++){
			String shapes = shape[deck[k] / 13];
 			String numbers = number[deck[k] % 13];
 			System.out.println("Ang nabunot mong card ay" + ": "+ numbers + " of " + shapes);	
		}
	}
}
