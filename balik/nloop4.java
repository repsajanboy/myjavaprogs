import java.util.*;
class nloop4{
	public static void main (String args []){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		int row=1;
		while (row<=num)
		{
			for(int col=row; col<=num; col++)
				System.out.print(col + " ");
				System.out.println();
				row++;
		}
	}
}