import java.util.Scanner;
public class nloopsample {   
    public static void main(String[] arg){  
        Scanner input = new Scanner(System.in);
        int total=0,number;
        System.out.print("Do you want to Enter a Number? \n Press Y ");
        String x;
        x= input.nextLine();
        while("Y".equals(x) || "y".equals(x)){
        System.out.print("Enter a number? ");
        number=input.nextInt();
        total=total+number;
           System.out.print("Press Y to enter another number: ");
           x= input.next();
        }
        System.out.print("The sum of the numbers is " +total);
}} 