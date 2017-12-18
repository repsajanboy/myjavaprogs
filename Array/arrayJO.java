import javax.swing.*;
class arrayJO
{
	public static void main(String [] args)
	{
	String input;
	int eleno, max;
	int [] no = new int[5];
	for (eleno=0; eleno<=4; eleno++)
	{
	input=JOptionPane.showInputDialog("Enter Value for Element " + eleno + ":");
	no [eleno]= Integer.parseInt(input);
	}
	max = no[0];
	for (eleno = 0; eleno<=4; eleno++)
	{
	if (no[eleno]>max)
	{
	max = no[eleno];
	}
	}
	JOptionPane.showMessageDialog(null,"The  Highest Number Array is " + max,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);

	}
}