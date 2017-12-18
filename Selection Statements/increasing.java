import java.util.Scanner;
class increasing
{
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter three numbers: ");
	int F= input.nextInt();
	int S= input.nextInt();
	int T= input.nextInt();
	
	if(F<S && F<T && S<T)
	System.out.print( F + "," + S + "," + T);
	if(F<T && F<S && T<S)
	System.out.print( F + "," + T + "," + S);
	if(S<F && S<T && F<T)
	System.out.print( S + "," + F + "," + T);
	if(S<T && S<F && T<F)
	System.out.print( S + "," + T + "," + F);
	if(T<S && T<F && F<S)
	System.out.print( T + "," + F + "," + S);
	if(T<F && T<S && S<F)
	System.out.print( T+ "," + S + "," + F);
	}
}
	
