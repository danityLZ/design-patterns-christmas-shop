package fmi;

public class WantABike implements Command{

	private final MysticBoard mysticBoard;

	public WantABike(MysticBoard mysticBoard) {
		this.mysticBoard = mysticBoard;
	}

	@Override
	public void execute() {
		this.mysticBoard.getToy("bike");		
	}
}
