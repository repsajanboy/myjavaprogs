import java.util.*;
class oddeven{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	int odd=0;
	int ev=0;
	int sum=0;
	int sum1=0;
	int ave=0;
	int ave1=0;
	int x;
	int even [] = new int [20];
	System.out.println("Enter numbers:");
	for( x=0; x<even.length; ){
		even[x] = input.nextInt();
		if(even[x]%2==0) {
            ev+=1;
            ave+=even[x];
            sum+=even[x];
	
		x++;
                      }
    
        else {
            odd+=1;
            ave1+=even[x];
            sum1+=even[x];
                      }
    

	}
	double average1 = ave1/odd;
	double average = ave/ev;
	System.out.println("the sum of even is "+ sum);
	System.out.println("the sum of odd is "+ sum1);
	System.out.println("the average of odd is "+ average1);
	System.out.println("The average of even is " + average);
	System.out.println("the number of even is " +ev);
	System.out.println("the number of odd is "+odd);
}
}
