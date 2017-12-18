import java.util.*;
class nloop7{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = in.nextInt();
		int row = 1;
		for(int i=num; i>=1; i--){
			for(int j=1; j<=i*2; j++){
				System.out.print(" ");
			}
			for(int j=i; j<=num; j++){
				System.out.print(j + " ");
			}
			for(int j=num-1; j>=i; j--){
				System.out.print(j + " ");
			}
			System.out.println();
			row++;
		}
	}
}