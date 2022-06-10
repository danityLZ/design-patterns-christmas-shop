package fmi;

public class DollFactory extends AbstractFactory<Doll>{
	private static DollFactory instance;
	
	private DollFactory() {}
	
	public static DollFactory getInstance() {
		if (instance == null) {
			instance = new DollFactory();
		}
		
		return instance;
	}

	@Override
	public Doll getToy(String[] args) {
		return new Doll(args[1], args[0]);
	}
}
