import java.util.*;
class nloop3{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		for(int i=0; i<=num; i++){
			for(int k=1; k<=i; k++)
				System.out.print(k + " ");
				System.out.println();
		}
	}
}