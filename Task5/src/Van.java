
public class Van extends Vehicle {

	private int speed;
	private int cost;
	
	
	public Van(String ID, int speed) {
		
		super(ID, "van");
		this.speed=speed;
		}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getCost(Vehicle i) {
		this.cost = this.speed * 20;
		return this.cost;
	}

}
