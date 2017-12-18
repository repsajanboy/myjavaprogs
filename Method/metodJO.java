import javax.swing.*;
class metodJO
{
	public static void main (String [] args)
	{
	String inp;
	int no;
	inp= JOptionPane.showInputDialog("Enter a number:");
	no= Integer.parseInt(inp);
	Factor (no);
	System.exit(0);
	}
	static void Factor (int num)
	{
		int x, fctr;
		fctr=1;
		for(x=1; x <=num; x++)
		{
		fctr=fctr * x;
		}
		JOptionPane.showMessageDialog(null,"The factorial of "+ num + " is " + fctr, "Factorial",JOptionPane.INFORMATION_MESSAGE);
	}
}