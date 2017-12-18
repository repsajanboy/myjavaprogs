import java.util.Scanner;
class design
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner (System.in);
	System.out.println("Please enter Five digit number: ");
	int number = input.nextInt();
	int ttsand = number/10000;
	int tsand = number/1000%10;
	int hdreds = number/100%10;
	int tens =  number/10%10;      int ones = number%10;
	System.out.println(ttsand +"   "+ tsand +"   "+ hdreds +"   "+ tens +"   " +ones);
	}
} 