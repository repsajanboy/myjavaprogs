import javax.swing.*;
class week3
{
	public static void main(String [] args)
	{
	String input1= JOptionPane.showInputDialog("Enter the height:");
	double height= Double.parseDouble(input1);
	String input2= JOptionPane.showInputDialog("Enter the width:");
	double width= Double.parseDouble(input2);
	JOptionPane.showMessageDialog(null,"The height of your plot is " + height*2.54 +"cm."+"\nThe width of your plot is " +width*2.54 +" cm." + "\nThe area of your plot is " + height*width*2.54*2.54 +" square cm."," Height, Width and Area",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}