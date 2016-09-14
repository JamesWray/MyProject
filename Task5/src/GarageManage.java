import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
public class GarageManage {
	
	
	ArrayList<Garage> garages;
	
	
	
	public GarageManage(Garage garage) {
		garages = new ArrayList<Garage>();
		garages.add(garage);
		
		
	}
	
	public void addGarage(String name) {
		Garage a = new Garage(name);
		garages.add(a);
	}
	
	public boolean ownsGarage(String name) {
		boolean owns = false;
		
		for(Garage I : garages) {
			if(I.getName().equalsIgnoreCase(name)) {
				owns = true;
			}
			
			
		}
		
		return owns;
		
		
	}

	public int NoOfGarage() {
		int counter =0;
		for(Garage A : garages) {
			counter++;
		}
		return counter;
	}


	public ArrayList<Garage> getGarages() {
		return garages;
	}



	public void setGarages(ArrayList<Garage> garages) {
		this.garages = garages;
	}
	
	public String listGarages() {
		String list = "";
		int counter =1;
	for(Garage I : garages) {
		list += counter + ". " + I.getName() + "\n";
		counter++;
		
	}
	
	return list;
	
	
	
	
	
	
	
	}
	
public Garage  getGarage(String name) {
	
ArrayList<Garage> mu = new ArrayList<Garage>();
for(Garage I : garages) {
	
	if(I.getName().equalsIgnoreCase(name)) {
		mu.add(I);
	}
	
	
}

	return mu.get(0);
	
	
	
	
	
}

public void removeGarage(String name) {
	ArrayList<Garage> dispose = new ArrayList<Garage>();
	
	for(Garage I : garages) {
		if(I.getName().equalsIgnoreCase(name)) {
			dispose.add(I);
		}
		}
	if(dispose.isEmpty()) {
		System.out.println("Garage not found!");
	}
	else {
		garages.removeAll(dispose);
		System.out.println("Garage removed!");
	}
	
	
}

public int total() {
	int total=0;
	for(Garage A : garages ) {
		total+=A.cost();
	}
	return total;
	
	
}

public String inventory() {
	int cars=0;
	int van=0;
	int lorry=0;
	
	for (Garage A : garages) {
		cars+=A.carsingarage();
		van+=A.vansingarage();
		lorry+=A.lorrysingarage();
	}
	
	
	return "Across all garages there are currently: \n"+cars+" car(s).\n"+van+" van(s).\n"+lorry+" lorry(s).";
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
