
public class Car extends Vehicle {
	private int HP;
	private int cost;
	
	
	
	public Car(String ID, int HP) {
		
		super(ID, "Car");
		
		this.HP = HP;
		
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}
	
	public int getCost(Vehicle i) {
		this.cost = this.HP * 20;
		return this.cost;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
