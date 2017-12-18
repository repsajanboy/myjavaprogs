import javax.swing.*;
class loopJO
{
	public static void main(String [] args)
	{
	int a=10, b=10, k=1;
	String display=" ";
	while(k<=5)
		{
		display=display+k+" "+a+" "+b+"\n ";
		a=a+2;
		b=a+b;
		k=k+1;
		}
		JOptionPane.showMessageDialog(null,display,"Output",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}