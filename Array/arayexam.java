class arayexam
{
	public static void main(String [] args)
	{
	int i, temp[]=new int [10];
	for(i=0; i<10; i++)
		temp[i]=2*i;
	for(i=0; i<10; i++)
		System.out.print(temp[i] + " ");
	System.out.println();
	for(i=0; i<10; i=i+2)
		System.out.print(temp[i] + " ");
	}
}