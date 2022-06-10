package fmi;

public class WantADoll implements Command{
	private MysticBoard mysticBoard;
	
	public WantADoll(MysticBoard mysticBoard) {
		this.mysticBoard = mysticBoard;
	}

	@Override
	public void execute() {
		this.mysticBoard.getToy("doll");
	}
}
