import java.io.IOException;
import java.util.*;
import java.io.*;
public class bank {
	
	int actbalance = 1000; 
	record rec = new record();
	public void menu() {
		Scanner sh = new Scanner(System.in);
		
		clrscr();
		//transactions
		System.out.println("*****choose transaction:*****");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Transfer Money:");
		
		//input
		
		System.out.println();
		int choice = sh.nextInt();
		
		//case
		switch(choice) {
		case 1:
			clrscr();
			System.out.println("**Balance Inquiry**");
			System.out.println("Account Balance : " + actbalance);
			rec.checkBalance(actbalance);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			promptEnterKey();
			break;
		case 2:
			clrscr();
			System.out.println("**Cash Deposit**");
			System.out.print("Enter amount : ");
			int amount = sh.nextInt();
			System.out.println();
			actbalance = actbalance + amount;
			System.out.println("Account Balance : " + actbalance);
			rec.cashDeposit(amount);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			promptEnterKey();
			break;
		case 3:
			clrscr();
			System.out.println("**Cash Withdrawal**");
			System.out.print("Enter amount : ");
			int amount1 = sh.nextInt();
			System.out.println();
			actbalance = actbalance - amount1;
			System.out.println("Account Balance : " + actbalance);
			rec.withDrawal(amount1);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			promptEnterKey();
			break;
		case 4:
			clrscr();
			System.out.println("**Money Transfer**");
			System.out.print("Enter amount : ");
			int amount2 = sh.nextInt();
			System.out.println();
			actbalance = actbalance - amount2;
			System.out.println("Account Balance : " + actbalance);
			rec.moneyTransfer(amount2);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			promptEnterKey();
			break;
			
		default:
			System.out.println("Please enter 1-4 only. Thankyou");
			
		}
	}
	public void promptEnterKey(){
	    System.out.println("Press ENTER to continue...");
	    System.out.println("Ctrl + C to exit...");
	    try {
	        System.in.read();
	        menu();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public static void clrscr(){
	    //Clears Screen in java
	    try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}
}
