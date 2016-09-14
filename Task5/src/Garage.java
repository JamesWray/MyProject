import java.util.ArrayList;
public class Garage {


	ArrayList<Vehicle> Vehicles;
	private String name;

	public Garage(String Name) {
		this.name=Name;
		Vehicles = new ArrayList<Vehicle>();
	}

	public ArrayList<Vehicle> getVehicles() {
		return Vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		Vehicles = vehicles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addTo(Vehicle a) {

		if(Vehicles.contains(a)) {
			System.out.println("This vehicle already exists!");
		}

		else {
			Vehicles.add(a);
		}
	}

	public void remover(Vehicle a) {

		if (Vehicles.contains(a)) {
			Vehicles.remove(a);
		}

		else {
			System.out.println("This vehicle does not exist!");
		}
	}


	public void remover(String ID) {
		ArrayList<Vehicle> discard = new ArrayList<Vehicle>();

		for (Vehicle a : Vehicles) {

			if (a.getID().equalsIgnoreCase(ID)) {

				discard.add(a);
			}

		}

		Vehicles.removeAll(discard);
	}


	public void removeType(String type) {

		for (Vehicle a : Vehicles) {

			if (a.getType().equalsIgnoreCase(type)) {
				Vehicles.remove(a);

			}}}
	public String fix() {
		int total=0;
		for(Vehicle i : Vehicles) {
			total+=i.getCost(i);
		}
		return "The total cost to fix all vehicles is: £" + total;
	}
	
	public int cost() {
		int total=0;
		for(Vehicle i : Vehicles) {
			total+=i.getCost(i);
		}
		return total;
	}
	
	public String fix(String type) {
		int total =0;
		
		
		for(Vehicle i:Vehicles) {
			if(i.getType().equalsIgnoreCase(type)) {
				total += i.getCost(i);
			}
	       }
		return "The cost to repair all " +type +"s is: £"+total;
		
		
		
		
	}

	public void empty() {

		if(!Vehicles.isEmpty()) {

			for(int i =0;i<=Vehicles.size();i++)	
				Vehicles.remove(i);		
		}

		else {
			System.out.println("The garage is already empty!");

		}}


	public void list() {
int lorry=0;
int van=0;
int car=0;


for(Vehicle i:Vehicles) {
	if(i.getType().equalsIgnoreCase("car")) {
		car++;
	}
	
	else if (i.getType().equalsIgnoreCase("van")) {
		van++;
		}
	
	else {
		lorry++;
	}
}

 System.out.println("Number of cars: "+car+","+"\nNumber of Vans: "+van+"\nNumber of Lorries: "+lorry+"\n");


		if (!Vehicles.isEmpty()) {
			System.out.println("The garage currently contains: ");
			for(Vehicle i : Vehicles) {
				
				
				
				System.out.println(i.vehicleDetails(i));
				
				
				
				
			}}
		else {
			System.out.println("\nThe garage is currently empty!");
		}

	}


	public boolean contains(String ID) {
		boolean contains=false;
      
		for(Vehicle k : Vehicles) {
			if(k.getID().equalsIgnoreCase(ID)) {
				contains = true;
			}
		}
        return contains;
		}
	
	public boolean containsType(String type) {
		boolean containsType = false;
		for(Vehicle k : Vehicles) {
			if(k.getType().equalsIgnoreCase(type)){
				containsType = true;
			}
		}
		return containsType;
		
		
	}
	
	public String getTypeNumber(String type) {
		
		int NoOfType = 0;
		for (Vehicle k : Vehicles) {
			if(k.getType().equalsIgnoreCase(type)) {
				NoOfType++;
			}
			
			
		}
		
		return "There are currently: " + NoOfType+" "+ type+"(s) in the garage.";
		
		
		
	}
	
	public void ListByType(String type) {
		ArrayList<Vehicle> TypeArray = new ArrayList<Vehicle>();
		
		for(Vehicle k : Vehicles) {
			
			if(k.getType().equalsIgnoreCase(type)) {
				TypeArray.add(k);
			}
			}
		
		for(Vehicle j : TypeArray) {
			System.out.println(j.vehicleDetails(j));
		}
	}


	public int carsingarage() {
		int car=0;


		for(Vehicle I : Vehicles) {
			if(I.getType().equalsIgnoreCase("car")) {
				car++;
			}}
		return car;

	}

	public int vansingarage() {
		int van=0;
		for(Vehicle I : Vehicles) {
			if (I.getType().equalsIgnoreCase("van")) {
				van++;
			}}
		return van;}

	public int lorrysingarage() {
		int lorry=0;
		for(Vehicle I:Vehicles) {
			if(I.getType().equalsIgnoreCase("lorry")) {
				lorry++;

			}
		}
		return lorry;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	





















