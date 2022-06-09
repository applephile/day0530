package day0530;

//클래스를 final 접근제어자로 생성해서 다른 클래스의 상속되지 않게 만들어준다
final class Singleton {
	
	private static Singleton single = new Singleton();
	
	//생성자에 private 접근제어자를 선언하여 다른 클래스에서 무분별하게 해당 클래스에 접근하지 못 하도록 한다
	private Singleton() {}
	
	//생성자의 private 접근제어자 때문에 접근하지 못하는 부분을 메서드를 통해서 간접적으로 접근할 수 있도록 해주는 것 
	static Singleton getInstance() {
		return single;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		//즉 obj1과 obj2는 같은 주소에 해당하는 값을 가지는 것 
		//애초에 Singleton 클래스에서 객체를 선언 후에 obj1과 obj2가 같은 객체를 받아왔기 때문에 그렇다
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체");
		} else {
			System.out.println("다른 Singleton 객체");
		}
		
	}

}
