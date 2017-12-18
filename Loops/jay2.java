import java.util.Scanner;
class jay2
{
	public static void main(String[]args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Five Numbers ");
	int highest = -99999;
	int lowest = 99999;
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int num5 = input.nextInt();
	if(num1>highest){
	highest = num1;}
	if(num2>highest){
	highest= num2;}
	if(num3>highest){
	highest= num3;}
	if(num4>highest){
	highest= num4;}
	if(num5>highest){
	highest= num5;}
	if (num1<lowest){
	lowest = num1;}
	if (num2<lowest){
	lowest = num2;}
	if (num3<lowest){
	lowest = num3;}
	if (num4<lowest){
	lowest = num4;}
	if (num5<lowest){
	lowest = num5;}
	System.out.print("The highest number is " + highest +"\nThe lowest number is " + lowest);
	}
}