
public abstract class Vehicle {

private String ID;
private String type;

public Vehicle(String ID, String type) {

	this.ID = ID;
	this.type = type;
	
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String vehicleDetails(Vehicle i) {
	
	if (i.getType().equalsIgnoreCase("Car")) {
	
	StringBuilder sb = new StringBuilder();
	sb.append("Type: " + i.getType() + "\n");
	sb.append("Vehicles ID: " + i.getID() + "\n");
	sb.append("Horsepower: " + ((Car) i).getHP()+"\n");
	return sb.toString();
	}
	
	
	


	else if (i.getType().equalsIgnoreCase("Lorry")) { 
	
	StringBuilder sb = new StringBuilder();
	sb.append("Type: "+i.getType()+"\n");
	sb.append("Vehicles ID: "+i.getID()+"\n");
	sb.append("Storage Space: "+((Lorry) i).getStorage()+"\n");
	return sb.toString();
	}


	else if (i.getType().equalsIgnoreCase("Van")) {
	StringBuilder sb = new StringBuilder();
	sb.append("Type: "+i.getType()+"\n");
	sb.append("Vehicles ID: "+i.getID()+"\n");
	sb.append("Speed: "+((Van) i).getSpeed()+"\n");
	return sb.toString();}
	
	else {
		return "";
	}
	
	
	
}


public abstract int getCost(Vehicle i);
















}
