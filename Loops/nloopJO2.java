import javax.swing.*;
class nloopJO2
{
	public static void main(String [] args)
	{
	int a=5, b=1;
	for(int c=1; c<=5; c++)
		{
		JOptionPane.showMessageDialog(null,a+" "+b+" "+c,"Output",JOptionPane.INFORMATION_MESSAGE);
		a++;
		b+=a;
		}
		System.exit(0);
	}
}