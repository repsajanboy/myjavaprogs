class pyramidd
{
	public static void main (String [] args){
	for(int i=0; i<8; i++){
	for(int j=0; j<16-i; j++){
		System.out.print(" ");
	}
	for(int k=0; k<=i; k++){
		if(i==0 || i==1 || i==7|| k==0 || k==i)
              System.out.print("* ");
          else
          	System.out.print("  ");
	}
	System.out.println();
	
	}
	for(int i=0; i<8; i++){
	for(int j=0; j<8-i; j++){
		System.out.print(" ");
	}
	for(int k=0; k<=i; k++){
		if(i==0 || i==1 || i==7|| k==0 || k==i)
              System.out.print("* ");
          else
          	System.out.print("  ");
	}
	for(int j=0; j<7-i; j++){
		System.out.print("  ");
	}
	for(int k=0; k<=i; k++){
		if(i==0 || i==1 || i==7|| k==0 || k==i)
              System.out.print("* ");
          else
          	System.out.print("  ");
	}
	System.out.println();
	
	}
	}
}