package fmi;

public class ChristmasWorkshop {
	
	MysticBoard mysticBoard;
	
	public ChristmasWorkshop() {
		this.mysticBoard = new MysticBoard();
		Elves elve1 = new Elves("djudjence1");
		
		mysticBoard.subscribe(elve1);
	}
	

	public static void main(String[] args) {
		ChristmasWorkshop christmasWorkshop = new ChristmasWorkshop();
		Santa santa = Santa.getInstance();
		
		santa.wish(new WantABike(christmasWorkshop.mysticBoard));
		santa.wish(new WantABike(christmasWorkshop.mysticBoard));
		santa.wish(new WantADoll(christmasWorkshop.mysticBoard));
		
		santa.checkToys();
	}
}
