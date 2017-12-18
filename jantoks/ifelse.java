/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantoks;
import java.util.Scanner;
public class ifelse {
    public static void main (String [] args){
    Scanner input= new Scanner (System.in);
            int a= input.nextInt();
            if(a<10)
            System.out.println(a+" is less than 10" );
            else
            System.out.println(a+" is more than 10");
}
}
