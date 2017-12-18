/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantoks;

import java.util.Scanner;

/**
 *
 * @author Lenov G5030
 */
public class shifter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter size: ");
        int size= input.nextInt();
        int[] shifter = new int[size];
        for(int a=0; a<size; a++)
            shifter[a]= input.nextInt();
        System.out.print("Rotate Left or Right: (Enter L or R)");
        String j= input.next();
        if("L".equals(j) || "l".equals(j)){
            System.out.print("Shift Left by: ");
            int x= input.nextInt();
        for(int c=0; c<x; c++){
            shifter[c]=0;
        }  
        for(int d=x; d<shifter.length; d++){
            System.out.print(shifter[d]+ " ");
        }
        for(int e=0; e<x; e++){
            System.out.print(shifter[e]+ " ");
        }
        System.out.println();
        }
        else if ("R".equals(j) || "r".equals(j)){
       System.out.print("Shift to Right by :") ;
       int x=input.nextInt();
       for(int c=x; c>=0; c-- ){
        shifter[c]=0;
       }
       for(int d=0; d>shifter.length-1; d++){
        System.out.print(shifter[d]+ " ");    
        }
       for(int e=0; e>0; e++){
         System.out.print(shifter[e] + " ");  
       }
       System.out.println();
        }
    }
}