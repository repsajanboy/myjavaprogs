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
public class EMCsquared {
  public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter size: ");
        int size= input.nextInt();
        int[] EMCsquared = new int[size];
        for(int a=0; a<size; a++)
            EMCsquared[a]= input.nextInt();
        System.out.print("Rotate Left or Right: (Enter L or R)");
        String j= input.next();
        System.out.println("Rotate by: ");
        int x= input.nextInt();
        if(null != j)switch (j) {
          case "L":
          case "l":
              for (int i = 0; i < x; i++) {
                  rotate(EMCsquared);
                  printArray(EMCsquared);
              } break;
          case "R":
          case "r":
              for (int i =x ; i >0 ; i--) {
                  reverse(EMCsquared);
                  printReverse(EMCsquared);
}             break;
              default:
              System.out.println("Wrong Entry");
        }      
      }
 public static int[] rotate(int[] emc) {
        int Array = emc[0];
        int i;
        for (i = 0; i < emc.length - 1; i++) {
             emc[i] = emc[i + 1];
         }
        emc[emc.length -1] = Array;
         return (emc);
}
public static void printArray(int[] emc) {
        for (int i = 0; i < emc.length; i++) {
          System.out.print(emc[i] + "   ");
        }
         System.out.println();}
 public static int[] reverse(int[] emc) {
        int Array = emc[0];
        int i;
        for (i = 0; i < emc.length - 1; i++) {
             emc[i] = emc[i + 1];
         }
        emc[emc.length -1] = Array;
         return (emc);
}

    public static void printReverse(int[] emc) {
        for (int i = emc.length-1; i >=0 ; i--) {
          System.out.print(" " + emc[i]);
        }
         System.out.println();
}

}
