import java.util.Scanner;
class eitherswitch
{
	public static void main(String [] args)
	{
	Scanner input= new Scanner(System.in);
	int number = input.nextInt();
	switch(number)
	{
	case 10:
		System.out.print("IT IS TEN");
	break;
	case 20:
		System.out.print("IT IS TWENTY");
	break;
	default:
		System.out.print("IT IS NEITHER TEN NOR TWENTY");
	}
	}
}