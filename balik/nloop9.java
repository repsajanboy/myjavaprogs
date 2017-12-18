import java.util.*;
class nloop9{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sh.nextInt();
		int x=1;
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}
}