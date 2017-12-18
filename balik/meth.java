import java.util.*;
class meth{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sh.nextInt();
		total(num);
	}
	public static void total(int num){
		int sum=0;
		for(int i=0; i<=num; i++)
			sum += i;
		System.out.println("The sum is"+sum);
	}
}