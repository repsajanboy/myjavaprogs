import java.util.*;
class nloop11{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sh.nextInt();
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num-i; j++){
				System.out.print("    ");
			}
			int x=1;
			for(int j=1; j<=i; j++){
				System.out.printf("%4d",x);
			x += x;
			}
			for(int l=x/2; l>1;){
			l = l/2;
			System.out.printf("%4d", l);
		}
			
			System.out.println();
		}
	}
}