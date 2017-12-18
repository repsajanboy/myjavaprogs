import java.util.*;
public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers separated by spaces.");
        for(int c = 0;c<10;c++){
            a[c] = input.nextInt();
        }
        for(int d=9;d>=0;d--){
        b[d] = a[9-d];
        }
        
        for(int f=0; f<10;f++){
        System.out.print(b[f]+" ");
    }   
}
}
