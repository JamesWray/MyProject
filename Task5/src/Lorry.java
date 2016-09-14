
public class Lorry extends Vehicle {
	
	private int storage;
	private int cost;
	
public Lorry(String ID, int storage) {
	super(ID, "lorry");
	this.storage=storage;
	
	
	
	
	
}

public int getStorage() {
	return storage;
}

public void setStorage(int storage) {
	this.storage = storage;
}	
	
public int getCost(Vehicle i) {
	this.cost = this.storage * 20;
	return this.cost;
}

}
