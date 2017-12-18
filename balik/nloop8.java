import java.util.*;
class nloop8{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = sh.nextInt();
		for(int i=1; i<=num; i++){
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