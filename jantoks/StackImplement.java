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
public class StackImplement {
   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        /* Creating object of class arrayStack */
        arrayStackk stk = new arrayStackk(5);
            System.out.println("Enter Stack Operation:");
            String x= scan.next();
        char ch;
        do{
       if(  null != x) /* Perform Stack Operations */ switch (x) {
                case "push":
                    System.out.println("Please Enter number to push");
                    stk.push(scan.next());
                    break;
                case "pop":
                    System.out.println("Popped Element; " + stk.pop());
                    break;
                case "peek":
                    System.out.println("Peek Element: " + stk.peek());
                    break;
                case "empty":
                    System.out.println(stk.isEmpty());
                    break;
                case "full":
                    System.out.println(stk.isFull());
                    break;
                case "size":
                    System.out.println(stk.getSize());
                    break;
                default:
                    System.out.print("Wrong Entry");
                    break;
            }
       System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
       }while (ch == 'Y'|| ch == 'y');
}
}