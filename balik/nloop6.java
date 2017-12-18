import java.util.*;
class nloop6{
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num-i; j++){
				System.out.print("  ");
			}
		for(int k=i; k>=2; k--){
			System.out.print(k + " ");
		}
		for(int k=1; k<=i; k++){
				System.out.print(k+ " ");
		}
      	System.out.println();
		}
	}
}