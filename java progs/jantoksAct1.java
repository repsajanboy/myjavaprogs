import java.util.Scanner;
public class jantoksAct1
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter V in volts: ");
	double V= input.nextDouble();
	
	System.out.print("Enter I in amperes: ");
	double I= input.nextDouble();
	
	System.out.print("Resistance in R is: "+ V/I + " ohms");
	}	
}