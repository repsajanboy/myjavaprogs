import java.util.*;
class testingan{
	public static void main(String args []){
		Scanner sh = new Scanner(System.in);
		int x=1;
		for(int i=0; i<=5; i++){
			System.out.print(x +" ");
			x += x;
		}
		for(int i=x; i>1;){
			i = i/2;
			System.out.print(i + " ");
		}

	}
}