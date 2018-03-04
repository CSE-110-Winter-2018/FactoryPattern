
public class ToyDuckFactory extends ToyFactory{
	
	public ToyDuckFactory() {
		
	}
	
	public Toy inject(String duckType) {
		
		if(isOptionAvailable(duckType)) {
			Toy car = new Toy(duckType);
			return car;
		} else {
			System.out.println("The duck you want is not available, returning a basic duck\n");
			return new Toy("Rubber Duck");
		}
		
	}
}
