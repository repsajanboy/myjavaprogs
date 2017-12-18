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
public class interets {
public static void main(String [] args){
    beta bets= new beta ();
    double pamount = 13258.36,rate = 0.09,pass = 0;
    for (int y=1;y<=5; y++){
    for (int m=1;m<=12; m++)
        pass+= pamount;
    bets.compound(pass, rate, y);
    }
}
}
