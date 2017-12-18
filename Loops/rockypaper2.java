import java.util.Scanner;
class rockypaper2
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.println("Lets Play a Game"+"\nBato-Bato Pik"+"\nPlease enter P for paper R for Rock and S for Scissors");
	System.out.print("Player 1: ");
	String x= input.next();
	System.out.print("Player 2: ");
	String y= input.next();
	
	
	if("P".equals(x)||"p".equals(x) && "R".equals(y) ||"r".equals(y)){
	System.out.print("Paper covers Rock");}
	else if("P".equals(y)||"p".equals(y) && "R".equals(x) ||"r".equals(x)){
	System.out.print("Paper covers Rock"+"\nPlayer 2 Wins!");}
	else if(x=="P"||x=="p" && y=="S"||y=="s"){
	System.out.print("Scissor cuts Paper");}
	else if(x=="S"||x=="s" && y=="P"||y=="p"){
	System.out.print("Scissor cuts Paper");}
	else if(x=="S"||x=="s" && y=="R"||y=="r"){
	System.out.print("Rock breaks Scissors");}
	else if(x=="R"||x=="r" && y=="S"||y=="s"){
	System.out.print("Rock breaks Scissors");}
	else if(x=="P"||x=="p" && y=="P"||y=="p"){
	System.out.print("Nobody Wins");}
	else if(x=="R"||x=="r" && y=="R"||y=="r"){
	System.out.print("Nobody Wins");}
	else if(x=="S"||x=="s" && y=="S"||y=="s"){
	System.out.print("Nobody Wins");}
	}
}
	
	