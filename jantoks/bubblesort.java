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
public class bubblesort {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int [10];
         for (int a=0; a<arr1.length; a++)
            arr1[a]= input.nextInt();
      bubble_srt(arr1);}
    public static void bubble_srt(int myArray[])
    {
        int temp = 0;
        for (int counter = 0; counter < myArray.length - 1; counter++)
        {
            for (int index = 0; index < myArray.length - 1 - counter; index++)
            {
                if (myArray[index] > myArray[index + 1])
                {
                    temp = myArray[index];
                    myArray[index] = myArray[index + 1];
                    myArray[index + 1] = temp;
                }
            }
            printNumbers(myArray);
        }
     }

    private static printNumbers(int[] myArray)
    {
        for (int i = 0; i < myArray.length; i++)
       {
            System.out.print(myArray[i] + " ");
        }System.out.println("\n");
    }
    
}