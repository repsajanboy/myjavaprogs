import java.util.Scanner;
class rockypaper3
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.println("Lets Play a Game"+"\nBato-Bato Pik"+"\nPlease enter P for paper R for Rock and S for Scissors");
	System.out.print("Player 1: ");
	String x= input.next();
	System.out.print("Player 2: ");
	String y= input.next();
	String P,p,R,r,S,s;
	switch(x)
	
	{
	case "P":
	case "p":
	
	System.out.print("Paper covers Rock"+"\nPlayer 1 wins");
	break;
	case "r":
	case "R":
	System.out.print("Paper covers Rock"+"\nPlayer 1 wins");
	break;}
	}
}