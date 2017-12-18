class metodexam2
{
	public static void main(String [] arg)
	{
	friendly();
	shy(6);
	System.out.println("One more time");
	shy(2);
	friendly();
	System.out.println("End of the program.");
	}
	public static void friendly()
	{
	System.out.println("Hello");
	}
	public static void shy(int audience_count)
	{
		if(audience_count<5)
		return;
		System.out.println("Goodbye");
	}
}