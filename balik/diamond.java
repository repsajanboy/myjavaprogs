class diamond{
	public static void main(String args []){
		for(int i=0; i<9; i++){
			for(int j=0; j<=9-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=9; i>=0; i--){
			for(int j=0; j<=9-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}