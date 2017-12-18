import javax.swing.*;
import java.text.DecimalFormat;
class nloopJO
{
	public static void main(String [] args)
	{
		DecimalFormat frm= new DecimalFormat("0.00");
		String inp;
		double sumGrd,grd,aveGrd;
		int x, cnt;
		cnt=0;
		sumGrd=0;
		do{
			inp= JOptionPane.showInputDialog("Enter Grade");
			grd= Double.parseDouble(inp);
			sumGrd= sumGrd+grd;
			cnt++;
			x= JOptionPane.showConfirmDialog(null,"Do You want to continue?","Grade",JOptionPane.YES_NO_OPTION);
			}while(x!=1);
			aveGrd= sumGrd/cnt;
			JOptionPane.showMessageDialog(null,"Your Grade Average is "+frm.format(aveGrd),"Grade",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		 
	}
}