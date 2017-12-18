package jantoks;
import java.util.*;
public class cassse {
    public static void main(String [] args){
        Scanner input= new Scanner (System.in);
        String letter= input.next();
        switch(letter)
        {
            case "A":
          System.out.println("This is a switch statement");
                break;
            case "B":
          System.out.println("This is also a switch statement");
                break;
            default:
          System.out.println("This is not a switch statement");
        }
    }
}
