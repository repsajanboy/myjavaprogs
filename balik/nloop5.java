import java.util.*;
class nloop5{
	public static void main (String args []){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		for(int i=num; i>=0; i--){
			for(int j=1; j<=i; j++)
				System.out.print(j + " ");
				System.out.println();
		}
	}
}