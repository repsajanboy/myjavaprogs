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
public class SariSari {
    public static void main(String [] args){
     Scanner input = new Scanner (System.in); 
    int [] code = {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220};
    String [] product = {"Milo","Kopi","Nesca","Coke","Spri","Roya","Peps","MtDe","Blue","Chuck","ChocO","Stin","Cobr","Gato","SanM","RedH","Empi","Jack","Blac","Mata"};
    int [] quantity = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
    int [] price = {5,10,20,30,40,5,10,15,20,30,40,50,10,20,30,40,10,20,30,35};
    for(;;){   
    System.out.println("Code\tProduct  Quantity  Price");
        
        for(int a=0;a<code.length;a++)
            System.out.println(code[a]+"\t"+product[a]+"        "+quantity[a]+"        "+price[a]);
        
        System.out.println("How many Items would you like to buy? ");
        int x = input.nextInt();
        int cod = 0,subt, subtotal=0;
        int total [] = new int [x];
        
       for(int i=0; i<x; i++){
           System.out.println("Enter the Code of the Product:");
          int emc = input.nextInt();
           System.out.println("How many Products would you like to buy?");
      int y = input.nextInt();
      for(int z = 0; z<code.length; z++)
      cod = emc-201;
     if(y<=quantity[cod]){
           quantity[cod] = quantity[cod]-y;
       }
       else{
           System.out.println("Cannot be :Please enter valid amount of products");
       }
      subt = y*price[cod];
            total[i] = subt;
       subtotal = subtotal + total[i];
       }
     System.out.println("TOTAL IS Php" + subtotal +".00");
        
        System.out.println("How much would you like to pay?");
        int cash = input.nextInt();
        if(cash>=subtotal){
            System.out.println("Your change is: "+ (cash - subtotal));
        }
        else{
            System.out.println("You don't have enough.");
        }
        System.out.println("Code\tProduct  Quantity  Price");
        
        for(int a=0;a<code.length;a++)
            System.out.println(code[a]+"\t"+product[a]+"        "+quantity[a]+"        "+price[a]);
        int subtotal1=0;
        subtotal1= subtotal1+subtotal;
        System.out.println("Your Total sale is: "+ subtotal1);
       
               
            
        
        
    }
}
}