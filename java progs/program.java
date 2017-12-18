import javax.swing.*;
class program
{
	public static void main(String [] args)
	{
		String input1= JOptionPane.showInputDialog("Enter the first number ");
		int A= Integer.parseInt(input1);
		String input2= JOptionPane.showInputDialog("Enter the second number ");
		int B=Integer.parseInt(input2);
		String input3= JOptionPane.showInputDialog("Enter the third number ");
		int C= Integer.parseInt(input3);
	JOptionPane.showMessageDialog(null, "The sum is: "+ (A+B+C) +"\nThe average is: "+ (A+B+C)/3 +"\nThe product is: "+A*B*C,"Sum,Average and Product",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}