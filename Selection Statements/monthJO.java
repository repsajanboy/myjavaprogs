import javax.swing.*;
class monthJO
{
	public static void main(String [] args)
	{
	String input=JOptionPane.showInputDialog("Please Enter Month's number:");
	int number= Integer.parseInt(input);
	
	switch(number)
	{
	case 1:
	JOptionPane.showMessageDialog(null,"January","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 2:
	JOptionPane.showMessageDialog(null,"February","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 3:
	JOptionPane.showMessageDialog(null,"March","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 4:
	JOptionPane.showMessageDialog(null,"April","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 5:
	JOptionPane.showMessageDialog(null,"May","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 6:
	JOptionPane.showMessageDialog(null,"June","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 7:
	JOptionPane.showMessageDialog(null,"July","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 8:
	JOptionPane.showMessageDialog(null,"August","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 9:
	JOptionPane.showMessageDialog(null,"September","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 10:
	JOptionPane.showMessageDialog(null,"October","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 11:
	JOptionPane.showMessageDialog(null,"November","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case 12:
	JOptionPane.showMessageDialog(null,"December","Month",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	default:
	JOptionPane.showMessageDialog(null,"Please Enter number's 1-12 only","Error",JOptionPane.ERROR_MESSAGE);
	System.exit(0);
	}
	JOptionPane.showMessageDialog(null,"Thank You!","End of Program",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}