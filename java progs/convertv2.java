import javax.swing.*;
class convertv2
{
	public static void main(String [] args)
	{
		String input1= JOptionPane.showInputDialog("Enter No. of Hours:");
		int hour= Integer.parseInt(input1);
		String input2= JOptionPane.showInputDialog("Enter No. of Minutes:");
		int minutes= Integer.parseInt(input2);
		JOptionPane.showMessageDialog(null,hour + " HOURS AND " + minutes + " MINUTES EQUALS " + (hour*60+minutes) + " MINUTES ","Hours And Minutes",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}