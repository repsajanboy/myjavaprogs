import java.util.*;
class nloop10{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int num = sh.nextInt();
		for(int i=1; i<num; i++){
			for(int j=1; j<=num-i; j++){
				System.out.print("  ");
			}
			for(int k=1; k<i; k++){
				System.out.print(k + " ");
			}
			for(int k=i; k>=1; k--){
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i=num; i>=1; i--){
			for(int j=1; j<=num-i; j++){
				System.out.print("  ");
			}
			for(int j=1; j<i; j++){
				System.out.print(j+ " ");
			}
			for(int k=i; k>=1; k--){
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}
}