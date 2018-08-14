package constructor;

public class Car {
	
	//Variables
		public String carName = "BMW";
		public String carModel = "X3";
		public String carColor = "Blue Metallic";
		int year = 2018;
		
	//Constructor-1 (Empty)
		public Car() {
			
		}
		
	//Constructor-2 (With One Data)
		public Car(String carName) {
			this.carName = carName;
			System.out.println(carName);
		}
		
	//Constructor-3 (With Three Data)
		public Car(String carName, String carModel, String carColor) {
			this.carName = carName;
			this.carModel = carModel;
			this.carColor = carColor;
			System.out.println(carName+ " " + carModel + " " + carColor);
		}
		
	//Constructor-4 (With Four Data)
		public Car(String carName, String carModel, String carColor, int year) {
			this.carName = carName;
			this.carModel = carModel;
			this.carColor = carColor;
			this.year = year;
			System.out.println(carName+ " " + carModel + " " + carColor + " " + year);
		}

	//Methods
		public void DisplayCarName() {
			System.out.println("CarName:" + carName);
		}
		
		public void DisplayCarModel() {
			System.out.println("CarModel:" + carModel);
		}
		
		public void DisplayCarColor() {
			System.out.println("CarColor:" + carColor);
		}
		
		public void DisplayCarMakingYear() {
			System.out.println("MakingYear:" + year);
		}
}
