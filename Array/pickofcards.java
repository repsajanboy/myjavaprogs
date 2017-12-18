class pickofcards{
	public void randomcard(){
		int [] deck = new int [52];
		String [] shape = {"Spade", "Heart", "Club", "Diamond"};
		String [] number = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		for(int i=0; i<deck.length; i++){
			deck[i]= i;
		}
		for (int i=0; i<deck.length; i++){
			int index = (int)(Math.random() * deck.length);
 			int temp = deck[i];
 			deck[i] = deck[index];
 			deck[index] = temp;
		}
		for(int i=0; i<deck.length; i++){
			String shapes = shape[deck[i] / 13];
 			String numbers = number[deck[i] % 13];
 			System.out.println("Ang nabunot mong card ay" + ": "+ numbers + " of " + shapes);

		}
	}
}