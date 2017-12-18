import java.util.Scanner;
class vote
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner (System.in);
	System.out.print("What is your age? ");
	int age= input.nextInt();
	if (age < 18){
	int vote= 18-age;
	System.out.print("Your are able to vote in " + vote + " years.");}
	else{
	System.out.print("You are eligible to vote.");}
	}
}