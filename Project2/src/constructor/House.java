package constructor;

public class House {//Open Class Body
	
	//Variables
	String houseName = "";
	int houseAddress = 77;
	
	//Declare Constructor, Method
	//Constructor-1
	public House() {
	}
	//Constructor-2
	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
	}
	//Constructor-3
	public House(String houseName, int houseAddress) {
		this.houseName = houseName;
		this.houseAddress = houseAddress;
		System.out.println(houseName + "" + houseAddress);
	}
	//Implement Methods
	public void livingRoom() {
		System.out.println("Watch TV");
	}
	public void displayHouseName() {
		System.out.println(houseName);
	}
	public void displayHouseName(String houseName) {
		System.out.println(houseName);
	} 
}//Close Class Body