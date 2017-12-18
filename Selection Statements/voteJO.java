import javax.swing.*;
class voteJO
{
	public static void main(String [] args)
	{
	String input=JOptionPane.showInputDialog("What is your age?");
	int age= Integer.parseInt(input);
	if (age < 18 ){
	JOptionPane.showMessageDialog(null," You are able to vote in " + (18-age) + " years.","VOTE",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	else{
	JOptionPane.showMessageDialog(null," You are eligible to vote.","VOTE",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	}
}
	