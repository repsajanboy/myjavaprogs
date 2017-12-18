import javax.swing.*;
class increasingJO
{
	public static void main(String [] args)
	{
	String input1=JOptionPane.showInputDialog("Please enter first number: ");
	String input2=JOptionPane.showInputDialog("Please enter second number: ");
	String input3=JOptionPane.showInputDialog("Please enter third number: ");
	int F= Integer.parseInt(input1);
	int S= Integer.parseInt(input2);
	int T= Integer.parseInt(input3);
	
	if(F<S && F<T && S<T){
	JOptionPane.showMessageDialog(null, F + ", " + S + ", " + T,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	if(F<T && F<S && T<S){
	JOptionPane.showMessageDialog(null, F + ", " + T + ", " + S,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	if(S<F && S<T && F<T){
	JOptionPane.showMessageDialog(null, S + ", " + F + ", " + T,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	if(S<T && S<F && T<F){
	JOptionPane.showMessageDialog(null, S + ", " + T + ", " + F,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	if(T<S && T<F && F<S){
	JOptionPane.showMessageDialog(null, T + ", " + F + ", " + S,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	if(T<F && T<S && S<F){
	JOptionPane.showMessageDialog(null, T + ", " + S + ", " + F,"Output",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);}
	}
}
	
