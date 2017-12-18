/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantoks;

/**
 *
 * @author Lenov G5030
 */
public class fruits {
      public static void main(String [] args){
        Stack<String> fruits = new Stack<String>();
        fruits.push("apple");
        print(fruits);
        fruits.push("pineapple");
        print(fruits);
        fruits.push("orange");
        print(fruits);
        fruits.push("grapes");
        print(fruits);
        fruits.push("mango");
        print(fruits);
        fruits.push("greenapple");
        print(fruits);
        
        
        
        fruits.pop();
        
    }
    public static void print(Stack<String>s){
     if (s. isEmpty())
     System.out.println("No Data");
     else 
     System.out.println(s + "Top");
    
    }
}
