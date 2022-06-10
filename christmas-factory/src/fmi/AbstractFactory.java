package fmi;

public abstract class AbstractFactory<Toy> {
	
	public abstract Toy getToy(String[] args);
}
