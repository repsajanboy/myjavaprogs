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
public class arrayStackk {
    
    int maxSize;
    int top;
    int len;
    String arr[];
    public arrayStackk(int n)
    {
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        if(top == 0){
            return true;
        }else{
            return false;
        }
            
    }
    /*  Function to check if stack is full */
    public boolean isFull()
    {
        return top == maxSize;      
    }
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return len ;
    }
    /*  Function to check the top element of the stack */
    public String peek()
    {
      if(top>0){
      return arr[top-1];}
      else{
          return null;
      }
    }
    /*  Function to add an element to the stack */
    public void push(String jjm)
    {
      if(top < maxSize){
        arr[top] = jjm;
       top++;
       len++;
      }
      else{
          System.out.println("Stack Overflow");
      }
    }
    public String pop()
    {
        if(!this. isEmpty()){
            String mos = this.peek();
            arr[top-1] = null;
            top--;
            len--;
            return mos;
        }
        else{
            return null;
        }
    }
}
