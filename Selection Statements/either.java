import java.util.Scanner;
class either
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	int num = input.nextInt();
	if(num == 10){
		System.out.print("IT IS TEN");}
	else if(num == 20){
		System.out.print("IT IS TWENTY");}
	else{
		System.out.print("IT IS NEITHER TEN NOR TWENTY");}
	}
}