import javax.swing.*;
public class jantoksAct1v2
{
	public static void main(String [] args)
	{
	
	String input1=JOptionPane.showInputDialog("Enter V in volts:");
	int V= Integer.parseInt(input1);
	
	String input2=JOptionPane.showInputDialog("Enter I in amperes:");
	int I= Integer.parseInt(input2);
	
	JOptionPane.showMessageDialog(null, "Resistance in R is: "+ (V/I) + " ohms ", " Volt Amperes and Resistance",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}	
}