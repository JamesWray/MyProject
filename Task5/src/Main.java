

import java.net.PasswordAuthentication;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean confirm = true;
		
		System.out.println("New user; enter username");
		String username = reader.nextLine();
		
		while(confirm) {
			
			System.out.println("Enter a password: ");
			String pass = reader.nextLine();
			System.out.println("And confirm by reentering: ");
			String pass1 = reader.nextLine();
			
			if(pass.equals(pass1)) {
				System.out.println("Password accepted!");
				confirm=false;
				User user = new User(username, pass);
			}
			else {
				System.out.println("Passwords do not match!");
			}
			}



		
		
		
		
		
	

		System.out.println("Please name your first garage: ");
		String name = reader.nextLine();		
	
		
	
		
		








		Garage garage = new Garage(name);
		GarageManage manager = new GarageManage(garage);
		int choice;
		boolean run = true;



		while (run) {
			try {
				System.out.println("\nCurrent USer: " + user.getname());
				System.out.println("\nCurrent Garage: "+garage.getName()+".");
				System.out.println("\nMain Menu:" );
				System.out.println("1. Add Vehicle. 2. Remove Vehicle. 3. Caculate Cost. 4. Empty Garage 5. List Garage  \n6. Cost by Type 7.Check By type    8. New Garage     9.Change garage 10. List Garages 11. Remove Garage 12. Total Cost to Repair All Garages 13. Total Garage Holdings 14. Exit 15. User Menu");
				System.out.print("To select an action, please use the corresponding number: ");



				choice = Integer.parseInt(reader.nextLine());


				switch (choice) {

				case 1 :
					System.out.println("Is the vehicle a car, van or lorry?");
					String type = reader.nextLine();
					if (type.equalsIgnoreCase("car")) {
						System.out.println("Enter the ID number: ");
						String ID = reader.nextLine();
						System.out.println("Enter the Horsepower: ");
						int HP = Integer.parseInt(reader.nextLine());
						Car car = new Car(ID,HP);
						garage.addTo(car);
						System.out.println("Car " +ID+" added to garage.");
						break;
					}

					else if (type.equalsIgnoreCase("van")) {
						System.out.println("Enter the ID number: ");
						String ID = reader.nextLine();
						System.out.println("Enter the speed: ");
						int speed = Integer.parseInt(reader.nextLine());
						Van van = new Van(ID,speed);
						garage.addTo(van);
						System.out.println("Van "+ID+" added to garage.");
						break;

					}

					else if (type.equalsIgnoreCase("lorry")) {
						System.out.println("Enter the ID number: ");
						String ID = reader.nextLine();
						System.out.println("Enter the storage capacity in meteres squared: ");
						int storage = Integer.parseInt(reader.nextLine());
						Lorry lorry = new Lorry(ID,storage);
						garage.addTo(lorry);
						System.out.println("Lorry "+ID+" added to garage.");
						break;
					}

					else {
						System.out.println("INVALID SELECTION!");
						break;
					}

				case 2:
					System.out.println("\nEnter the ID number or Type of vehicle to remove: ");
					String remove = reader.nextLine();
					if (remove.equalsIgnoreCase("car")||remove.equalsIgnoreCase("van")||remove.equalsIgnoreCase("lorry")) {

						if(garage.contains(remove)) {
							garage.removeType(remove);
							System.out.println("\nVehicles of type: " +remove +" have been removed.");

							break;
						}
						else {
							System.out.println("There are none of those5"
									+ " vehicles in the garage!");
							break;
						}
					}

					else  {

						if(garage.contains(remove)) {

							garage.remover(remove);
							System.out.println("Vehicle: "+remove
									+" has been removed");
							break;}
						else {
							System.out.println("That vehicle is not currently in the garage!");
							break;
						}

					}

				case 3:

					System.out.println(garage.fix());
					break;

				case 4:
					garage.empty();
					break;

				case 5:
					garage.list();
					break;


				case 6:
					String type1;
					System.out.println("Please enter the type of vehicle to calculate cost: ");
					type1 = reader.nextLine();
					type1.toLowerCase();

					if(garage.containsType(type1)) {
						System.out.println(garage.fix(type1));
					}
					else {
						System.out.println("There are no vehicles of this type in the garage!");
					}

					break;


				case 7:

					System.out.println("What vehicle type are you interested in?");
					String type2;
					type2 = reader.nextLine();
					type2.toLowerCase();

					if(garage.containsType(type2)) {
						System.out.println(garage.getTypeNumber(type2));
						System.out.println("Do you wish to list them?");
						System.out.println("Y/N?");
						String YesNo = reader.nextLine();
						if(YesNo.equalsIgnoreCase("y")) {

							garage.ListByType(type2);

						}

						else if (YesNo.equalsIgnoreCase("n")) {
							break;
						}

						else {
							System.out.println("Invalid Selection!");
							break;
						}}

					else {
						System.out.println("There are no Vehicles of this type in the garage!");	       
					}
					break;


				case 8:

					System.out.println("Please enter the name of your new garage: ");
					String name1 = reader.nextLine();
					manager.addGarage(name1);

					break;

				case 9:

					System.out.println("\nCurrent Garages: ");
					System.out.print(manager.listGarages());
					System.out.println("Which garage would you like to view?");
					String selection = reader.nextLine();
					if (manager.ownsGarage(selection)) {
						garage = manager.getGarage(selection);
						break;
					}
					else {
						System.out.println("Could not find garage!");
						break;
					}
					
				case 10:
					System.out.println("All Garages: ");
					System.out.println(manager.listGarages());
					break;
					
				case 11:
					System.out.println(manager.listGarages());
					System.out.println("Enter the name of garage to remove: ");
					remove=reader.nextLine();
				    if(manager.getGarage(remove).equals(garage)) {
				    	System.out.println("You cant remove the garage you are currently in!");
				    	break;
				    }
					
					
					
				    else if (manager.ownsGarage(remove)) {
						manager.removeGarage(remove);
						break;
				    }

				    else {
				    	System.out.println("That garage does not exist!");
				    	break;
				    }


				case 12:
					System.out.println("The cost to repair across all "+manager.NoOfGarage()+" garage(s) is: £"+manager.total());
					break;


				case 13:
					System.out.println(manager.inventory());
					break;
					
					
					
					
				case 14:
					System.out.println("\nExiting..");
					run = false;
					break;
					
				case 15:
					System.out.println("1. Create new user 2.Change user 3. Delete User 4. Return");
					int choice0=Integer.parseInt(reader.nextLine());
					switch (choice0) {
					
					case 1:
						confirm = true;
						System.out.println("Enter the new user name: ");
						name = reader.nextLine();
						while(confirm) {
							
							System.out.println("Enter a password: ");
							String pass = reader.nextLine();
							System.out.println("And confirm by reentering: ");
							String pass1 = reader.nextLine();
							
							if(pass.equals(pass1)) {
								System.out.println("Password accepted!");
								confirm=false;
								User user0 = new User(name, pass);
								System.out.println("User Created");
							}
							else {
								System.out.println("Passwords do not match!");
							}
							}
						break;
						
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			





				}}

			catch(IllegalArgumentException ex) {
				System.out.println("Invalid input, try again!\n");




			}


		}
	 



























		reader.close();



	}


}
