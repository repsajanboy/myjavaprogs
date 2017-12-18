import java.util.*;
import java.io.*;
public class account {
	public  void login() {
		Scanner sh = new Scanner(System.in);
		bank trans = new bank();
		clrscr();
		String user = "user";
		System.out.println("Enter User : ");
		String user1 = sh.next();
		
		if(user1.equals(user)) {
			System.out.println("Enter Pincode : ");
			int pinCode = sh.nextInt();
				if(pinCode == 123) {
					trans.menu();
				} else {
					System.out.println("Wrong Pin Code");
				}
		} else {
			System.out.println("Wrong User");
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
