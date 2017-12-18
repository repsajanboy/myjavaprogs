import javax.swing.*;
class rockypaper
{
	public static void main(String [] args)
	{
	JOptionPane.showMessageDialog(null,"Lets Play a Game"+"\nBato-Bato Pik"+"\nPlease enter P for paper R for Rock and S for Scissors","Bato-Bato Pik",JOptionPane.INFORMATION_MESSAGE);
	int j;
	int result=0;
	do{
	String x=JOptionPane.showInputDialog("Player 1");
	String y=JOptionPane.showInputDialog("Player 2");

	if("P".equals(x)||"p".equals(x) && "R".equals(y)||"r".equals(y)){
	JOptionPane.showMessageDialog(null,"Paper covers Rock"+"\nPlayer 1 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("P".equals(y)||"p".equals(y) && "R".equals(x) ||"r".equals(x)){
	JOptionPane.showMessageDialog(null,"Paper covers Rock"+"\nPlayer 2 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("P".equals(x)||"p".equals(x) && "S".equals(y)||"s".equals(y)){
	JOptionPane.showMessageDialog(null,"Scissor cuts Paper"+"\nPlayer 1 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("P".equals(y)||"p".equals(y) && "S".equals(x)||"s".equals(x)){
	JOptionPane.showMessageDialog(null,"Scissor cuts Paper"+"\nPlayer 2 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("R".equals(x)||"r".equals(x) && "S".equals(y)||"s".equals(y)){
	JOptionPane.showMessageDialog(null,"Rock breaks Scissors"+"\nPlayer 1 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("R".equals(y)||"r".equals(y) && "S".equals(x)||"s".equals(x)){
	JOptionPane.showMessageDialog(null,"Rock breaks Scissors"+"\nPlayer 2 Wins!","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("P".equals(x)||"p".equals(x) && "P".equals(y)||"p".equals(y)){
	JOptionPane.showMessageDialog(null,"Nobody Wins","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("R".equals(x)||"r".equals(x) && "R".equals(y)||"r".equals(y)){
	JOptionPane.showMessageDialog(null,"Nobody Wins","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else if("S".equals(x)||"s".equals(x) && "S".equals(y)||"s".equals(y)){
	JOptionPane.showMessageDialog(null,"Nobody Wins","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	else {
		JOptionPane.showMessageDialog(null,"Nobody Wins","Bato-Bato Pik",JOptionPane.PLAIN_MESSAGE);}
	j= JOptionPane.showConfirmDialog(null,"Do You want to continue?","Bato-Batoo Pik",JOptionPane.YES_NO_OPTION);
			}while(j!=1);
	JOptionPane.showMessageDialog(null,"Thanks For Playing","GoodBye",JOptionPane.PLAIN_MESSAGE);
	}
}
	
	