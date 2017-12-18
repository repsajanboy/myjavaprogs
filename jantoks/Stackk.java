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
public class Stackk {
    
      private int top;
      private int[] storage;
 
      Stackk(int capacity) {
            if (capacity <= 0)
                  throw new IllegalArgumentException(
                             "Stack's capacity must be positive");
            storage = new int[capacity];
            top = -1;
      }
 
      void push(int value) {
            if (top == storage.length)
                  throw new StackException("Stack's underlying storage is overflow");
            top++;
            storage[top] = value;
      }
 
      int peek() {
            if (top == -1)
                  throw new StackException("Stack is empty");
            return storage[top];
      }
 
      void pop() {
            if (top == -1)
                  throw new StackException("Stack is empty");
            top--;
      }
 
      boolean isEmpty() {
            return (top == -1);
      }
 
      public class StackException extends RuntimeException {
            public StackException(String message) {
                  super(message);
            }
      }
}
