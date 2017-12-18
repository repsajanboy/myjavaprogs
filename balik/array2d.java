import java.util.*;
class array2d{
	public static void main(String args[]){
		Scanner sh = new Scanner (System.in);
		int [][] arr = new int[5][5];
		int x=1;
		int total = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
			arr[i][j] = x++;
			System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++){
			for( int j=0; j<arr[i].length; j++){
		total += arr[i][j];
			}
		}
		System.out.println("The sum of all elements: " + total);
		for (int j=0; j<arr[0].length; j++) {
			int total1 = 0;
			for (int i=0; i<arr.length; i++)
			total1 += arr[i][j];
			System.out.println("Sum for column " + j + " is " + total1);
			
		}
		for(int i=0; i<arr[0].length; i++){
			int total2 = 0;
			for(int j=0; j<arr.length; j++)
			total2 += arr[i][j];
			System.out.println("Sum for row " + i + " is "+ total2);
		}
		int diagonal =0;
		for(int j=0; j<arr[0].length; j++){
			for(int i=0; i<arr[0].length; i++)
				if(arr[i]==arr[j])
				diagonal += arr[i][j];
		}
		System.out.println("Sum of diagonal l to r " + diagonal);
		int diagonal1= 0;
		for(int j=0; j<arr[0].length; j++){
			for(int i=0; i<arr[0].length; i++)
				if(arr[j]== arr[2])
				diagonal1 += arr[i][j];
		}
		System.out.println("Sum of diagonal mid " + diagonal1);
		int diagonal2=0;
		for(int j=0; j<arr.length; j++){
			for(int i=0; i<arr.length; i++)
				if((i+j)== 4)
				diagonal2 += arr[i][j];
		}
		System.out.println("Sum of diagonal r to l " + diagonal2); 
	}
}