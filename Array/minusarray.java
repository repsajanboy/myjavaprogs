import java.util.*;
class minusarray{
	public static void main (String [] args){
		Scanner sh = new Scanner(System.in);
		int [] deck = new int [52];
		int sum = 0;
		for(int i=0; i<deck.length; i++){
			deck[i]=1;
		}
		for (int i=0; i<deck.length; i++){
			sum +=deck[i];}
			System.out.println("Total: " + sum);
		
		System.out.println("Do you want to continue? (y/n)");
		String choice = sh.next();
		switch (choice){
		 case "Y":
          case "y":
          int sum1 = sum;
          	for(int i=0; i<1; i++){
          			sum1--;
          		}
          	System.out.println("Total: " + sum1);
          break;
          case "N":
          case "n":
          	System.out.println("Thankyou!");
          default:
          	System.out.println("Bye");
        }
    	

	}	
}