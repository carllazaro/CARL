public class Color {
	enum color {VANTABLACK, WHITE, MAROON, PURPLE, YELLOW, BROWN};
}
class Model {
	enum model {SEDAN, SUV, CONVERTIBLE, HATCHBACK};
}
class Car {
	private int year;
	private Model.model model;
	private Color.color color;

	Car(int yr, Model.model m, Color.color c) {
		 year = yr;
		 model = m;
		 color = c;
	}
	public void display() {
		System.out.println("MODEL: " + model + "\nYEAR: " + year + "\nCOLOR: " + color + "\n");
	}
}
class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car(2021, Model.model.SUV, Color.color.WHITE);
		Car car2 = new Car(2016, Model.model.SEDAN, Color.color.VANTABLACK);
		
		car1.display();
		car2.display();
	}
}
