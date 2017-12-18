/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantoks;
import java.util.*;
/**
 *
 * @author Lenov G5030
 */
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


