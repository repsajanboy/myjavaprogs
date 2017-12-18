import javax.swing.*;
class week3v2
{
	public static void main (String [] args)
	{
	String name1= JOptionPane.showInputDialog("Enter the name of the Teacher 1:");
	String input1= JOptionPane.showInputDialog("Enter the number of Hours the Teacher worked:");
	int hour1= Integer.parseInt(input1);
	int salary1=30*hour1;
	
	String name2= JOptionPane.showInputDialog("Enter the name of the Teacher 2:");
	String input2= JOptionPane.showInputDialog("Enter the number of Hours the Teacher worked:");
	int hour2= Integer.parseInt(input2);
	int salary2=30*hour2;
	
	String name3= JOptionPane.showInputDialog("Enter the name of the Teacher 3:");
	String input3= JOptionPane.showInputDialog("Enter the number of Hours the Teacher worked:");
	int hour3= Integer.parseInt(input3);
	int salary3=30*hour3;
	
	String name4= JOptionPane.showInputDialog("Enter the name of the Teacher 4:");
	String input4= JOptionPane.showInputDialog("Enter the number of Hours the Teacher worked:");
	int hour4= Integer.parseInt(input4);
	int salary4=30*hour4;
	
	String name5= JOptionPane.showInputDialog("Enter the name of the Teacher 5:");
	String input5= JOptionPane.showInputDialog("Enter the number of Hours the Teacher worked:");
	int hour5= Integer.parseInt(input5);
	int salary5=30*hour5;
	
	JOptionPane.showMessageDialog(null,"1. "+name1 + " - " + hour1 + " hours worked - " + "earns a salary of $" + salary1 +"\n2. "+name2 + " - " + hour2 + " hours worked - " + "earns a salary of $" + salary2 +"\n3. "+name3 + " - " + hour3 + " hours worked - " + "earns a salary of $" + salary3 +"\n4. "+name4 + " - " + hour4 + " hours worked - " + "earns a salary of $" + salary4 +"\n5. "+name5 + " - " + hour5 + " hours worked - " + "earns a salary of $" + salary5,"Name, Hour and Salaries",  JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
	}
}