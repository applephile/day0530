package day0530;

public class CarMain2 {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
//		Ambulance a = fe;
		Car c = fe;
		
		if(fe instanceof FireEngine) {
			System.out.println("FireEngine 가능");
		}
		
		if(fe instanceof Car) {
			System.out.println("Car 가능");
		}
	}

}
