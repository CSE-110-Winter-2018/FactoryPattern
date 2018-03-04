import java.util.ArrayList;

public class Distributor {
	
	public static void main(String[] args) {
		
		// A list of all the toys available at my distribution store
		ArrayList<Toy> myToys = new ArrayList<Toy>();
		
		ToyFactory mDuckFactory = new ToyDuckFactory();
		ToyFactory mCarFactory = new ToyCarFactory();
		
		// Adding options to my duck factory
		mDuckFactory.addOption("Yellow Rubber Duck");
		mDuckFactory.addOption("Squeaking Rubber Duck");
		
		// Adding options to my car factory
		mCarFactory.addOption("Hot Wheels");
		mCarFactory.addOption("F1");
		
		// Creating some toys
		Toy myLittleFerrari = mCarFactory.inject("F1");
		Toy myHuntingDecoy = mDuckFactory.inject("Squeaking Rubber Duck");
		Toy myLittleTesla = mCarFactory.inject("Tesla");
		
		// Adding them to my list
		myToys.add(myLittleFerrari);
		myToys.add(myHuntingDecoy);
		myToys.add(myLittleTesla);
		
		// Printing the list of my toys
		System.out.println("I have these toys available at my distribution store:");
		for(Toy t: myToys) {
			String toyName = t.getToyName();
			System.out.println(toyName);
		}
		
	}
	
}
