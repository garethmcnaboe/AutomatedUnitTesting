package cs265;

public class CS265_Lab_W08 {
	
	final static int cocktailPrice = 8;
	final static int nonAlcPrice = 10;
	final static float reduction = .5f;
		
	static public int getPrice(boolean cocktail, boolean nonAlc, boolean student, boolean happyHour) {
		int price = 0;
		
		if (cocktail) {	
			price = price + cocktailPrice;
		}
		if (nonAlc) {
			price = price + nonAlcPrice;
		}
		if (student) {
			if (happyHour) {
				if (price<=18) {
					price = (int)(price * reduction);
				} else {
					price = (int)(price - (price));
				}
			}
		}		
		return price;
	}
	
}