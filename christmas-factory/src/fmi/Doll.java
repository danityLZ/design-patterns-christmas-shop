package fmi;

public class Doll extends Toy {
	String size;
	String gender;
	
	public Doll(String gender, String size) {
		this.size = size;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.size + " size doll " + this.gender;
	}
}
