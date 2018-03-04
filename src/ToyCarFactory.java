public class ToyCarFactory extends ToyFactory {
	
	public ToyCarFactory() {
		
	}
	
	public Toy inject(String carType) {
		
		if(isOptionAvailable(carType)) {
			Toy car = new Toy(carType);
			return car;
		} else {
			System.out.println("The car you want is not available, returning a basic car\n");
			return new Toy("car");
		}
		
	}

}
