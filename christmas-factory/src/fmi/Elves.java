package fmi;

public class Elves implements Observer {
	public String name;
	public Observable mysticBoard;
	
	public Elves(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		Toy item = null;
		
		if (this.mysticBoard == null) {
			System.out.println("Board not set");
			return;
		}
		
		String toy = this.mysticBoard.getToyRequested();
		if(toy.equals("bike")) {
			item = BikeFactory.getInstance().getToy(new String[]{"black"});
		}
		
		else if(toy.equals("doll")) {
			item = DollFactory.getInstance().getToy(new String[]{"medium", "girl"});
		}
		
		if(item !=null) {
			Santa.getInstance().addToy(item);
		}
	}

	@Override
	public void setMysticBoard(Observable mysticBoard) {
		this.mysticBoard = mysticBoard;		
	}
}
