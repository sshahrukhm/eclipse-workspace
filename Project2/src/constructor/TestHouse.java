package constructor;

public class TestHouse {

	public static void main(String[] args) {
		House myHouse = new House("White House");
		myHouse.livingRoom();
		
		House yourHouse = new House();
		yourHouse.displayHouseName();
		
		House herHouse = new House();
		yourHouse.displayHouseName("Blue House");
		
		House theirHouse = new House("Downstreet, 30");

	}

}
