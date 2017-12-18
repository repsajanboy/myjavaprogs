import javax.swing.*;
class switchJOption
{
	public static void main(String [] args)
	{
	String input= JOptionPane.showInputDialog("Enter your Midterm Grade and press return:");

	
	switch(input)
	{
	case "A":
	JOptionPane.showMessageDialog(null,"Excellent. You need not take the final","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case "B":
	
	JOptionPane.showMessageDialog(null,"Very Good","Output",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,"Your Midterm Grade now is A","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	System.exit(0);
	break;
	case "C":
	JOptionPane.showMessageDialog(null,"Passing","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	case "D":
	case "F":
	JOptionPane.showMessageDialog(null,"Not Good"+"\nGo Study","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	break;
	default:
	JOptionPane.showMessageDialog(null,"This is not a possible grade","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
	JOptionPane.showMessageDialog(null,"End of Program","Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}