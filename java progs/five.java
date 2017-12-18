import javax.swing.*;
class number
{
	public static void main(String [] args)
	{
	String inp1=JOptionPane.showInputDialog("Enter a 5-digit integer:");
	int number=Integer.parseInt(inp1);
	int prod= number/10000*number/1000%10*number/100%10*number/10%10*number10;
	JOptionPane.showMessageDialog(null,"You have Entered " + inp1 +"\nThe PRODUCT is " + prod,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}