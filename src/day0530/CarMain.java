package day0530;

class Car {
	String color = "white";
	int door = 4;
	
	Car(){}
	
	void drive() {
		System.out.println("운전");
	}
	
	void stop() {
		System.out.println("정지");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("방수");
	}
}
class Ambulance extends	Car {
	void siren() {
		System.out.println("응급");
	}
}



public class CarMain {

	public static void main(String[] args) {
		
		FireEngine f = new FireEngine();
		
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("------------------------");
		
		Car c = f;
		
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
		
		System.out.println("------------------------");
		
		FireEngine f2 = (FireEngine)c;
		
		System.out.println(f2.color);
		System.out.println(f2.door);
		f2.drive();
		f2.stop();
		f2.water();
		
		System.out.println("------------------------");
//		Ambulance a = (Ambluance)f2; FireEngine과 Ambulance는 상속관계가 아니기 때문에 참조변수가 안 된다
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //UpCasting : 조상 -> 자식 형변환 생략가능
		
		fe2 = (FireEngine)car; //DownCasting : 자식 -> 조상 형변환 필수 조상 클래스가 자식 클래스보다 더 적은 개수의 멤버를 가지고 있기 때문에
		
	}

}













