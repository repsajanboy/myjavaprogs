class pyramid
{
	public static void main(String [] args)
	{
		for(int i=0; i<15; i++){
	for(int j=0; j<16-i; j++){
		System.out.print(" ");
	}
	for(int k=0; k<=i; k++){
		if(i==0 || i==1 || i==7|| i==14 || k==0 || k==i || k==7 )
              System.out.print("* ");
          else
          	System.out.print("  ");
	}

	System.out.println();
	
	}
	}
}
