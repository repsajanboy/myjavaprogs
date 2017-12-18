import java.util.Scanner;
class ifElse
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the value of A: ");
	int A= input.nextInt();
	System.out.print("Enter the value of B: ");
	int B= input.nextInt();
	System.out.print("Enter the value of C: ");
	int C= input.nextInt();
	
	if (C*C== A*A+B*B)
		System.out.print(A +","+ B + "," + C + " Your triangle is a right triangle");
	else
		System.out.print(A + "," + B + "," + C + " Your triangle is not a right triangle");
	}
}