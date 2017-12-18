import java.io.*;
import java.lang.*;
import java.util.*;

public class record {
	
	public void checkBalance(int actbalance) {
		try {
			FileWriter fstream = new FileWriter("history.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("\n" + "***************************");
			  out.newLine();
			  out.write("\n" + "Balance Inquiry");
			  out.newLine();
			  out.write("\n" + actbalance);
			  out.newLine();
			  out.close();
		}
		catch (Exception e) {
			System.out.println("you have an error");
		}
	}
	public void cashDeposit(int amount) {
		try {
			FileWriter fstream = new FileWriter("history.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("\n" + "***************************");
			  out.newLine();
			  out.write("\n" + "Cash Deposit");
			  out.newLine();
			  out.write("\n" + amount);
			  out.newLine();
			  out.close();
		}
		catch (Exception e) {
			System.out.println("you have an error");
		}
	}
	public void withDrawal(int amount1) {
		try {
			FileWriter fstream = new FileWriter("history.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("\n" + "***************************");
			  out.newLine();
			  out.write("\n" + " Cash Withdrawal");
			  out.newLine();
			  out.write("\n" + amount1);
			  out.newLine();
			  out.close();
		}
		catch (Exception e) {
			System.out.println("you have an error");
		}
	}
	public void moneyTransfer(int amount2) {
		try {
			FileWriter fstream = new FileWriter("history.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("\n" + "***************************");
			  out.newLine();
			  out.write("\n" + "Money Transfer");
			  out.newLine();
			  out.write("\n" + amount2);
			  out.newLine();
			  out.close();
		}
		catch (Exception e) {
			System.out.println("you have an error");
		}
	}
	
}
