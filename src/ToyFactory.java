import java.util.HashSet;

public abstract class ToyFactory {
	
	private HashSet<String> availableOptions = new HashSet<String>();
	
	public ToyFactory() {
		
	}
	
	public void addOption(String newToyType) {
		
		availableOptions.add(newToyType);
		
	}
	
	public boolean isOptionAvailable(String opt) {
		
		return availableOptions.contains(opt);
		
	}
	
	abstract Toy inject(String s);

}
