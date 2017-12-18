import java.util.Scanner;
class switchstatement
{
	public static void main (String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Enter your Midterm Grade and press return:");
	String grade= input.next();
	
	switch(grade)
	{
	case "A":
		System.out.println("Excellent. You need not take the final");
		break;
	case "B":
		System.out.println("Very Good");
		grade="A";
		System.out.print("Your Midterm grade now is " + grade + "\n");
		break;
	case "C":
		System.out.println("Passing");
		break;
	case "D":
	case "F":
		System.out.print("Not Good\nGo Study\n");
		break;
	default:
		System.out.println("That is not a possible grade");
	}
	System.out.println("End of Program\n");
	}
}
