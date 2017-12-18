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
public class arraykopo {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        System.out.println("Stack Implemetation");
        System.out.println("Enter Size of Integer Stack ");
        int n = input.nextInt();
        arraykopo2 stk = new arraykopo2(n);
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. top");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice = input.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    stk.push( input.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stk.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("Top Element = " + stk.top());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stk.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + stk.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + stk.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            stk.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = input.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y'); 
    }
}