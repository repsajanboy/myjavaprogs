import java.util.Scanner;
class convert
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	
	int hour= input.nextInt();
	int minutes= input.nextInt();

	System.out.print(hour + " HOURS AND " + minutes + " MINUTES EQUALS " + (hour*60+minutes) + " MINUTES ");
	}
}