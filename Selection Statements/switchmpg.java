import java.util.Scanner;
class switchmpg
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Preferred Conversion: " +"\n1. kpl to mpg" + "\n2. mpg to kpl" +"\nEnter your choice: ");
	int number= input.nextInt();
	switch(number)
	{
	case 1:
	System.out.print("Enter kilometres per litre value: ");
	double kpl= input.nextDouble();
	double mpg= (kpl/1.609)*3.785;
	System.out.print("The equivalent miles per gallon is: " + mpg);
	break;
	case 2:
	System.out.print("Enter miles per gallon value: ");
	double mpg2= input.nextDouble();
	double kpl2= (mpg2*1.609)/3.785;
	System.out.print("The equivalent kilometres per litre is: " + kpl2);
	break;
	default:
	System.out.print("Please enter numbers 1-2 only.");
	}
	}
}