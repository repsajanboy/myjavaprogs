class disp{
	public static void main(String args []){
		int dis [] = new int [10];
		int x=1;
		for(int i=0; i<dis.length; i++){
			dis[i] = x++;
			System.out.print(" " + dis[i]);
		}

	}
}