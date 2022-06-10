package fmi;

import java.util.ArrayList;
import java.util.List;

public class Santa {
	private static Santa instance;
	private List<Toy> toyList;
	
	private Santa() {
		this.toyList = new ArrayList<>();
	}
	
	public static Santa getInstance() {
		if (instance == null) {
			instance = new Santa();
		}
		
		return instance;
	}
	
	public void wish(Command command) {
		command.execute();
	}
	
	public void addToy(Toy toy) {
		this.toyList.add(toy);
	}
	
	public void checkToys() {
		System.out.println("I have " + this.toyList.size() + " toys in my bag, Santa said");
		for (Toy toy:this.toyList) {
			System.out.println(toy.toString());
		}
	}

}
