import java.util.*;
public class cominterest {
    public static void main(String [] args){
    bank bets= new bank ();
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter amount: ");
    int amount= input.nextInt();
    System.out.print("Please enter rate: ");
    double rate= input.nextDouble();
    double pass = 0;
    for (int y=1;true; y++){
    for (int m=1;m<=12; m++)
        pass+= amount;
    bets.compound(pass, rate, y);
    
    }
    }
}    


