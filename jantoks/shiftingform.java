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
public class shiftingform {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         
        System.out.println("Enter Array size.");
        int a [] = new int[x.nextInt()];
        System.out.println("Enter " + a.length + " elements.");
        for(int b=0; b<a.length; b++){
            a[b] = x.nextInt();
        }for(;;){
         System.out.print("Shift Left or Right: (Enter L or R)");
        String j= x.next();
        System.out.println("Shift by:");
        int shift = x.nextInt();
        if(null != j)switch (j) {
          case "L":
          case "l":
        for(int c=0; c<shift; c++){
            a[c] = 0;
        }
        for(int d=shift; d<a.length; d++){
        System.out.print(a[d] +" ");
        }
        for(int e=0; e<shift; e++){
        System.out.print(a[e] +" ");
        }System.out.println();
        break;
        case "R":
        case "r":
        for(int c=a.length-1; c>a.length-1-shift; c--){
            a[c] = 0;
        }
        for(int d=a.length-shift;d<a.length;d++){
            System.out.print(a[a.length-1]+" ");
        }
        for(int e=0;e<a.length-shift; e++){
            System.out.print(a[e]+" ");
        }
        System.out.println();
            break;
        default:
            System.out.println("Wrong Entry");
        }
    }
    }
}