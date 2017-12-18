import java.util.*;
class numpyd{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = in.nextInt();
		for(int i=0; i<=num; i++){
		for(int k=1; k<=i; k++)
		System.out.print(i+ " ");
	System.out.println();
		}
	}
}